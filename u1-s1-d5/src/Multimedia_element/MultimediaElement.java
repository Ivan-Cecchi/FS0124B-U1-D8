package Multimedia_element;

public abstract class MultimediaElement {
    String title;

    protected TypeOfMedia type;

    public MultimediaElement(String title) {
        this.title = title;
    }

    public abstract void play();

    @Override
    public String toString() {
        return "File:" +
                " title: " + title + " " +
                ", type: " + type;
    }

    public abstract void upVolume();

    public abstract void downVolume();

    public abstract void show();

}
