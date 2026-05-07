/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplaylistdimo;

/**
 *
 * @author msi
 */
public class MusicPlayListDimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MusicPlaylist list = new MusicPlaylist();
        list.addSong("woman", "doja cat");
        list.addSong("super","seventeen");
        list.addSong("gunday", "devender ahlawat");
        list.addSong("cold water", "justin beiber");
        list.prevSong("super");
        list.nextSong("super");
        list.removeSongByName("gunday");
        
  
        
    }
    
}
