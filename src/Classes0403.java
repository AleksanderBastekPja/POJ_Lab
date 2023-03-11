import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Classes0403 {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {exercise_07();}

    public static void exercise_01(Integer a, Integer b) {
        System.out.println((a*b));
    }
    public static void exercise_02() {
        System.out.println(Double.valueOf(df.format(Math.sqrt(Math.PI))));
    }

    public static void exercise_03() {
        Scanner scanner = new Scanner(System.in);
        String napis1 = scanner.next();
        String napis2 = scanner.next();
        scanner.close();

        System.out.println(("%" + napis1 + " " + napis2 + "%"));
    }

    public static void exercise_04() {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());
        scanner.close();

        if (a <= 0 || b <= 0 || c <= 0) System.out.println("BLAD");
        else if ((a + b > c) && (a + c > b) && (b + c > a)) System.out.println("TAK");
        else System.out.println("NIE");
    }

    public static void exercise_05() {
        Scanner scanner = new Scanner(System.in);
        int month = Integer.parseInt(scanner.next());
        switch (month) {
            case 1:
                System.out.println("Styczen 31 dni");
                break;
            case 2:
                System.out.println("Luty 28 dni");
                break;
            case 3:
                System.out.println("Marzec 31 dni");
                break;
            case 4:
                System.out.println("Kwiecien 30 dni");
                break;
            case 5:
                System.out.println("Maj 31 dni");
                break;
            case 6:
                System.out.println("Czerwiec 30 dni");
                break;
            case 7:
                System.out.println("Lipiec 31 dni");
                break;
            case 8:
                System.out.println("Sierpien 31 dni");
                break;
            case 9:
                System.out.println("Wrzesien 30 dni");
                break;
            case 10:
                System.out.println("Pazdziernik 31 dni");
                break;
            case 11:
                System.out.println("Listopad 30 dni");
                break;
            case 12:
                System.out.println("Grudzen 31 dni");
                break;
            default:
                System.out.println("BLAD");
                break;
        }
    }

    public static void exercise_06() {
        Scanner scanner = new Scanner(System.in);
        double a = Integer.parseInt(scanner.next());
        double b = Integer.parseInt(scanner.next());
        double c = Integer.parseInt(scanner.next());
        scanner.close();

        double tmp;
        if (a < b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        if (a < c) {
            tmp = a;
            a = c;
            c = tmp;
        }
        if (b < c) {
            tmp = b;
            b = c;
            c = tmp;
        }

        System.out.println(String.format("%s, %s, %s", a, b, c));
        System.out.println(String.format("%s, %s, %s", c, b, a));
    }

    public static void exercise_07() { // n musi być większe lub równe nic nie było w poleceniu o walidacji, ale miałem się zastanowić
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int m = Integer.parseInt(scanner.next());

        if (n < 0 || m < 0) {
            System.out.println("BLAD");
            return;
        }

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.next());
            array1[i] = num;
        }
        for (int j = 0; j < m; j++) {
            int num = Integer.parseInt(scanner.next());
            array2[j] = num;
        }

        scanner.close();


        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array1[i] * array2[i];
        }
        int sum2 = Arrays.stream(array2).sum();

        System.out.println(sum);

    }

    public static void piramide_up(int a) {
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void piramide_down(int a) {
        for (int k = a; k >= 0; k--) {
            for (int l = 0; l <= k; l++) {
                System.out.print("*");
            }
            if (a != 0) System.out.println();
        }
    }

    public static void exercise_08() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        piramide_up(n);
        piramide_down(n);

        piramide_down(n);
        piramide_up(n);
    }

    public static void exercise_09() {
        System.out.println("WEJSCIE");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] myArray = s.toCharArray();
        int a = 0;

        for (int i = 0; i < myArray.length; i++) if (myArray[i] == myArray[myArray.length - i - 1]) a++;
        if (myArray.length == a) System.out.println("TAK");
        else System.out.println("NIE");
    }

    public static void exercise_10() {
        System.out.println("WEJSCIE");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] array = new int[100][100];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for (int k = 0; k < columns; k++) {
            for (int l = 0; l < rows; l++) {
                System.out.print(array[l][k]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    public static void exercise_11() {
        Scanner sc = new Scanner(System.in);
        char[] pangram = sc.next().toLowerCase().toCharArray();
        HashMap<Character,Boolean> letterCounter = new HashMap<Character,Boolean>();

        for (char letter :
                pangram) {
            // zmienna z poza kontekstu, nie wiedziałem jak napisać strumieniowo, by tego uniknąć
            if (letterCounter.get(letter) != null) {
                System.out.println("NIE");
                return;
            }
            letterCounter.put(letter, true);
        }
        System.out.println("TAK");
    }

    public static void exercise_12() {
        final int yearInSeconds = 31557600;
        HashMap<String, Double> planets = new HashMap<String, Double>();
        planets.put("Ziemia", (double) yearInSeconds);
        planets.put("Merkury", yearInSeconds * 0.2408467);
        planets.put("Wenus", yearInSeconds * 0.61519726);
        planets.put("Mars", yearInSeconds * 1.8808158);
        planets.put("Jowisz", yearInSeconds * 11.862615);
        planets.put("Sturn", yearInSeconds * 29.447498);
        planets.put("Uran", yearInSeconds * 84.016846);
        planets.put("Neptun", yearInSeconds * 164.79132);

        Scanner sc = new Scanner(System.in);
        int lifeTime = Integer.parseInt(sc.next());
        String planet = sc.next();

        Double yearsInPlanet = lifeTime / planets.get(planet);
        System.out.println(df.format(yearsInPlanet));
    }
    public static int exercise_13(int i, int[] intArray) {
        if (i >= intArray.length) return 0;
        return intArray[i] > exercise_13(i+1, intArray) ? intArray[i] : exercise_13(i+1, intArray);
    }

}
