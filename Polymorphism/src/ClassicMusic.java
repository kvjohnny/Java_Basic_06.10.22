public class ClassicMusic extends MusicStyles {
    String classicMusicBand1;
    String classicMusicBand2;
    String classicMusicBand3;

    public ClassicMusic(String classicMusicBand1, String classicMusicBand2, String classicMusicBand3) {
        this.classicMusicBand1 = classicMusicBand1;
        this.classicMusicBand2 = classicMusicBand2;
        this.classicMusicBand3 = classicMusicBand3;
    }

    @Override
    public Object playMusic() {
        super.playMusic();
        return this.classicMusicBand1 + " " + super.playMusic() + "классическую музыку.\n" +
                this.classicMusicBand2 + " " + super.playMusic() + "классическую музыку.\n" +
                this.classicMusicBand3 + " " + super.playMusic() + "классическую музыку.\n";
    }
}
