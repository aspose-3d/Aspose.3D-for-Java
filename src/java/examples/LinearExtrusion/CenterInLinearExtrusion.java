package examples.LinearExtrusion;

import com.aspose.threed.*;
import examples.RunExamples;

import java.io.IOException;

public class CenterInLinearExtrusion {
    public static void run() throws IOException {
        // ExStart:CenterInLinearExtrusion
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

        // If Center property is true, the extrusion range is from -Height/2 to Height/2, otherwise the extrusion is from 0 to Height
        // Perform linear extrusion on left node using center and slices property
        left.createChildNode(new LinearExtrusion(shape, 2) {{ setCenter(false); setSlices(3); }});
        // Set ground plane for reference
        left.createChildNode(new Box(0.01, 3, 3));
        // Perform linear extrusion on left node using center and slices property
        right.createChildNode(new LinearExtrusion(shape, 2) {{ setCenter(true); setSlices(3); }});
        // Set ground plane for reference
        right.createChildNode(new Box(0.01, 3, 3));

        // Save 3D scene
        scene.save(MyDir + "CenterInLinearExtrusion.obj", FileFormat.WAVEFRONTOBJ);
        // ExEnd:CenterInLinearExtrusion
    }
}
