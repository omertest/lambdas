/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sterrenbeeld;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream; 
class Main2 {
  private static final Path STERRENBEELDEN_PATH = Paths 
    .get("C:\\Users\\omer.aldur\\Desktop\\CURSUS MATERIAAL\\JVP-documenten\\lambdas\\sterrenbeelden.txt");
  public static void main(String[] args) { 
    System.out.print("woord:"); 
    try (Scanner scanner = new Scanner(System.in)) {
      String woord = scanner.next().toUpperCase();
      try (Stream<String> stream = Files.lines(STERRENBEELDEN_PATH)) {
        stream.filter(sterrenbeeld -> sterrenbeeld.toUpperCase().contains(woord))
              .forEach(sterrenbeeld -> System.out.println(sterrenbeeld));
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
  }
} 
