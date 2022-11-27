public class RockMusic extends MusicStyles {
    String rockMusicBand1;
    String rockMusicBand2;
    String rockMusicBand3;

    public RockMusic(String rockMusicBand1, String rockMusicBand2, String rockMusicBand3) {
        this.rockMusicBand1 = rockMusicBand1;
        this.rockMusicBand2 = rockMusicBand2;
        this.rockMusicBand3 = rockMusicBand3;
    }

    @Override
    public Object playMusic() {
        super.playMusic();
        return this.rockMusicBand1 + " " + super.playMusic() + "рок-музыку.\n" +
                this.rockMusicBand2 + " " + super.playMusic() + "рок-музыку.\n" +
                this.rockMusicBand3 + " " + super.playMusic() + "рок-музыку.\n";
    }
}
