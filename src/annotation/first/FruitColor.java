package annotation.first;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by 徐礼林 on 2017/4/8.
 */
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitColor {
    /**
     * 颜色枚举
     */
    public enum Color{Bule,Red,Green};

    /**
     * 颜色属性
     */
    Color fruitColor() default Color.Green;
}
