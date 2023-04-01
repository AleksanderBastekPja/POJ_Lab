class Circle {
    private double radius;
    private int colour;

    Circle() {
        this.radius = 2.0;
        this.colour = 0x000000;
    }

    Circle(double radius) {
        this.radius = radius;
        this.colour = 0x000000; // załóżmy że colour jest w HEX
    }
    Circle(double radius, int colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getColour() {
        return this.colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }

    public double getArea() {
        return Math.pow(this.radius, 2.0)*Math.PI;
    }

    @Override
    public String toString() {
        return "radius=" + radius +
                ", colour=" + colour;
    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle circleA = new Circle();
        Circle circleB = new Circle(3.0);
        Circle circleC = new Circle(4.0, 0x05f000);

        System.out.printf("circleA: radius=%1s area=%1s%n", circleA.getRadius(), circleA.getArea());
        System.out.printf("circleA: radius=%1s colour=%1s%n", circleA.getRadius(), circleA.getColour());
        System.out.printf("circleB: radius=%1s area=%1s%n", circleB.getRadius(), circleB.getArea());
        System.out.printf("circleB: radius=%1s colour=%1s%n", circleB.getRadius(), circleB.getColour());
        System.out.printf("circleC: radius=%1s area=%1s%n", circleC.getRadius(), circleC.getArea());
        System.out.printf("circleC: radius=%1s colour=%1s%n", circleC.getRadius(), circleC.getColour());
        System.out.println(circleC.toString());
    }
}

class Author {
    private String name;
    private String surname;
    private int age;

    Author(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Author name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age;
    }
}

class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Friedrich", "Nietzche", 62);
        Author author2 = new Author("Franz", "Kafka", 38);
        Author author3 = new Author("Jonathan", "Edwards", 56);

        System.out.println(author1.toString());
        System.out.println(author2.toString());
        System.out.println(author3.toString());
    }
}
