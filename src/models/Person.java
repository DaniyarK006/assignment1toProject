package models;

public class Person{
    protected String name;
    protected String surname;
    protected int age;
    protected boolean gender;

    public Person(String name,String surname,int age,boolean gender){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public boolean gender(){
        return gender;
    }

    public int age(){
        return age;
    }

    public String surname(){
        return surname;
    }

    public String name(){
        return name;
    }
    @Override
    public String toString(){
        String genderString = gender ? "Male" : "Female";
        return " Hi, I'm " + name + " " + surname + " " + age + " " + genderString + " . "  ;
    }
}