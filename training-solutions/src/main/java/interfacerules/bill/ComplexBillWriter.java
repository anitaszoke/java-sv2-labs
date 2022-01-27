package interfacerules.bill;

import java.util.List;

public class ComplexBillWriter implements BillWrite {
    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (String s : billItems) {
            String[] fullLine = s.split(";");
            String item = fullLine[0];
            int price = Integer.parseInt(fullLine[1]);
            int piece = Integer.parseInt(fullLine[2]);

            sb.append(String.format("%s; darabszám: %d, egységár: %d, összesen: %d Ft", item, piece, price, (piece * price))).append("\n");
        }
        return sb.toString();
    }
}