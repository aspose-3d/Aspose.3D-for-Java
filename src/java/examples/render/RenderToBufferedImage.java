package examples.render;

import com.aspose.threed.Camera;
import com.aspose.threed.ImageRenderOptions;
import com.aspose.threed.Scene;
import examples.RunExamples;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RenderToBufferedImage extends RenderBase {
    public static void run() throws IOException {
        Scene scene = new Scene();
        Camera camera = setupScene(scene);
        //Supported render target types: BufferedImage.TYPE_4BYTE_ABGR/TYPE_3BYTE_BGR
        BufferedImage image = new BufferedImage(1024, 1024, BufferedImage.TYPE_3BYTE_BGR);
        ImageRenderOptions opt = new ImageRenderOptions();
        opt.setBackgroundColor(new Color(0x156043));
        scene.render(camera, image, opt);

        //save BufferedImage to file using ImageIO from JDK
        String output = RunExamples.getOutputFilePath("render-to-image.png");
        ImageIO.write(image, "png", new File(output));
    }
}
