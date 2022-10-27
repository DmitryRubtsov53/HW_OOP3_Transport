import java.time.LocalDate;

public abstract class Transport {
    private String brand;
    private String model;
    private int yearOfIssue;
    private String country;
    private String color;
    private int maxSpeed;

// abstract methods **************************************************************************************
    public abstract void refill();

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
        this.color = color != null ? color : "белый";
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed != 0 ? maxSpeed : 100;
    }
// constructor *******************************************************************************************
    public Transport(String brand, String model, int yearOfIssue, String country, String color, int maxSpeed) {
        this.brand = brand != null ? brand : "default";
        this.model = model != null ? model : "default";
        this.yearOfIssue = yearOfIssue != 0 ? yearOfIssue : LocalDate.now().getYear();
        this.country = country != null ? country : "Россия";
        setColor(color);
        setMaxSpeed(maxSpeed);

    }

} // class *********************************************************************************************
