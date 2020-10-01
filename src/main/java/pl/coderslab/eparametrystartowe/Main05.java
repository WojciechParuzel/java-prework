package pl.coderslab.eparametrystartowe;

public class Main05 {

    public static void main(String[] args) {

        Integer points = Integer.parseInt(args[0]);

        if (points < 0 || points > 100) {
            System.out.println("BADVALUE");
        } else {
            if (points > 0 && points <= 50) {
                System.out.println("F");
            } else {
                if (points > 50 && points <= 70) {
                    System.out.println("E");
                } else {
                    if (points > 70 && points <= 90) {
                        System.out.println("C");
                    } else {
                        if (points > 90 && points <= 100) {
                            System.out.println("A");
                        }
                    }
                }
            }
        }

    }

}
