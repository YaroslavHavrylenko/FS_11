package hw10.Pets;

public enum Species {
    DOG ("Dog"),
    DOMESTICCAT ("Domestic Cat"),
    FISH ("Fish"),
    ROBOCAT ("RoboCat"),
    UNKNOWN ("Unknown");

    private final String species;

    Species (String species) {
        this.species = (species == null) ? "Unknown" : species; }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return species;
    }
}
