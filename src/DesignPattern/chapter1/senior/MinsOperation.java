package DesignPattern.chapter1.senior;

/**
 * Description:
 * Created by 徐礼林 on 2017/4/15.
 */
public class MinsOperation extends Operation {
    @Override
    public Double getResult(String paraA,String paraB){
        return Double.parseDouble(paraA)-Double.parseDouble(paraB);
    }
}
