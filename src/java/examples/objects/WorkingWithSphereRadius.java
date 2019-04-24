package examples.objects;

import com.aspose.threed.FileFormat;
import com.aspose.threed.Scene;
import com.aspose.threed.Sphere;

import java.io.IOException;

public class WorkingWithSphereRadius {
    public static void run() throws IOException {
        // ExStart:WorkingWithSphereRadius

        // initialize a scene
        Scene scene = new Scene();
        // initialize a Sphere
        Sphere sphere = new Sphere();
        // set radius
        sphere.setRadius(10);
        // add sphere to the scene
        scene.getRootNode().createChildNode(sphere);
        // save scene
        scene.save("sphere.obj", FileFormat.WAVEFRONTOBJ);
        // ExEnd:WorkingWithSphereRadius

    }
}
