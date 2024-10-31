package Commands;

import Voucher.Voucher;
import java.util.Scanner;

public class AddVoucher extends Command {

    public AddVoucher(String title) {
        super(title);
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        Voucher newVoucher = new Voucher();
        systemVouchers.addVoucher(newVoucher);

        System.out.print("\n\tНатисніть Enter, щоб продовжити...");
        scanner.nextLine();
    }
}