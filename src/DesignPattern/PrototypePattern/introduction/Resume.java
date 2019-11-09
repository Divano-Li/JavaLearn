package DesignPattern.PrototypePattern.introduction;
/**
 * Description:简历类
 * Created by 徐礼林 on 2017/5/9.
 */
public class Resume {
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;
    public Resume(String name){
        this.name = name;
    }
    //设置个人信息
    public void setPersonalInfo(String sex,String age){
        this.sex = sex;
        this.age = age;
    }
    //设置工作经历
    public void setWorkExperience(String timeArea,String company){
        this.timeArea = timeArea;
        this.company = company;
    }
    //展示
    public  void display(){
        System.out.println("姓名 ：   "+this.name+" 年龄 ："+this.age+" 性别 ："+this.sex);
        System.out.println("工作经历："+this.timeArea+" : "+this.company);
    }
}
