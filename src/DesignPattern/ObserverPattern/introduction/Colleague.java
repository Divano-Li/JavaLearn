package DesignPattern.ObserverPattern.introduction;

/**
 * Description:
 * Created by 徐礼林 on 2017/5/19.
 */
public class Colleague {
    private String name;
    private String status;
    public Colleague(String name,String status){
        this.name = name;
        this.status = status;
    }
    //更新自己的状态
    public void update(){
        System.out.print("员工： " +name+ " 在 "+status);
        status = "认真工作";
        System.out.println( " 现在在 "+status);
    }
}
