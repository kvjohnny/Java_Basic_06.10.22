public class PopMusic extends MusicStyles {
    String popMusicBand1;
    String popMusicBand2;
    String popMusicBand3;

    public PopMusic(String popMusicBand1, String popMusicBand2, String popMusicBand3) {
        this.popMusicBand1 = popMusicBand1;
        this.popMusicBand2 = popMusicBand2;
        this.popMusicBand3 = popMusicBand3;
    }

    @Override
    public Object playMusic() {
        super.playMusic();
        return this.popMusicBand1 + " " + super.playMusic() + "поп-музыку.\n" +
                this.popMusicBand2 + " " + super.playMusic() + "поп-музыку.\n" +
                this.popMusicBand3 + " " + super.playMusic() + "поп-музыку.\n";
    }
}
