public class Transport {
    private final String brand;
    private final String model;
    private final int yearOfIssue;
    private final String country;
    private String color;
    private int maxSpeed;

 // getters **********************************************************************************************

    public String getBrand() { return brand;
    }
    public String getModel() { return model;
    }
    public int getYearOfIssue() { return yearOfIssue;
    }
    public String getCountry() { return country;
    }
    public String getColor() { return color;
    }
    public int getMaxSpeed() { return maxSpeed;
    }
// setters **********************************************************************************************
    public void setColor(String color) {
        this.color = color;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
// constructor *******************************************************************************************
    public Transport(String brand, String model, int yearOfIssue, String country, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.country = country;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
