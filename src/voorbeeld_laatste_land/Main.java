/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voorbeeld_laatste_land;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author omer.aldur
 */
public class Main {
    
private static final Path LANDCODES_PATH = Paths.get("D:/JPF/landcodes.txt");
  public static void main(String[] args) { 
    try (Stream<String> stream = Files.lines(LANDCODES_PATH)) {
      stream.map(regel -> regel.substring(regel.indexOf(' ') + 1))
            .max((naam1, naam2) -> naam1.compareToIgnoreCase(naam2))
            .ifPresent(grootsteNaam -> System.out.println(grootsteNaam));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
