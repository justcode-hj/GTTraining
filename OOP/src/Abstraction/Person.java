package Abstraction;

public abstract class Person {
    private String Name;

    private String Gender;

    public Person(String nm, String Gen) {

        this.Name = nm;

        this.Gender = Gen;

    }

    public abstract void work();

    @Override

    public String toString() {

        return "Name=" + this.Name + "::Gender=" + this.Gender;

    }

    public void changeName(String newName) {

        this.Name = newName;

    }

    public void Exam() {
    }

    public void Office() {
    }

}
