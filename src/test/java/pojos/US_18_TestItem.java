package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class US_18_TestItem {

    private String name;
    private String description;
    private String defaultValMin;
    private String defaultValMax;
    private double    price;


    public US_18_TestItem(String name, String description, String defaultValMin, String defaultValMax, double price) {
        this.name = name;
        this.description = description;
        this.defaultValMin = defaultValMin;
        this.defaultValMax = defaultValMax;
        this.price = price;
    }


    public US_18_TestItem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDefaultValMin() {
        return defaultValMin;
    }

    public void setDefaultValMin(String defaultValMin) {
        this.defaultValMin = defaultValMin;
    }

    public String getDefaultValMax() {
        return defaultValMax;
    }

    public void setDefaultValMax(String defaultValMax) {
        this.defaultValMax = defaultValMax;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "US_18_TestItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", defaultValMin='" + defaultValMin + '\'' +
                ", defaultValMax='" + defaultValMax + '\'' +
                ", price=" + price +
                '}';
    }
}