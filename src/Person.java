public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phoneNumber;
    private String city;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public Person(String firstName, String lastName, int age, String email, String phoneNumber, String city) {
        this(firstName, lastName, age);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getCity() {
        return this.city;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 10) {
            this.phoneNumber = phoneNumber;
        }
    }

    public void setCity(String city) {
        this.city = city;
    }

    // toString
    public String toString() {
        return "First Name: " + this.firstName + "\nLast Name: " + this.lastName + "\nAge: " + this.age + "\nEmail: "
                + this.email + "\nPhone Number: " + this.phoneNumber + "\nLived From: " + this.city;
    }
}
