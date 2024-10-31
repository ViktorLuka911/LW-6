package Commands;

public class Sort extends Command {

    private final String type;

    public Sort(String type, String title) {
        super(title);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void execute() {
        boolean ascending = getTitle().equals("За зростанням");

        switch (getType()) {
            case "Сортувати за кількістю днів":
                systemVouchers.sortVouchersByDays(ascending);
                break;

            case "Сортувати за ціною":
                systemVouchers.sortVouchersByPrice(ascending);
                break;

            case "Сортувати за датою":
                systemVouchers.sortVouchersByDate(ascending);
                break;
        }
        systemVouchers.showVouchers(true);
    }
}