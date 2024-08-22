package office;

public class Runner {
    public static void main(String[] args) {
        Boss bossOffice = new Boss("Петр Николаевич");
        Manager managerOffice = new Manager("Володя");
        Secretar secretarOffice = new Secretar();
        Security securityOffice = new Security("Петрович");
        Office office = new Office(bossOffice, managerOffice, secretarOffice, securityOffice);
        office.workDay();
    }
}
