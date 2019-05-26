import java.util.Random;

public class Wheel {
    private int value;
    private String color;
    Random random;

    public Wheel() {
        value=0;
        color=null;
        random=new Random();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void display(){
        System.out.print(value+" "+color);
    }

    public void spin(){
        value = random.nextInt(37)+1;
        color = (random.nextInt(1)==0)?"Red":"Black";
    }
}
