public class Bus extends Transport {
    private String bodyType;
    private int places;
    private double engineVolume;

    private String gearbox;
    private String regNumber;
    private String tiresType;
// getters **********************************************************************************************

    public String getBodyType() { return bodyType;
    }
    public int getPlaces() { return places;
    }
    public double getEngineVolume() { return engineVolume;
    }
    public String getGearbox() { return gearbox;
    }
    public String getRegNumber() { return regNumber;
    }
    public String getTiresType() { return tiresType;
    }
    // setters **********************************************************************************************
    public void setGearbox(String gearbox) {
        this.gearbox = (gearbox == null || gearbox.isEmpty() || gearbox.isBlank()) ? "МКПП" : gearbox;
    }
    public void setRegNumber(String regNumber) {
        this.regNumber = (regNumber == null || regNumber.isEmpty() || regNumber.isBlank()) ? "default" : regNumber;
    }
    public void setTiresType(String tiresType) {
        this.tiresType = (tiresType == null || tiresType.isEmpty() || tiresType.isBlank()) ? "летние" : tiresType;
    }
    // constructor *******************************************************************************************
    public Bus (String brand, String model, int yearOfIssue, String country, String color, int maxSpeed, String bodyType,
                int places, double engineVolume, String gearbox, String regNumber, String tiresType) {

        super(brand, model, yearOfIssue, country, color, maxSpeed);

        this.places = places != 0 ? places : 50;
        this.engineVolume = engineVolume != 0 ? engineVolume : 10;

        setGearbox(gearbox);
        setRegNumber(regNumber);
        setTiresType(tiresType);
    }
    // Methods ************************************************************************************************
    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getYearOfIssue() + "-го года, сборка " +
                getCountry() + ", " + "цвет " + getColor() + ", мах скорость " + getMaxSpeed() +
                ", V двигателя - " + engineVolume + ", количество мест " + places +
                ", Госномер " + regNumber + ", " + gearbox + ", тип авторезины - " +  tiresType + ".";
    }
    public static void printBus (Bus[] bus) {
        for (Bus el : bus) {
            System.out.println(el);
        }
    }

    @Override
    public void refill() {
        System.out.println("Автобус можно заправлять бензином или дизелем на заправке.");
    }
} // class *********************************************************************************************

