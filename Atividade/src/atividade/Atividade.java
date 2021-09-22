
package atividade;

import javax.swing.JOptionPane;

   
public class Atividade {
  
    
    public static void main(String[] args) {
       String num = JOptionPane.showInputDialog(null, "Digite um numero", "Sucessor", -1);
    double numero = Double.parseDouble(num);
    
    int sucessor= (int) (numero+1);
        
         JOptionPane.showMessageDialog(null,"O sucessor de "+ num+ " é "+sucessor);
    }
    
}
