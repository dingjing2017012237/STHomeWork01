package entity;

public class Student {
    private int id;        			// 学号
    private String name;    		// 姓名
    private String birDate; 		//生日
    private String gender;     		// 性别

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirDate() {
        return birDate;
    }

    public void setBirDate(String birDate) {
        this.birDate = birDate;
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student() {
    }

    public Student(String name, String birDate) {
        this.name = name;
        this.birDate = birDate;
    }

    public Student(int id, String name, String birDate, String gender) {
        this.id = id;
        this.name = name;
        this.birDate = birDate;
        this.gender=gender;
    }

    public String toString(){
        return "学号:"+id+",姓名:"+name+",生日:"+birDate+",性别:"+gender;
    }
}