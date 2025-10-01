package exp1.structural.adapter;

public class MediaAdapter implements MediaPlayer {
    private Mp3Player mp3Player;
    private Mp4Player mp4Player;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            if (mp3Player == null) mp3Player = new Mp3Player();
            mp3Player.playMp3(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            if (mp4Player == null) mp4Player = new Mp4Player();
            mp4Player.playMp4(fileName);
        } else {
            System.out.println("Invalid media type: " + audioType);
        }
    }
}