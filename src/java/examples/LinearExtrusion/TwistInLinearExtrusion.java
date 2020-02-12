package examples.LinearExtrusion;

import com.aspose.threed.*;
import examples.RunExamples;

import java.io.IOException;

public class TwistInLinearExtrusion {
    public static void run() throws IOException {
        // ExStart:TwistInLinearExtrusion
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

        // Twist property defines the degree of the rotation while extruding the profile
        // Perform linear extrusion on left node using twist and slices property
        left.createChildNode(new LinearExtrusion(profile, 10) {{ setTwist(0); setSlices(100); }});
        // Perform linear extrusion on right node using twist and slices property
        right.createChildNode(new LinearExtrusion(profile, 10) {{ setTwist(90); setSlices(100); }});

        // Save 3D scene
        scene.save(MyDir + "TwistInLinearExtrusion.obj", FileFormat.WAVEFRONTOBJ);
        // ExEnd:TwistInLinearExtrusion
    }
}
