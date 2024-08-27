package homework5.ex2_worm;

public class Runner {
    public static void main(String[] args) {
        Computer computer = new Computer();
        ComputerWorm computerWorm = new ComputerWorm(computer);
        computerWorm.login("Юрий");
        computerWorm.exit();
        computerWorm.login("Андрей");
        computerWorm.print("важное сообщение!");
    }
}
