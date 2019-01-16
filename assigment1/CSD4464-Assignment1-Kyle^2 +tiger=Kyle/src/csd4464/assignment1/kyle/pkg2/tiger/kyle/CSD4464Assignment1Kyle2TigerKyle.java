/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment1.kyle.pkg2.tiger.kyle;

/**
 *
 * @author c0704435
 */
public class CSD4464Assignment1Kyle2TigerKyle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static String stringPower(String s, int i) {
        if(s.equals("")){
        return "";
    }
        if (i < 1){
            return null;
        }
        if (i ==1){
            return s;
        }
        String power= "";
        
        for (int num = 1; num <= i; num++){
            
            power +=s;
        }
        return power;
        
    
   


}
}

