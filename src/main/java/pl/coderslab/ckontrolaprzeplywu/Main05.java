package pl.coderslab.ckontrolaprzeplywu;

public class Main05 {

    public static void main(String[] args) {
        int resultFor = 0;
        int resultWhile = 0;

        for (int i = 1; i < 11; i++) {
            resultFor += i;
        }
        int i = 1;
        while (i < 11) {
            resultWhile += i;
            i++;
        }

        System.out.println(resultFor);
        System.out.println(resultWhile);
    }

}