package pl.coderslab.ckontrolaprzeplywu;

public class Main10 {

    public static void main(String[] args) {


        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i >= j) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

        int k = n + 1;
        for (int i = 1; i <= n; i++) {
            k--;
            for (int j = 1; j <= n; j++) {
                if (j <= k) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }

            }
            System.out.println();
        }
    }


}
