package examples.geometry;

import java.io.File;

import com.aspose.threed.Box;
import com.aspose.threed.Cylinder;
import com.aspose.threed.FileFormat;
import com.aspose.threed.Mesh;
import com.aspose.threed.Node;
import com.aspose.threed.Scene;
import examples.RunExamples;


public class CubeScene {
    public static void run() throws Exception {
            // ExStart:CreateCubeScene
            // Initialize scene object
            Scene scene = new Scene();
            // Initialize Node class object
            Node cubeNode = new Node("box");
            // Call Common class create mesh using polygon builder method to set mesh instance
            Mesh mesh = Common.createMeshUsingPolygonBuilder();
            // Point node to the Mesh geometry
            cubeNode.setEntity(mesh);
            // Add Node to a scene
            scene.getRootNode().getChildNodes().add(cubeNode);
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            MyDir = MyDir + RunExamples.getOutputFilePath("CubeScene.fbx");
            // Save 3D scene in the supported file formats
            //scene.save(MyDir, FileFormat.FBX7400ASCII);
            scene.save("C:\\3D\\test35\\BoxScene.fbx", FileFormat.FBX7400ASCII);
            // ExEnd:CreateCubeScene

            System.out.println("\nCube Scene created successfully.\nFile saved at " + MyDir);
        }
}
