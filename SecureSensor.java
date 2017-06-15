package my.carPark;

public class SecureSensor {
    
    public boolean state;
    public int bayNumber = 0;
    
    public SecureSensor(int bayCount){  //constructor
        this.state = false;
        this.bayNumber = bayCount;
    }
    
    public void changeState(){
        this.state = !state;
    }
    
    public String getState()
    {
        if (state == false)
            return "Sensor off";
        else
            return "Sensor on";
    }
    
    
}
