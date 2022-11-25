package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary>0) {
            if (salary <= 10000) {
                System.out.println(salary * 0.85);
            } else if (salary <= 20000) {
                System.out.println(salary * 0.82);
            } else if (salary > 20000) {
                System.out.println(salary * 0.80);
            }
        }
        else System.out.println("wrong input!");
    }

    public static void main(String[] args) {
        SalaryCalculator sc = new SalaryCalculator();
       sc.calculateSalary(5000);
    }
}
