package hw03;

import java.util.Scanner;

public class Task_planner {
    public static void main(String[] args) {
        String [][] mySchedule = createSchedule();
        String dayOfWeek;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print(" Please, input the day of the week: ");
            dayOfWeek = scanner.nextLine();
            dayOfWeek = dayOfWeek.trim().toLowerCase();

            if (dayOfWeek.startsWith("change") || dayOfWeek.startsWith("reschedule")) {
                mySchedule = findDayChangeSchedule(dayOfWeek, mySchedule);
            } else {
                switch (dayOfWeek) {
                    case ("sunday"):
                        System.out.printf(" Your tasks for %s: %s\n", mySchedule[0][0], mySchedule[0][1]);
                        break;
                    case ("monday"):
                        System.out.printf(" Your tasks for %s: %s\n", mySchedule[1][0], mySchedule[1][1]);
                        break;
                    case ("tuesday"):
                        System.out.printf(" Your tasks for %s: %s\n", mySchedule[2][0], mySchedule[2][1]);
                        break;
                    case ("wednesday"):
                        System.out.printf(" Your tasks for %s: %s\n", mySchedule[3][0], mySchedule[3][1]);
                        break;
                    case ("thursday"):
                        System.out.printf(" Your tasks for %s: %s\n", mySchedule[4][0], mySchedule[4][1]);
                        break;
                    case ("friday"):
                        System.out.printf(" Your tasks for %s: %s\n", mySchedule[5][0], mySchedule[5][1]);
                        break;
                    case ("saturday"):
                        System.out.printf(" Your tasks for %s: %s\n", mySchedule[6][0], mySchedule[6][1]);
                        break;
                    default:
                        if (!dayOfWeek.equals("exit"))
                            System.out.println("Sorry, I don't understand you, please try again.");
                        break;
                }
            }
            } while (!dayOfWeek.equals("exit"));
    }

     public static String[][] createSchedule () {
         String[][] schedule = new String[7][2];
         schedule[0][0] = "Sunday";
         schedule[0][1] = "do home work";

         schedule[1][0] = "Monday";
         schedule[1][1] = "go to courses; watch a film";

         schedule[2][0] = "Tuesday";
         schedule[2][1] = "play football";

         schedule[3][0] = "Wednesday";
         schedule[3][1] = "celebrate Birthday";

         schedule[4][0] = "Thursday";
         schedule[4][1] = "do exercise";

         schedule[5][0] = "Friday";
         schedule[5][1] = "go to the party";

         schedule[6][0] = "Saturday";
         schedule[6][1] = "day for relax";
         return schedule;
     }

     public static String[][] findDayChangeSchedule (String changeDay, String[][] schedule) {
        String newTask;
        Scanner scanner = new Scanner(System.in);

        String[] day = new String[2];
        day = changeDay.split(" ");
        switch (day[1]) {
             case ("sunday"):
                 System.out.printf("Please, input new tasks for %s ", schedule[0][0]);
                 newTask = scanner.nextLine();
                 schedule[0][1] = newTask;
                 break;
             case ("monday"):
                 System.out.printf("Please, input new tasks for %s ", schedule[1][0]);
                 newTask = scanner.nextLine();
                 schedule[1][1] = newTask;
                 break;
             case ("tuesday"):
                 System.out.printf("Please, input new tasks for %s ", schedule[2][0]);
                 newTask = scanner.nextLine();
                 schedule[2][1] = newTask;
                 break;
             case ("wednesday"):
                 System.out.printf("Please, input new tasks for %s ", schedule[3][0]);
                 newTask = scanner.nextLine();
                 schedule[3][1] = newTask;
                 break;
             case ("thursday"):
                 System.out.printf("Please, input new tasks for %s ", schedule[4][0]);
                 newTask = scanner.nextLine();
                 schedule[4][1] = newTask;
                 break;
             case ("friday"):
                 System.out.printf("Please, input new tasks for %s ", schedule[5][0]);
                 newTask = scanner.nextLine();
                 schedule[5][1] = newTask;
                 break;
             case ("saturday"):
                 System.out.printf("Please, input new tasks for %s ", schedule[6][0]);
                 newTask = scanner.nextLine();
                 schedule[6][1] = newTask;
                 break;
             default:
                 System.out.println("You input wrong name of day for change or reschedule");
                 break;
         }
        return schedule;
     }
}