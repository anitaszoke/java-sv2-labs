package stringconcat.nameconcat;

public class Name {
    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getGivenName() {
        return givenName;
    }

    public Title getTitle() {
        return title;
    }

    public String concatNameHungarianStyle() {
        String fullName = "";
        if (title != null) {
           fullName = fullName.concat(title.getTitles());
           fullName = fullName.concat(" ");
           fullName = fullName.concat(familyName);
           fullName = fullName.concat(" ");
        } else {
            fullName = familyName;
            fullName = fullName.concat(" ");
        }
        if (middleName != null) {
            fullName = fullName.concat(middleName);
            fullName = fullName.concat(" ");
            fullName = fullName.concat(givenName);
        } else {
            fullName = fullName.concat(givenName);
        }
        return fullName;
    }

    public String concatNameWesternStyle() {
        String fullName = "";
        if (title != null) {
            fullName += title.getTitles() + " " + givenName + " ";
        } else {
            fullName = givenName + " ";
        }
        if (middleName != null) {
            fullName += middleName +" "+ familyName;
        } else {
            fullName += familyName;
        }
        return fullName;
    }
}
