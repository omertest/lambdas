/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voorbeeld_forEach;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author omer.aldur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] groenten = {"tomaat", "sla", "ui", "prei"};
        Stream<String> stream = Arrays.stream(groenten);
        stream.forEach(groente -> System.out.println(groente));
    }

}
