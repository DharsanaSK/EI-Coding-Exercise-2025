# Behavioral pattern 

## 1. State   
**Allows an object to alter its behavior when its internal state changes, appearing as if the object changed its class.**
- **Usecase**: Music Player
- The State Pattern helps by:    
   - Encapsulating behavior associated with a particular state into separate classes.
   - Making the context (MusicPlayer) simpler by delegating state-specific behavior to state objects.
   - Allowing easy addition of new media types without touching the client.
### Components  
1. **Target Interface** (`MediaPlayer.java`) → defines the uniform method `play(type, file)` the client expects.
2. **Adaptees** (`Mp3Player.java`, `Mp4Player.java`) → existing incompatible classes.
3. **Adapter** (`MediaAdapter.java`) → implements the target interface and **translates** the `play` call into the correct method on the adaptee (`Mp3Player` or `Mp4Player`).
4. **Client** (`Main.java`) → Uses the adapter via the target interface, unaware of the adaptee details.
### Output
```
Enter type (mp3/mp4/exit): mp3
Enter file name: song.mp3
Playing mp3 file: song.mp3

Enter type (mp3/mp4/exit): mp4
Enter file name: movie.mp4
Playing mp4 file: movie.mp4

Enter type (mp3/mp4/exit): exit
```
### Summary
The Adapter Pattern lets a media player client play MP3 and MP4 files using a single `play()` method, even though the underlying players have different interfaces (`playMp3()`, `playMp4()`).

---


## 2. Composite   
**Allows treating individual objects and compositions of objects uniformly, forming a part-whole hierarchy**
- **Usecase**: Menu System
- The Composite Pattern helps by:    
   - Allowing clients to treat **single items (leaves)** and **groups of items (composites)** the same way.
   - Simplifying client code, since it interacts only with the common component interface.
   - Supporting hierarchical tree structures like menus, folders, or organizational charts.
### Components  
1. **Component** (`MenuComponent.java`) → defines the uniform method `display(indent)` that all menu items and menus implement.
2. **Leaf** (`MenuItem.java`) → represents individual objects that **do not contain children**, e.g., a single menu item.
3. **Composite** (`Menu.java`) → represents objects that **can contain other components**, e.g., a menu with submenus or items; implements methods to `add()` children and `display()` them.
4. **Client** (`Main.java`) → builds the menu hierarchy and interacts with `MenuComponent` without knowing whether it is dealing with a `Leaf` or a `Composite`.
### Output
```
[Menu] Main Menu
  [Menu] File
    - New
    - Open
    - Save
  [Menu] Edit
    - Copy
    - Paste
```
### Summary
The Composite Pattern lets a client display an entire menu system using a single `display()` method. The client does not need to distinguish between individual menu items (`MenuItem`) and menus containing multiple items (`Menu`), making the system easy to extend and maintain.

---
