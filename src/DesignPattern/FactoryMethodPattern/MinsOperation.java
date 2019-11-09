package DesignPattern.FactoryMethodPattern;

/**
 * Description:
 * Created by 徐礼林 on 2017/5/9.
 */
public class MinsOperation extends Operation {
    @Override
    public void getResult(String paraA,String paraB) {
        Double d = Double.parseDouble(paraA)-Double.parseDouble(paraB);
        System.out.println("结果为："+ d);
    }
}
