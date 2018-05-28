package examples.geometry;

import com.aspose.threed.*;
import examples.RunExamples;

public class TransformationToNodeByQuaternion {

        public static void run() throws Exception {
            // ExStart:AddTransformationToNodeByQuaternion
            // Initialize scene object
            Scene scene = new Scene();

            // Initialize Node class object
            Node cubeNode = new Node("cube");

            // Call Common class create mesh using polygon builder method to set mesh instance
            Mesh mesh = Common.createMeshUsingPolygonBuilder();

            // Point node to the Mesh geometry
            cubeNode.setEntity(mesh);
            // Set rotation
            cubeNode.getTransform().setRotation(Quaternion.fromRotation(new Vector3(0, 1, 0), new Vector3(0.3, 0.5, 0.1)));
            // Set translation
            cubeNode.getTransform().setTranslation(new Vector3(0, 0, 20));
            // Add cube to the scene
            scene.getRootNode().getChildNodes().add(cubeNode);

            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            MyDir = MyDir + RunExamples.getOutputFilePath("TransformationToNode.fbx");

            // Save 3D scene in the supported file formats
            scene.save(MyDir, FileFormat.FBX7500ASCII);
            // ExEnd:AddTransformationToNodeByQuaternion
            System.out.println("\nTransformation added successfully to node.\nFile saved at " + MyDir);

        }
}
