package DesignPattern.PrototypePattern.deepCopy;

/**
 * Description:
 * Created by 徐礼林 on 2017/5/10.
 */
public class Client {
    public static void main(String[] args) {
        Resume resume = new Resume("Divano_Li");
        resume.setWorkExperience("2016-2017","Hand");
        resume.setPersonalInfo("male","24");

        //复制对象1
        Resume re = resume.clone();
        re.setPersonalInfo("female","25");
        re.setWorkExperience("2017-2018","Baidu");

        //复制对象2
        Resume re1 = resume.clone();
        re1.setPersonalInfo("female1","26");
        re1.setWorkExperience("2018-2019","Alibaba");

        //展示(工作经历都是不一样了--这就是深复制)
        resume.display();
        re.display();
        re1.display();
    }
}
