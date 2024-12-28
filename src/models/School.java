package models;

import java.util.ArrayList;

public class School {
    private String name;
    private final ArrayList<Student> students;
    private final ArrayList<Teacher> teachers;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        if (student != null) {
            students.add(student);
        }
    }

    public void addTeacher(Teacher teacher) {
        if (teacher != null) {
            teachers.add(teacher);
        }
    }

    public ArrayList<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public ArrayList<Teacher> getTeachers() {
        return new ArrayList<>(teachers);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("School: " + name + "\n");
        result.append("Students:\n");
        students.forEach(student -> result.append(student).append("\n"));
        result.append("Teachers:\n");
        teachers.forEach(teacher -> result.append(teacher).append("\n"));
        return result.toString();
    }
}

