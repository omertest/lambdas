/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voorbeeld_landcodes;

/**
 *
 * @author omer.aldur
 */

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

class Main {
  private static final Path LANDCODES_PATH = Paths.get("C:\\Users\\omer.aldur\\Desktop\\CURSUS MATERIAAL\\JVP-documenten\\lambdas");
  private static Optional<String> landNaam(String landcode) { 
    try (BufferedReader reader = Files.newBufferedReader(LANDCODES_PATH)) {
      for (String regel; (regel = reader.readLine()) != null;) {
        int spatieIndex = regel.indexOf(' ');
        if (landcode.equals(regel.substring(0, spatieIndex))) {
          return Optional.of(regel.substring(spatieIndex+1));
        }
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return Optional.empty();
  } 
  public static void main(String[] args) {
    landNaam("BE").ifPresent(landNaam -> System.out.println(landNaam));
  }
} 