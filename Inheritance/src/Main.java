public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Cigdem", "Oztutan");
        Employee employee2 = new Employee("Furkan", "Orhan", 3500);

        Employee engineer1 = new Engineer("Enes", "Orhan", 12000);
        Employee engineer2 = new Engineer("Serhan", "Orhan", 1500);

        System.out.println("--------------");

        employee1.infoBox();
        employee2.infoBox();
        engineer1.infoBox();
        engineer2.infoBox();
    }

}