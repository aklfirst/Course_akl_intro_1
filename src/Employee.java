public class Employee {


    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private int department;
    private float salary;
    public static float totalSalary;
    public static float maxSalary;
    public static float minSalary;
    public static int highestPaidEmployeeReference;
    public static int lowestPaidEmployeeReference;
    private static float averageSalary;
    public static int counter;
    private int id;

    static Employee[] employeeList = new Employee[10];


    public Employee(String firstName, String middleName, String lastName, int age, int department, float salary) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.department = department;
        this.salary = salary;
        id = ++counter;

    }

    public int getid() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Сотрудник: " + getid() + "| " + getFirstName() + "| " + getMiddleName() + "| " + getLastName() + "| " + getAge() + "| " + getDepartment() + "| " + getSalary();
    }

    public static void printAllActiveEmployees() {

        for (int i = 0; i < counter; i++) {
            if (employeeList[i] != null) {
                System.out.println(employeeList[i]);
            } else {
                break;
            }

        }
    }

    public static void totalSalary() {

        for (int i = 0; i < counter; i++) {
            if (employeeList[i] != null) {
                totalSalary = totalSalary + employeeList[i].getSalary();

            } else {
                break;
            }

        }
        System.out.println("Общий ФОТ в месяц: " + totalSalary);
        averageSalary = totalSalary / counter;
        System.out.println("Средняя зарплата в месяц: " + averageSalary);
    }

    public static void getMaxSalary() {
        maxSalary = employeeList[0].getSalary();
        for (int i = 0; i < counter; i++) {
            if (employeeList[i].getSalary() > maxSalary) {
                maxSalary = employeeList[i].getSalary();
                highestPaidEmployeeReference = i;
            }

        }
        System.out.println("Самая высокая зарплата: " + maxSalary + " - " + employeeList[highestPaidEmployeeReference].getFirstName() + " " + employeeList[highestPaidEmployeeReference].getMiddleName() + " " + employeeList[highestPaidEmployeeReference].getLastName());

    }

    public static void getMinSalary() {
        minSalary = employeeList[0].getSalary();
        for (int i = 0; i < counter; i++) {
            if (employeeList[i].getSalary() < minSalary) {
                minSalary = employeeList[i].getSalary();
                lowestPaidEmployeeReference = i;
            }

        }
        System.out.println("Самая низкая зарплата: " + minSalary + " - " + employeeList[lowestPaidEmployeeReference].getFirstName() + " " + employeeList[lowestPaidEmployeeReference].getMiddleName() + " " + employeeList[lowestPaidEmployeeReference].getLastName());

    }

    public static void printNamesOnly() {

        for (int i = 0; i < counter; i++) {
            if (employeeList[i] != null) {
                System.out.println(employeeList[i].getFirstName() + " " + employeeList[i].getMiddleName() + " " + employeeList[i].getLastName());
            } else {
                break;
            }

        }
    }

}

