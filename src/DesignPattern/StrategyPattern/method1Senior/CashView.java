
package DesignPattern.StrategyPattern.method1Senior;


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
            CashSuper cs = new CashFactory().createCashAccept(flag);
            System.out.println("应收取："+cs.acceptCash(price*num));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
