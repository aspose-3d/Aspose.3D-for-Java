package examples.loadsave;

import com.aspose.threed.*;
import examples.RunExamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SaveOptions {

        public static void run() throws Exception {
            colladaSaveOption();
            discreet3DSSaveOption();
            fbxSaveOption();
            objSaveOption();
            glTFSaveOptions();
            drcSaveOptions();
        }
    //This method is supported by version 19.8 or greater
    public static void prettyPrintInGltfSaveOption() throws IOException {
        // ExStart:prettyPrintInGltfSaveOption
        // Initialize 3D scene
        Scene scene = new Scene(new Sphere());
        // Initialize GLTFSaveOptions
        GltfSaveOptions opt = new GltfSaveOptions(FileFormat.GLTF2);
        // opt.prettyPrint = true; //Old code
        // The JSON content of GLTF file is indented for human reading, default value is false
        // Use setter to change this configuration.
        opt.setPrettyPrint(true);
        // Save 3D Scene
        scene.save(RunExamples.getDataDir() + "prettyPrintInGltfSaveOption.gltf", opt);
        // ExEnd:prettyPrintInGltfSaveOption
    }
    //This method is supported by version 19.9 or greater
    public static void html5SaveOption() throws IOException {
        // ExStart:html5SaveOption
        // Initialize a scene
        Scene scene = new Scene();
        // Initialize a node
        Node node = scene.getRootNode().createChildNode(new Cylinder());
        // Set child node properites
        LambertMaterial mat = new LambertMaterial();
        mat.setDiffuseColor(new Vector3(0.34,0.59, 0.41));
        node.setMaterial(mat);
        Light light = new Light();
        light.setLightType(LightType.POINT);
        scene.getRootNode().createChildNode(light).getTransform().setTranslation(10, 0, 10);
        // Initialize HTML5SaveOptions
        Html5SaveOptions opt = new Html5SaveOptions();
        // Turn off the grid
        opt.setShowGrid(false);
        //Turn off the user interface
        opt.setShowUI(false);
        scene.save(RunExamples.getDataDir() + "html5SaveOption.html", FileFormat.HTML5);
        // ExEnd:html5SaveOption
    }

    public static void colladaSaveOption()
        {
            // ExStart:ColladaSaveOption
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            ColladaSaveOptions saveColladaopts = new ColladaSaveOptions();
            // Generates indented XML document
            saveColladaopts.setIndented(true);
            // The style of node transformation
            saveColladaopts.setTransformStyle(ColladaTransformStyle.MATRIX);
            // Configure the lookup paths to allow importer to find external dependencies.
            saveColladaopts.getLookupPaths().add(MyDir);
            // ExEnd:ColladaSaveOption
        }
        public static void discreet3DSSaveOption()
        {
            // ExStart:Discreet3DSSaveOption
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            // Initialize an object
            Discreet3dsSaveOptions saveOpts = new Discreet3dsSaveOptions();
            // The start base for generating new name for duplicated names.
            saveOpts.setDuplicatedNameCounterBase(2);
            // The format of the duplicated counter.
            saveOpts.setDuplicatedNameCounterFormat("NameFormat");
            // The separator between object's name and the duplicated counter.
            saveOpts.setDuplicatedNameSeparator("Separator");
            // Allows to export cameras
            saveOpts.setExportCamera(true);
            // Allows to export light
            saveOpts.setExportLight(true);
            // Flip the coordinate system
            saveOpts.setFlipCoordinateSystem(true);
            // Prefer to use gamma-corrected color if a 3ds file provides both original color and gamma-corrected color.
            saveOpts.setGammaCorrectedColor(true);
            // Use high-precise color which each color channel will use 32bit float.
            saveOpts.setHighPreciseColor(true);
            // Configure the look up paths to allow importer to find external dependencies.
            saveOpts.getLookupPaths().add(MyDir);
            // Set the master scale
            saveOpts.setMasterScale(1);
            // ExEnd:Discreet3DSSaveOption
        }
        public static void fbxSaveOption()
        {
            // ExStart:FBXSaveOption
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            // Initialize an object
            FbxSaveOptions saveOpts = new FbxSaveOptions(FileFormat.FBX7400ASCII);
            // Generates the legacy material properties.
            saveOpts.setExportLegacyMaterialProperties(true);
            // Fold repeated curve data using FBX's animation reference count
            saveOpts.setFoldRepeatedCurveData(true);
            // Always generates material mapping information for geometries if the attached node contains materials.
            saveOpts.setGenerateVertexElementMaterial(true);
            // Configure the look up paths to allow importer to find external dependencies.
            saveOpts.getLookupPaths().add(MyDir);
            // Generates a video object for texture.
            saveOpts.setVideoForTexture(true);
            // ExEnd:FBXSaveOption
        }
        public static void objSaveOption()
        {
            // ExStart:ObjSaveOption
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            // Initialize an object
            ObjSaveOptions saveObjOpts = new ObjSaveOptions();
            // Import materials from external material library file
            saveObjOpts.setEnableMaterials(true);
            // Flip the coordinate system.
            saveObjOpts.setFlipCoordinateSystem(true);
            // Configure the look up paths to allow importer to find external dependencies.
            saveObjOpts.getLookupPaths().add(MyDir);
            // Serialize W component in model's vertex position
            saveObjOpts.setSerializeW(true);
            // Generate comments for each section
            saveObjOpts.setVerbose(true);
            // ExEnd:ObjSaveOption
        }
        public static void STLSaveOption()
        {
            // ExStart:STLSaveOption
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            // Initialize an object
            StlSaveOptions saveSTLOpts = new StlSaveOptions();
            // Flip the coordinate system.
            saveSTLOpts.setFlipCoordinateSystem(true);
            // Configure the look up paths to allow importer to find external dependencies.
            saveSTLOpts.getLookupPaths().add(MyDir);
            // ExEnd:STLSaveOption
        }
        public static void U3DSaveOption()
        {
            // ExStart:U3DSaveOption
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            // Initialize an object
            U3dSaveOptions saveU3DOptions = new U3dSaveOptions();
            // Export normal data.
            saveU3DOptions.setExportNormals(true);
            // Export the texture coordinates.
            saveU3DOptions.setExportTextureCoordinates(true);
            // Export the vertex diffuse color.
            saveU3DOptions.setExportVertexDiffuse(true);
            // Export vertex specular color
            saveU3DOptions.setExportVertexSpecular(true);
            // Flip the coordinate system.
            saveU3DOptions.setFlipCoordinateSystem(true);
            // Configure the look up paths to allow importer to find external dependencies.
            saveU3DOptions.getLookupPaths().add(MyDir);
            // Compress the mesh data
            saveU3DOptions.setMeshCompression(true);
            // ExEnd:U3DSaveOption
        }
        
        public static void glTFSaveOptions() throws Exception {
            // ExStart:glTFSaveOptions
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            // Initialize Scene object
            Scene scene = new Scene();
            // Create a child node
            scene.getRootNode().createChildNode("sphere", new Sphere());
            // Set glTF saving options. The code example embeds all assets into the target file usually a glTF file comes with some dependencies, a bin file for model's vertex/indices, two .glsl files for vertex/fragment shaders
            // Use opt.EmbedAssets to tells the Aspose.3D API to export scene and embed the dependencies inside the target file.
            GltfSaveOptions opt = new GltfSaveOptions(FileContentType.ASCII);
            opt.setEmbedAssets(true);
            // Use KHR_materials_common extension to define the material, thus no GLSL files are generated.
            opt.setUseCommonMaterials(true);
            // Customize the name of the buffer file which defines model
            opt.setBufferFile("mybuf.bin");
            // Save glTF file
            scene.save(MyDir + "glTFSaveOptions_out.gltf", opt);

            // Save a binary glTF file using KHR_binary_glTF extension
            scene.save(MyDir + "glTFSaveOptions_out.glb", FileFormat.GLTF_BINARY);

            // Developers may use saving options to create a binary glTF file using KHR_binary_glTF extension
            GltfSaveOptions opts = new GltfSaveOptions(FileContentType.BINARY);
            scene.save(MyDir + "Test_out.glb", opts);
            // ExEnd:glTFSaveOptions
        }
        public static void drcSaveOptions() throws Exception {
            // ExStart:DRCSaveOptions
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            // Initialize Scene object
            Scene scene = new Scene();
            // Create a child node
            scene.getRootNode().createChildNode("sphere", new Sphere());
            // Initialize .DRC saving options.
            DracoSaveOptions opts = new DracoSaveOptions();
            // Quantization bits for position
            opts.setPositionBits(14);
            // Quantization bits for texture coordinate
            opts.setTextureCoordinateBits(8);
            // Quantization bits for vertex color
            opts.setColorBits(10);
            // Quantization bits for normal vectors
            opts.setNormalBits(7);
            // Set compression level
            opts.setCompressionLevel(DracoCompressionLevel.OPTIMAL);

            // Save Google Draco (.drc) file
            scene.save(MyDir + "DRCSaveOptions_out.drc", opts);
            // ExEnd:DRCSaveOptions
        }
        public static void DiscardSavingMaterial() throws Exception {
            // ExStart:DiscardSavingMaterial
            // The code example uses the DummyFileSystem, so the material files are not created.
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            // Initialize Scene object
            Scene scene = new Scene();
            // Create a child node
            scene.getRootNode().createChildNode("sphere", new Sphere()).setMaterial(new PhongMaterial());
            // Set saving options
            ObjSaveOptions opt = new ObjSaveOptions();
            opt.setFileSystem(new DummyFileSystem());
            // Save 3D scene
            scene.save(MyDir + "DiscardSavingMaterial_out.obj", opt);
            // ExEnd:DiscardSavingMaterial
        }
        public static void savingDependenciesInLocalDirectory() throws Exception {
            // ExStart:SavingDependenciesInLocalDirectory
            // The code example uses the LocalFileSystem class to save dependencies to the local directory.
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            // Initialize Scene object
            Scene scene = new Scene();
            // Create a child node
            scene.getRootNode().createChildNode("sphere", new Sphere()).setMaterial(new PhongMaterial());
            // Set saving options
            ObjSaveOptions opt = new ObjSaveOptions();
            opt.setFileSystem(new LocalFileSystem(MyDir));
            // Save 3D scene
            scene.save(MyDir + "SavingDependenciesInLocalDirectory_out.obj", opt);
            // ExEnd:SavingDependenciesInLocalDirectory
        }
        public static void SavingDependenciesInMemoryFileSystem() throws Exception {
            // ExStart:SavingDependenciesInMemoryFileSystem
            // The code example uses the MemoryFileSystem to intercepts the dependencies writing.
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            // Initialize Scene object
            Scene scene = new Scene();
            // Create a child node
            scene.getRootNode().createChildNode("sphere", new Sphere()).setMaterial(new PhongMaterial());
            // Set saving options
            ObjSaveOptions opt = new ObjSaveOptions();
            MemoryFileSystem mfs = new MemoryFileSystem();
            opt.setFileSystem(mfs);
            // Save 3D scene
            scene.save(MyDir + "SavingDependenciesInMemoryFileSystem_out.obj", opt);
            // Get the test.mtl file content
            byte[] mtl = mfs.getFileContent(MyDir + "SavingDependenciesInMemoryFileSystem_out.mtl");
            Files.write(Paths.get(MyDir, "Material.mtl"), mtl);
            // ExEnd:SavingDependenciesInMemoryFileSystem
        }
        private static void RVMSaveOptions() throws IOException
        {
            //ExStart: RVMSaveOptions
            String dataDir = RunExamples.getDataDir();
            Scene scene = new Scene();
            Node node = scene.getRootNode().createChildNode("Box", new Box());
            node.setProperty("rvm:Refno", "=3462123");
            node.setProperty("rvm:Description", "This is the description of the box");
            //The RVM attribute's prefix is rvm:, all properties that starts with rvm: will be exported to .att file(the prefix will be removed)
            RvmSaveOptions opt = new RvmSaveOptions();
            opt.setAttributePrefix( "rvm:");
            opt.setExportAttributes(true);
            scene.save(dataDir + "test.rvm", opt);
            //ExEnd: RVMSaveOptions
        }
}
