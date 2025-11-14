package inheritance;
public class cat extends pet {
    private String FurColor;
    private String WhiskerColor;
    private String FurLength;
    private int ToeNumber;
    public cat(String EyeColor, float Age, float Weight, String Location,
               String FurColor, String WhiskerColor, String FurLength, int ToeNumber) {
        super(EyeColor, Age, Weight, Location);
        this.FurColor = FurColor;
        this.WhiskerColor = WhiskerColor;
        this.FurLength = FurLength;
        this.ToeNumber = ToeNumber;
    }
    public void purr(int soundLevel) {
        System.out.println("*** purring at level " + soundLevel + " ***");
    }
    public void meow() {
        System.out.println("*** meow ***");
    }
    public void groom() {
        System.out.println("*** grooming ***");
    }
    public void purr() {
        System.out.println("purr(soundlevel)");
    }
    @Override
    public String toString() {
        return "You entered a " + EyeColor + "-eyed cat that is " + Age +
                " years old and weighs " + Weight + " pounds lives in " + Location + ". " +
                "Its fur color is " + FurColor + ", whisker color is " + WhiskerColor +
                ", fur length is " + FurLength + " and it has " + ToeNumber + " toes.";
    }
}

