package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AudioFeatures implements Feature {

    private final String title;
    private final int length;
    private final List<String> performers;
    private List<String> composer = new ArrayList<>();

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        checkAllAudioFeatures(title, length, performers, composer);
        this.title = title;
        this.length = length;
        this.performers = performers;
        this.composer = composer;
    }

    public AudioFeatures(String title, int length, List<String> performers) {
        checkAllAudioFeaturesWithOutComposer(title, length, performers);
        this.title = title;
        this.length = length;
        this.performers = performers;
    }

    public int getLength() {
        return length;
    }

    @Override
    public List<String> getContributors() {
        return createContributors(performers, composer);
    }

    @Override
    public String getTitle() {
        return title;
    }

    private List<String> createContributors(List<String> performers, List<String> composer) {
        List<String> contributors = new ArrayList<>();
        for (List<String> strings : Arrays.asList(composer, performers)) {
            contributors.addAll(strings);
        }
        return contributors;
    }

    private void checkAllAudioFeaturesWithOutComposer(String title, int length, List<String> performers) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Invalid title");
        }
        if (length <= 0) {
            throw new IllegalArgumentException("Invalid length");
        }
        if (Validators.isEmpty(performers)) {
            throw new IllegalArgumentException("Invalid performers");
        }
    }

    private void checkAllAudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        checkAllAudioFeaturesWithOutComposer(title, length, performers);
        if (Validators.isEmpty(composer)) {
            throw new IllegalArgumentException("Invalid composers");
        }
    }
}