package DesignPattern.chapter1.primary;

/**
 * Description:
 * Created by 徐礼林 on 2017/4/13.
 */
public class Operation {
    public String operation(String A,String B,String C){
        String result = "";
        switch (B){
            case "+":
                result = String.valueOf(Double.parseDouble(A)+Double.parseDouble(C));
                break;
            case "-":
                result =  String.valueOf(Double.parseDouble(A)-Double.parseDouble(C));
                break;
            case "*":
                result = String.valueOf(Double.parseDouble(A)*Double.parseDouble(C));
                break;
            case "/":
                if("0".equals(C)){
                    System.out.println("除数不为0");
                    break;
                }else{
                    result =  String.valueOf(Double.parseDouble(A)/Double.parseDouble(C));
                    break;
                }
        }
        return result;
    }
}
