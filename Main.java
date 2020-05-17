import javax.swing.JOptionPane;
import java.util.*;

public class Main
{
    
    public static void main()
    {
            JOptionPane.showMessageDialog(null," Detta är ett bibliotek program. Den är skapad för att visa"
                + " alla böcker och dess författare. I programmet kan man även lägga "
                + " till författare i vårt system.");
                
               
                int val1;
                String förstaVal = JOptionPane.showInputDialog("Välj ett aternativ:      "
                + "[1.Visa alla böcker och författare]"
                + "                   [2.Lägg till ny författare]");
        ArrayList<Författare> författareLista = new ArrayList<Författare>();
        Författare f1 = new Författare ("You are the placebo",245, " Joe", "Dispenza"); // objekt av datatypen Författare
        författareLista.add(f1);

        
        Författare f2 = new Författare("Les Misérables",345, " Victor", " Hugo"); // anropar konstruktorn som tar emot fyra parametrar
        författareLista.add(f2);
        
        Författare f3 = new Författare("A Gift Of Fire",354, " Sara", " Baase");
        författareLista.add(f3);
        


        try{ // kollar om användaren matar in ett tal
                       val1=Integer.parseInt(förstaVal);

        if(val1 == 1) 
             {
                         
                         for(Författare  f:författareLista) // loopar igenom författareLista
                         {
                             JOptionPane.showMessageDialog(null,f.toString());
                             
                         }
       
                         f1.veckansBokTips();
                 
             }   
             else 
             {
                      
              String nyBok =   JOptionPane.showInputDialog("Bok: ");
              int nySida = Integer.parseInt(JOptionPane.showInputDialog("Mata in antal sidor: "));
              String nyNamn =    JOptionPane.showInputDialog("Författarens namn: ");
              String nyEfternamn =   JOptionPane.showInputDialog("Författarens efternamn: ");

             
                Författare f4 = new Författare(nyBok, nySida ,nyNamn, nyEfternamn);
                författareLista.add(f4);
                 JOptionPane.showMessageDialog(null, "Boken är nu sparad i ArrayListan, tryck OK för att se alla böcker.");
                
                for(Författare  f:författareLista) // loopar igenom författareLista
                         {
                             JOptionPane.showMessageDialog(null,f.toString());
                             
                         }
                
             
     
             }
             
              }
            
            catch(NumberFormatException e){
                                         JOptionPane.showMessageDialog(null, "Du måste mata in ett tal, försök igen!");

            
            }
             
         
           
         
        
     
    }




}

