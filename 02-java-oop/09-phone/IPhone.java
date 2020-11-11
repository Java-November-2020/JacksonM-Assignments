public class IPhone extends Phone implements Ringable{
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        super(versionNumber,batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring(){
        return "RingRingRing from IPhone";
    }

    @Override
    public String unlock(){
        return "Unlock the IPhone!";

    }

    @Override
    public void displayInfo(){
        System.out.println("Phone Model: " + this.getVersionNumber());
        System.out.println("Battery percentage: " + this.getVersionNumber());
        System.out.println("Carrier: " + this.getCarrier());
        System.out.println("RingTone: " + this.getringTone());
    }
}
