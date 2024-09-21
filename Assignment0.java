import java.util.Scanner;

/**
 * CSCI 1110 W2021 A0 - Keeping track of active minutes in a month
 * @author Juliano Franz
 *
 */

public class Assignment0 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int month = kb.nextInt();
        int daysInMonth = -1;

        if(month == 2){
            daysInMonth = 28;
        }
        else if(month % 2 == 0 && month < 8){
            daysInMonth = 30;
        }
        else if(month %2 != 0 && month >8) {
            daysInMonth = 30;
        }
        else {
            daysInMonth = 31;
        }

        int[] activeMinutesMonth = new int[daysInMonth];

        int day = kb.nextInt();
        int totalExercise = 0;
        while (day != 0){
            int exerciseMinutes = kb.nextInt();
            if(day >0 && day <= daysInMonth){
                activeMinutesMonth[day-1] += exerciseMinutes;
                totalExercise += exerciseMinutes;
            }
            day = kb.nextInt();
        }

        System.out.printf("On month #%d, you were active %d minutes or %.2f%% of the time.\n",
                month, totalExercise, 100*(double)totalExercise/(daysInMonth * 24 * 60));

        //Q2 25 points - most active day
        int mostActiveDay = 1;
        int mostActiveDayMinutes = activeMinutesMonth[0];
        for (int i = 0; i < daysInMonth; i++) {
            if(mostActiveDayMinutes < activeMinutesMonth[i]){
                mostActiveDay = i+1;
                mostActiveDayMinutes = activeMinutesMonth[i];
            }
        }

        System.out.printf("You were most active on day %d with %d minutes\n", mostActiveDay,mostActiveDayMinutes);


        //Q3 - Histogram
        int[] numStars = new int[daysInMonth];
        for (int i = 0; i < numStars.length; i++) {
            numStars[i] = activeMinutesMonth[i]/10;
        }
        for (int i = 0; i < numStars.length; i++) {
            System.out.print(i+1 + " ");
            for (int j = 0; j < numStars[i]; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        //Q4 Bar Chart
        String[][] barChart = new String[mostActiveDayMinutes/10+1][daysInMonth];
        for (int i = 0; i < daysInMonth; i++) {
            barChart[0][i] = String.format("%3s", i+1);
        }
        for (int i = 0; i < daysInMonth; i++) {
            for (int j = 1; j < activeMinutesMonth[i]/10 + 1; j++) {
                barChart[j][i] = "*";
            }
        }

        for (int i = barChart.length-1; i >= 0; i--) {
            for (int j = 0; j < barChart[0].length; j++) {
                if(barChart[i][j] == null){
                    System.out.printf("%3s", "");
                }
                else {
                    System.out.printf("%3s", barChart[i][j]);
                }
            }
            System.out.println();
        }
    }

}
