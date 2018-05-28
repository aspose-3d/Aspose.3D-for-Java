package examples.objects;

import com.aspose.threed.*;
import examples.RunExamples;

public class ConvertBoxMeshtoTriangleMeshCustomMemoryLayout {

        public static void run() throws Exception {
            // Initialize scene object
            Scene scene = new Scene();

            // Initialize Node class object
            Node cubeNode = new Node("box");

            // ExStart:ConvertBoxMeshtoTriangleMeshCustomMemoryLayout
            // Get mesh of the Box
            Mesh box = (new Box()).toMesh();
            // Create a customized vertex layout
            VertexDeclaration vd = new VertexDeclaration();
            VertexField position = vd.addField(VertexFieldDataType.F_VECTOR4, VertexFieldSemantic.POSITION);
            vd.addField(VertexFieldDataType.F_VECTOR3, VertexFieldSemantic.NORMAL);
            // Get a triangle mesh
            TriMesh triMesh = TriMesh.fromMesh(box);
            // ExEnd:ConvertBoxMeshtoTriangleMeshCustomMemoryLayout

            // Point node to the Mesh geometry
            cubeNode.setEntity(box);

            // Add Node to a scene
            scene.getRootNode().getChildNodes().add(cubeNode);

            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir() + RunExamples.getOutputFilePath("BoxToTriangleMeshCustomMemoryLayoutScene.fbx");

            // Save 3D scene in the supported file formats
            scene.save(MyDir, FileFormat.FBX7400ASCII);

            System.out.println("\n Converted a Box mesh to triangle mesh with custom memory layout of the vertex successfully.\nFile saved at " + MyDir);
        }
}
