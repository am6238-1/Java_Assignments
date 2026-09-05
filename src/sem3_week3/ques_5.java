package sem3_week3;

public class ques_5 {


        static void main() {

            new Employe("Divya", 65000);

            new Employe("Arjun", 55000);

            new Employe("Priya", 70000);

            Employe.printCompanyInfo();
        }
    }


    class Employe {

        String empName;
        double salary;

        static String companyName = "Bright Horizon Technologies";

        static int employeeCount = 0;

        Employe(String empName, double salary) {

            this.empName = empName;
            this.salary = salary;

            employeeCount++;
        }

        static void printCompanyInfo() {

            System.out.println("Company: " + companyName);

            System.out.println("Employee Count: " + employeeCount);
        }
    }
