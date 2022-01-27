package interfacedefaultmethods.demo;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void createdAfterTest(){
        Account account = new Account(LocalDateTime.of(2022,1,10,10,12));
        boolean resultAfter = account.createdAfter(LocalDateTime.of(2022,1,10,10,30));
        boolean resultBefore = account.createdAfter(LocalDateTime.of(2022,1,10,10,0));

        System.out.println(resultAfter);
        System.out.println(resultBefore);

        assertFalse(account.createdAfter(LocalDateTime.of(2022,1,10,10,30)));
        assertTrue(account.createdAfter(LocalDateTime.of(2022,1,10,10,0)));
    }

}