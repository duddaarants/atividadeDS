
package principal;

import javax.swing.JOptionPane;

public class Principal {

    
    public static void main(String[] args) {
      
    String  x = JOptionPane.showInputDialog(null, "Digite o primeiro valor");
    int valor1 = Integer.parseInt(x);
 
    String op = JOptionPane.showInputDialog(null, "Operação que deseja realizar\n 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão");
    int op1 = Integer.parseInt(op);
    
    x =   JOptionPane.showInputDialog(null, "Digite o segundo valor");
    int valor2 = Integer.parseInt(x);
   
    if(op1==1){
        //double res = valor1 + valor2;
        JOptionPane.showMessageDialog(null,"O resultado é: "+(valor1+valor2));
    }else if(op1==2){
        double res = valor1 - valor2;
        JOptionPane.showMessageDialog(null,"O resultado é: "+res);
    }else if(op1==3){
        double res = valor1 * valor2;
        JOptionPane.showMessageDialog(null,"O resultado é: "+res);
    }else if(op1==4){
        double res = valor1 / valor2;
        JOptionPane.showMessageDialog(null,"O resultado é: "+res);
    }
  
    }
    
}
