
package boletin7_4;

import javax.swing.JOptionPane;

public class Peso {
    public String PedirNome(){
    String nome;
    nome = JOptionPane.showInputDialog("teclea nome ");
    return nome;  
 //tamen    return JOptionPane.showInputDialog("teclea nome")
    }
  
    public float PedirPeso(){
    float peso;
    String res = JOptionPane.showInputDialog("teclea peso ");
    peso = Float.parseFloat(res);
    return peso;
}
    public void Peso(String nome1,String nome2,float peso1,float peso2){
     if(peso1> peso2)
      JOptionPane.showMessageDialog(null,(peso1 - peso2) + " Pesa máis: " + nome1);
     else
      JOptionPane.showInternalMessageDialog(null,(peso2 - peso1) + " Pesa máis: " + nome2 );
                 
                 
    
    }
}