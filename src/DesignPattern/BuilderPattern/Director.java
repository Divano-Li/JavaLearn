package DesignPattern.BuilderPattern;

/**
 * Description:具体的product的构建及装配顺序由它决定
 * Created by 徐礼林 on 2017/5/17.
 */
public class Director {
    public void  construct(Builder builder){
        builder.BuildPartA();
        builder.BuildPartB();
    }
}
