
# Java Music Playlist

This project is a console-based music playlist application developed using Java. It was created to demonstrate object-oriented programming concepts and the implementation of a custom doubly linked list data structure.

The application allows songs to be added, removed, and navigated by moving to the next or previous song in the playlist. Each song stores its title, artist name, ID, and references to the previous and next songs.

---

## Features

- Add songs to the playlist
- Store song title and artist name
- Assign an ID to each song
- Remove a song by name
- Find the next song
- Find the previous song
- Navigate the playlist using linked nodes

---

## Technologies Used

- Java
- Object-Oriented Programming
- Custom Doubly Linked List
- Console-Based Application

---

## Project Structure

### `MusicPlaylist.java`

Contains the main playlist logic. It defines the song nodes and manages playlist operations such as adding songs, removing songs, and navigating between songs.

### `MusicPlayListDimo.java`

Contains the `main` method used to test and demonstrate the playlist functionality.

---

## Concepts Demonstrated

- Classes and objects
- Inner classes
- Encapsulation
- Doubly linked list implementation
- Node references
- Previous and next navigation
- Data insertion and deletion
- Basic algorithmic thinking

---

## How the System Works

Each song is represented as a node in a doubly linked list. Every song node stores:

- Song name
- Artist name
- Song ID
- Reference to the previous song
- Reference to the next song

The playlist uses header and trailer nodes to manage the beginning and end of the list. When a song is added, it is inserted into the playlist structure. When a song is removed, the previous and next nodes are connected together to keep the playlist linked correctly.

---

## Sample Operations

```java
MusicPlaylist list = new MusicPlaylist();

list.addSong("woman", "doja cat");
list.addSong("super", "seventeen");
list.addSong("gunday", "devender ahlawat");
list.addSong("cold water", "justin beiber");

list.prevSong("super");
list.nextSong("super");
list.removeSongByName("gunday");
```

---

## Purpose of the Project

The purpose of this project is to practice implementing a dynamic data structure manually in Java instead of relying on built-in collection classes.

This project helped demonstrate how a doubly linked list can be used in a real-world style example, such as a music playlist where users may need to move forward and backward between songs.

It also supports understanding of object-oriented design, node-based data organization, and basic playlist management operations.

---

## How to Run

1. Download or clone the repository.
2. Open the project in a Java IDE such as NetBeans, IntelliJ IDEA, or Eclipse.
3. Compile and run `MusicPlayListDimo.java`.
4. The console will display the playlist operation results.

---

## Academic Context

This project was developed as an academic Java programming exercise focused on data structures and object-oriented programming. It demonstrates how linked nodes can be used to organize and manage data dynamically.
````
