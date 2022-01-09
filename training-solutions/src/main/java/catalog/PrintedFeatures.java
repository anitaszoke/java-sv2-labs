package catalog;

import java.util.List;

public class PrintedFeatures implements Feature {

    private final String title;
    private final int numberOfPages;
    private final List<String> authors;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        checkAllPrintedFeatures(title, numberOfPages, authors);
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public List<String> getContributors() {
        return authors;
    }

    @Override
    public String getTitle() {
        return title;
    }

    private void checkAllPrintedFeatures(String title, int numberOfPages, List<String> authors) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
        if (numberOfPages <= 0) {
            throw new IllegalArgumentException("Invalid number of pages");
        }
        if (Validators.isEmpty(authors)) {
            throw new IllegalArgumentException("Invalid performers");
        }
    }
}