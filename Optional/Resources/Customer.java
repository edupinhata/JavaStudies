package Resources;

// Basic Customer class to use as examples

public class Customer{

    private String name;
    private int age;
    private String socialNumber;

    public Customer(String name, int age, String socialNumber) {
        this.name = name;
        this.age = age;
        this.socialNumber = socialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }
}
