package oct17;

public class mp3player {

    public mp3player(String s) {
    }

    public void play() {
    }

    class MP3Player extends abstractclass {
        private String song;
        public MP3Player(String song) {
            this.song = song;
        }

        @Override
        public void play() {
            System.out.println("Playing MP3: " + song);
        }
    }
}




