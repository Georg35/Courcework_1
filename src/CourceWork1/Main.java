package CourceWork1;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Алексеев Леонид Николаевич", 1, 98000);
        employees[1] = new Employee("Богданов Николай Васильевич", 3, 77500);
        employees[2] = new Employee("Ваганоа Алена Николаевна", 5, 85050);
        employees[3] = new Employee("Ершова Анастасия Михайловна", 2, 99752);
        employees[4] = new Employee("Зубов Евгений Михайлович", 4, 125800);
        employees[5] = new Employee("Лепихина Евгения Валерьевна", 2, 110000);
        employees[6] = new Employee("Никифоров Константин Сергеевич", 1, 55000);
        employees[7] = new Employee("Панкратов Григорий Витальевич", 5, 78600);
        employees[8] = new Employee("Скоробогатова Ирина Михайловна", 1, 99800);
        employees[9] = new Employee("Ушаков Степан Николаевич", 4, 69800);


        Employee.fullEmployees(employees);
        Employee.empTotalSalary(employees);


        System.out.println("Общая сумма затрат на заработную плату - " + Employee.empTotalSalary(employees) + " рублей");
        System.out.println("Среднее значение затрат на заработную плату - " + Employee.averageSalary(employees) + " рублей");
        System.out.println("Сотрудник с максимальной зарплатой - " + Employee.empMaxSalary(employees));
        System.out.println("Сотрудник с минимальной зарплатой - " + Employee.empMinSalary(employees));

        Employee.empList(employees);

    }

}
