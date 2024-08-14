public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        double now = System.currentTimeMillis();

        Main demo = new Main();
        System.out.println(demo.findSum(999999));

        System.out.println("Time taken is: " + (System.currentTimeMillis() - now) + "ms");
    }

    public int findSum(int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += i;
        }
        return sum;
    }

//    public int findSum(int n){
//        return n * (n + 1) / 2;
//    }
}