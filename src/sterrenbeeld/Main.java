/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sterrenbeeld;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream; 
class Main {
  private static final Path STERRENBEELDEN_PATH = 
    Paths.get("C:\\Users\\omer.aldur\\Desktop\\CURSUS MATERIAAL\\JVP-documenten\\lambdas\\sterrenbeelden.txt");
  public static void main(String[] args) { 
    try (Stream<String> stream = Files.lines(STERRENBEELDEN_PATH)) {
      stream.forEach(
        sterrenbeeld -> System.out.println(sterrenbeeld.toUpperCase()));
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
