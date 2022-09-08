/*Name: |Evans, Amber 	CMIS 141/7380 	Date: (05/10/2022)
  This program will create a class which models a household appliance . */


public class Juicer{
    String brand; // the juicer brand
    String juicerType; // whether a centrifugal, masticating, or trituriating juicer
    double chuteSize; // size of feed chute

    // constructor
    public Juicer(double chuteSize, String juicerType, String brand) {
        this.brand = brand;
        this.chuteSize = chuteSize;
        this.juicerType = juicerType;
    }
    // method that choosing if the chute size can take whole fruit
    public String FeedSize() {
        if(chuteSize < 3.0) {
            return "With chute size: "+chuteSize+", you will have to cut up your fruit to fit them down the chute.";
        }
        else {
            return "With chute size: "+chuteSize+", whole fruit can fit down the chute.";
        }
    }
    // method displaying juicer attributes
    public String toString() {
        return "The "+this.brand+" uses "+juicerType+" technology and has a "+chuteSize+" chute size.";
    }
    public static void main(String[]args) {
        // initializing juicer objects
        Juicer Nama = new Juicer(9.8, "masticating", "Nama");
        Juicer Kuvings = new Juicer(3.0, "masticating", "Kuvings");

        // using the FeedSize() method to display object attributes
        System.out.println(Nama.FeedSize());
        System.out.println(Nama.toString());
        System.out.println("\n");
        System.out.println(Kuvings.FeedSize());
        System.out.println(Kuvings.toString());
        
    }
}