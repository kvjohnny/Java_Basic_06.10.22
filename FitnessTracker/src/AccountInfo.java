public class AccountInfo {
    private final String name;
    private final int birthday;
    private final String monthOfBirth;
    private final int yearOfBirth;
    private final String email;
    private final String phoneNumber;
    private String familyName;
    private double weight;
    private String pressure;
    private long numberOfSteps;
    private int age;
    private static final int CURRENT_YEAR = 2022;


    public String getName() {
        return name;
    }

    public int getBirthday() {
        return birthday;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public long getNumberOfSteps() {
        return numberOfSteps;
    }

    public void setNumberOfSteps(long numberOfSteps) {
        this.numberOfSteps = numberOfSteps;
    }

    public AccountInfo(String name, String familyName, int birthday, String monthOfBirth, int yearOfBirth,
                       String email, String phoneNumber, double weight,
                       String pressure, long numberOfSteps) {
        this.name = name;
        this.familyName = familyName;
        this.birthday = birthday;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.weight = weight;
        this.pressure = pressure;
        this.numberOfSteps = numberOfSteps;
    }


    public int getAge() {
        return age;
    }

    public String printAccountInfo() {
        age = CURRENT_YEAR - yearOfBirth;
        return "Данные о пользователе " + name + " " + familyName + ": " + '\n' +
                "------------------------------------------------" + '\n' +
                "Имя - " + name + '\n' +
                "Фамилия - " + familyName + '\n' +
                "Дата рождения - " + birthday + " " + monthOfBirth + " " + yearOfBirth + " года" + '\n' +
                "Возраст (лет) - " + age + '\n' +
                "Адрес электронной почты - " + email + '\n' +
                "Номер телефона - " + phoneNumber + '\n' +
                "Вес (кг) - " + weight + '\n' +
                "Давление - " + pressure + '\n' +
                "Количество пройденных за день шагов - " + numberOfSteps + '\n' + '\n';
    }
}



