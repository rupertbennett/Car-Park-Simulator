package my.carPark;

public class Coin {
    
    private int id;
    private boolean secure, paid;
    private String secureBayNo;
    private String password;
    private float timeEntered;
            
    public Coin(int count){  //constructor
        this.id = count;
        this.secure = false;
        this.secureBayNo = "";
        this.password = null;
        this.paid = false;
    }
    
    public int getId(){
        return id;
    }
    
    public void setSecure(){
        this.secure = !secure;
    }
    
    public boolean getSecure(){
        return secure;
    }
    
    public String getBayNo(){
        return secureBayNo;
    }
    
    public void setBayNo(String secureBayNoIn){
        this.secureBayNo = secureBayNoIn;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String passwordIn){
        this.password = passwordIn;
    }
    
    public void timeEntered(float timeEnteredIn){
        this.timeEntered = timeEnteredIn;
    }
    
    public float getTimeEntered(){
        return timeEntered;
    }
    
    public String paidState(){
        if (paid != false)
            return "paid";
        else 
            return "unpaid";
    }
    
    public void changePaidState(){
        this.paid = !paid;
    }
    
    
}

