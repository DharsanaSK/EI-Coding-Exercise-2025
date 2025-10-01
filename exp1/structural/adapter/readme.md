##### **(I)Adapter pattern:**

        Acts as a bridge between two incompatible interfaces,allowing them to work together.

 

adapter/

 ├── MediaPlayer.java        # Target interface

 ├── Mp3Player.java          # Concrete class with playMp3()

 ├── Mp4Player.java          # Concrete class with playMp4()

 ├── MediaAdapter.java       # Adapter class–bridges client with players

 └── Main.java               # Client – takes user input and plays files



###### **How it Works?**

1)The client (Main) only knows about MediaPlayer (the common interface).

2)When the user enters a file type, Main calls:

                   player.play(type, file);

3)The adapter (MediaAdapter) translates this request into the correct call:

   =>If mp3 → Mp3Player.playMp3(file)

   =>If mp4 → Mp4Player.playMp4(file)

4)If the type is unsupported, the adapter rejects it gracefully.



###### **Why Adapter Pattern?**

* Without adapter → Client must know every player (Mp3Player, Mp4Player, etc.).
* With adapter → Client just calls play().
* Easy to extend → Adding new formats (AVI, MKV, WAV) requires changes only in MediaAdapter.java, not in the client.
