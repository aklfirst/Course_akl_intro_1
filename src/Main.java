public class Main {


    public static void main(String[] args) {

        Employee klepov = new Employee("Александр", "Анатольевич", "Клепов", 48, 5, 200_000);
        Employee frolov = new Employee("Дмитрий", "Викторович", "Фролов", 40, 2, 100_000);
        Employee volosevich = new Employee("Дмитрий", "Борисович", "Волосевич", 49, 3, 50_000);

        Employee.employeeList[0] = klepov;
        Employee.employeeList[1] = frolov;
        Employee.employeeList[2] = volosevich;

        volosevich.setSalary(300000);

        Employee.printAllActiveEmployees();
        Employee.totalSalary();
        Employee.getMaxSalary();
        Employee.getMinSalary();
        Employee.printNamesOnly();

    }
}
