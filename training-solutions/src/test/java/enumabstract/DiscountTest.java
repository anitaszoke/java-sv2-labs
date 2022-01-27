package enumabstract;

import enumabstract.discount.Discount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {

    @Test
    void specialOfferTest() {
        Discount discount = Discount.SPECIAL_OFFER;

        assertEquals(80, discount.getAmountToPay(10, 10));
    }

    @Test
    void blackFridayOfferTest() {
        Discount discount = Discount.BLACK_FRIDAY_OFFER;

        assertEquals(15, discount.getAmountToPay(10, 2));
        assertEquals(20, discount.getAmountToPay(10, 3));
        assertEquals(35, discount.getAmountToPay(10, 5));
    }

}