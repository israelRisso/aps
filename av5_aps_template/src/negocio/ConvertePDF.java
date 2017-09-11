package negocio;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConvertePDF extends Conversor{
    
     public ConvertePDF(String arquivo) {
        super(arquivo);
    }

    
   
    
    
    
    @Override
    protected void writeData() {
        
         Document document = new Document();
          try {
             
              PdfWriter.getInstance(document, new FileOutputStream("saida.pdf"));
              document.open();
             
              // adicionando um parágrafo no documento
              document.add(new Paragraph(texto));
}
          catch(DocumentException | IOException de) {
              System.err.println(de.getMessage());
          }
          document.close();
      }   
        
        
        

}
    
    

