package Logik;

import lombok.Data;


public  final class Customer {
    private String firstName;
    private String secondName;
    private int age;
    private Adress adress;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public Adress getAdress() {
        return adress;
    }
}
