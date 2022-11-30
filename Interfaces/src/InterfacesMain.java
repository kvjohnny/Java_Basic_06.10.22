public class InterfacesMain {
    public static void main(String[] args) {
        Androids androids = new Androids();
        androids.call();
        androids.shortMessageService();
        androids.internet();
        androids.linuxKernel();
        IPhones iPhones = new IPhones();
        iPhones.call();
        iPhones.shortMessageService();
        iPhones.internet();
        iPhones.iOperatingSystem();
    }
}
