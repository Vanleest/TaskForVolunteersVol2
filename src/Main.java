import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1 result: "+ plusMinusBuilder(7));
        System.out.println("Task2 result: "+ calcSumArray(new int[]{0, 1, 2, 3, 4}));
        System.out.println("Task3 result: "+ Arrays.toString(sumZero(7)));
        System.out.println("Task4 result: "+ largestInFamily(213));
        System.out.println("Task5 result: "+ repFirstChar("&est"));
    }

    private static String plusMinusBuilder(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i< n; i++) {
            if (i % 2 == 0) {
                stringBuilder.append("+");
            } else {
                stringBuilder.append("-");
            }
        }
        return stringBuilder.toString();
    }

    private static int calcSumArray(int[] arr) {
        int result = 0;
        for(int i=0; i< arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

    private static int[] sumZero(int n) {
        int[] arr = new int[n];

        for(int i = 0; i< n/2; i++) {
            arr[i] = i + 1;
            arr[n - i - 1] = -(i + 1);
        }

        if(n%2!=0)
            arr[n/2] = 0;

        return arr;
    }

    private static int largestInFamily(int n) {
        String stringN = String.valueOf(n);
        int[] intArray = convertStringToIntArray(stringN);
        Arrays.sort(intArray);
        StringBuilder stringBuilder = convertIntArrayToString(intArray);
        return Integer.parseInt(stringBuilder.toString());
    }

    private static StringBuilder convertIntArrayToString(int[] intArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = intArray.length -1; i >= 0; i--) {
            stringBuilder.append(intArray[i]);
        }
        return stringBuilder;
    }

    private static int[] convertStringToIntArray(String stringN) {
        int[] intArray = new int[stringN.length()];
        for (int i = 0; i < stringN.length(); i++) {
            intArray[i] = Character.getNumericValue(stringN.charAt(i));
        }
        return intArray;
    }


    private static String repFirstChar(String s) {
        char c = s.charAt(0);
        if(Character.isUpperCase(c)) {
            return "upper";
        } else if(Character.isLowerCase(c)) {
            return "lower";
        } else if(Character.isDigit(c)){
            return "digit";
        } else {
            return "other";
        }
    }
}

