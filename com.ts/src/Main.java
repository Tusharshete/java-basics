public class Main {
    public static void main(String[] args) {
        // define arrays for left-value and right-value
        double[] leftVal = {100.0d, 50.0d, 20.0d, 10.0d};
        double[] rightVal = {50.0d, 20.0d, 10.0d, 5.0d};

        // define array for operators
        char[] operation = {'d', 'm', 'a', 's'};

        // array to store the results
        double[] result = new double[operation.length];

        for (int i=0; i < operation.length; i++) {
            result[i] = execute(leftVal[i], rightVal[i], operation[i]);
            System.out.println(leftVal[i] + " (" + operation[i] + ") " + rightVal[i] + " = " + result[i]);
        }
    }

    public static double execute(double leftVal, double rightVal, char operation) {
        switch (operation) {
            case 'd' -> {
                return leftVal / rightVal;
            }
            case 'm' -> {
                return leftVal * rightVal;
            }
            case 'a' -> {
                return leftVal + rightVal;
            }
            case 's' -> {
                return leftVal - rightVal;
            }
            default -> throw new RuntimeException();
        }
    }
}