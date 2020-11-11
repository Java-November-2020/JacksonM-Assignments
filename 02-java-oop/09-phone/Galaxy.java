public class Galaxy extends Phone implements Ringable{

    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring(){
        return "RingRingRingGalaxy";
    }

    @Override
    public String unlock(){
        return "Unlock the Galaxy phone!";

    }

    @Override
    public void displayInfo(){
        System.out.println("Phone Model: " + this.getVersionNumber());
        System.out.println("Battery percentage: " + this.getVersionNumber());
        System.out.println("Carrier: " + this.getCarrier());
        System.out.println("RingTone: " + this.getringTone());
    }
}
