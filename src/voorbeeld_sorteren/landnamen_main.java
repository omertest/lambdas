/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voorbeeld_sorteren;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream; 
class landnamen_main {
  private static final Path LANDCODES_PATH = Paths.get("C:\\Users\\omer.aldur\\Desktop\\CURSUS MATERIAAL\\JVP-documenten\\lambdas\\landcodes.txt");
  public static void main(String[] args) { 
    try (Stream<String> stream = Files.lines(LANDCODES_PATH)) {
      stream.map(regel -> regel.substring(regel.indexOf(' ') + 1))
            .sorted()
            .forEach(naam -> System.out.println(naam));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
} 
