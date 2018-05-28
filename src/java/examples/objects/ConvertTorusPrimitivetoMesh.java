package examples.objects;

import com.aspose.threed.*;
import examples.RunExamples;

import java.io.IOException;

public class ConvertTorusPrimitivetoMesh {

        public static void run() throws Exception {
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            MyDir = MyDir + "test.fbx";

            // Load a 3D file
            Scene scene = new Scene(MyDir);
            // Initialize Node class object
            Node cubeNode = new Node("torus");

            // ExStart:ConvertTorusPrimitivetoMesh
            // Initialize object by Torus class
            IMeshConvertible convertible = new Torus();

            // Convert a Torus to Mesh
            Mesh mesh = convertible.toMesh();
            // ExEnd:ConvertTorusPrimitivetoMesh

            // Point node to the Mesh geometry
            cubeNode.setEntity(mesh);

            // Add Node to a scene
            scene.getRootNode().addChildNode(cubeNode);

            // The path to the documents directory.
            MyDir = RunExamples.getDataDir() + RunExamples.getOutputFilePath("TorusToMeshScene.fbx");

            // Save 3D scene in the supported file formats
            scene.save(MyDir, FileFormat.FBX7400ASCII);

            System.out.println("\n Converted the primitive Torus to a mesh successfully.\nFile saved at " + MyDir);
        }
}
