package examples.objects;

import com.aspose.threed.DracoCompressionLevel;
import com.aspose.threed.DracoSaveOptions;
import com.aspose.threed.FileFormat;
import com.aspose.threed.Sphere;
import examples.RunExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Encode3DMeshinGoogleDraco {

        public static void run() throws IOException {
            // ExStart:Encode3DMeshinGoogleDraco
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();

            // Create a sphere
            Sphere sphere = new Sphere();
            // Encode the sphere to Google Draco raw data using optimal compression level.
            DracoSaveOptions opt = new DracoSaveOptions();
            opt.setCompressionLevel(DracoCompressionLevel.OPTIMAL);
            byte[] b = FileFormat.DRACO.encode(sphere.toMesh(), opt);
            // Save the raw bytes to file
            Files.write(Paths.get(MyDir, "SphereMeshtoDRC_Out.drc"), b);
            // ExEnd:Encode3DMeshinGoogleDraco
        }
}
