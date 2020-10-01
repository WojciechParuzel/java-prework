package pl.coderslab.eparametrystartowe;

public class Main03 {
    public static void main(String[] args) {

        double suma = 0.0;

        for (int i=0;  i < args.length;  i++){
            Integer arg = Integer.parseInt(args[i]);
            suma += arg;
        }

        System.out.println(suma/args.length);
    }
}
