import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Arrays to store student data
        int[] rollNos = new int[numStudents];
        String[] names = new String[numStudents];
        float[] physicsGrades = new float[numStudents];
        float[] chemistryGrades = new float[numStudents];
        float[] mathGrades = new float[numStudents];
        float[] biologyGrades = new float[numStudents];
        float[] englishGrades = new float[numStudents];

        // Input loop to get student data
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            rollNos[i] = scanner.nextInt();
            System.out.print("Name: ");
            names[i] = scanner.next();
            System.out.print("Physics Grade: ");
            physicsGrades[i] = scanner.nextFloat();
            System.out.print("Chemistry Grade: ");
            chemistryGrades[i] = scanner.nextFloat();
            System.out.print("Math Grade: ");
            mathGrades[i] = scanner.nextFloat();
            System.out.print("Biology Grade: ");
            biologyGrades[i] = scanner.nextFloat();
            System.out.print("English Grade: ");
            englishGrades[i] = scanner.nextFloat();
        }

        // Calculate average, highest, and lowest grades for each subject
        float[] averages = new float[5];
        float[] highestGrades = new float[5];
        float[] lowestGrades = new float[5];

        for (int i = 0; i < 5; i++) {
            float total = 0;
            float highest = physicsGrades[0];
            float lowest = physicsGrades[0];

            for (int j = 0; j < numStudents; j++) {
                float grade = 0;
                switch (i) {
                    case 0:
                        grade = physicsGrades[j];
                        break;
                    case 1:
                        grade = chemistryGrades[j];
                        break;
                    case 2:
                        grade = mathGrades[j];
                        break;
                    case 3:
                        grade = biologyGrades[j];
                        break;
                    case 4:
                        grade = englishGrades[j];
                        break;
                }

                total += grade;

                if (grade > highest) {
                    highest = grade;
                }

                if (grade < lowest) {
                    lowest = grade;
                }
            }

            averages[i] = total / numStudents;
            highestGrades[i] = highest;
            lowestGrades[i] = lowest;
        }

        // Display results
        System.out.println("\nSubject-wise Statistics:");
        for (int i = 0; i < 5; i++) {
            String subject = "";
            switch (i) {
                case 0:
                    subject = "Physics";
                    break;
                case 1:
                    subject = "Chemistry";
                    break;
                case 2:
                    subject = "Math";
                    break;
                case 3:
                    subject = "Biology";
                    break;
                case 4:
                    subject = "English";
                    break;
            }

            System.out.println("\n" + subject + ":");
            System.out.println("Average Grade: " + averages[i]);
            System.out.println("Highest Grade: " + highestGrades[i]);
            System.out.println("Lowest Grade: " + lowestGrades[i]);
        }
    }
}
