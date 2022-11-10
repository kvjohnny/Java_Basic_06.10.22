public class Person {
    char ch = 96;   // В этой программе использовал целочисленное значение,
                    // представляющее символ '`' в наборе символов Unicode.
                    // Символ '`' использую для дальнейшей нумерации списков
                    // буквами латинского алфавита, начиная с a, b, и т.д.
    public String personInfo(String name, String familyName, String city, long num) {
        String result;
        result = ++ch + ". " + "Позвонить гражданину " + name + " " +
                familyName + " из города " + city + " можно по номеру " + num + ".";
        return result;
    }
}
