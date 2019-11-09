
package DesignPattern.StrategyPattern.StrategyBindFactory;


import DesignPattern.StrategyPattern.method1Senior.CashFactory;
import DesignPattern.StrategyPattern.method1Senior.CashSuper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Description: 收银界面
 * Created by 徐礼林 on 2017/4/22.
 */
public class CashView {
    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("单价 ：");
            Double price = Double.parseDouble(br.readLine());
            System.out.println("数量 ：");
            Double num = Double.parseDouble(br.readLine());
            System.out.println("选择打折方式(正常收费/满300减100/打8折)");
            String  flag = br.readLine();
            //这里不再使用简单工厂类来获取收费对象而是通过策略与工厂结合的方式进行收费
            //好处就是指需要一个Context上下文类就可以进行收费计算
            //CashSuper cs = new CashFactory().createCashAccept(flag);
            Context ct = new Context(flag);
            Double money = ct.getResult(price*num);
            System.out.println("应收取："+money);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
