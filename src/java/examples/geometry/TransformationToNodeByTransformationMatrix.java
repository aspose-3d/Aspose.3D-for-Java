package examples.geometry;

import com.aspose.threed.*;
import examples.RunExamples;

public class TransformationToNodeByTransformationMatrix {

        public static void run() throws Exception {
            // ExStart:AddTransformationToNodeByTransformationMatrix
            // Initialize scene object
            Scene scene = new Scene();

            // Initialize Node class object
            Node cubeNode = new Node("cube");

            // Call Common class create mesh using polygon builder method to set mesh instance
            Mesh mesh = Common.createMeshUsingPolygonBuilder();

            // Point node to the Mesh geometry
            cubeNode.setEntity(mesh);
            // Set custom translation matrix
            cubeNode.getTransform().setTransformMatrix(new Matrix4(
            1, -0.3, 0, 0,
            0.4, 1, 0.3, 0,
            0, 0, 1, 0,
            0, 20, 0, 1
            ));
            // Add cube to the scene
            scene.getRootNode().addChildNode(cubeNode);

            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            MyDir = MyDir + RunExamples.getOutputFilePath("TransformationToNode.fbx");

            // Save 3D scene in the supported file formats
            scene.save(MyDir, FileFormat.FBX7500ASCII);
            // ExEnd:AddTransformationToNodeByTransformationMatrix
            System.out.println("\nTransformation added successfully to node.\nFile saved at " + MyDir);

        }
}
