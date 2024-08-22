package office;

public class Office {
    public Boss boss;
    public Manager manager;
    public Secretar secretar;
    public Security security;

    public Office(Boss newboss, Manager newmanager, Secretar newsecretar, Security newsecurity) {
        this.boss = newboss;
        this.manager = newmanager;
        this.secretar = newsecretar;
        this.security = newsecurity;
    }

    public void workDay() {
        this.boss.say(this.manager.name);
        this.manager.say();
        this.security.say();
        this.secretar.say(this.boss.name, this.manager.name, this.security.name);
    }
}
