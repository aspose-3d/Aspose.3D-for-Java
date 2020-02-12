package examples.LinearExtrusion;

import com.aspose.threed.*;
import examples.RunExamples;

import java.io.IOException;

public class DirectionInLinearExtrusion {
    public static void run() throws IOException {
        // ExStart:DirectionInLinearExtrusion
        // The path to the documents directory.
        String MyDir = RunExamples.getDataDir();
        // Initialize the base profile to be extruded
        RectangleShape profile = new RectangleShape();
        profile.setRoundingRadius(0.3);
        // Create a scene
        Scene scene = new Scene();
        // Create left node
        Node left = scene.getRootNode().createChildNode();
        // Create right node
        Node right = scene.getRootNode().createChildNode();
        left.getTransform().setTranslation(new Vector3(5, 0, 0));

        // Direction property defines the direction of the extrusion.
        // Perform linear extrusion on left node using twist and slices property
        left.createChildNode(new LinearExtrusion(profile, 10) {{ setTwist(360); setSlices(100); }});
        // Perform linear extrusion on right node using twist, slices, and direction property
        right.createChildNode(new LinearExtrusion(profile, 10) {{ setTwist(360); setSlices(100); setDirection(new Vector3(0.3, 0.2, 1));}});

        // Save 3D scene
        scene.save(MyDir + "DirectionInLinearExtrusion.obj", FileFormat.WAVEFRONTOBJ);
        // ExEnd:DirectionInLinearExtrusion
    }
}
