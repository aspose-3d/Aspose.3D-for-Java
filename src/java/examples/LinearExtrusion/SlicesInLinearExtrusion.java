package examples.LinearExtrusion;

import com.aspose.threed.*;
import examples.RunExamples;
import java.io.IOException;

public class SlicesInLinearExtrusion {
    public static void run() throws IOException {
        // ExStart:SlicesInLinearExtrusion
        // The path to the documents directory.
        String MyDir = RunExamples.getDataDir();
        // Initialize the base shape to be extruded
        Shape shape = Shape.fromControlPoints(
                new Vector3(1, 1, 0),
                new Vector3(-1, 1, 0),
                new Vector3(-1, -1, 0),
                new Vector3(1, -1, 0)
        );
        // Create a scene
        Scene scene = new Scene();
        // Create left node
        Node left = scene.getRootNode().createChildNode();
        // Create right node
        Node right = scene.getRootNode().createChildNode();
        left.getTransform().setTranslation(new Vector3(5, 0, 0));

        // Slices parameter defines the number of intermediate points along the path of the extrusion
        // Perform linear extrusion on left node using slices property
        left.createChildNode(new LinearExtrusion(shape, 2) {{setSlices(2);}});
        // Perform linear extrusion on right node using slices property
        right.createChildNode(new LinearExtrusion(shape, 2) {{setSlices(10);}});

        // Save 3D scene
        scene.save(MyDir + "SlicesInLinearExtrusion.obj", FileFormat.WAVEFRONTOBJ);
        // ExEnd:SlicesInLinearExtrusion

    }
}
