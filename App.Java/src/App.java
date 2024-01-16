public class App {
    public int dIt(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i = 2 * i - 1) {
        if (i <= 1) {
            sum += i;
            i = 2;
        } else {
            sum += i;
        }
    }
        return sum;
    }
     public static void main(String[] args){

     }
    }
