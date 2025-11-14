package inheritance;

public class bird extends pet {
    private String FeatherColor;
    private String Wingspan;
    private String BeakType;

    public bird(String EyeColor, float Age, float Weight, String Location,
                String FeatherColor, String Wingspan, String BeakType) {
        super(EyeColor, Age, Weight, Location);
        this.FeatherColor = FeatherColor;
        this.Wingspan = Wingspan;
        this.BeakType = BeakType;
    }
    public void squawk() {
        System.out.println("*** squawk ***");
    }
    public void fly() {
        System.out.println("*** fly ***");
    }
    @Override
    public String toString() {
        return "You entered a " + EyeColor + "-eyed bird that is " + Age +
                " years old and weighs " + Weight + " pounds lives in " + Location + ". " +
                "Its feather color is " + FeatherColor + " and wingspan is " + Wingspan +
                " and beak type is " + BeakType + ".";
    }
}


