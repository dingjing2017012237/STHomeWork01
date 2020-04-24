package service;

import entity.Student;

public interface StudentService {
    //1.先解决初始化问题
    void doInitStudent();
    //1.新增人员
    boolean doAddStudentToStudentManager(Student student);
    //2.删除人员
    boolean doDelStudentToStudentManager(Student student);

    //删除人员
    void doDelStudentToStudentManager(int id);

    //3.修改人员
    boolean doUpdStudentToStudentManager(Student student);
    //4.查人员
    void doFindById(int id);
    //5.输出人员
    void doPrintAll();
	void doInitStudnet();
}