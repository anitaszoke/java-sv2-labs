package catalog;

public class SearchCriteria {
    public String contributor;
    public String title;

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }

    public static SearchCriteria createByBoth(String title, String contributor) {
        if (Validators.isBlank(title) || Validators.isBlank(contributor)) {
            throw new IllegalArgumentException("Invalid title or contributor");
        }
        return new SearchCriteria(title, contributor);
    }

    public static SearchCriteria createByContributor(String contributor) {
        if (Validators.isBlank(contributor)) {
            throw new IllegalArgumentException("Invalid contributor");
        }
        return new SearchCriteria(null, contributor);
    }

    public static SearchCriteria createByTitle(String title) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Invalid title");
        }
        return new SearchCriteria(title, null);
    }

    public boolean hasContributor() {
        return (contributor != null);
    }

    public boolean hasTitle() {
        return (title != null);
    }

    private SearchCriteria(String title, String contributor) {
        Validators.isBlank(title);
        Validators.isBlank(contributor);
        this.title = title;
        this.contributor = contributor;
    }
}