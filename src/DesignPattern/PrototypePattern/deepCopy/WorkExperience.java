package DesignPattern.PrototypePattern.deepCopy;

/**
 * Description:
 * Created by 徐礼林 on 2017/5/10.
 */
public class WorkExperience implements Cloneable{
    String timeArea;
    String company;
    public WorkExperience clone(){
        WorkExperience workExperience = null;
        try {
            workExperience = (WorkExperience) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return workExperience;
    }
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