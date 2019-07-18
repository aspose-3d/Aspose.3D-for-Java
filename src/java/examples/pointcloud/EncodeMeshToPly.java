package examples.pointcloud;

import com.aspose.threed.DracoSaveOptions;
import com.aspose.threed.FileFormat;
import com.aspose.threed.Sphere;
import examples.RunExamples;

import java.io.IOException;

public class EncodeMeshToPly {
    public static void run() throws IOException {
        // ExStart:1
        FileFormat.PLY.encode(new Sphere(), RunExamples.getDataDir() + "sphere.ply");
        // ExEnd:1
    }
}

