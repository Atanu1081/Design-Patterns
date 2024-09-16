package creational.builder;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String country;

    private Employee(EmployeeBuilder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.country = builder.country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    static class EmployeeBuilder {
        private int id;
        private String firstName;
        private String lastName;
        private String country;

        public EmployeeBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public EmployeeBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public EmployeeBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Employee build() {
            Employee employee = new Employee(this);
            return employee;
        }
    }
}
