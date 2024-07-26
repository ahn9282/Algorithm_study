package study.algorithm;

import java.time.LocalDate;

public class Year2016 {
    public static void main(String[] args) {
        System.out.println(solution(1,1));
        System.out.println(LocalDate.of(2016, 1,1).getDayOfWeek().toString().substring(0,3));
    }

    public static String solution(int a, int b) {
        String answer = "";

        String[] days = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};

        int day = 0;


        for(int i=1; i < a; i++){
            day += months[i];
        }
        day += b;



        return days[day %7-1];
    }
}
