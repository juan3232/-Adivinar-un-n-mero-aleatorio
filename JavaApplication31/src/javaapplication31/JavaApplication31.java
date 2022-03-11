
package javaapplication31;

import javax.swing.JOptionPane;



/**
 *
 * @author AMKARA
 */
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int Numero,alea,contador=0;
      
       alea = (int)(Math.random()*100);
       
       do{
            Numero = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero"));
                if(alea>Numero){
                    System.out.println("diguita un numero mayor");
                }
                else{
                    System.out.println("diguite un numero menor ");
                            
                }
                contador++;
       }while(Numero !=alea);
       
        System.out.println("\nGenialm aivinaste el numero:" + contador + "inteentos");
    }
    
    
}
