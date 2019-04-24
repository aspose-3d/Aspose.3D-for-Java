package examples.render;

import com.aspose.threed.*;
import examples.RunExamples;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RenderToFile extends RenderBase {
    public static void run() throws IOException {

        Scene scene = new Scene();
        Camera camera = setupScene(scene);
        String output = RunExamples.getOutputFilePath("render-to-file.png");
        //Scene.render uses ImageIO internally, what output format is supported depends on your JRE.
        scene.render(camera, output, new Dimension(1024, 1024), "png");
    }
}
