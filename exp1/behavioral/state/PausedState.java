package exp1.behavioral.state;

class PausedState implements PlayerState {
    public void pressPlay(MusicPlayer player) {
        System.out.println("Resuming music...");
        player.setState(new PlayingState());
    }

    public void pressPause(MusicPlayer player) {
        System.out.println("Already paused.");
    }
}