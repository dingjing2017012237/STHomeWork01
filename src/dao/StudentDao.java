package dao;

import entity.Student;

public interface StudentDao {
    //1.初始化问题
    void doInitStudent();
    //2.新增学生
    boolean doAddStudentToStudentManager(Student student);
    //3.删除学生
    void doDelStudentToStudentManager(int id);
    //4.修改学生信息
    boolean doUpdStudentToStudentManager(Student student);
    //5.查询学生信息
    void doFindById(int id);
    //6.输出学生信息
    void doPrintAll();
}