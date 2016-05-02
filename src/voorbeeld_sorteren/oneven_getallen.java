package voorbeeld_sorteren;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class oneven_getallen {

    public static void main(String[] args) {
        List<Integer> getallen = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            for (int getal; (getal = scanner.nextInt()) != 0;) {
                getallen.add(getal);
            }
            getallen.stream()
                    .filter(getal -> getal % 2 == 1)
                    .sorted((getal1, getal2) -> getal2 - getal1)
                    .forEach(getal -> System.out.println(getal));
        }
    }
}
