package DesignPattern.PrototypePattern.seniorIntroduction;

/**
 * Description:
 * Created by 徐礼林 on 2017/5/9.
 */
public class Client {
    public static void main(String[] args) {
        Resume resume = new Resume("春杰");
        Resume copy = resume.clone();
        resume.display();
        copy.setPersonalInfo("男","10");
        copy.setWorkExperience("2017-2018","Hand");
        copy.display();
    }
}
