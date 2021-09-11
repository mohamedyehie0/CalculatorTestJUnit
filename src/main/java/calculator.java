public class calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public long multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        int result;
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot divide by zero");
        } else {
            result = a/b;
        }
        return result;
    }
    public int sqr(int x){
        int y;
        y = x*x;
        return y;
    }

    public int reminder(int a, int b){
        int y;
        y = a%b;
        return y;
    }


}