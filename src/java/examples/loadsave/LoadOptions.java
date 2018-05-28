package examples.loadsave;

import com.aspose.threed.*;
import examples.RunExamples;

import java.io.IOException;

public class LoadOptions {

        public static void run() throws IOException {

            discreet3DSLoadOption();
            objLoadOption();
            stlLoadOption();
            u3dLoadOption();
            gltfLoadOptions();
            plyLoadOptions();
            xLoadOptions();
        }
        public static void discreet3DSLoadOption()
        {
            // ExStart:Discreet3DSOption
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            Discreet3DSLoadOptions loadOpts = new Discreet3DSLoadOptions();
            // Sets wheather to use the transformation defined in the first frame of animation track.
            loadOpts.setApplyAnimationTransform(true);
            // Flip the coordinate system
            loadOpts.setFlipCoordinateSystem(true);
            // Prefer to use gamma-corrected color if a 3ds file provides both original color and gamma-corrected color.
            loadOpts.setGammaCorrectedColor(true);
            // Configure the look up paths to allow importer to find external dependencies.
            loadOpts.getLookupPaths().add(MyDir);
            // ExEnd:Discreet3DSOption
        }
        public static void objLoadOption()
        {
            // ExStart:ObjLoadOption
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            // Initialize an object
            ObjLoadOptions loadObjOpts = new ObjLoadOptions();
            // Import materials from external material library file
            loadObjOpts.setEnableMaterials(true);
            // Flip the coordinate system.
            loadObjOpts.setFlipCoordinateSystem(true);
            // Configure the look up paths to allow importer to find external dependencies.
            loadObjOpts.getLookupPaths().add(MyDir);
            // ExEnd:ObjLoadOption
        }
        public static void stlLoadOption()
        {
            // ExStart:STLLoadOption
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            // Initialize an object
            STLLoadOptions loadSTLOpts = new STLLoadOptions();
            // Flip the coordinate system.
            loadSTLOpts.setFlipCoordinateSystem(true);
            // Configure the look up paths to allow importer to find external dependencies.
            loadSTLOpts.getLookupPaths().add(MyDir);
            // ExEnd:STLLoadOption
        }
        public static void u3dLoadOption()
        {
            // ExStart:U3DLoadOption
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            // Initialize an object
            U3DLoadOptions loadU3DOpts = new U3DLoadOptions();
            // Flip the coordinate system.
            loadU3DOpts.setFlipCoordinateSystem(true);
            // Configure the look up paths to allow importer to find external dependencies.
            loadU3DOpts.getLookupPaths().add(MyDir);
            // ExEnd:U3DLoadOption
        }
        public static void gltfLoadOptions() throws IOException {
            // ExStart:glTFLoadOptions
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            // Initialize Scene class object
            Scene scene = new Scene();
            // Set load options
            GLTFLoadOptions loadOpt = new GLTFLoadOptions();
            // The default value is true, usually we don't need to change it. Aspose.3D will automatically flip the V/T texture coordinate during load and save.
            loadOpt.setFlipTexCoordV(true);
            scene.open( MyDir + "Duck.gltf", loadOpt);
            // ExEnd:glTFLoadOptions
        }
        public static void plyLoadOptions() throws IOException {
            // ExStart:PlyLoadOptions
            // the path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            // initialize Scene class object
            Scene scene = new Scene();
            // initialize an object
            PlyLoadOptions loadPLYOpts = new PlyLoadOptions();
            // Flip the coordinate system.
            loadPLYOpts.setFlipCoordinateSystem(true);
            // load 3D Ply model
            scene.open(MyDir + "vase-v2.ply", loadPLYOpts);
            // ExEnd:PlyLoadOptions
        }
        public static void xLoadOptions() throws IOException {
            // ExStart:XLoadOptions
            // the path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            // initialize Scene class object
            Scene scene = new Scene();
            // initialize an object
            XLoadOptions loadXOpts = new XLoadOptions(FileContentType.ASCII);
            // flip the coordinate system.
            loadXOpts.setFlipCoordinateSystem(true);
            // load 3D X file
            scene.open(MyDir + "warrior.x", loadXOpts);
            // ExEnd:XLoadOptions
        }
}
