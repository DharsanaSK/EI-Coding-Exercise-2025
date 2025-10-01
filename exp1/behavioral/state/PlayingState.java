package exp1.behavioral.state;

class PlayingState implements PlayerState {
    public void pressPlay(MusicPlayer player) {
        System.out.println("Already playing...");
    }

    public void pressPause(MusicPlayer player) {
        System.out.println("Music paused.");
        player.setState(new PausedState());
    }
}
