package Chapter11.Homework;

public class Homework01 {
    public static void main(String[] args) {
        Car c = new Car(); // 9.0 red
        Car c1 = new Car(100);
        // 100.0 red(自己写成了white,注意color这个属性是static，只会随着类的加载执行一次)
        // 如果不是static，则输出white
        System.out.println(c);
        System.out.println(c1);

    }
}

class Car {
    double price = 10;
    String color = "white";

    public String toString() {
        return price + "\t" + color;
    }

    public Car() {
        this.price = 9;
        this.color = "red";
    }

    public Car(double price) {
        this.price = price;
    }
}