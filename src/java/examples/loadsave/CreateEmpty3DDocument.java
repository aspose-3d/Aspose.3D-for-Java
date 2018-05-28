package examples.loadsave;

import com.aspose.threed.FileFormat;
import com.aspose.threed.Scene;
import examples.RunExamples;

import java.io.Console;

public class CreateEmpty3DDocument {

        public static void run() throws Exception {
            // ExStart:CreateEmpty3DDocument
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            MyDir = MyDir + "document.fbx";

            // Create an object of the Scene class
            Scene scene = new Scene();
            // Save 3D scene document
            scene.save(MyDir, FileFormat.FBX7500ASCII);
            // ExEnd:CreateEmpty3DDocument

            System.out.println("\nAn empty 3D document created successfully.\nFile saved at " + MyDir);
        }
}
