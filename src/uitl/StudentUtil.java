package uitl;

import java.util.Scanner;

import entity.Student;

public class StudentUtil {

    Scanner in =new Scanner(System.in);

    //获取到新的人员信息
    public Student getStudent(String str){
        System.out.println("请你输入需要"+str+"的学生学号：");
        int id = in.nextInt();
        System.out.println("请你输入需要"+str+"的学生姓名：");
        String name = in.next();
        System.out.println("请你输入需要"+str+"的学生生日：");
        String birDate = in.next();
        System.out.println("请你输入需要"+str+"的学生性别：");
        String gender = in.next();

        Student student = new Student(id,name,birDate,gender);
        return student;
    }
    public int getStudentsId(String str){
        System.out.println("请您输入需要"+str+"的学生学号:");
        int id=in.nextInt();
        return id;
    }
}