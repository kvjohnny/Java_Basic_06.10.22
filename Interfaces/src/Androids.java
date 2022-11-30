public class Androids implements Smartphones, LinuxOperatingSystem {
    @Override
    public void call() {
        System.out.println("Смартфоны на базе операционной системы " +
                "Android используют для звонков.");
    }

    @Override
    public void shortMessageService() {
        System.out.println("Смартфоны на базе операционной системы Android " +
                "используют для отправки и получения SMS.");
    }

    @Override
    public void internet() {
        System.out.println("Смартфоны на базе операционной системы Android " +
                "используют для серфинга в сети Интернет.");
    }

    @Override
    public void linuxKernel() {
        System.out.println("Android - опреционная система, " +
                "которая создана на базе ядра Linux.");
    }
}
