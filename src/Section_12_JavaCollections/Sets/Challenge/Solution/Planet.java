package Section_12_JavaCollections.Sets.Challenge.Solution;

public class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody satellite) {
        // Planets can only have moons as satellites
        if (satellite.getKey().getBodyType() == BodyTypes.MOON) {
            return super.addSatellite(satellite);
        } else {
            return false;
        }

    }
}
