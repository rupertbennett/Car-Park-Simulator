package my.carPark;

public class EntryBarrier {
    
    private Boolean openState = false;
    
    public void open(){
        openState = true;
    }
    
    public void close(){
        openState = false;
    }
    
    public String getstate(){
        if (openState == false)
            return "Closed";
        else
            return "Open";
    }
}
