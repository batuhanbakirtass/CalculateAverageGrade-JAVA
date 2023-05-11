import java.util.Scanner;

public class CalculateAverageGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Math grade: ");
        int math = input.nextInt();

        System.out.print("Enter your Physics grade: ");
        int physics = input.nextInt();

        System.out.print("Enter your Chemistry grade: ");
        int chemistry = input.nextInt();

        System.out.print("Enter your Turkish grade: ");
        int turkish = input.nextInt();

        System.out.print("Enter your History grade: ");
        int history = input.nextInt();

        System.out.print("Enter your Music grade: ");
        int music = input.nextInt();

        double average = (math + physics + chemistry + turkish + history + music) / 6.0;

        System.out.println("Your average grade: " + average);
        System.out.println("Your status: " + (average >= 60 ? "Passed" : "Failed"));

        input.close();
    }
}
