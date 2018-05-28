package examples.geometry;

import com.aspose.threed.*;
import examples.RunExamples;

public class TriangulateMesh {

        public static void run() throws Exception {
            // ExStart:TriangulateMesh
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();

            // Initialize scene object
            Scene scene = new Scene();
            scene.open(MyDir + "document.fbx");

            scene.getRootNode().accept(new NodeVisitor() {

                @Override
                public boolean call(Node node) {
                    Mesh mesh = (Mesh)node.getEntity();
                    if (mesh != null)
                    {
                        // Triangulate the mesh
                        Mesh newMesh = PolygonModifier.triangulate(mesh);
                        // Replace the old mesh
                        node.setEntity(newMesh);
                    }
                    return true;
                }
            });
            MyDir = MyDir + RunExamples.getOutputFilePath("document.fbx");
            scene.save(MyDir, FileFormat.FBX7400ASCII);
            // ExEnd:TriangulateMesh
            System.out.println("\nMesh has been Triangulated.\nFile saved at " + MyDir);
        }
}
