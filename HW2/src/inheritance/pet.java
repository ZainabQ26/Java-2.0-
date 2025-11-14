package inheritance;

public class pet {
    protected String EyeColor;
    protected float Age;
    protected float Weight;
    protected String Location;
    public pet(String EyeColor, float age, float weight, String location) {
        this.EyeColor = EyeColor;
        this.Age = age;
        this.Weight = weight;
        this.Location = location;
    }
    public String getEyeColor() { return EyeColor; }
    public float getAge() { return Age; }
    public float getWeight() { return Weight; }
    public String getLocation() { return Location; }
    public void eat(String foodType) {
        System.out.println("The pet is eating " + foodType);
    }
    public void sleep(int timeLength) {
        System.out.println("The pet is sleeping for " + timeLength + " hours.");
    }
}

