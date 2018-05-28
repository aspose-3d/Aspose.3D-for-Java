package examples.objects;

import com.aspose.threed.*;
import examples.RunExamples;

public class ConvertSpherePrimitivetoMesh {

        public static void run() throws Exception {
            // Initialize scene object
            Scene scene = new Scene();

            // Initialize Node class object
            Node cubeNode = new Node("sphere");

            // ExStart:ConvertSpherePrimitivetoMesh
            // Initialize object by Sphere class
            IMeshConvertible convertible = new Sphere();

            // Convert a Sphere to Mesh
            Mesh mesh = convertible.toMesh();
            // ExEnd:ConvertSpherePrimitivetoMesh

            // Point node to the Mesh geometry
            cubeNode.setEntity(mesh);

            // Add Node to a scene
            scene.getRootNode().addChildNode(cubeNode);

            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir() + RunExamples.getOutputFilePath("SphereToMeshScene.fbx");

            // Save 3D scene in the supported file formats
            scene.save(MyDir, FileFormat.FBX7400ASCII);

            System.out.println("\n Converted the primitive Sphere to a mesh successfully.\nFile saved at " + MyDir);
        }
}
