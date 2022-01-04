package virtualmethod.grammar;

public class Grammar {
    public static void main(String[] args) {
        Verb verbOne = new PhrasalVerb("küld", "el");
        System.out.println(verbOne.getWord());

        Verb verbTwo = new PhrasalVerbWithSuffix("küld", "el", "te");
        System.out.println(verbTwo.getWord());

        Preposition prepositionOne = new PhrasalVerb("küld", "el");
        System.out.println(prepositionOne.getPreposition());
        System.out.println(prepositionOne.getWholeWord());

        Preposition prepositionTwo = new PhrasalVerbWithSuffix("küld", "el", "te");
        System.out.println(prepositionTwo.getWholeWord());
        System.out.println(prepositionTwo.getPreposition());

        PhrasalVerb phrasalVerbOne = new PhrasalVerb("küld", "el");
        System.out.println(phrasalVerbOne.getPreposition());
        System.out.println(phrasalVerbOne.getWholeWord());
        System.out.println(phrasalVerbOne.getWord());

        PhrasalVerb phrasalVerbTwo = new PhrasalVerbWithSuffix("küld", "el", "te");
        System.out.println(phrasalVerbTwo.getWord());
        System.out.println(phrasalVerbTwo.getWholeWord());
        System.out.println(phrasalVerbTwo.getPreposition());

        Suffix suffixOne = new PhrasalVerbWithSuffix("küld", "el", "te");
        System.out.println(suffixOne.getSuffix());

        PhrasalVerbWithSuffix phrasalVerbWithSuffixOne = new PhrasalVerbWithSuffix("küld", "el", "te");
        System.out.println(phrasalVerbWithSuffixOne.getSuffix());
        System.out.println(phrasalVerbWithSuffixOne.getWholeWord());
        System.out.println(phrasalVerbWithSuffixOne.getWord());
        System.out.println(phrasalVerbWithSuffixOne.getPreposition());

    }
}
