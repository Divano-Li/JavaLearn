package annotation.first;


import sun.awt.SunHints;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by 徐礼林 on 2017/4/8.
 */
public class AppleTest {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Apple apple = new Apple();
        Method[] methods = Apple.class.getDeclaredMethods();
        for(Method method:methods){
            boolean hasAnnotation = method.isAnnotationPresent(FruitName.class);
            if(hasAnnotation){
                FruitName fruitName = method.getAnnotation(FruitName.class);
                method.invoke(apple,fruitName.value());
            }
        }
        Field[] fields = Apple.class.getDeclaredFields();
        for(Field field : fields){
            boolean hasAnnotation  = field.isAnnotationPresent(FruitColor.class);
            if(hasAnnotation){
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                apple.setAppleColor(fruitColor.fruitColor().toString());
            }
        }
        System.out.print("水果名："+apple.getAppleName()+"  水果的颜色："+apple.getAppleColor());
    }
}
