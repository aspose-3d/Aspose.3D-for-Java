package examples.animation;

import com.aspose.threed.*;
import examples.RunExamples;

public class SetupTargetAndCamera {
    public static void run() throws Exception {
        // ExStart:SetupTargetAndCamera
        // The path to the documents directory.
        String MyDir = RunExamples.getDataDir();
        // Initialize scene object
        Scene scene = new Scene();
        // Get a child node object
        Node cameraNode = scene.getRootNode().createChildNode("camera", new Camera());
        // Set camera node translation
        cameraNode.getTransform().setTranslation(new Vector3(100, 20, 0));
        ((Camera)cameraNode.getEntity()).setTarget(scene.getRootNode().createChildNode("target"));
        MyDir = MyDir + "camera-test.3ds";
        scene.save(MyDir, FileFormat.DISCREET3DS);
        // ExEnd:SetupTargetAndCamera
        System.out.println("\nThe target and camera has been setup successfully.\nFile saved at " + MyDir);
    }
}
