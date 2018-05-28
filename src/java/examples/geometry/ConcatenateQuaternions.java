package examples.geometry;

import com.aspose.threed.*;
import examples.RunExamples;

public class ConcatenateQuaternions {

        public static void run() throws Exception {
            // ExStart:ConcatenateQuaternions
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();

            Scene scene = new Scene();

            Quaternion q1 = Quaternion.fromEulerAngle(Math.PI * 0.5, 0, 0);
            Vector3.X_AXIS.x = 3;
            Quaternion q2 = Quaternion.fromAngleAxis(-Math.PI * 0.5, Vector3.X_AXIS);
            // Concatenate q1 and q2. q1 and q2 rotate alone x-axis with same angle but different direction,
            // So the concatenated result will be identity quaternion.
            Quaternion q3 = q1.concat(q2);

            // Create 3 cylinders to represent each quaternion
            Node cylinder = scene.getRootNode().createChildNode("cylinder-q1", new Cylinder(0.1, 1, 2));
            cylinder.getTransform().setRotation(q1);
            cylinder.getTransform().setTranslation(new Vector3(-5, 2, 0));

            cylinder = scene.getRootNode().createChildNode("cylinder-q2", new Cylinder(0.1, 1, 2));
            cylinder.getTransform().setRotation(q2);
            cylinder.getTransform().setTranslation(new Vector3(0, 2, 0));

            cylinder = scene.getRootNode().createChildNode("cylinder-q3", new Cylinder(0.1, 1, 2));
            cylinder.getTransform().setRotation(q3);
            cylinder.getTransform().setTranslation(new Vector3(5, 2, 0));
            MyDir = MyDir + "test_out.fbx";
            // Save to file
            scene.save(MyDir, FileFormat.FBX7400ASCII);
            // ExEnd:ConcatenateQuaternions

            System.out.println("\nQuaternions concatenated successfully.\nFile saved at " + MyDir);

        }
}
