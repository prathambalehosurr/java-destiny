abstract class TV {
    abstract void turnOn();   
    abstract void turnOff();
}

class TVRemote extends TV {

    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}

public class inher {
    public static void main(String[] args) {
        TV tv = new TVRemote(); 
        
        tv.turnOn();
        tv.turnOff();
    }
}