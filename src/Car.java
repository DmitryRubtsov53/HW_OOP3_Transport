public class Car {
    private final String bodyType;
    private final int places;
    private final float engineVolume;
    private String gearbox;
    private String regNumber;
    private String tiresType;
// getters **********************************************************************************************

    public String getBodyType() { return bodyType;
    }
    public int getPlaces() { return places;
    }
    public float getEngineVolume() { return engineVolume;
    }
    public String getGearbox() { return gearbox;
    }
    public String getRegNumber() { return regNumber;
    }
    public String getTiresType() { return tiresType;
    }
// setters **********************************************************************************************
    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }
    public void setTiresType(String tiresType) {
        this.tiresType = tiresType;
    }
// constructor *******************************************************************************************
    public Car(String bodyType, int places, float engineVolume, String gearbox, String regNumber, String tiresType) {
        this.bodyType = bodyType;
        this.places = places;
        this.engineVolume = engineVolume;
        this.gearbox = gearbox;
        this.regNumber = regNumber;
        this.tiresType = tiresType;
    }
}
