package examples.modeling;
import com.aspose.threed.*;
import examples.RunExamples;

public class Primitive3DModels {

    public static void run() throws Exception {
            // ExStart:Primitive3DModels
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();

            // Initialize a Scene object
            Scene scene = new Scene();
            // Create a Box model
            scene.getRootNode().createChildNode("box", new Box());
            // Create a Cylinder model
            scene.getRootNode().createChildNode("cylinder", new Cylinder());
            // Save drawing in the FBX format
            MyDir = MyDir + RunExamples.getOutputFilePath("test.fbx");
            scene.save(MyDir, FileFormat.FBX7500ASCII);

            // ExEnd:Primitive3DModels
            System.out.println("\nBuilding a scene from primitive 3D models successfully.\nFile saved at " + MyDir);

    }
}
