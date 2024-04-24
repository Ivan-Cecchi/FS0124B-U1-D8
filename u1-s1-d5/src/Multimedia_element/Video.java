package Multimedia_element;


public class Video extends MultimediaElement {
    private int brightness;
    private int volume;
    private int duration;

    public Video(String title, int duration, int brightness, int volume) {
        super(title);
        this.brightness = brightness;
        this.volume = volume;
        this.duration = duration;
        this.type = TypeOfMedia.VIDEO;
    }

    public void show() {
        System.out.println("Video: " + title);
        System.out.println("Brightness: " + brightness);
        System.out.println("Volume: " + volume);
        System.out.println("Duration: " + duration);
        System.out.println("---------------------------");
    }

    public void play() {
        for (int i = 0; i < duration; i++) {
            System.out.print("Playing: " + title + " ");
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            System.out.print(" " + "Brightness" + " ");
            for (int k = 0; k < brightness; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------");

    }

    public void upBrightness() {
        this.brightness += 10;
    }

    public void downBrightness() {
        this.brightness -= 10;
    }

    public void upVolume() {
        this.volume += 10;
    }

    public void downVolume() {
        this.volume -= 10;
    }

}
