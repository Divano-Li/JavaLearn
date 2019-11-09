package DesignPattern.chapter1.senior;

/**
 * Description:
 * Created by 徐礼林 on 2017/4/15.
 */
public class OperationFactory {
     public Operation op ;
     public Operation getOperation(String operator){
         switch(operator){
             case "+":
                 op =  new AddOperation();
                 break;
             case "-":
                 op = new MinsOperation();
                 break;
         }
         return op;
     }
}
