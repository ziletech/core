package logisoftoffice;
import java.util.*;

/**
 *
 * @author user
 */
public class Main {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LogisoftOffice logisoft = new LogisoftOffice();
        
        Window window1 = new Window();
        
        window1.setNumber(1230);
        window1.setSize("20'");
        window1.setType("Full Size");
        
        System.out.println("Number : " + window1.getNumber());
        System.out.println("Size : " + window1.getSize());
        System.out.println("Type : " + window1.getType());
        
        logisoft.addToWindowList(window1);
        
        Window window2 = new Window();
        window2.setNumber(25);
        logisoft.addToWindowList(window2);
        
        
    }
    
}
