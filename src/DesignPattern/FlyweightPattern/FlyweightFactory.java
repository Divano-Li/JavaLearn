package DesignPattern.FlyweightPattern;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Description:
 * Created by 徐礼林 on 2017/12/27.
 */
public class FlyweightFactory {
    private HashMap flyweights = new HashMap();
    public Flyweight getFlyweight(int a){
        Flyweight flyweight = (Flyweight)flyweights.get(a);
        if(flyweight == null){
            //产生新的concreteFlyweight
            flyweight = new ConcreteFlyweight(a);
            flyweights.put(a,flyweight);
        }
        return flyweight;
    }
    public int getFlyweightSize(){
        return  flyweights.size();
    }
}
