package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
    }

    public void deleteItemByRegistrationNumber(String registrationNumber) {
        catalogItems.remove(itemByRegNumber(registrationNumber));
    }

    private CatalogItem itemByRegNumber(String registrationNumber) {
        CatalogItem item = catalogItems.get(0);
        for (CatalogItem c : catalogItems) {
            if (c.getRegistrationNumber().equals(registrationNumber)) {
                item = c;
            }
        }
        return item;
    }

    public double averagePageNumberOver(int maxPage) {
        checkPage(maxPage);
        double sum = 0;
        double count = 0;

        for (CatalogItem c : catalogItems) {
            if (c.numberOfPagesAtOneItem() > maxPage) {
                sum += c.numberOfPagesAtOneItem();
                count++;
            }
        }
        return sum / count;
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> result = new ArrayList<>();

        for (CatalogItem c : catalogItems) {
            if ((c.getContributors().contains((searchCriteria.contributor))) || (c.getTitles().contains((searchCriteria.title)))) {
                result.add(c);
            }
        }
        return result;
    }

    public int getAllPageNumber() {
        int allPageNumber = 0;

        for (CatalogItem item : catalogItems) {
            allPageNumber += item.numberOfPagesAtOneItem();

        }
        return allPageNumber;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> audioLibraryItems = new ArrayList<>();

        for (CatalogItem item : catalogItems) {
            if (item.hasAudioFeature()) {
                audioLibraryItems.add(item);
            }
        }
        return audioLibraryItems;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> printedLibraryItems = new ArrayList<>();

        for (CatalogItem item : catalogItems) {
            if (item.numberOfPagesAtOneItem() > 0) {
                printedLibraryItems.add(item);
            }
        }
        return printedLibraryItems;
    }

//     Ez miért nem működik?
//    public List<CatalogItem> getPrintedLibraryItems() {
//        List<CatalogItem> printedLibraryItems = new ArrayList<>();
//
//        for (CatalogItem item : catalogItems) {
//            if (item.hasPrintedFeature()) {
//                printedLibraryItems.add(item);
//            }
//        }
//        return printedLibraryItems;
//    }


    public int getFullLength() {
        List<CatalogItem> audioLibraryItems = getAudioLibraryItems();
        int fullLength = 0;

        for (CatalogItem item : audioLibraryItems) {
            fullLength += item.fullLengthAtOneItem();
        }

        return fullLength;
    }

    private void checkPage(int maxPage) {
        if (maxPage == 0) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        if (maxPage < 0 || maxPage > getAllPageNumber()) {
            throw new IllegalArgumentException("No page");
        }
    }
}
