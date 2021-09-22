
package principal1;

import javax.swing.JOptionPane;

public class Principal1 {

    static String x, x1;
    
    public static void main(String[] args) {
        x = JOptionPane.showInputDialog(null, "Digite seu peso", "IMC", -1);
    double peso = Double.parseDouble(x);
    
    x1 = JOptionPane.showInputDialog(null, "Digite sua altura", "IMC", -1);
     double alt = Double.parseDouble(x1);
    double imc = peso/(alt*alt);
    
    if(imc < 18.5) {
        JOptionPane.showMessageDialog(null, String.format("Você esta abaixo do peso ideal \n Seu IMC é %.2f", imc));
    }else if(imc <= 24.9) {
     
        double res = peso/(alt*alt);
        JOptionPane.showMessageDialog(null, String.format("Parabéns\n Você esta em seu peso normal!\n Seu IMC é %.2f", imc));
    }else if(imc < 29.9){
        JOptionPane.showMessageDialog(null,String.format("Você esta acima de seu peso (sobrepeso)\n Seu IMC é %.2f", imc));
    }else if(imc < 34.9){
       
        JOptionPane.showMessageDialog(null,String.format("Obesidade Grau I \n Seu IMC é %.2f", imc));
    }else if(imc < 39.9){
        
        JOptionPane.showMessageDialog(null,String.format("Obesidade Grau II \n Seu IMC é %.2f", imc));
    }else{
       
        JOptionPane.showMessageDialog(null,String.format("Obesidade Grau III \n Seu IMC é %.2f", imc));
    }
    }
}
    
    
        
    
