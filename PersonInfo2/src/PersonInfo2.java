public class PersonInfo2 {
    public static void main(String[] args) {
        Person person = new Person();
        String str1 = person.personInfo("Will", "Smith", "New York", 2936729462846L);
        System.out.println(str1);
        String str2 = person.personInfo("Jackie", "Chan", "Shanghai", 12312412412L);
        System.out.println(str2);
        String str3 = person.personInfo("Sherlock", "Holmes", "London", 37742123513L);
        System.out.println(str3);
    }
}
