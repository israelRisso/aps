/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConverteTxt extends Conversor {

    public ConverteTxt(String arquivo) {
        super(arquivo);
    }

    
   
    
    
    
    @Override
    protected void writeData() {
        try {
            PrintWriter gravar = new PrintWriter(new File("saida.txt"));
            gravar.append(texto);
            gravar.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConverteTxt.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}