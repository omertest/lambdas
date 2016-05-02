/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voorbeeld_onevengetallen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author omer.aldur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
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
