package HomeTask.HomeTask;

public class Human {
    int age;

    public Human(int age) {
        this.age = age;
    }

    public void setVoice() {
        System.out.println("I can speak!");
    }
}

class Person extends Human{
    String name;
    String surname;

    public Person(int age, String name, String surname) {
        super(age);
        this.name = name;
        this.surname = surname;
    }

}

class Engineer extends Person {
    public void inviteTest() {
        System.out.println(name + "Write code!");
    }

    public void executeCode() {
        System.out.println(name + "Execute code!");
    }

    public Engineer(int age, String name, String surname)
    {
        super(age, name, surname);
    }
}

class AutomatedQA extends Engineer{

    public AutomatedQA(int age, String name, String surname)
    {
        super(age, name, surname);
    }


}
class ManualQA extends Engineer{

    public ManualQA(int age, String name, String surname) {
        super(age, name, surname);
    }

}


