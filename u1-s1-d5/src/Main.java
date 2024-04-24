import java.util.Scanner;

import Multimedia_element.*;

public class Main {
    public static void main(String[] args) {

        MultimediaElement[] multimediaElements = new MultimediaElement[0];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("---------------------------");
            System.out.println("Choose what type of file to create by tiping in a number between 1 and 3");
            System.out.println("1. Player");
            System.out.println("2. Video");
            System.out.println("3. Image");
            System.out.println("---------------------------");
            int file = scanner.nextInt();
            switch (file) {
                case 1:
                    System.out.println("Insert audio file name");
                    String title = scanner.next();
                    System.out.println("Insert Artist");
                    String artist = scanner.next();
                    System.out.println("Insert volume");
                    int volume = scanner.nextInt();
                    // added WHILE to control volume value
                    while (volume < 0 || volume > 100) {
                        System.out.println("Insert a valid volume between 1 and 100");
                        volume = scanner.nextInt();
                    }
                    System.out.println("Insert file duration");
                    int duration = scanner.nextInt();
                    // added WHILE to control duration
                    while (duration < 0 || duration > 100) {
                        System.out.println("Insert valid duration between 1 and 100");
                        duration = scanner.nextInt();
                    }
                    System.out.println("---------------------------");
                    Player player = new Player(title, artist, duration, volume);
                    multimediaElements = addX(multimediaElements, player);
                    // new element inside multimediaElements array
                    for (MultimediaElement element : multimediaElements) {
                        System.out.println(element.toString());
                    }
                    break;
                case 2:
                    System.out.println("Insert video name");
                    String title1 = scanner.next();
                    System.out.println("Insert file brightness");
                    int brightness1 = scanner.nextInt();
                    // added WHILE to control brightness
                    while (brightness1 < 0 || brightness1 > 100) {
                        System.out.println("Insert valid brightness between 1 and 100");
                        brightness1 = scanner.nextInt();
                    }
                    System.out.println("Insert file volume");
                    int volume1 = scanner.nextInt();
                    // added WHILE to check if volume is between 1 and 100
                    while (volume1 < 0 || volume1 > 100) {
                        System.out.println("Insert valid volume between 1 and 100");
                        volume1 = scanner.nextInt();
                    }
                    System.out.println("Insert file duration");
                    int duration1 = scanner.nextInt();
                    // added WHILE to check if duration is between 1 and 100
                    while (duration1 < 1 || duration1 > 100) {
                        System.out.println("Insert a duration between 1 and 100");
                        duration1 = scanner.nextInt();
                    }
                    System.out.println("---------------------------");
                    Video video = new Video(title1, duration1, brightness1, volume1);
                    multimediaElements = addX(multimediaElements, video);
                    // new element inside multimediaElements array
                    for (MultimediaElement element : multimediaElements) {
                        System.out.println(element.toString());
                    }

                    break;
                case 3:
                    System.out.println("Insert image name here");
                    String title2 = scanner.next();
                    System.out.println("Inserfile brightness");
                    int brightness2 = scanner.nextInt();
                    // adding WHILE to check brightness
                    while (brightness2 < 0 || brightness2 > 100) {
                        System.out.println("Inservalid brightness between 1 and 100");
                        brightness2 = scanner.nextInt();
                    }
                    System.out.println("---------------------------");
                    Image image = new Image(title2, brightness2);
                    multimediaElements = addX(multimediaElements, image);
                    // added new element in multimediaElements array
                    for (MultimediaElement element : multimediaElements) {
                        System.out.println(element.toString());
                    }

                    break;
                default:
                    System.out.println("Value not valid");
                    break;
            }
        }
        String play = "s";
        while (play.equals("s")) {
            System.out.println(
                    "Inserthe number of the file you want to reproduce (from 1 to " + multimediaElements.length + "):");
            int num = scanner.nextInt();
            if (num >= 1 && num <= multimediaElements.length) {
                multimediaElements[num - 1].play();
                // check if the file is a video, image or audio

                if (multimediaElements[num - 1] instanceof Player) {
                    System.out.println("---------------------------");
                    System.out.println("Do you want to change file volume? (y/n)");
                    String volume = scanner.next().toLowerCase();
                    if (volume.equals("y")) {
                        System.out.println("---------------------------");
                        System.out.println("Insert + or - to change volume");
                        String volume1 = scanner.next().toLowerCase();
                        switch (volume1) {
                            case "+":
                                ((Player) multimediaElements[num - 1]).upVolume();
                                multimediaElements[num - 1].show();
                                break;
                            case "-":
                                ((Player) multimediaElements[num - 1]).downVolume();
                                multimediaElements[num - 1].show();
                                break;
                            default:
                                System.out.println("Number not valid.");
                                break;
                        }
                    } else {
                        System.out.println("---------------------------");
                        System.out.println("No problem!");
                        System.out.println("---------------------------");
                    }
                } else if (multimediaElements[num - 1] instanceof Video) {
                    System.out.println("---------------------------");
                    System.out.println("Do you want to change file volume? (y/n)");
                    String volume = scanner.next().toLowerCase();
                    if (volume.equals("y")) {
                        System.out.println("---------------------------");
                        System.out.println("Insert + or - to change volume");
                        String volume1 = scanner.next().toLowerCase();
                        switch (volume1) {
                            case "+":
                                ((Video) multimediaElements[num - 1]).upVolume();
                                multimediaElements[num - 1].show();
                                break;
                            case "-":
                                ((Video) multimediaElements[num - 1]).downVolume();
                                multimediaElements[num - 1].show();
                                break;
                            default:
                                System.out.println("Number not valid");
                                break;
                        }
                    } else {
                        System.out.println("---------------------------");
                        System.out.println("No problem!");
                        System.out.println("---------------------------");
                    }
                    System.out.println("---------------------------");
                    System.out.println("Do you want to change file brightness? (y/n)");
                    String lum = scanner.next().toLowerCase();
                    if (lum.equals("y")) {
                        System.out.println("---------------------------");
                        System.out.println("Insert + or - to change brightness");
                        String lum1 = scanner.next().toLowerCase();
                        switch (lum1) {
                            case "+":
                                ((Video) multimediaElements[num - 1]).upBrightness();
                                multimediaElements[num - 1].show();
                                break;
                            case "-":
                                ((Video) multimediaElements[num - 1]).downBrightness();
                                multimediaElements[num - 1].show();
                                break;
                            default:
                                System.out.println("Number not valid");
                                break;
                        }
                    } else {
                        System.out.println("---------------------------");
                        System.out.println("No problem");
                        System.out.println("---------------------------");
                    }

                } else if (multimediaElements[num - 1] instanceof Image) {
                    System.out.println("---------------------------");
                    System.out.println("Do you want to change file brightness? (y/n)");
                    String lum = scanner.next().toLowerCase();
                    if (lum.equals("y")) {
                        System.out.println("---------------------------");
                        System.out.println("Insert + or - to change brightness");
                        String lum1 = scanner.next().toLowerCase();
                        switch (lum1) {
                            case "+":
                                ((Image) multimediaElements[num - 1]).upBrightness();
                                multimediaElements[num - 1].show();
                                break;
                            case "-":
                                ((Image) multimediaElements[num - 1]).downBrightness();
                                multimediaElements[num - 1].show();
                                break;
                            default:
                                System.out.println("Number not valid");
                                break;
                        }
                    } else {
                        System.out.println("---------------------------");
                        System.out.println("No problem");
                        System.out.println("---------------------------");
                    }

                }

                System.out.println("Do you want to play another file? (y/n)");
                System.out.println("Warning! Choosing 'n' will close the application");
                play = scanner.next().toLowerCase();
            }
        }
        System.out.println("---------------------------");
        System.out.println("Have a nice day!");
        System.out.println("---------------------------");
        scanner.close();

    }

    public static MultimediaElement[] addX(MultimediaElement[] array, MultimediaElement element) {
        MultimediaElement[] newArray = new MultimediaElement[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = element;
        return newArray;
    }
}