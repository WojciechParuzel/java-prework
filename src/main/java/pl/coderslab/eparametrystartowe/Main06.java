package pl.coderslab.eparametrystartowe;

public class Main06 {

    public static void main(String[] args) {

        Integer n = Integer.parseInt(args[0]);

        for (int i = 1; i <= n; i++){
            for(int j=1; j<=n; j++){
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println();
        }
    }

}
