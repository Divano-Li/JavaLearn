package DesignPattern.ObserverPattern.introduction;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * Created by 徐礼林 on 2017/5/19.
 */
public class Secretary {
    private String name;
    private String bossAction;

    public Secretary(String name){
        this.name = name;
    }
    public String getBossAction() {
        return bossAction;
    }
    public void setBossAction(String bossAction) {
        this.bossAction = bossAction;
    }
    public List<Colleague> colleagues =new ArrayList<Colleague>();
    public void add(Colleague colleague){
        colleagues.add(colleague);
    }
    public void notifys(){
        for(Colleague colleague : colleagues){
            colleague.update();
        }
    }
}
