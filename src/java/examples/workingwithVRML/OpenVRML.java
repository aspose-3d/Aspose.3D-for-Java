package examples.workingwithVRML;

import com.aspose.threed.FileFormat;
import com.aspose.threed.Scene;
import com.aspose.threed.Sphere;
import examples.RunExamples;

import java.io.IOException;

public class OpenVRML {
    public static void run() throws IOException {
        // ExStart:OpenVRML
        // The path to the documents directory.
        String MyDir = RunExamples.getDataDir();
        // initialize a scene
        Scene scene = new Scene();
        // open Virtual Reality Modeling Language (VRML) file format
        scene.open( MyDir + "test.wrl");
        // work with VRML file format...
        // ExEnd:OpenVRML
    }
}
