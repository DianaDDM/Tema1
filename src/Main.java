public class Main {
    public static void main(String[] args) {

        // Instances for principal class CelestialBody
        CelestialBody celestialBody = new CelestialBody();
        celestialBody.setName("Uranus");
        celestialBody.setDimension(25.362);

        // composition by aggregation
        Satellite satellite = new Satellite("Cordelia", false, 0.335);
        celestialBody.setSatellite(satellite);

        // composition by containment
        CelestialBody celestialBody1 = new CelestialBody(69911, "Jupiter", new Satellite("Europa", false, 3.52));

        System.out.println(celestialBody);
        System.out.println(celestialBody1);
        System.out.println();


        // Refferences for the child class Planet

        CelestialBody planet = new Planet();
        planet.setName("Saturn");
        planet.setDimension(58.232);
        planet.setSatellite(new Satellite("Atlas", false, 0.601));
        System.out.println(planet);


        Planet planet1 = new Planet();
        //Satellite satellite1 = new Satellite("Sputnik",true,96.17);
        planet1.setName("Earth");
        planet1.setDimension(6371);
        planet1.getSatellite().setName("Sputnik 1");
        planet1.getSatellite().setArtificial(true);
        planet1.getSatellite().setOrbitalPeriod(96.17);
        planet1.setColor("Blue");
        planet1.setInhabitated(true);
        System.out.println(planet1);
        System.out.println();

        // short modifications for planet Earth's details
        planet1.getSatellite().setName("Moon");
        planet1.getSatellite().setArtificial(false);
        planet1.getSatellite().setOrbitalPeriod(27);
        System.out.println(planet1);
        System.out.println();



    }
}