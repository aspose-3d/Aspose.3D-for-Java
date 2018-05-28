package examples.objects;

import com.aspose.threed.*;
import examples.RunExamples;

public class ConvertPlanePrimitivetoMesh {

        public static void run() throws Exception {
            // Initialize scene object
            Scene scene = new Scene();

            // Initialize Node class object
            Node cubeNode = new Node("plane");

            // ExStart:ConvertPlanePrimitivetoMesh
            // Initialize object by Plane class
            IMeshConvertible convertible = new Plane();

            // Convert a Plane to Mesh
            Mesh mesh = convertible.toMesh();
            // ExEnd:ConvertPlanePrimitivetoMesh

            // Point node to the Mesh geometry
            cubeNode.setEntity( mesh);

            // Add Node to a scene
            scene.getRootNode().addChildNode(cubeNode);

            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir() + RunExamples.getOutputFilePath("PlaneToMeshScene.fbx");

            // Save 3D scene in the supported file formats
            scene.save(MyDir, FileFormat.FBX7400ASCII);

            System.out.println("\n Converted the primitive Plane to a mesh successfully.\nFile saved at " + MyDir);
        }
}
