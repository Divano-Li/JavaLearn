package DesignPattern.PrototypePattern.introduction;
/**
 * Description:
 * Created by 徐礼林 on 2017/5/9.
 */
public class ResumeView {
    public static void main(String[] args) {
        Resume resume = new Resume("春杰");
        resume.setPersonalInfo("男","23");
        resume.setWorkExperience("2016-2017","Hand");
        resume.display();
    }
}
