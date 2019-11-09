package DesignPattern.chapter1.primary;

import DesignPattern.chapter1.primary.Operation;

/**
 * Description:继承
 * Created by 徐礼林 on 2017/4/13.
 */
public class SqrtOperation extends Operation {
    public String operation(String A,String B,String C){
        String result = "";
        switch (B){
            case "sqrt":
                result = String.valueOf(Math.sqrt(Double.parseDouble(A)));
                break;
        }
        return result;
    }
}
