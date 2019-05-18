import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        for (String arg : args) {
            try {
                int amount = Integer.parseInt(arg);
                System.out.println("Giving change for" + arg);
                printExchange(amount);
            }catch (RuntimeException e) {
                System.out.println("Something went wrong!");
            }
        }



    }

    public static void printExchange(int amont) {
        if (amont % 10 !=0) {
            throw new RuntimeException();
        }
        Nominal[] values = Nominal.values();
        int pointer = 0;
        while (amont > 0) {
            if (values[pointer].getValue() <= amont) {
                System.out.println(values[pointer]);
                amont -= values[pointer].getValue();
            } else {
                pointer++;
            }


        }
    }
}
