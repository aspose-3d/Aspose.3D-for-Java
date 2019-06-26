package examples.WorkingWithCylinder;

import com.aspose.threed.*;
import examples.RunExamples;

import java.io.IOException;

public class CustomizedShearBottomCylinder {
    public static void run() throws IOException {
        // ExStart:1
        // Create a scene
        Scene scene = new Scene();
        // Create cylinder 1
        Cylinder cylinder1 = new Cylinder(2, 2, 10, 20, 1, false);
        // Customized shear bottom for cylinder 1
        cylinder1.setShearBottom(new Vector2(0, 0.83));// shear 47.5deg in xy plane(z-axis)
        // Add cylinder 1 to the scene
        scene.getRootNode().createChildNode(cylinder1).getTransform().setTranslation(10, 0, 0);
        // Create cylinder 2
        Cylinder cylinder2 = new Cylinder(2, 2, 10, 20, 1, false);
        // Add cylinder to without a ShearBottom to the scene
        scene.getRootNode().createChildNode(cylinder2);
        // Save scene
        scene.save(RunExamples.getDataDir()+ "CustomizedShearBottomCylinder.obj", FileFormat.WAVEFRONTOBJ);
        // ExEnd:1
    }
}
