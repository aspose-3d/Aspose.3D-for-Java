package examples.pointcloud;

import com.aspose.threed.FileFormat;
import com.aspose.threed.PointCloud;
import examples.RunExamples;

import java.io.IOException;

public class DecodeMesh {
    public static void run() throws IOException {
        // ExStart:1
        PointCloud pointCloud = (PointCloud) FileFormat.DRACO.decode(RunExamples.getDataDir() + "point_cloud_no_qp.drc");
        // ExEnd:1
    }
}
