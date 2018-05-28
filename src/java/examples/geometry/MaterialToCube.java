package examples.geometry;

import com.aspose.threed.*;
import examples.RunExamples;

import java.nio.file.Files;
import java.nio.file.Paths;

public class MaterialToCube {
    public static void run() throws Exception {
            // ExStart:AddMaterialToCube
            // Initialize scene object
            Scene scene = new Scene();

            // Initialize cube node object
            Node cubeNode = new Node("cube");

            // Call Common class create mesh using polygon builder method to set mesh instance
            Mesh mesh = Common.createMeshUsingPolygonBuilder();

            // Point node to the mesh
            cubeNode.setEntity(mesh);

            // Add cube to the scene
            scene.getRootNode().addChildNode(cubeNode);

            // Initiallize PhongMaterial object
            PhongMaterial mat = new PhongMaterial();

            // Initiallize Texture object
            Texture diffuse = new Texture();

            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();

            // Set local file path
            diffuse.setFileName(MyDir + "surface.dds");

            // Set Texture of the material
            mat.setTexture(Material.MAP_DIFFUSE, diffuse);

            // Embed raw content data to FBX (only for FBX and optional)
            // Set file name
            diffuse.setFileName("embedded-texture.png");
            // Set binary content
            diffuse.setContent(Files.readAllBytes(Paths.get(MyDir, "aspose-logo.jpg")));

            // Set color
            mat.setSpecularColor(new Vector3(1, 0, 0));

            // Set brightness
            mat.setShininess(100);

            // Set material property of the cube object
            cubeNode.setMaterial(mat);

            MyDir = MyDir + RunExamples.getOutputFilePath("MaterialToCube.fbx");

            // Save 3D scene in the supported file formats
            scene.save(MyDir, FileFormat.FBX7400ASCII);
            // ExEnd:AddMaterialToCube

            System.out.println("\nMaterial added successfully to cube.\nFile saved at " + MyDir);
        }
}
