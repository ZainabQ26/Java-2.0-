package BINCONTAINER;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

class Bin1{
    private ArrayList<Integer> items;
    private int currentWeight;
    private static final int MAX_WEIGHT = 10;
    public Bin1(){
        items = new ArrayList<>();
        currentWeight = 0;
    }
    public boolean addItem(int item) {
        if (currentWeight + item > MAX_WEIGHT) {
            return false;
        }
        items.add(item);
        currentWeight += item;
        return true;
    }
    public List<Integer> getItems() {
        return new ArrayList<>(items);
    }

}
public class BINCONTAINER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of objects: ");
        int n = sc.nextInt();
        int[] weights = new int[n];
        System.out.println("Enter the weights of the objects with space: ");
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }
        ArrayList<Bin1> bins = new ArrayList<>();
        for (int weight: weights){
            boolean added = false;
            for (Bin1 bin: bins){
                if (bin.addItem(weight)){
                    added = true;
                    break;
                }
            }
            if (!added){
                Bin1 bin = new Bin1();
                bin.addItem(weight);
                bins.add(bin);
            }
        }
        for(int i=0; i<bins.size(); i++){
            System.out.println("container " + (i+1)+ " " + "contains objects with weights ");
            for(int item: bins.get(i).getItems()){
                System.out.println(item);
            }
            System.out.println();
        }
    }
}


