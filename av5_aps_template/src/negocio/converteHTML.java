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

/**
 *
 * @author iapereira
 */
public class converteHTML extends Conversor {

    public converteHTML(String arquivo) {
        super(arquivo);
    }

     @Override
     protected void processData()    {
        texto = "<html>\n" +
        "  <title>Pessoas</title>\n" +
        "  <body>\n       <table border=\"2px\">\n";
        
         for (int i = 0; i < linhas.size(); i++) {
             texto += "           <tr>\n";
            for (int j = 0; j < linhas.get(i).length; j++) {
                texto = texto + "               <td>" + linhas.get(i)[j] + "</td>\n";
            }
             texto += "           </tr>\n";
         }
         texto += "       </table>" + "\n  </body>\n" +
        "</html>";
    }
    
    @Override
    protected void writeData() {
        try {
            PrintWriter gravar = new PrintWriter(new File("saida.html"));
            gravar.append(texto);
            gravar.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConverteTxt.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}