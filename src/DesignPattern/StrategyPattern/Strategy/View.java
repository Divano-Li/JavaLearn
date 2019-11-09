package DesignPattern.StrategyPattern.Strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Description:
 * Created by 徐礼林 on 2017/4/23.
 */
public class View {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("选择一种策略(正常收费/打8折/满300减100) ：");
        String flag= br.readLine();
        switch(flag){
            case  "正常收费" :
                Context ctA = new Context(new ConcreteStrategyA());
                ctA.contextInterface();
                break;
            case "打8折":
                Context ctB = new Context(new ConcreteStrategyB());
                ctB.contextInterface();
                break;
            case "满300减100":
                Context ctC = new Context(new ConcreteStrategyC());
                ctC.contextInterface();
                break;
        }
    }
}
