package examples.pointcloud;

import com.aspose.threed.FileFormat;
import com.aspose.threed.PlySaveOptions;
import com.aspose.threed.Sphere;
import examples.RunExamples;

import java.io.IOException;

public class ExportToPlyAsPointCloud {
    public static void run() throws IOException {
        // ExStart:1
        PlySaveOptions opt = new PlySaveOptions();
        opt.setPointCloud(true);
        FileFormat.PLY.encode(new Sphere(),RunExamples.getDataDir() + "sphere.ply", opt);
        // ExEnd:1
    }
}
