package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {

    private final String registrationNumber;
    private final int price;
    private final List<Feature> features = new ArrayList<>();

    public CatalogItem(String registrationNumber, int price, Feature... features) {
        Validators.isBlank(registrationNumber);
        this.registrationNumber = registrationNumber;
        if (price <= 0) {
            throw new IllegalArgumentException("Invalid price");
        }
        this.price = price;
        for (Feature feature : features) {
            this.features.add(feature);
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getPrice() {
        return price;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int fullLengthAtOneItem() {
        int fullLength = 0;
        for (Feature feature : features) {
            if (feature.getClass() == AudioFeatures.class) {
                fullLength += ((AudioFeatures) feature).getLength();
            }
        }
        return fullLength;
    }

    public List<String> getContributors() {
        List<String> contributorList = new ArrayList<>();
        for (Feature feature : features) {
            List<String> stringList = feature.getContributors();
            for (String s : stringList) {
                contributorList.add(s);
            }
        }
        return contributorList;
    }

    public List<String> getTitles() {
        List<String> allTitle = new ArrayList<>();
        for (Feature feature : features) {
            allTitle.add(feature.getTitle());
        }
        return allTitle;
    }

    public boolean hasAudioFeature() {
        boolean hasAudio = false;
        for (Feature feature : features) {
            hasAudio = feature.getClass() == AudioFeatures.class;
        }
        return hasAudio;
    }

    public boolean hasPrintedFeature() {
        boolean hasPrinted = false;
        for (Feature feature : features) {
            hasPrinted = feature.getClass() == PrintedFeatures.class;
        }
        return hasPrinted;
    }

    public int numberOfPagesAtOneItem() {
        int pages = 0;
        for (Feature feature : features) {
            if (feature.getClass() == PrintedFeatures.class) {
                pages += ((PrintedFeatures) feature).getNumberOfPages();
            }
        }
        return pages;
    }
}