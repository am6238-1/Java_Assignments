package sem1_week_1_practice;

public class ques_3 {
        static String getBmiStatus(double bmi) {

            if (bmi < 18.5) {
                return "Underweight";
            } else if (bmi < 25) {
                return "Normal";
            } else if (bmi < 30) {
                return "Overweight";
            } else {
                return "Obese";
            }
        }

        static void printWellnessReport(double[] heights, double[] weights) {

            System.out.println("Person | Height | Weight | BMI | Status");

            for (int i = 0; i < heights.length; i++) {

                double bmi = weights[i] / (heights[i] * heights[i]);

                String status = getBmiStatus(bmi);

                System.out.printf(
                        "Person %d | %.2f m | %.2f kg | %.2f | %s%n", i + 1, heights[i], weights[i], bmi, status );
            }
        }

        static void main() {

            double[] heights = {
                    1.75, 1.60, 1.80, 1.65, 1.70
            };

            double[] weights = {
                    70, 90, 80, 55, 95
            };

            printWellnessReport(heights, weights);
        }
    }
