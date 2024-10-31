import SystemVouchers.SystemVouchers;

public class Main {
    public static void main() {
        SystemVouchers systemVouchers = SystemVouchers.getInstance();

        Menu.Main menu = new Menu.Main();
        menu.startMenu();

        systemVouchers.closeDataFileLogger();
    }
}