package dao;

import entity.Student;

public interface StudentDao {
    //1.先解决初始化问题
    void doInitStudent();
    //1.新增学生
    boolean doAddStudentToStudentManager(Student student);
    //2.删除学生
    void doDelStudentToStudentManager(int id);
    //3.修改学生信息
    boolean doUpdStudentToStudentManager(Student student);
    //4.查询学生信息
    void doFindById(int id);
    //5.输出学生信息
    void doPrintAll();
}