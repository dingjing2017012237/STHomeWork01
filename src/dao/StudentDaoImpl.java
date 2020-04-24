package dao;

import entity.Student;
import entity.StudentManager;

public class StudentDaoImpl implements StudentDao {
    // 学生从哪里获取的
	StudentManagerDaoImpl rdi = new StudentManagerDaoImpl();
	StudentManager[] table = rdi.getTable();
    @Override
    public void doInitStudent() {
        Student p1 = new Student(101,"小黄","19990102","男");
        Student p2 = new Student(103,"小黑","19981008","男");
        Student p3 = new Student(102,"小红","19980318","女");
        
        table[0].getStudents()[0] = p1;
        table[0].getStudents()[1] = p2;

        table[2].getStudents()[0] = p3;

    }

    /***
     * 2.新增
     * @param person ： 来源自于PersonUtil
     * @return true 代表成功，false代表失败
     */
    @Override
    public boolean doAddStudentToStudentManager(Student student) {
        
        if(student.getGender().equals("男")){      
            for (int i =0;i<2;i++){
                for(int j=0;j<table[i].getStudents().length;j++){  
                    if(table[i].getStudents()[j]==null){
                        table[i].getStudents()[j] = student;
                        return true;
                    }

                }
            }
        }else if(student.getGender().equals("女")){ 
            for (int i =2;i<table.length;i++) {
                for (int j = 0; j < table[i].getStudents().length; j++) {  
                    if (table[i].getStudents()[j] == null) {
                    	table[i].getStudents()[j] = student;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //3.删除人员
    public void doDelStudentToStudentManager(int id){
        for (int i=0;i<table.length;i++){
            if (table[i].getStudents()!=null) {
                for (int j = 0; j < table[i].getStudents().length; j++) {
                    if (table[i].getStudents()[j].getId() == id) {
                    	table[i].getStudents()[j] = null;
                        System.out.println("删除成功");
                        break;
                    }else{
                        System.out.println("人员不存在");
                        break;
                    }
                }
            }
            break;
        }
    }
    
    //4.修改人员
    public boolean doUpdStudentToStudentManager(Student student){
        for (int i=0;i<table.length;i++){
            if (table[i].getStudents()!=null) {
                for (int j = 0; j < table[i].getStudents().length; j++) {
                    if (table[i].getStudents()[j].getId() == student.getId()) {
                    	table[i].getStudents()[j] = student;
                        return true;
                    }else{
                        return false;
                    }
                }
            }
        }
        return false;
    }


    //5.查信息
    @Override
    public void doFindById(int id) {
        for (int i=0;i<table.length;i++){
            if (table[i].getStudents()!=null) {
                for (int j = 0; j < table[i].getStudents().length; j++) {
                    if (table[i].getStudents()[j].getId() == id&&table[i].getStudents()[j]!=null) {
                        System.out.println(table[i].getStudents()[j]);
                        break;
                    }else{
                        System.out.println("人员不存在");
                        break;
                    }
                }
            }break;
        }

    }

    /**
     * 6.所有信息
     */
    @Override
    public void doPrintAll() {
        
        for(int i=0;i<table.length;i++){

            int num = 0;   //刚开始都没有人

            //打印人员信息
            if(table[i].getStudents()!=null){
                for(int j=0;j<table[i].getStudents().length;j++){
                    if(table[i].getStudents()[j]!=null){
                        num++;
                    }
                }
            //打印信息
                System.out.println("当前表为:"+table[i].getRid()+",此表当前人数为:"+num+",表类型为:"+table[i].getType()+"生");

                for(int j=0;j<table[i].getStudents().length;j++){
                    if(table[i].getStudents()[j]!=null){
                        System.out.println(table[i].getStudents()[j]);
                    }
                }
            }
            System.out.println();
        }

    }


}
