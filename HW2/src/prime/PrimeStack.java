package prime;
public class PrimeStack {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
            return true;
        }
        public static void main(String[] args) {
            IntegerStack stack = new IntegerStack(120);
            for (int i = 2; i < 120; i++) {
                if (isPrime(i)) {
                    stack.push(i);
                }
            }
            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
        }
    }



