package util;

import java.util.Scanner;

public class TypeValidator {

    static Scanner sc = new Scanner(System.in);

    public static int validateInt(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                int value = sc.nextInt();
                sc.nextLine();
                return value;
            } catch (Exception e) {
                System.out.println("Ingrese un número entero válido");
                sc.nextLine();
            }
        }
    }

    public static double validateDouble(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                double value = sc.nextDouble();
                sc.nextLine();
                return value;
            } catch (Exception e) {
                System.out.println("Ingrese un número decimal válido");
                sc.nextLine();
            }
        }
    }

    public static String validateString(String prompt) {
        while (true) {
            System.out.println(prompt);
            String value = sc.nextLine().trim();

            if (!value.isEmpty()) {
                return value;
            }

            System.out.println("El campo no puede estar vacío");
        }
    }

    public static boolean validateBoolean(String prompt) {
        while (true) {
            try {
                System.out.println(prompt + " (true/false)");
                boolean value = sc.nextBoolean();
                sc.nextLine();
                return value;
            } catch (Exception e) {
                System.out.println("Ingrese true o false");
                sc.nextLine();
            }
        }
    }
}
