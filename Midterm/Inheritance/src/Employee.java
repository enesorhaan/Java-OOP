public class Employee {
    private String ayrac = "------------------";
    private String name, surname, job;
    private int salary, annualPermit = 14;

    Employee(){
        this.name = null;
        this.surname = null;
    }
    Employee(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.job = "Calisan";
        this.salary = 2500;
        this.annualPermit = 14;
    }
    Employee(String name, String surname, int salary){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        if(salary > 3000){
            this.job = "Kidemli Calisan";
            this.annualPermit += 3;
        }else if(salary > 0 && salary < 3000){
            this.job = "Calisan";
        }else{
            this.job = "Stajyer";
            this.annualPermit = 0;
        }
    }

    // Total fiyat ile maaş zammı
    public int makeRaise(int howMuch){
        salary += howMuch;
        return  salary;
    }
    // Zam oranı ile zam yapmak
    public int makeRaise(double howMuch){
        double money = (double) salary * howMuch;
        makeRaise((int)money);
        return salary;
    }

    // Setter
    public void setJob(String job){
        this.job = job;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setAnnualPermit(int annualPermit){
        this.annualPermit = annualPermit;
    }

    public String getJob() {
        return job;
    }
    public int getSalary() {
        return salary;
    }
    public int getAnnualPermit() {
        return annualPermit;
    }

    public void infoBox(){
        System.out.println("< "+getJob()+" Bilgileri>\n"+ayrac+"\n-> Çalışan İsmi: "+name+"\n-> Çalışan Soyismi: "+surname+
                "\n-> Görevi: "+getJob()+"\n-> Maaşı: "+getSalary()+" TL\n-> İzin Günü: "+getAnnualPermit()+" İş Günü\n"+ayrac);
    }
    public void raiseInfo(){
        System.out.println("< "+getJob()+" Zam Uygulaması >\n-> Yeni Verilecek Maaş: "+getSalary()+"TL \n"+ayrac);
    }

}
