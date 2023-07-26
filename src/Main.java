public class Main {
    public static void main(String[] args) {
        Person personOne = new Person("John", "Doe", 30);
        Person personTwo = new Person("Jane", "Doe", 25, "email@email.com",
                "555-555-5555", "Izmir");
        Wall wall = new Wall(5, 4);

        System.out.println("----------------------------------------");
        System.out.println("Person One");
        System.out.printf("First Name: %s%nLast Name: %s%nAge: %s%n", personOne.getFirstName(), personOne.getLastName(),
                personOne.getAge());
        System.out.println("----------------------------------------");
        System.out.println("Person Two");
        System.out.printf("First Name: %s%nLast Name: %s%nAge: %s%nEmail: %s%nPhone Number: %s%nCity: %s%n",
                personTwo.getFirstName(), personTwo.getLastName(), personTwo.getAge(), personTwo.getEmail(),
                personTwo.getPhoneNumber(), personTwo.getCity());
        System.out.println("----------------------------------------");
        System.out.println("Wall");
        System.out.printf("Width: %s%nHeight: %s%nArea: %s%n", wall.getWidth(), wall.getHeight(), wall.getArea());
        System.out.println("-----------------");
        wall.setHeight(-1.5);
        System.out.printf("Width: %s%nHeight: %s%nArea: %s%n", wall.getWidth(), wall.getHeight(), wall.getArea());
        System.out.println("----------------------------------------");

    }
}