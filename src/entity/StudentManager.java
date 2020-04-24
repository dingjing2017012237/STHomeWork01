package entity;

import entity.Student;

public class StudentManager {
    private int rid;        // 学生编号
    private Student[] students;// 学生人数
    private String type;    // 类型

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public StudentManager() {
    }

    public StudentManager(Student[] students, String type) {
        this.students = students;
        this.type = type;
    }

    public StudentManager(int rid, Student[] students, String type) {
        this.rid = rid;
        this.students = students;
        this.type = type;
    }

    public String toString(){
        return "学生编号:"+rid+",学生人数:"+students.length+",类型:"+type;
    }
}
