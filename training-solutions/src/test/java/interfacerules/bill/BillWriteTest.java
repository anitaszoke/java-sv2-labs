package interfacerules.bill;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BillWriteTest {

    Bill bill = new Bill();
    BillWrite billWrite;

    Path path = Paths.get("src/test/resources/billitems.txt");
    List<String> billItems = bill.readBillItemsFromFile(path);

    @Test
    void readFileTest() {
        assertEquals(4, billItems.size());
        assertTrue(billItems.get(0).contains("kenyér"));
    }

    @Test
    void simpleBillWriterTest() {
        billWrite = new SimpleBillWriter();
        String bills = billWrite.writeBill(billItems);

        assertTrue(bills.contains("kenyér,1 * 400 = 400 Ft\n"));
    }

    @Test
    void complexBillWriterTest() {
        billWrite = new ComplexBillWriter();
        String bills = billWrite.writeBill(billItems);

        assertTrue(bills.contains("kenyér; darabszám: 1, egységár: 400, összesen: 400 Ft\n"));
    }
}