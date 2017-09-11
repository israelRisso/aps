/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import negocio.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Conversor conv = new ConverteTxt("entrada.csv");
        conv.parseDataAndGenerateOutput();
         conv = new converteHTML("entrada.csv");
        conv.parseDataAndGenerateOutput();
         conv = new ConvertePDF("entrada.csv");
        conv.parseDataAndGenerateOutput();
         conv = new ConvertePlanilha("entrada.csv");
        conv.parseDataAndGenerateOutput();
       
    }
    
}
