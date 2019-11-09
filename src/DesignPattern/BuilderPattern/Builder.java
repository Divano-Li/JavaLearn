package DesignPattern.BuilderPattern;

/**
 * Description:
 * Created by 徐礼林 on 2017/5/17.
 */
public abstract class Builder
{
    public abstract void  BuildPartA();
    public abstract void  BuildPartB();
    public abstract Product getResult();
}
