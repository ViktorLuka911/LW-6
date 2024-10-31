package Commands;

import Menu.Menu;

public class GoToMenu extends Command {

    private final Menu menu;

    public GoToMenu(String title, Menu menu) {
        super(title);
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.startMenu();
    }
}