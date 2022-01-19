package sorting;

import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTest {

    @Test
    void getHeightIncome() {
        Income income = new Income(new int[]{1000,800,900,1100,500});

        assertEquals(1100,income.getHighIncome());
    }

}