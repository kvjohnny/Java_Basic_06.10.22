public class MusicStylesMain {
    public static void main(String[] args) {

        MusicStyles popMusic = new PopMusic("Deep Sea Diver", "Honeys", "Stories");
        MusicStyles rockMusic = new RockMusic("Queen", "Pink Floyd", "Nirvana");
        MusicStyles classicMusic = new ClassicMusic("Alma Trio", "Oberlin Trio", "Hermitage Piano Trio");

        Object[] stylesOfMusic = {popMusic.playMusic(), rockMusic.playMusic(),
                classicMusic.playMusic()};
        for (Object styleOfMusic : stylesOfMusic) {
            System.out.print(styleOfMusic);
            System.out.println();
        }
    }
}