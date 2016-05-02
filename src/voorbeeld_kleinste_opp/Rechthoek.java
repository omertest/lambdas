/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voorbeeld_kleinste_opp;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

/**
 *
 * @author omer.aldur
 */
public class Rechthoek {

    private final int lengte;
    private final int breedte;

    public Rechthoek(int lengte, int breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
    }

    public int getOppervlakte() {
        return lengte * breedte;
    }

    @Override
    public String toString() {
        return lengte + " op " + breedte;
    }
}

class Main {

    public static void main(String[] args) {

        List<Rechthoek> rechthoeken = Arrays.asList(
                new Rechthoek(3, 2), new Rechthoek(4, 5), new Rechthoek(2, 3));
        OptionalInt kleinsteOppervlakte = rechthoeken.stream()
                .mapToInt(rechthoek -> rechthoek.getOppervlakte())
                .min();
        kleinsteOppervlakte.ifPresent(oppervlakte -> {
            System.out.println(oppervlakte);
            rechthoeken.stream()
                    .filter(rechthoek -> rechthoek.getOppervlakte() == oppervlakte)
                    .forEach(rechthoek -> System.out.println(rechthoek));
        });
    }
}
