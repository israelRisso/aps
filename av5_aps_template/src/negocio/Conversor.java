package negocio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Conversor {
    private final String arquivo;
    protected ArrayList<String[]> linhas = new ArrayList();
    protected String texto = "";
    
    public Conversor(String arquivo) {
        this.arquivo = arquivo;
    }
    
    public final void parseDataAndGenerateOutput(){
        readData();
        processData();
        writeData();
    }
    
     final void readData(){
        try {
            Scanner entrada = new Scanner(new File(arquivo));
            while  (entrada.hasNext())  {
            linhas.add(entrada.nextLine().split(";"));
        }
        entrada.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Conversor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
    }
    
    protected void processData()    {
        for (int i = 1; i < linhas.size(); i++) {
            for (int j = 0; j < linhas.get(i).length; j++) {
                texto = texto + linhas.get(0)[j] + ": " + linhas.get(i)[j];
                if (j < linhas.get(i).length-1) texto += ", ";
                else texto += "\n";
            }
        }
    }
    
    protected abstract void writeData();
    
    
}
