package office;


public class office {
    public boss boss;//= new boss();
    public manager manager;//= new manager();
    public secretar secretar;// = new secretar();
    public security security;// = new security();

    public office(boss newboss, manager newmanager, secretar newsecretar, security newsecurity) {
        this.boss = newboss;
        this.manager = newmanager;
        this.secretar = newsecretar;
        this.security = newsecurity;
    }

    public void workDay() {
        this.boss.Say(this.manager.name);
        this.manager.Say();
        this.security.Say();
        this.secretar.Say(this.boss.name, this.manager.name, this.security.name);

    }
}
