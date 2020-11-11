public class PhoneTester {
    public static void main(String[] args) {
        Galaxy s20 = new Galaxy("S20", 95, "AT&T", "DrewDrewDrew!");
        IPhone iphoneTweleve = new IPhone ("X11", 100, "AT&T", "Zing");
        
        s20.displayInfo();
        System.out.println(s20.ring());
        System.out.println(s20.unlock());

        iphoneTweleve.displayInfo();
        System.out.println(iphoneTweleve.ring());
        System.out.println(iphoneTweleve.unlock());
    }


}
