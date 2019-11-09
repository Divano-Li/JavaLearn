package DesignPattern.PrototypePattern.shallowCopy;

/**
 * Description:浅复制
 * Created by 徐礼林 on 2017/5/10.
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private WorkExperience workExperience;
    public Resume(String name){
        this.name = name;
        workExperience = new WorkExperience();}
    public Resume clone(){
        Resume resume = null;
        try {
            resume = (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resume; }
    //设置个人信息
    public void setPersonalInfo(String sex ,String age){
        this.sex = sex;
        this.age = age;}
    //设置工作经历
    public void setWorkExperience(String timeArea,String company){
        workExperience.timeArea =timeArea;
        workExperience.company = company;}
    //展示
    public  void display(){
        System.out.println("姓名 ：   "+this.name+" 年龄 ："+this.age+" 性别 ："+this.sex);
        System.out.println("工作经历："+workExperience.timeArea+" : "+workExperience.company);
    }
}
