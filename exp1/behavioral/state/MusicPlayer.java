package exp1.behavioral.state;

class MusicPlayer {
    private PlayerState state;

    public MusicPlayer() {
        state = new StoppedState(); // initial state
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void pressPlay() {
        state.pressPlay(this);
    }

    public void pressPause() {
        state.pressPause(this);
    }
}
