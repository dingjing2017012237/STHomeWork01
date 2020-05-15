package service;

import entity.Student;

public interface StudentService {
	//问题（4）注释要清晰
    //1.初始化问题
    void doInitStudent();
    //2.新增人员
    boolean doAddStudentToStudentManager(Student student);
    //3.删除人员（输出）
    boolean doDelStudentToStudentManager(Student student);
    //4.删除人员
    void doDelStudentToStudentManager(int id);
    //5.修改人员
    boolean doUpdStudentToStudentManager(Student student);
    //6.查寻人员
    void doFindById(int id);
    //7.输出人员
    void doPrintAll();
    //8.刷新
	void doInitStudnet();
}