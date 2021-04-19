package examples.loadsave;

import com.aspose.threed.*;
import examples.RunExamples;

public class Non_PBRtoPBRMaterial {

        public static void run() throws Exception {
            // ExStart:Non_PBRtoPBRMaterial
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            /* initialize a new 3D scene */
            Scene s = new Scene();
            Box box = new Box();
            PhongMaterial mat = new PhongMaterial();
            mat.setDiffuseColor(new Vector3(1, 0, 1));
            s.getRootNode().createChildNode("box1", box).setMaterial(mat);

            GltfSaveOptions opt = new GltfSaveOptions(FileFormat.GLTF2);
            //Custom material converter to convert PhongMaterial to PbrMaterial
            opt.setMaterialConverter(new MaterialConverter() {
                @Override
                public Material call(Material material) {
                    PhongMaterial m = (PhongMaterial) material;
                    PbrMaterial ret = new PbrMaterial();
                    ret.setAlbedo(m.getDiffuseColor());
                    return ret;
                }
            });
            // save in GLTF 2.0 format
            s.save(MyDir + "Non_PBRtoPBRMaterial_Out.gltf", opt);
            // ExEnd:Non_PBRtoPBRMaterial
        }
}
