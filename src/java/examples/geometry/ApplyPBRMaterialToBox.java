package examples.geometry;

import com.aspose.threed.*;
import examples.RunExamples;

public class ApplyPBRMaterialToBox {

        public static void run() throws Exception {
            // ExStart:ApplyPBRMaterialToBox
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();

            // initialize a scene
            Scene scene = new Scene();
            // initialize PBR material object
            PbrMaterial mat = new PbrMaterial();
            // an almost metal material
            mat.setMetallicFactor(0.9);
            // material surface is very rough
            mat.setRoughnessFactor(0.9);
            // create a box to which the material will be applied
            Node boxNode = scene.getRootNode().createChildNode("box", new Box());
            boxNode.setMaterial(mat);
            // save 3d scene into STL format
            scene.save(MyDir + "PBR_Material_Box_Out.stl", FileFormat.STLASCII);
            // ExEnd:ApplyPBRMaterialToBox
        }
}
