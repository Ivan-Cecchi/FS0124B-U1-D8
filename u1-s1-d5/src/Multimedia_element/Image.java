package Multimedia_element;

public class Image extends MultimediaElement {
    private int brightness;

    public Image(String title, int brightness) {
        super(title);
        this.brightness = brightness;
        this.type = TypeOfMedia.IMAGE;
    }

    public void show() {
        System.out.println("Image: " + title);
        System.out.println("Brightness: " + brightness);
        System.out.println("---------------------------");
    }

    public void upBrightness() {
        this.brightness += 10;
    }

    public void downBrightness() {
        this.brightness -= 10;
    }

    @Override
    public void play() {
        System.out.print(title + " " + "Brightness" + " ");
        for (int k = 0; k < brightness; k++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("---------------------------");
    }

    @Override
    public void upVolume() {
        System.out.println("Non posso aumentare il volume di un'immagine");
    }

    @Override
    public void downVolume() {
        System.out.println("Non posso aumentare il volume di un'immagine");
    }
}
