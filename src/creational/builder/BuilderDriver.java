package creational.builder;

public class BuilderDriver {

    // JDK : SB, Stream, Calender.
    // SpringBoot : Main class, RestTemplate, ResponseEntity, User.
    public static void main(String[] args) {
        Employee e1 = new Employee.EmployeeBuilder().setId(1).build();
        System.out.println(e1);

        Employee e2 = new Employee.EmployeeBuilder().setId(1)
                .setFirstName("Atanu")
                        .setLastName("Chak")
                                .setCountry("India").build();
        System.out.println(e2);

        Employee e3 = new Employee.EmployeeBuilder().setCountry("Portugal").build();
        System.out.println(e3);
    }
}
