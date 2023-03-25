import java.util.Scanner;
import java.io.IOException;

public class Classes1803 {
    public static void main(String[] args) {
        VehicleProg vp = new VehicleProg();
        vp.setSportsCar(new Vehicle(4, 60, 17));
        vp.setMiniVan(new Vehicle(7, 50, 14));
        vp.range();
    }
}

// exercise 2.1 2.2
class Human {
    String imie;
    String nazwisko;
    int grupa;
    String kierunek;

    public Human(
            String imie,
            String nazwisko,
            int grupa,
            String kierunek
    ) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.grupa = grupa;
        this.kierunek = kierunek;
    }
    // exercise 2.1
    public void getHumanInfo() {
        System.out.printf("Imie: %1s%n", this.imie);
        System.out.printf("Nazwisko: %1s%n", this.nazwisko);
        System.out.printf("Grupa: %1s%n", this.grupa);
        System.out.printf("Kierunek: %1s%n", this.kierunek);
    }

    // exercise 2.2
    public static void getInputedHumanInfo() {
        String imie;
        String nazwisko;
        int grupa;
        String kierunek;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        imie = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        nazwisko = scanner.nextLine();
        System.out.println("Podaj grupe");
        grupa = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj kierunek");
        kierunek = scanner.nextLine();

        System.out.printf("Imie: %1s%n", imie);
        System.out.printf("Nazwisko: %1s%n", nazwisko);
        System.out.printf("Grupa: %1s%n", grupa);
        System.out.printf("Kierunek: %1s%n", kierunek);

    }
}

// exercise 2.3
class DataTypesValuePrinter {
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    String str;
    boolean b;
    public void printAllDefaultValues() {
        System.out.printf("short s = %1s%n", s);
        System.out.printf("short s = %1s%n", i);
        System.out.printf("short s = %1s%n", l);
        System.out.printf("short s = %1s%n", f);
        System.out.printf("short s = %1s%n", d);
        System.out.printf("short s = %1s%n", c);
        System.out.printf("short s = %1s%n", str);
        System.out.printf("short s = %1s%n", b);
    }
}

// exercise 2.4

class StringComparator {
    String str1;
    String str2;
    public StringComparator(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public void compareStrings() {
        boolean isSame = str1.equals(str2);
        System.out.printf("str1.equals(str2): %1s%n", isSame);
    }
}

// exercise 2.5
class Operators {
    int numA = 7;
    int numB = 2;

    public void operatorsUsage() {
        System.out.printf("numA = %1s%n", numA);
        numA--;
        System.out.printf("numA-- = %1s%n", numA);
        System.out.printf("numB = %1s%n", numA);
        numB++;
        System.out.printf("numB = %1s%n", numA);


        int division = numA / numB;
        System.out.printf("numA / numB = %1s%n", division);

        boolean isABigger = numA > numB;
        System.out.printf("numA > numB = %1s%n", isABigger);

    }
}

// exercise 2.6
class MatrixTransposer {
    private int[][] matrix = {
            {0, 10, 20},
            {1, 11, 21},
            {2, 12, 22}
    };

    public void transposeMatrix() {
        for (int k = 0; k<3; k++)
        {
            for (int l = 0; l < 3; l++) {
                System.out.print(matrix[l][k]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

// exercise 2.7
class RollerVolume {
    public static void countRollerVolume() {
        int r;
        int h;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promien");
        r = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj wysokosc");
        h = Integer.parseInt(scanner.nextLine());
        System.out.print("Objetosc walca to: ");
        System.out.println(Math.PI * Math.pow(r, 2) * h);
    }
}

// exercise 2.8
class LogicTable {
    public static void showLogicalTable() {
        Boolean[] P = {true, true, false, false};
        Boolean[] Q = {true, false, true, false};
        String stringPattern = "%-5s %-5s %-5s %-5s %-5s %-5s%n";
        System.out.printf(stringPattern, "P", "Q", "AND", "OR", "XOR", "NOT");
        for (int i=0; i < P.length; i++) System.out.printf(stringPattern, P[i], Q[i], P[i] && Q[i], P[i] || Q[i], P[i] ^ Q[i], !P[i]);
    }
}

class OneLetterGame {

    public static void oneLetterGame(String[] args) {
        int inChar;
        System.out.println("Pomyslalem litere z przedzialu od A do Z. Odgadnij ja: ");
        try {
            while (true) {
                inChar = System.in.read();
                if (inChar == 'A') {
                    System.out.println("Dobrze!");
                    break;
                }
                else if(inChar == 'Q') System.out.println("Zle! Nizej");
                else if(inChar == 'Z') System.out.println("Zle! Wyzej");
                else System.out.println("Zle! Bardziej w prawo");
            }

        }
        catch (IOException e){
            System.out.println("Error reading from user");
        }
    }
}

class PowersOfTwo {
    public static void powersOfTwo() {
        for (int i=0;i<=14 ;i++) System.out.printf("2 do potęgi %1s wynosi %1s%n", i, (int)Math.pow(2,i));
    }
}

class Vehicle {
    protected int passangers;
    protected double fuelCap;
    protected double fuelBurning;

    Vehicle(int passangers, double fuelCap, double fuelBurning) {
        this.passangers = passangers;
        this.fuelCap = fuelCap;
        this.fuelBurning = fuelBurning;
    }
}

// 2.11-2.13
class VehicleProg {
    private Vehicle sportsCar;
    private Vehicle miniVan;

    public Vehicle getSportsCar() {
        return sportsCar;
    }
    public Vehicle getMiniVan() {
        return miniVan;
    }
    public void setSportsCar(Vehicle sportsCar) {
        this.sportsCar = sportsCar;
    }
    public void setMiniVan(Vehicle miniVan) {
        this.miniVan = miniVan;
    }

    public void range() {
        double sportcarRange = (sportsCar.fuelCap / miniVan.fuelBurning) * 100;
        double miniVanRange = (miniVan.fuelCap / miniVan.fuelBurning) * 100;

        System.out.printf("sporstCar wiozacy %1s osób na pełnym baku przejedzie %1s, a miniVan wiozący %1s osob przejedzie %1s%n", this.sportsCar.passangers, sportcarRange, this.miniVan.passangers, miniVanRange);
    }

    // 2.15
    // do przejechania jakiego odcinka? Nie rozumiem tresci zadania
}