public class Planet extends CelestialBody {

    //Atributes
    private String color;
    private boolean inhabitated;


    //Contructor

    public Planet() {

    }

    public Planet(String color, boolean inhabitated) {
        this();
        this.color = color;
        this.inhabitated = inhabitated;
    }


    // Getters
    public String getColor() {
        return color;
    }

    public boolean isInhabitated() {
        return inhabitated;
    }


    //Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setInhabitated(boolean inhabitated) {
        this.inhabitated = inhabitated;
    }


    //ToString
    @Override
    public String toString() {

        return "Planet{" + " " + super.toString() + " " +
                "color='" + color + '\'' +
                ", inhabitated=" + inhabitated +
                '}';
    }
}
