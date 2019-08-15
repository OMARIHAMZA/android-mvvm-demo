package omari.hamza.android_mvvm_demo.models;

public class Place {

    private String name;
    private String imageUrl;

    public Place(String imageUrl, String name) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
