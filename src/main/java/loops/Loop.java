package loops;

public class Loop {
    public static void main(String[] args) {
      /*  int number;
        number = 2;
        int maxLimit;
        maxLimit = 100;

        while (number <= maxLimit) {
            if (number % 2 == 0) {
                System.out.println(number);

            }
            number++;

        }*/

        //for loop
        int maxValue;
        maxValue = 30;
        for (int number = 0; number < maxValue; number++) {
            if (number % 2 != 0) {

                System.out.println(number);
            }
        }

    }
}
