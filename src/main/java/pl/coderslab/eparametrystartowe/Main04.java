package pl.coderslab.eparametrystartowe;

public class Main04 {

    public static void main(String[] args) {

        Integer a = Integer.parseInt(args[0]);
        Integer b = Integer.parseInt(args[1]);
        Integer c = Integer.parseInt(args[2]);

        if ((a + b > c) && (c + b > a) && (a + c > b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
