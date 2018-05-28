package examples.loadsave;

import com.aspose.threed.FileFormat;
import examples.RunExamples;

import java.io.IOException;

public class DetectFormat {
    public static void run() throws IOException {
            // ExStart:DetectFormat
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            // Detect the format of a 3D file
            FileFormat inputFormat = FileFormat.detect(MyDir + "document.fbx");
            // Display the file format
            System.out.println("File Format: " + inputFormat.toString());
            // ExEnd:DetectFormat
        }
}
