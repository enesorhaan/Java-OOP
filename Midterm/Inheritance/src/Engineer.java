public class Engineer extends Employee{

    Engineer(){
        super();
        setSalary(7000);
    }

    Engineer(String name, String surname){
        super(name, surname);
        setJob("Muhendis");
        setAnnualPermit(20);
        setSalary(7000);
    }

    Engineer(String name, String surname, int salary){
        super(name, surname, salary);
        setSalary(salary);
        if(salary > 7000){
            setJob("Kidemli Muhendis");
            setAnnualPermit(25);
        }else if(salary > 10000){
            setJob("Uzman Muhendis");
            setAnnualPermit(35);
        }else{
            setJob("Stajyer Muhendis");
            setAnnualPermit(0);
        }
    }

    @Override
    public int makeRaise(double howMuch){
        double money = (double)(getSalary() * howMuch) + 250;
        makeRaise((int)money);
        return getSalary();
    }
}
