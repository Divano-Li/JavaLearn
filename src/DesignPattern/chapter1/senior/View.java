package DesignPattern.chapter1.senior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Description:
 * Created by 徐礼林 on 2017/4/15.
 */
public class View {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个数A : ");
        try {
            String paraA  = br.readLine();
            System.out.println("请输入一个符号B(+ - / *) : ");
            String operator = br.readLine();
            System.out.println("请输入另一个数C : ");
            String paraC =br.readLine();
            //运用了多态：多态的三个条件：继承，重写，父类的引用指向子类的对象
            Operation op = new AddOperation();
            System.out.println("运算结果 : "+op.getResult(paraA,paraC));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
