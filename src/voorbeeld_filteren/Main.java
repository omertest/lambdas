
package voorbeeld_filteren;
import java.util.stream.Stream;
class Main {
  public static void main(String[] args) { 
Stream.of("sla", "wortel", "kool", "biet")
  .filter(groente -> groente.length() == 4)
  .forEach(groenteMet4Letters -> System.out.println(groenteMet4Letters));
  }
}
