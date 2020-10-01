package pl.coderslab.eparametrystartowe;

public class Main08 {

    public static void main(String[] args) {

        Integer x = Integer.parseInt(args[0]);
        Integer y = Integer.parseInt(args[1]);

        int min;
        int max = 1;

        if (x > y){
            min = x;
        } else {
            min = y;
        }

        for (int i = 1; i <= min; i++){
            if ((x%i==0) && (y%i==0)){
                max = i;
            }
        }
        System.out.println(max);
    }

}
