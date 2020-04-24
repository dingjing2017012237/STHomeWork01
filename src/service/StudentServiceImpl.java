package service;

import dao.StudentDaoImpl;
import entity.Student;

public abstract class StudentServiceImpl implements StudentService {

    StudentDaoImpl pdidao = new StudentDaoImpl();

    @Override
    public void doInitStudent() {
        pdidao.doInitStudent();
    }
//新增人员
    @Override
    public boolean doAddStudentToStudentManager(Student student) {
        boolean b = pdidao.doAddStudentToStudentManager(student);
        if(b){
            System.out.println("新增成功！");
            return true;
        }else {
            System.out.println("新增失败!");
            return false;
        }
    }


    //删除人员
    @Override
    public void doDelStudentToStudentManager(int id) {
    pdidao.doDelStudentToStudentManager(id);
    }

    @Override
    public boolean doUpdStudentToStudentManager(Student student) {
        boolean  b= pdidao.doUpdStudentToStudentManager(student);
        if(b){
            System.out.println("修改成功！");
            return true;
        }else {
            System.out.println("修改失败!");
            return false;
        }
    }
    //4.单查
    @Override
    public void doFindById(int id) {
        pdidao.doFindById(id);

    }

    //5.全查信息
    @Override
    public void doPrintAll() {
        pdidao.doPrintAll();

    }

}
