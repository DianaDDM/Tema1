public class CelestialBody {

    //Atributes
    private double dimension;
    private String name;
    private Satellite satellite;


    // Constructors
    public CelestialBody() {

        satellite = new Satellite();
    }

    public CelestialBody(int dimension, String name, Satellite satellite) {
        this();
        this.dimension = dimension;
        this.name = name;
        this.satellite = satellite;
    }


    // Getters
    public double getDimension() {
        return dimension;
    }

    public String getName() {
        return name;
    }

    public Satellite getSatellite() {
        return satellite;
    }


    //Setters
    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSatellite(Satellite satellite) {
        this.satellite = satellite;
    }


    // ToString
    @Override
    public String toString() {
        return "CelestialBody{" +
                "dimension=" + dimension +
                ", name='" + name + '\'' +
                ", satellite=" + satellite +
                '}';
    }
}
