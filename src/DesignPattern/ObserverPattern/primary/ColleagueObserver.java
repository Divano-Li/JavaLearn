package DesignPattern.ObserverPattern.primary;

/**
 * Description:
 * Created by 徐礼林 on 2017/5/19.
 */
public abstract class ColleagueObserver {
    private String name;
    private String status;
    public ColleagueObserver(String name,String status){
        this.name = name;
        this.status = status;
    }
    public abstract  void update();
}
