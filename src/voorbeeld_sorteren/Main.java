/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voorbeeld_sorteren;

import java.util.stream.Stream;

class Main {
  public static void main(String[] args) { 
    Stream.of("sla", "wortel", "kool", "biet")
      .sorted()       .forEach(groente -> System.out.println(groente));
  }
} 
