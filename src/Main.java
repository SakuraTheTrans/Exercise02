public class Main {
    public static void main(String[] args) {
        int[] highs = {45, 29, 10, 22, 41, 28, 33};
        double[] precip = {0.95, 0.60, 0.25, 0.05, 0, 0.75, 0.90};
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("  Day  |  Temp  |  Precipitation");
        for (int i = 0; i < highs.length; i++) {
            if (highs[i] <= 32){
                if (precip[i] > 0.50){
                    System.out.println(days[i] + " |   " + highs[i] + "   | " + (precip[i] * 100) + "%  !! Likely To Snow !!");
                }
            }
        }
    }
}