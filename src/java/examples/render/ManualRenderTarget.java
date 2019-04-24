package examples.render;

import com.aspose.threed.*;
import examples.RunExamples;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ManualRenderTarget extends RenderBase{

    public static void run() throws IOException {
        Scene scene = new Scene();
        Camera camera = setupScene(scene);
        String output = RunExamples.getOutputFilePath("manual-render-to-image.png");
        //Supported render target types: BufferedImage.TYPE_4BYTE_ABGR/TYPE_3BYTE_BGR
        BufferedImage image = new BufferedImage(1024, 1024, BufferedImage.TYPE_3BYTE_BGR);
        scene.render(camera, image);
        try(Renderer renderer = Renderer.createRenderer()) {
            try(IRenderTexture rt = renderer.getRenderFactory().createRenderTexture(new RenderParameters(), 1, image.getWidth(), image.getHeight())) {
                rt.createViewport(camera, Color.pink, RelativeRectangle.fromScale(0, 0, 1, 1));
                renderer.render(rt);
                ITexture2D texture = (ITexture2D)rt.getTargets().get(0);
                texture.save(image);
            }
        }
        ImageIO.write(image, "png", new File(output));
    }
}
