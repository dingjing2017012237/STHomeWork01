package dao;

import entity.Student;
import entity.StudentManager;

public class StudentManagerDaoImpl implements StudentManagerDao {

	StudentManager[] table = new StudentManager[4];

    
    @Override
    public StudentManager[] getTable() {

        // （1）定义前2个表为男生表
        for(int i =0;i<=1;i++){
            table[i] = new StudentManager((i),new Student[6],"男");
        }

        // （2）定义后2个表为女生表
        for(int i=2;i<table.length;i++){
            table[i] = new StudentManager((i),new Student[6],"女");
        }

        return table;
    }
}
