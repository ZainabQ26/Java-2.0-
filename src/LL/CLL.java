package LL;

public class CLL {
    private NODE head;
    private NODE tail;
    public void addSuitor(int suitorNumber) {
        NODE newNode = new NODE(suitorNumber);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    private String getSuitorList(NODE current) {
        if (current == null) return "[]";

        StringBuilder sb = new StringBuilder("[");
        NODE temp = current;

        do {
            sb.append(temp.suitorNumber).append(" ");
            temp = temp.next;
        } while (temp != current);

        return sb.toString().trim() + "]";
    }


    public int eliminateSuitors(int step) {
        NODE current = head;
        NODE prev = tail;


        System.out.println("\n-------------------------------------------------");
        System.out.printf("%-22s %-30s\n", "Remaining Suitors", "Elimination Step");
        System.out.println("-------------------------------------------------");

        while (current.next != current) {
            for (int i = 1; i < step; i++) {
                prev = current;
                current = current.next;
            }

            System.out.printf("%-22s Suitor %d eliminated, continue counting from %d\n",
                    getSuitorList(current), current.suitorNumber, current.next.suitorNumber);


            prev.next = current.next;
            current.next = null;

            current = prev.next;
        }

        return current.suitorNumber;
    }
}
