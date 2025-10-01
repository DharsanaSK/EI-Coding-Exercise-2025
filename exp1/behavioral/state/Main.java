package exp1.behavioral.state;

public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.pressPlay();  // Starting music...
        player.pressPlay();  // Already playing...
        player.pressPause(); // Music paused.
        player.pressPause(); // Already paused.
        player.pressPlay();  // Resuming music...
    }
}

