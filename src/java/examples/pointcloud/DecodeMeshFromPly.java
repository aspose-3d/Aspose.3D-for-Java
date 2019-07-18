package examples.pointcloud;

import com.aspose.threed.FileFormat;
import com.aspose.threed.Geometry;
import com.aspose.threed.Sphere;
import examples.RunExamples;

import java.io.IOException;

public class DecodeMeshFromPly {
    public static void run() throws IOException {
        // ExStart:1
        Geometry geom = FileFormat.PLY.decode(RunExamples.getDataDir() + "sphere.ply");
        // ExEnd:1
    }
}
