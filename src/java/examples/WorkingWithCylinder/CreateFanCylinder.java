package examples.WorkingWithCylinder;

import com.aspose.threed.*;
import examples.RunExamples;

import java.io.IOException;

public class CreateFanCylinder {
    public static void run() throws IOException {
        // ExStart:1
        // Create a Scene
        Scene scene = new Scene();
        // Create a cylinder
        Cylinder fan = new Cylinder(2, 2, 10, 20, 1, false);
        // Set GenerateGanCylinder to true
        fan.setGenerateFanCylinder(true);
        // Set ThetaLength
        fan.setThetaLength(MathUtils.toRadian(270.0));
        // Create ChildNode
        scene.getRootNode().createChildNode(fan).getTransform().setTranslation(10, 0, 0);
        // Create a cylinder without a fan
        Cylinder nonfan = new Cylinder(2, 2, 10, 20, 1, false);
        // Create ChildNode
        scene.getRootNode().createChildNode(nonfan);
        // Save scene
        scene.save(RunExamples.getDataDir()+ "CreateFanCylinder.obj", FileFormat.WAVEFRONTOBJ);
        // ExEnd:1
    }
}
