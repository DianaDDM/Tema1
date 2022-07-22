public class Satellite {

    //Atributes
    private String name;
    private boolean artificial;
    private double orbitalPeriod;

    //Constructor


    public Satellite() {

    }

    public Satellite(String name, boolean artificial, double orbitalPeriod) {
        this.name = name;
        this.artificial = artificial;
        this.orbitalPeriod = orbitalPeriod;
    }

    //Getters
    public boolean isArtificial() {
        return artificial;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public String getName() {
        return name;
    }


    //Setters
    public void setArtificial(boolean artificial) {
        this.artificial = artificial;
    }

    public void setOrbitalPeriod(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public void setName(String name) {
        this.name = name;
    }


    //ToString

    @Override
    public String toString() {
        return "Satellite{" +
                "name='" + name + '\'' +
                ", artificial=" + artificial +
                ", orbitalPeriod=" + orbitalPeriod +
                '}';
    }
}
