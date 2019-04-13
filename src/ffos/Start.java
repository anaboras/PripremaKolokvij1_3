

package ffos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Start {

      public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    
    public static void main(String[] args) {
        
        List<Kolegij> kolegiji = new ArrayList<>(); // dopusta se unos vise kolegija
        List<Izostanak> izostanci;
        
        String unos;
        Kolegij k;
        Izostanak i;
        
        for(;;){
            
            k = new Kolegij();
            JOptionPane.showMessageDialog(null, "Unos novog kolegija");
            k.setSifra(Pomocno.ucitajBroj("unesi šifru"));
            k.setNaziv(Pomocno.ucitajString("unesi naziv"));
            k.setBrojIzostanaka(Pomocno.ucitajBroj("dozvoljeni broj izostanaka"));
            
            izostanci = new ArrayList<>();
            
            for(;;){
                JOptionPane.showMessageDialog(null, "unesi novi izostanak");
                i = new Izostanak();
                i.setDatum(Pomocno.ucitajDatum("unesi datum"));
                i.setRazlog(Pomocno.ucitajString("unesi razlog"));
                k.setIzostanci(izostanci);
                izostanci.add(i);
                
           
                
                
           
            unos = JOptionPane.showInputDialog("K za prekid unosa izostanka");
             if(unos.toLowerCase().equals("k")){
                 break;
        }
        }
          kolegiji.add(k);
        unos = JOptionPane.showInputDialog("K za prekid unosa kolegija");
                if(unos.toLowerCase().equals("k")){
                    break;
                }
        }   
    
       
           for (Kolegij ko : kolegiji) {

            int izostanakStudenta = ko.getIzostanci().size();
            if (izostanakStudenta >= ko.getBrojIzostanaka()) {
                System.out.println(ANSI_RED + ko.getNaziv() + " " + izostanakStudenta + "/" + ko.getBrojIzostanaka()+ ANSI_RESET);
            } else {
                System.out.println(ko.getNaziv() + izostanakStudenta + "/" + ko.getBrojIzostanaka());
            }
        }
        
          
          
            }
        }
        
        
        
        
        
        
        
        
   

