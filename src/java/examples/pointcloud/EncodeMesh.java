package examples.pointcloud;

import com.aspose.threed.FileFormat;
import com.aspose.threed.Sphere;
import examples.RunExamples;

import java.io.IOException;

public class EncodeMesh {
    public static void run() throws IOException {
        // ExStart:1
        FileFormat.DRACO.encode(new Sphere(), RunExamples.getDataDir() + "sphere.drc");
        // ExEnd:1
    }
}
