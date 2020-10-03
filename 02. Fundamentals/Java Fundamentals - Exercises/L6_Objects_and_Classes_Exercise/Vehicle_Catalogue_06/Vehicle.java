package Objects_and_Classes_Exercise_06.Vehicle_Catalogue_06;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private Integer horsepower;

    public Vehicle(String type, String model, String color, Integer horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return this.type;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public Integer getHorsepower() {
        return this.horsepower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s\n" +
                        "Model: %s\n" +
                        "Color: %s\n" +
                        "Horsepower: %d",
                this.getType().toUpperCase().charAt(0) + this.getType().substring(1),
                this.getModel(),
                this.getColor(),
                this.getHorsepower());
    }
}