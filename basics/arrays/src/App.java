public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");

        int[] rollNums = { 10, 20, 34, 489, 37 };
        int[] rollNums2 = new int[5];

        for (int i = 0; i < rollNums.length; i++) {

            System.out.println(rollNums[i]);
        }

        int[] another;

        another = new int[5];
        System.out.println(another[4]);
    }
}
