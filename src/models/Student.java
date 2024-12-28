package models;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Student extends Person {
    private int id;
    private List<Integer> grades;
    private static int idGenerator = 1;

    private void assignId() {
        this.id = idGenerator++;
    }

    public Student(String name, String surname, int age, String genderString, List<Integer> grades) {
        super(name, surname, age, genderString);
        assignId();
        this.grades = new ArrayList<>(grades);
    }

    public double calculateGPA() {
        double sum = grades.stream().mapToInt(Integer::intValue).sum();
        double average = grades.isEmpty() ? 0 : sum / grades.size();

        return average >= 90 ? 4.0 :
                average >= 80 ? 3.0 :
                        average >= 70 ? 2.0 :
                                average >= 60 ? 1.0 : 0.0;
    }

    public void addGrades(List<Integer> newGrades) {
        grades.addAll(newGrades);
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + id + ".";
    }
}
