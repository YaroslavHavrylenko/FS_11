package hw06;

public enum DayOfWeek {
    SUNDAY ("Sunday"),
    MONDAY ("Monday"),
    TUESDAY ("Tuesday"),
    THURSDAY ("Thursday"),
    WEDNESDAY ("Wednesday"),
    FRIDAY ("Friday"),
    SATURDAY ("Saturday");

    private final String dayOfWeek;

    DayOfWeek (String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    };

    public String getDayOfWeek(){
        return dayOfWeek;
    }
}
