package Commands;

import SystemVouchers.SystemVouchers;

public abstract class Command {

    protected String title;
    protected SystemVouchers systemVouchers;

    public Command(String title) {
        this.title = title;
        this.systemVouchers = SystemVouchers.getInstance();
    }

    public abstract void execute();

    public String getTitle() {
        return title;
    }
}