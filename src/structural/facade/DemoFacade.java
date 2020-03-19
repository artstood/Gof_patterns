package structural.facade;

import java.io.File;

public class DemoFacade {
    public static void main(String[] args) {
        VideoConvertationFacade converter = new VideoConvertationFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
