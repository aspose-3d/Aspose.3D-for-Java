package examples.objects;

import com.aspose.threed.*;
import examples.RunExamples;

import java.io.IOException;

public class GenerateDataForMeshes {

        public static void run() throws IOException {
            // ExStart:GenerateDataForMeshes
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();

            // Load a 3ds file, 3ds file doesn't have normal data, but it has smoothing group
            Scene s = new Scene(MyDir + "camera.3ds");
            // Visit all nodes and create normal data for all meshes
            s.getRootNode().accept(new NodeVisitor() {
                @Override
                public boolean call(Node node) {
                    Mesh mesh = (Mesh)node.getEntity();
                    if (mesh != null)
                    {
                        VertexElementNormal normals = PolygonModifier.generateNormal(mesh);
                        mesh.addElement(normals);
                    }
                    return true;
                }
            });
            // ExEnd:GenerateDataForMeshes
            System.out.println("\nNormal data generated successfully for all meshes.");
        }
}
