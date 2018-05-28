package examples.objects;

import com.aspose.threed.*;
import examples.RunExamples;

public class ConvertCylinderPrimitivetoMesh {

        public static void run() throws Exception {
            // Initialize scene object
            Scene scene = new Scene();

            // Initialize Node class object
            Node cubeNode = new Node("cylinder");

            // ExStart:ConvertCylinderPrimitivetoMesh
            // Initialize object by Cylinder class
            IMeshConvertible convertible = new Cylinder();

            // Convert a Cylinder to Mesh
            Mesh mesh = convertible.toMesh();
            // ExEnd:ConvertCylinderPrimitivetoMesh

            // Point node to the Mesh geometry
            cubeNode.setEntity(mesh);

            // Add Node to a scene
            scene.getRootNode().addChildNode(cubeNode);

            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir() + RunExamples.getOutputFilePath("CylinderToMeshScene.fbx");

            // Save 3D scene in the supported file formats
            scene.save(MyDir, FileFormat.FBX7400ASCII);

            System.out.println("\n Converted the primitive Cylinder to a mesh successfully.\nFile saved at " + MyDir);
        }
}
