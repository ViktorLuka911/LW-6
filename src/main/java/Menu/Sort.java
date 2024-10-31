package Menu;

import Commands.Command;
import Commands.GoToMenu;
import Utilities.Utilities;
import java.util.ArrayList;
import java.util.Arrays;

public class Sort extends Menu {

    public Sort() {

        ArrayList<Menu> subMenus = new ArrayList<>(
                Arrays.asList(
                        new SortOrder("Сортувати за кількістю днів"),
                        new SortOrder("Сортувати за ціною"),
                        new SortOrder("Сортувати за датою")
                )
        );

        ArrayList<Command> commands = new ArrayList<>(
                Arrays.asList(
                        new GoToMenu("Сортувати за кількістю днів", subMenus.get(0)),
                        new GoToMenu("Сортувати за ціною", subMenus.get(1)),
                        new GoToMenu("Сортувати за датою", subMenus.get(2))
                )
        );

        super("Меню вибору типу сортування", commands, subMenus);
    }

    @Override
    public void printMenu() {
        System.out.printf("\n\t\t\t%s%n%n", title);
        for (int i = 0; i < commands.size(); i++) {
            System.out.printf("\t %d - %s%n", i + 1, commands.get(i).getTitle());
        }
    }

    @Override
    public boolean selectCommand() {
        int choice = Utilities.getValidatedInput(1, 3);

        switch (choice) {
            case 1 -> commands.get(0).execute();
            case 2 -> commands.get(1).execute();
            case 3 -> commands.get(2).execute();
        }

        return false;
    }
}