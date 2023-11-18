package employeeApp;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{
    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan healthplan = new Healthplan(1, "Basic Plan", Healthplan.Plan.BASIC);
        Employee employee = new Employee(1, "John Doe", "john.doe@example.com", "password123");
        employee.addHealthplan(0, "Dental Insurance");
        Company company = new Company(1, "Tech Corp", 100000.0);

        company.addEmployee(0, "Alice Johnson");

        System.out.println("Healthplan Information:\n" + healthplan.toString());
        System.out.println("\nEmployee Information:\n" + employee.toString());
        System.out.println("\nCompany Information:\n" + company.toString());
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
