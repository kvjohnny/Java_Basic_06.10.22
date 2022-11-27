public class InterfacesMain {
    public static void main(String[] args) {
        Androids androids = new Androids();
        androids.call();
        androids.sms();
        androids.internet();
        androids.linuxKernel();
        IPhones iPhones = new IPhones();
        iPhones.call();
        iPhones.sms();
        iPhones.internet();
        iPhones.iOS();
    }
}
