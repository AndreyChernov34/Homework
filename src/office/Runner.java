package office;

public class Runner {
    public static void main(String[] args){
        boss bossOffice= new boss("Петр Николаевич");
        manager managerOffice= new manager("Володя");
        secretar secretarOffice = new secretar();
        security securityOffice = new security("Петрович");

        office officeMy =new office (bossOffice,managerOffice ,secretarOffice,securityOffice);
        officeMy.workDay();
    }


}
