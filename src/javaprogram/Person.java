package javaprogram;

public class Person {
    String firstName;   //instance variables
    String lastName;  //instance variables
    int age;   //instance variables

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

    }


    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public int Age() {

        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.isEmpty() ? "" : firstName;


    }

    public void setLastName(String lastName) {
        this.lastName = lastName.isEmpty() ? "" : lastName;

    }

    public void setAge(int age) {
        this.age = (age >= 0 && age <= 100) ? age : 0;

    }

    public boolean isTeen() {
        return (age > 12 && age < 20);

    }


    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }
}

