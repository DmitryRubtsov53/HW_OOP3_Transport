import java.time.LocalDate;

public class Train extends Transport {
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
        this.tripPrice = tripPrice != 0 ? tripPrice : 100.0f;
    }
    public void setTravelTime(LocalDate travelTime) {
        this.travelTime = travelTime != null ? travelTime : LocalDate.now().plusDays(1);
    }
    public void setStartStation(String startStation) {
        this.startStation = (startStation == null || startStation.isEmpty() || startStation.isBlank()) ? "default" : startStation;
    }
    public void setEndingStation(String endingStation) {
        this.endingStation = (endingStation == null || endingStation.isEmpty() || endingStation.isBlank()) ? "default" : endingStation;
    }
    public void setWagons(int wagons) {
        this.wagons = wagons != 0 ? wagons : 5;
    }
// constructor *******************************************************************************************

    public Train(String brand, String model, int yearOfIssue, String country, String color, int maxSpeed,
                 float tripPrice, LocalDate travelTime, String startStation, String endingStation, int wagons) {

        super(brand, model, yearOfIssue, country, color, maxSpeed);

        setTripPrice(tripPrice);
        setTravelTime(travelTime);
        setStartStation(startStation);
        setEndingStation(endingStation);
        setWagons(wagons);
    }
// Methods *******************************************************************************************************
    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getYearOfIssue() + "-го года, сборка " +
                getCountry() + ", " + "цвет " + getColor() + ", мах скорость " + getMaxSpeed() + " км/ч., цена поездки " +
                tripPrice + " руб., время поездки " + travelTime + ", станция отправления " + startStation +
                ", станция прибытия" + endingStation + ", количество вагонов " +  wagons + ".";
    }
    public static void printTrain (Train[] train) {
        for (Train el : train) {
            System.out.println(el);
        }

    }

}  // class *********************************************************************************************
