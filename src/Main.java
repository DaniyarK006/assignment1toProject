import models.Teacher;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        File file = new File("src/students.txt");
        Scanner in = new Scanner(System.in);
        double percent=100;

        while (in.hasNextLine()){
            String line = in.nextLine();
            String[] tokens = line.split(",");
            String name = tokens[0];
            String surname = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String gender = tokens[3];
            List<Integer> grades=new ArrayList<Integer>();
            for(int i=4;i<tokens.length;++i){
                grades.add(Integer.parseInt(tokens[i]));
            }
        }

        file = new File("src/teachers.txt");
        in=new Scanner(file);

        while(in.hasNext()){

            String name = in.next();
            String surname = in.next();
            int age = in.nextInt();
            boolean gender = in.next();
            String subject = in.next();
            int yearsOfExperience = in.nextInt();
            int salary = in.nextInt();

            Teacher teacher = new Teacher(name, surname, age, gender, subject, yearsOfExperience, salary);
            School.addTeacher(teacher);
        }
        System.out.println(School);

        for (Student student : School.getStudents()) {
            System.out.println(student.getName() + " " + student.getSurname() + " has a GPA of " + student.calculateGPA()+"\n");
        };

        for(Teacher teacher:School.getTeacher()){
            teacher.giveRaise(teacher.getYearsOfexperience(), percantage);
            String IsSalary= teacher.israised(10);
            System.out.println(teacher.getName() +" "+ teacher.getSurname() + IsSalary);;;
        }

    }
}