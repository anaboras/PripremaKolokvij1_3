
package ffos;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class Pomocno {
    
    public static int ucitajBroj(String poruka){
        int god=0;
    for(;;){
        try{
        
       god = Integer.parseInt(
       JOptionPane.showInputDialog("Unesi " + poruka)
               
               
       );
       

       if(god<0 || god>22800){
           JOptionPane.showMessageDialog(null, "Broj mora biti veći od nule i manji od 22800");
           
       }else{ 
       
       return god;
       }
       
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Niste unijeli broj");
        }
        }
       
    }
    
    public static Date ucitajDatum(String poruka){
        
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy.");
         for(;;){
             
             try {
                 return dateFormat.parse(JOptionPane.showInputDialog(poruka));
                 
             } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "Datum nije valjan");
             }
         }
      
    }
    
  
    
    public static double ucitajProsjek(String poruka){
       
        for(;;){
            
            try{
                return Double.parseDouble(JOptionPane.showInputDialog(poruka));
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "niste unijeli broj");
            }
            
            
           
        }
    }
    
  
    
    public static String ucitajString(String poruka){
        String s;
        while(true){
           s = JOptionPane.showInputDialog("Unesi " + poruka);
           if(s.length()==0){
               JOptionPane.showMessageDialog(null, "Obavezan unos");
           }else {
               return s;  
           }
        }
         
    }  
}
