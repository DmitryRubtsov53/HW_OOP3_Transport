import java.time.LocalDate;

public class Train {
    private float tripPrice;
    private LocalDate travelTime;
    private String startStation;
    private String endingStation;
    private int  wagons;
// getters **********************************************************************************************

    public float getTripPrice() { return tripPrice;
    }
    public LocalDate getTravelTime() { return travelTime;
    }
    public String getStartStation() { return startStation;
    }
    public String getEndingStation() { return endingStation;
    }
    public int getWagons() { return wagons;
    }
// setters **********************************************************************************************
    public void setTripPrice(float tripPrice) {
        this.tripPrice = tripPrice;
    }
    public void setTravelTime(LocalDate travelTime) {
        this.travelTime = travelTime;
    }
    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }
    public void setEndingStation(String endingStation) {
        this.endingStation = endingStation;
    }
    public void setWagons(int wagons) {
        this.wagons = wagons;
    }
// constructor *******************************************************************************************

    public Train(float tripPrice, LocalDate travelTime, String startStation, String endingStation, int wagons) {
        this.tripPrice = tripPrice;
        this.travelTime = travelTime;
        this.startStation = startStation;
        this.endingStation = endingStation;
        this.wagons = wagons;
    }
}
