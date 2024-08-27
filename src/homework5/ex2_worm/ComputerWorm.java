package homework5.ex2_worm;

import java.io.FileWriter;
import java.io.IOException;

public class ComputerWorm extends Computer {
    private Computer computer;

    public ComputerWorm(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void login(String user) {
        savelog(String.format("Пользователь %s зашел в систему \n", user));
        super.login(user);
    }

    @Override
    public void exit() {
        savelog("Пользователь вышел из системы \n");
        super.exit();
    }

    @Override
    public void print(String string) {
        savelog(String.format("Пользователь %s отправил сообщение: %s\n", user, string));
        super.print(string);
    }

    private void savelog(String string) {
        try (FileWriter fileWriter = new FileWriter("comp.log", true)) {
            fileWriter.write(string);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
