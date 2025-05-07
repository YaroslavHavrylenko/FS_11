package hw05;

public enum Species {
    DOG ("Dog"),
    CAT ("Cat"),
    RABBIT ("Rabbit"),
    RAT ("Rat");

    private final String species;


    Species (String species) {
        this.species = species;
    };

    public String getSpecies() {
        return species;
    }
}
