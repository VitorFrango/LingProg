import java.io.IOException;

public class LerEscrever {

   public static void main(String[] parametros) {
      System.out.println("Hello and welcome!");
      String s = "";
      char c;
      try {
          do {
              c = (char)System.in.read();
                s = s + c;
          } while (c != '\n');
      } catch (IOException e) {}
          System.out.println("Escreveu_ " + s);
   }
}
