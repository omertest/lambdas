/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unieke_waarden;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author omer.aldur
 */
public class Artiestennamen {

    /**
     * @param args the command line arguments
     */
    
            
    private static final Path ALBUMS_ARTISTS_PATH = Paths.get("D:/JPF/namen.txt");
    public static void main(String[] args) { 
    try (Stream<String> stream = Files.lines(ALBUMS_ARTISTS_PATH)) {
      stream.map(regel -> regel.substring(regel.indexOf(',') + 1))
            .distinct()
            .sorted()
            .forEach(naam -> System.out.println(naam));
    } catch (IOException ex) { ex.printStackTrace(); }
  }
}

