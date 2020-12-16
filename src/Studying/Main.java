package Studying;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        if (i == 0) {System.out.println("Значение 0");
            return;
        }

        if (i > 0) {System.out.println(i + " положительное и ");
        }
        else {System.out.println(i + " отрицательное и ");
        }

        if ( i % 2 == 0 ){System.out.println("четное");
        }
        else {System.out.println("нечетное");
        }
    }
}
