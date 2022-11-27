public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("Смартфоны на базе операционной системы " +
                "iOS используют для звонков.");
    }

    @Override
    public void sms() {
        System.out.println("Смартфоны на базе операционной системы iOS " +
                "используют для отправки и получения sms.");
    }

    @Override
    public void internet() {
        System.out.println("Смартфоны на базе операционной системы iOS " +
                "используют для серфинга в сети Интернет.");
    }

    @Override
    public void iOS() {
        System.out.println("iOS - операционная система, которая " +
                "сначала была разработана для iPhone.");
    }
}
