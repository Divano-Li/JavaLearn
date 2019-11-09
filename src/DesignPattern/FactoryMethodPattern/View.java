package DesignPattern.FactoryMethodPattern;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Description:
 * Created by 徐礼林 on 2017/5/9.
 */
public class View {
    public static void main(String[] args) {
        try {
            BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入一个数  ：");
            String paraA = br.readLine();
            System.out.println("请输入运算符号 ： ");
            String operation  = br.readLine();
            System.out.println("请输入另一个数 : ");
            String paraB = br.readLine();
            OperationFactory op =null;
            switch (operation){
                case "+":
                    op = new AddOperationFactory();
                    break;
                case "-":
                    op = new MinsOperationFactory();
                    break;
            }
            op.createOperation().getResult(paraA,paraB);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
