package aula01exr01;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author ice
 */
public class Aula01Exr01 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Float l;
      Float c;
      Float a;

      try {
         String entrada;
         entrada = JOptionPane.showInputDialog("Digite a largura").replace(",", ".");
         l = Float.parseFloat(entrada);
         entrada = JOptionPane.showInputDialog("Digite o comprimento").replace(",",".");
         c = Float.parseFloat(entrada);
         entrada = JOptionPane.showInputDialog("Digite a profundidade").replace(",", ".");
         a = Float.parseFloat(entrada);
         JOptionPane.showMessageDialog(null, String.format("O volume é %.2f cm³", (l * c * a)), "Resultado", JOptionPane.PLAIN_MESSAGE);
      } catch (NumberFormatException | NullPointerException ex) {
         JOptionPane.showMessageDialog(null, "Você deve entrar com um valor!", "Erro na entada de dados", JOptionPane.ERROR_MESSAGE);
      }
   }

}
