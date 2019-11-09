package DesignPattern.FactoryMethodPattern;

/**
 * Description:
 * Created by 徐礼林 on 2017/5/9.
 */
public class MinsOperationFactory  extends OperationFactory{
    @Override
    Operation createOperation() {
        return new MinsOperation();
    }
}
