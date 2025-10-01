package exp1.behavioral.state;

class StoppedState implements PlayerState {
    public void pressPlay(MusicPlayer player) {
        System.out.println("Starting music...");
        player.setState(new PlayingState());
    }

    public void pressPause(MusicPlayer player) {
        System.out.println("Music is stopped, can't pause.");
    }
}