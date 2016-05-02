/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voorbeeld_sterrenbeelden_2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author omer.aldur
 */
public class Main {

    private static final Path STERRENBEELDEN_PATH
            = Paths.get("D:/JPF/sterrenbeelden2.txt");

    public static void main(String[] args) {
        try (Stream<String> stream = Files.lines(STERRENBEELDEN_PATH)) {
            stream.map(String::toUpperCase)
                    .forEach(System.out::println);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}