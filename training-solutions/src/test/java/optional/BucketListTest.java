package optional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BucketListTest {

    BucketList bucketList = new BucketList();

    Destination hawaii = new Destination("Hawaii", "island", 13000);
    Destination budapest = new Destination("Budapest", "city", 165);
    Destination philippines = new Destination("Philippines", "island", 10000);


    @Test
    void addDestinationTest() {
        bucketList.addDestinations(hawaii);
        bucketList.addDestinations(budapest);
        bucketList.addDestinations(philippines);

        assertEquals(3, bucketList.destinations.size());
        assertEquals(13000, bucketList.destinations.get(0).getKmFromHome());
    }

    @Test
    void getDestinationWithKeywordTest() {
        bucketList.addDestinations(hawaii);
        bucketList.addDestinations(budapest);
        bucketList.addDestinations(philippines);

        assertEquals("Hawaii", bucketList.getDestinationWithKeyword("island").get().getName());
    }

    @Test
    void getDestinationNearerThanGivenTest() {
        bucketList.addDestinations(hawaii);
        bucketList.addDestinations(budapest);
        bucketList.addDestinations(philippines);

        assertEquals("Budapest", bucketList.getDestinationNearerThanGiven(1000).get().getName());
    }
}