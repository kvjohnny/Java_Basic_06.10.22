public class IPhones implements Smartphones, IOperatingSystem {
    @Override
    public void call() {
        System.out.println("Смартфоны на базе операционной системы " +
                "iOS используют для звонков.");
    }

    @Override
    public void shortMessageService() {
        System.out.println("Смартфоны на базе операционной системы iOS " +
                "используют для отправки и получения SMS.");
    }

    @Override
    public void internet() {
        System.out.println("Смартфоны на базе операционной системы iOS " +
                "используют для серфинга в сети Интернет.");
    }

    @Override
    public void iOperatingSystem() {
        System.out.println("iOS - операционная система, которая " +
                "первоначально была разработана для iPhone.");
    }
}
