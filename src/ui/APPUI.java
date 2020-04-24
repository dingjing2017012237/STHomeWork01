package ui;

import java.util.Scanner;

import entity.Student;
import service.StudentServiceImpl;
import uitl.StudentUtil;

public class APPUI {

    Scanner in =  new Scanner(System.in);
    StudentServiceImpl psi = new StudentServiceImpl() {
    	
        @Override
        public boolean doDelStudentToStudentManager(Student student) {
            return false;
        }

		@Override
		public void doInitStudnet() {
			// TODO Auto-generated method stub
			
		}

		
    };
    public void getMenu(){
    	
    	//初始化
    	
    	System.out.println("请选择操作(1-2):");
    	psi.doInitStudent();
    	System.out.println("**********************************");
        System.out.println("**		1、管理		**");
        System.out.println("**		2、退出		**");
        System.out.println("**********************************");
        System.out.println();
        
        int choice = in.nextInt();
        switch (choice){
            case 1:
                //实现学生管理
            	getStudentMenu();
                break;
            case 2:
                System.exit(0);
                break;
        }
    }
    public void getStudentMenu(){
    	System.out.println("请选择操作(1-6):");
    	System.out.println("**********************************");
        System.out.println("**		1、插入		**");
        System.out.println("**		2、查找		**");
        System.out.println("**		3、删除		**");
        System.out.println("**		4、修改		**");
        System.out.println("**		5、输出		**");
        System.out.println("**		6、退出		**");
        System.out.println("**********************************");
        
        
        int choice = in.nextInt();
        switch (choice){
            //新增人员
            case 1:
                Student student =new StudentUtil().getStudent("插入");
                psi.doAddStudentToStudentManager(student);
                psi.doPrintAll();
                getStudentMenu();
                break;
              //查询信息    
            case 2:
                int id1 = new StudentUtil().getStudentsId("查找");
                psi.doFindById(id1);
                getStudentMenu();
                break;
                //删除人员
            case 3:
                int id = new StudentUtil().getStudentsId("删除");
                psi.doDelStudentToStudentManager(id);
                psi.doPrintAll();
                getStudentMenu();
                break;
                //修改信息
            case 4:
                Student student2 =new StudentUtil().getStudent("修改");
                psi.doUpdStudentToStudentManager(student2);
                psi.doPrintAll();
                getStudentMenu();
                break;
                //全部查询
            case 5:
                psi.doPrintAll();
                getStudentMenu();
                break;
                //返回上一层
            case 6:
                getMenu();
                break;
        }
    }
    public static void main(String[] args){
        new APPUI().getMenu();
    }
}