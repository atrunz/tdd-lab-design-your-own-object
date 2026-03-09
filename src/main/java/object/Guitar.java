package object;

import java.util.Scanner;

public class Guitar {
    private String brand;
    private String model;
    private String bodyStyle;
    private String bodyWoodType;
    private String fretboardType;
    private String color;
    private boolean isElectric;
    private boolean isBoltOn;
    private double numberOfFrets;
    private int numberOfStrings;
    private String pickupType;
    private double price;
    private String stringGauge;
    private boolean isPluggedIn;
    private int volumeKnobSetting;
    private String tuning;



    public Guitar(String brand, String model, String bodyStyle, String bodyWoodType, String fretboardType,
                  String color, boolean isElectric, boolean isBoltOn, double numberOfFrets, int numberOfStrings,
                  String pickupType, double price, String stringGauge, boolean isPluggedIn, int volumeKnobSetting, String tuning) {
       this.brand = brand;
       this.model = model;
       this.bodyStyle = bodyStyle;
       this.bodyWoodType = bodyWoodType;
       this.fretboardType = fretboardType;
       this.color = color;
       this.isElectric = isElectric;
       this.isBoltOn = isBoltOn;
       this.numberOfFrets = numberOfFrets;
       this.numberOfStrings = numberOfStrings;
       this.pickupType = pickupType;
       this.price = price;
       this.stringGauge = stringGauge;
       this.isPluggedIn = isPluggedIn;
       this.volumeKnobSetting = volumeKnobSetting;
       this.tuning = tuning;
    }

    public Guitar(String brand, String model,
                  String color, boolean isElectric, boolean isBoltOn, double numberOfFrets, int numberOfStrings,
                  String pickupType, double price, boolean isPluggedIn, String tuning) {
        this.brand = brand;
        this.model = model;
        this.bodyStyle = "Unknown" ;
        this.bodyWoodType = "Unknown" ;
        this.fretboardType = "Unknown" ;
        this.color = color;
        this.isElectric = isElectric;
        this.isBoltOn = isBoltOn;
        this.numberOfFrets = numberOfFrets;
        this.numberOfStrings = numberOfStrings;
        this.pickupType = pickupType;
        this.price = price;
        this.stringGauge = "Unknown";
        this.isPluggedIn = isPluggedIn;
        this.volumeKnobSetting = 0;
        this.tuning = tuning;
    }

    String getBrand() {
        return brand;
    }
    String getModel() {
       return model;
    }
    String getBodyStyle() {
       return bodyStyle;
    }
    String getBodyWoodType() {
       return bodyWoodType;
    }
    String getFretboardType() {
       return fretboardType;
    }
    String getColor() {
       return color;
    }
    boolean isElectric() {
       return isElectric;
    }

    boolean isBoltOn() {
       return isBoltOn;
    }
    double getNumberOfFrets() {
       return numberOfFrets;
    }
    int getNumberOfStrings() {
       return numberOfStrings;
    }
    String getPickupType() {
       return pickupType;
    }
    double getPrice() {
       return price;
    }
    String getStringGauge() {
       return stringGauge;
    }
    boolean isPluggedIn() {
       return isPluggedIn;
    }
    int getVolumeKnobSetting() {
       return volumeKnobSetting;
    }
    String getTuning() {
        return tuning;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
       this.model = model;
    }
    public void setBodyStyle(String bodyStyle) {
       this.bodyStyle = bodyStyle;
    }
    public void setBodyWoodType(String bodyWoodType) {
       this.bodyWoodType = bodyWoodType;
    }
    public void setFretboardType(String fretboardType) {
       this.fretboardType = fretboardType;
    }

    public void setColor(String color) {
       this.color = color;
    }
    public void setElectric(boolean electric) {
       this.isElectric = electric;
    }
    public void setBoltOn(boolean boltOn) {
       this.isBoltOn = boltOn;
    }
    public void setNumberOfFrets(double numberOfFrets) {
       this.numberOfFrets = numberOfFrets;
    }
    public void setNumberOfStrings(int numberOfStrings) {
       this.numberOfStrings = numberOfStrings;
    }
    public void setPickupType(String pickupType) {
       this.pickupType = pickupType;
    }
    public void setPrice(double price) {
       this.price = price;
    }
    public void setStringGauge(String stringGauge) {
       this.stringGauge = stringGauge;
    }
    public void setPluggedIn(boolean pluggedIn) {
       this.isPluggedIn = pluggedIn;
    }
    public void setVolumeKnobSetting(int volumeKnobSetting) {
       this.volumeKnobSetting = volumeKnobSetting;
    }


   public void tune(String tuning) {
        this.tuning = tuning;
       System.out.println("The guitar has been tuned to " + tuning);
   }

   public void play() {
       System.out.println("You are playing the " + this.brand + " " + this.model);
   }

   public void plugIn() {
        System.out.println("You are pluging the " + this.brand + " " + this.model + "in");
   }


   public void changeStrings(){
       System.out.println("Enter your string gauge");
       Scanner sc = new Scanner(System.in);
       String stringGauge = sc.nextLine();
       setStringGauge(stringGauge);

       System.out.println("You changed your strings");

   }

   public void setVolume() {
       System.out.println("Enter your new volume");
       Scanner sc = new Scanner(System.in);
       int volume = sc.nextInt();
       sc.nextLine(); //clear tokens

       if (volume > this.volumeKnobSetting && volume >= 0 && volume <= 10) {
           System.out.println("You turned up your volume to " + volume);
           setVolumeKnobSetting(volume);
       }else if (volume < this.volumeKnobSetting && volume >= 0 && volume <= 10){
           System.out.println("You turned down your volume to " + volume);
           setVolumeKnobSetting(volume);
       }else{
           System.out.println("Sorry bud, your volume doesn't go that far");
       }

   }

}
