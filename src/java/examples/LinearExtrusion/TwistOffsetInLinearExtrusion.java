package examples.LinearExtrusion;

import com.aspose.threed.*;
import examples.RunExamples;

import java.io.IOException;

public class TwistOffsetInLinearExtrusion {
    public static void run() throws IOException {
        // ExStart:TwistOffsetInLinearExtrusion
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

        // TwistOffset property is the translate offset while rotating the extrusion.
        // Perform linear extrusion on left node using twist and slices property
        left.createChildNode(new LinearExtrusion(profile, 10) {{ setTwist(360); setSlices(100); }});
        // Perform linear extrusion on right node using twist, twist offset and slices property
        right.createChildNode(new LinearExtrusion(profile, 10)  {{setTwist(360); setSlices(100); setTwistOffset(new Vector3(3, 0, 0));}});

        // Save 3D scene
        scene.save(MyDir + "TwistOffsetInLinearExtrusion.obj", FileFormat.WAVEFRONTOBJ);
        // ExEnd:TwistOffsetInLinearExtrusion
    }
}
