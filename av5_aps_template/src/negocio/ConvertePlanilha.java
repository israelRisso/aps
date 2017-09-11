/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.awt.Label;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author israel
 */
public class ConvertePlanilha extends Conversor{
     public ConvertePlanilha(String arquivo) {
        super(arquivo);
    }

    
   
    
    
    
    @Override
    protected void writeData() {
		WritableWorkbook workbook;
         try {
             workbook = Workbook.createWorkbook(new File("saida.xls"));
             	//cria a planilha, de nome "Plan1"
		WritableSheet sheet = workbook.createSheet("Plan1", 0);

		//adiciona a célula na planilha
                Label label;
                for (int i = 0; i < linhas.size(); i++) {
                    for (int j = 0; j < linhas.get(i).length; j++) {
                        sheet.addCell(new jxl.write.Label(j, i, linhas.get(i)[j]));
                    }
                }   
		workbook.write();
		workbook.close();

         } catch (IOException | WriteException ex) {
             Logger.getLogger(ConvertePlanilha.class.getName()).log(Level.SEVERE, null, ex);
         }

	
	}
    }



