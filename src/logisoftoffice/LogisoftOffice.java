package logisoftoffice;
import java.util.*; 

/**
 *
 * @author user
 */
public class LogisoftOffice {

//    private Window window[];
//    private SystemRake systemRake[];
//    private AirConditioner airConditioner[];
//    private Fan fan[];   
//    
    private ArrayList<Window> windowList =new  ArrayList<>();

    public ArrayList<Window> getWindowList() {
        return windowList;
    }

    public void setWindowList(ArrayList<Window> windowList) {
        this.windowList = windowList;
    }
    
    public void addToWindowList(Window window){
        this.windowList.add(window);
    }

}
