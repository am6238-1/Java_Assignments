package sem3_week3;

public class ques_3 {

        static void main() {

            Employee e1 = new Employee("E-101", "Divya", 65000);

            Employee e2 = new Employee("E-102", "Arjun");

            e1.printProfile();
            e2.printProfile();
        }
    }

    class Employee {

        String empId;
        String empName;
        double salary;
        boolean isIntern;

        Employee(String empId, String empName, double salary) {

            this.empId = empId;
            this.empName = empName;
            this.salary = salary;
            this.isIntern = false;
        }

        Employee(String empId, String empName) {

            this(empId, empName, 0);

            this.isIntern = true;
        }

        void printProfile() {

            System.out.println(empId + " | " + empName + " | Rs " + salary + " | Intern: " + isIntern);
        }
    }
