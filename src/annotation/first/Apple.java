package annotation.first;

/**
 * Created by 徐礼林 on 2017/4/8.
 */
public class Apple {

    private String appleName;

    @FruitColor(fruitColor = FruitColor.Color.Bule)
    private String appleColor;

    public String getAppleName() {
        return appleName;
    }
    @FruitName(value = "Apple")
    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }
    public void display(){
        System.out.print("名字："+ this.appleName+"颜色:"+this.appleColor);
    }
}
