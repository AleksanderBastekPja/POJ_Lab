// zad 4.1
class Circle {
    double radius = 1.0;
    String color = "blue";

    Circle() {}
    Circle(double radius) {
        this.radius = radius;
    }

    Circle(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.pow(this.radius, 2.0)*Math.PI;
    }

    public String toString() {
        return "radius=" + radius +
                ", colour=" + color;
    }
}

class Cylinder extends Circle {
    double height = 4.0;
    Cylinder() {}
    Cylinder(double radius) {
        this.radius = radius;
    }

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return height * radius;
    }
}

class TestCircleAndCylinder {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Cylinder cylinder1 = new Cylinder();
        Circle circle2 = new Circle("red");
        Cylinder cylinder2 = new Cylinder(4.0, 5.0);

        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());
        System.out.println(circle2.toString());

        System.out.println(cylinder2.getHeight());
        System.out.println(cylinder2.getArea());
        System.out.println(cylinder2.toString());

    }
}

// zad 4.2

class Car {
    int speed;
    double regularPrice;
    String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getRegularPrice() {
        return regularPrice;
    }
}

class Sedan extends Car implements Purchase {
    int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    double getSalePrice() {
        return length > 20 ? 5 : 10;
    }
}

class Ford extends Car implements Purchase {
    int year;
    int manufacturerDiscount;
    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }
    double getSalePrice() {
        return regularPrice * manufacturerDiscount;
    }
}

class Truck extends Car implements Purchase {
    int weight;
    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    double getSalePrice() {
        return regularPrice * (weight > 2000 ? 1.1 : 1);
    }
}

interface Purchase {
    default String getPurchaseInfo() {
        return getClass().getName();
    }
}

class AutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(160, 20000, "red", 10);
        Ford ford1 = new Ford(156, 4452.0 ,"black", 2005, 10);
        Ford ford2 = new Ford(156, 4452.0 ,"black", 2005, 10);
        Truck truck = new Truck(200, 500000, "gold", 5000);

        System.out.printf("%1s: %1s%n", sedan.getPurchaseInfo(), sedan.getSalePrice());
        System.out.printf("%1s: %1s%n", ford1.getPurchaseInfo(), ford1.getSalePrice());
        System.out.printf("%1s: %1s%n", ford2.getPurchaseInfo(), ford2.getSalePrice());
        System.out.printf("%1s: %1s%n", truck.getPurchaseInfo(), truck.getSalePrice());

    }
}
