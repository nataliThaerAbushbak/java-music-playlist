/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplaylistdemo;

import java.util.Iterator;

/**
 *
 * @author msi
 */
public class MusicPlaylist {
    //node is the song 
    private class Song{
			private String name;
			private Song prev;
			private Song next;
                        //the id willl encrease by 1 every  time user add a new Song
                        private int id = idIncrement;
                        private String artist;
                        //song constructor
			
                public Song(String name,String artist,Song prev,Song next,int id) {
				this.name=name;
                                this.artist=artist;
		         	this.prev=prev;
				this.next=next;
                                         
                                
			}
				
			
			public String getName() {
				return this.name;
			}
			public void setPrev(Song prev) {
				this.prev=prev;
			}
			public Song getPrev(){
				return this.prev;
			}
			public void setNext(Song next) {
				this.next=next;
			}
			public Song getNext(){
				return this.next;
			}
                        
                       public int getId() {
                        return id;
                        }
                        public void setId(int id) {
                        this.id= id;
                        }

                        public String getArtist() {
                         return artist;
                         }
		}
		private Song header;
                private Song tailer;
                private int size = 0;
                private int idIncrement=1;
                
                

public MusicPlaylist() {
    //header and tailer dint have elements or id
    header = new Song(null, null, null, null,0);  
    tailer = new Song(null, null, header, null,0); 
    header.setNext(tailer);
}

    	private void addBetween(String name ,String artist , Song predecessor, Song successor,int id) {
	Song newNode=new Song(name,artist,predecessor,successor,id);
	predecessor.setNext(newNode);
	successor.setPrev(newNode);
			size++;
		}
     int currentId;
    //to add a song to the end of the playList
    public void addSong(String name, String artist) {
        
        //if the playlist is empty
        if(size==0){
            this.addBetween(name, artist, header, tailer,idIncrement);
              }
    else{
            //if its not empty
         this.addBetween(name,artist, tailer.getPrev(), tailer,idIncrement++);           
     
     }
     
            }
    
    public void removeSongByName(String songName) {
        //current is our pointer at first it must start pointing to the first song on the list
    Song currentSong = header.getNext();
    
// while we didnt finish the list yet
    while (currentSong != tailer) { 
        if (currentSong.getName().equalsIgnoreCase(songName)) {
            //we make the next and prev songs point to each other and pass the current song
            
            Song prev = currentSong.getPrev();
            Song next = currentSong.getNext();
            prev.setNext(next);
            next.setPrev(prev);
            System.out.println( "Removed song: '" + currentSong.getName() + "' by " + currentSong.getArtist()+"its id is ="+currentSong.getId());
            
            
           size--;
           return;
           } 
   // to make the pointer move +1
          currentSong = currentSong.getNext();
          
          
    }//out of loop:the loop is finished the name doesnt match any song on the list
    System.out.println("Song '" + songName + "' not found in the playlist");  
  
}
//to get the next Song of the current song
    public void nextSong(String currentSongName){
        //start our loop from the first song
        Song currentSong = header.getNext();
        //while songs are not finished yet
        while (currentSong!=tailer) { 
           if (currentSong.getName().equalsIgnoreCase(currentSongName)) {
               Song nextSong =currentSong.getNext();
               //if the current song is not the last song
                if(nextSong != tailer){
              System.out.println("//the next song to :"+currentSong.getName()+" is : "+nextSong.getName()+
                    " by the artist :"+ nextSong.getArtist() );
                
            } else {
                    //current song is the last one
              System.out.println("list is finished");
                } return;}
          //i++ 
      currentSong = currentSong.getNext();  
      }
        //loop is finished but there isnt any song with that name
        System.out.println("no song with such a name");
      }
    // to get the prev song
     public void prevSong(String currentSongName){
         //starting the loop from the last song
        Song currentSong = tailer.getPrev();
        //if loop isnt finished
        while(currentSong!= header){
            
         if (currentSong.getName().equalsIgnoreCase(currentSongName)) {
            Song prevSong =currentSong.getPrev();
            //if current is not the first song
             if (prevSong != header) {
            System.out.println("the previous song to :"+currentSong.getName()+" //is : "+prevSong.getName()+
                    " by the artist :"+ prevSong.getArtist() );
        } else{
                 //if it is
               System.out.println("no previous song ..that is the beginning of the playlist");
             } return;}
         //i++
          currentSong = currentSong.getPrev();  
    }
        //loop is finished with no such a song name
        System.out.println("no song with such a name");
    }
}
    
 
    
    
    
                
		
		

   
