import java.util.Random;

public class Manager {
    static Random r = new Random();

    public static void main(String[] args) {
        isItConstant();
        System.out.println();
        histogram();
        System.out.println();
        binarySystem();
    }

    // printing a random array of size 6 with 0s and 1s and printing if its constant
    // or not
    public static void isItConstant() {
        // creating the array
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++)
            arr[i] = r.nextInt(2);

        // printing the array
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        // checking if its constant and printing the result
        boolean isConstant = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[0] != arr[i]) {
                isConstant = false;
                break;
            }
        }

        System.out.println(isConstant ? "\nthe array is constant" : " \nthe array is not constant");
    }

    // printing the histogram of a random array of size 10 with numbers till 100
    public static void histogram() {
        // creating the array
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++)
            arr[i] = r.nextInt(101);

        // printing the array
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        // organizing numbers
        int _0_20 = 0, _20_40 = 0, _40_60 = 0, _60_80 = 0, _80_100 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] < 20)
                _0_20++;
            else if (arr[i] >= 20 && arr[i] < 40)
                _20_40++;
            else if (arr[i] >= 40 && arr[i] < 60)
                _40_60++;
            else if (arr[i] >= 60 && arr[i] < 80)
                _60_80++;
            else
                _80_100++;
        }

        // printing the histogram
        System.out.println();
        System.out.print(" 0 to 19: ");

        for (int i = 0; i < _0_20; i++)
            System.out.print("*");

        System.out.println();
        System.out.print(" 20 to 40: ");

        for (int i = 0; i < _20_40; i++)
            System.out.print("*");

        System.out.println();
        System.out.print(" 40 to 60: ");

        for (int i = 0; i < _40_60; i++)
            System.out.print("*");

        System.out.println();
        System.out.print(" 60 to 80: ");

        for (int i = 0; i < _60_80; i++)
            System.out.print("*");

        System.out.println();
        System.out.print(" 80 to 100: ");

        for (int i = 0; i < _80_100; i++)
            System.out.print("*");

        System.out.println();
    }

    // converting a decimal number between 0-255 to binary system
    public static void binarySystem() {
        int[] binary = { 0, 0, 0, 0, 0, 0, 0, 0 };
        int number = r.nextInt(256);
        int i = 0;

        System.out.print("decimal: " + number + "\nbinary: ");

        // converting to binary
        while (number >= 1) {
            binary[i] = number % 2;
            number = number / 2;
            i++;
        }

        // printing binary
        for (int j = binary.length - 1; j >= 0; j--)
            System.out.print(binary[j]);
    }
}
