package examples.loadsave;

import com.aspose.threed.Scene;
import examples.RunExamples;

import java.io.IOException;

public class ReadExistingScene {

        public static void run() throws IOException {
            // ExStart:ReadExistingScene
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();

            // Initialize a Scene class object
            Scene scene = new Scene();
            // Load an existing 3D document
            scene.open(MyDir + "document.fbx");

            // ExEnd:ReadExistingScene
            System.out.println("\n3D Scene is ready for the modification, addition or processing purposes.");
        }
}
