package DesignPattern.PrototypePattern.shallowCopy;

/**
 * Description:
 * Created by 徐礼林 on 2017/5/10.
 */
public class WorkExperience implements Cloneable{
     String timeArea;
     String company;
    public String getTimeArea() {
        return timeArea;
    }
    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
}
