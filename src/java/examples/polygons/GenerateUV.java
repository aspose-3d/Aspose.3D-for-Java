/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.polygons;

import com.aspose.threed.Box;
import com.aspose.threed.FileFormat;
import com.aspose.threed.Mesh;
import com.aspose.threed.Node;
import com.aspose.threed.PolygonModifier;
import com.aspose.threed.Scene;
import com.aspose.threed.VertexElement;
import com.aspose.threed.VertexElementType;
import examples.RunExamples;

public class GenerateUV {

            public static void run() throws Exception {
            // ExStart:GenerateUV
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            Scene scene = new Scene();
            //since all primitive entities in Aspose.3D will have builtin UV generation
            //here we manually remove it to assume we have a mesh without UV data
            Mesh mesh = (new Box()).toMesh();
            mesh.getVertexElements().remove(mesh.getElement(VertexElementType.UV));

            //then we can manually generate UV for it
            VertexElement uv = PolygonModifier.generateUV(mesh);
            //generated UV data is not associated with the mesh, we should manually do this
            mesh.addElement(uv);
            //put it to the scene
            Node node = scene.getRootNode().createChildNode(mesh);
            //then save it
            scene.save(MyDir + "test.obj", FileFormat.WAVEFRONTOBJ);
            // ExEnd:GenerateUV
        }
    
}
