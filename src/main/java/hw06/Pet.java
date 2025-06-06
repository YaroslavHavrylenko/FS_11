package hw06;


public abstract class Pet {
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet (String nickname) {
        this.nickname = nickname;
    };
    public Pet (String nickname, int age, int trickLevel, String[] habits) {
        this.nickname = nickname;
        this.age = age;
        this. trickLevel = trickLevel;
        this.habits = habits;
    };
    public Pet () {};

    public void setNickname(String nickname) {
        this.nickname = (nickname.length() < 2) ? "Nickname not correct" :nickname;
    };
    public String getNickname() {
        return nickname;
    };

    public void setAge(int age) {
        this.age = age;
    };
    public int getAge() {
        return age;
    };

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = (trickLevel >= 0 && trickLevel <= 100 ) ? trickLevel : 1;
    };
    public int getTrickLevel() {
        return trickLevel;
    };

    public void setHabits (String[] habits){
        this.habits = (habits == null || habits.length == 0 ) ? new String[]{"No habits"} : habits;
    }
    public String[] getHabits() {
        return habits;
    }

    public void eat(){
        System.out.println("Я їм!");
    };
    public abstract void respond();

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object deleted - ".concat(this.toString()));
    }
}
