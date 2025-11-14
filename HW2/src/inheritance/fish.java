package inheritance;

public class fish extends pet{
    private boolean Jawless;
    private String SkeletonType;
    private boolean DorsalFin;
    private String BodyType;


    public fish(String EyeColor, float Age, float Weight, String Location,
                boolean Jawless, String SkeletonType, boolean DorsalFin, String BodyType) {
        super(EyeColor, Age, Weight, Location);
        this.Jawless = Jawless;
        this.SkeletonType = SkeletonType;
        this.DorsalFin = DorsalFin;
        this.BodyType = BodyType;
    }

    public void swim(String direction) {
        System.out.println("*** swimming " + direction + " ***");
    }

    public void eatLight() {
        System.out.println("*** detectLight() ***");
    }

    @Override
    public String toString() {
        return "You entered a " + EyeColor + "-eyed fish that is " + Age +
                " years old and weighs " + Weight + " pounds lives in " + Location + ". " +
                "It is " + (Jawless ? "jawless" : "not jawless") + ", has a " +
                SkeletonType + " skeleton, " + (DorsalFin ? "has" : "does not have") +
                " a dorsal fin, and its body type is " + BodyType + ".";
    }
}
