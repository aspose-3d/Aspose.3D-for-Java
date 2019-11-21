package examples;

import examples.LinearExtrusion.*;
import examples.WorkingWithCylinder.CreateFanCylinder;
import examples.WorkingWithCylinder.CustomizedOffsetTopCylinder;
import examples.WorkingWithCylinder.CustomizedShearBottomCylinder;
import examples.animation.*;
import examples.geometry.*;
import examples.loadsave.*;
import examples.modeling.*;
import examples.objects.*;
import examples.pointcloud.*;
import examples.polygons.*;
import examples.scene.*;
import examples.render.*;
import examples.workingwithVRML.OpenVRML;

import java.io.File;
import java.nio.file.Paths;


public class RunExamples {

    public static void main(String[] args) throws Exception {
        System.out.println("Open RunExamples.java. \nIn Main() method uncomment the example that you want to run.");
        System.out.println("=====================================================");
        // Uncomment the one you want to try out

        // =====================================================
        // =====================================================
        // Loading and Saving
        // =====================================================
        // =====================================================

        // CreateEmpty3DDocument.run();
        // ReadExistingScene.run();
        // ReadExistingScene.ReadRVMWithAttributes();
        // DetectFormat.run();
        // SaveOptions.SavingDependenciesInMemoryFileSystem();
        // LoadOptions.run();
        // SaveOptions.run();
        // Non_PBRtoPBRMaterial.run();
        // SaveOptions.prettyPrintInGltfSaveOption();
        // SaveOptions.html5SaveOption();

        // =====================================================
        // =====================================================
        // Animation
        // =====================================================
        // =====================================================

        // PropertyToDocument.run();
        // SetupTargetAndCamera.run();

        // =====================================================
        // =====================================================
        // 3DScene
        // =====================================================
        // =====================================================

        // Save3DMeshesInCustomBinaryFormat.run();
        // InformationToScene.run();
        // ExportSceneToCompressedAMF.run();
        // ChangePlaneOrientation.run();
        ThreeDProperties.run();
        
        // =====================================================
        // =====================================================
        // Geometry and Hierarchy
        // =====================================================

        // CubeScene.run();
        // MaterialToCube.run();
        // TransformationToNodeByQuaternion.run();
        // TransformationToNodeByEulerAngles.run();
        // TransformationToNodeByTransformationMatrix.run();
        // NodeHierarchy.run();
        // MeshGeometryData.run();
        // SetupNormalsOnCube.run();
        // TriangulateMesh.run();
        // ConcatenateQuaternions.run();
        // ApplyPBRMaterialToBox.run();
        // ExposeGeometricTransformation.run();

        // =====================================================
        // =====================================================
        // 3D Modeling
        // =====================================================
        // =====================================================

        // Primitive3DModels.run();

        // =====================================================
        // =====================================================
        // Working with Objects
        // =====================================================
        // =====================================================

        // SplitMeshbyMaterial.run();
        // ConvertSpherePrimitivetoMesh.run();
        // ConvertBoxPrimitivetoMesh.run();
        // ConvertPlanePrimitivetoMesh.run();
        // ConvertCylinderPrimitivetoMesh.run();
        // ConvertTorusPrimitivetoMesh.run();
        // ConvertBoxMeshtoTriangleMeshCustomMemoryLayout.run();
        // GenerateDataForMeshes.run();
        // BuildTangentAndBinormalData.run();
        // Encode3DMeshinGoogleDraco.run();
        // XPathLikeObjectQueries.run();
        // WorkingWithSphereRadius.run();
        // CreatePolygonInMesh.run();




        // =====================================================
        // =====================================================
        // Polygons
        // =====================================================
        // =====================================================
        //  ConvertPolygonsToTriangles.run();
        //  GenerateUV.run();

        // =====================================================
        // =====================================================
        // Working With Linear Extrusion
        // =====================================================
        // =====================================================
        // PerformingLinearExtrusion.run();
        // SlicesInLinearExtrusion.run();
        // CenterInLinearExtrusion.run();
        // TwistInLinearExtrusion.run();
        // TwistOffsetInLinearExtrusion.run();
        // DirectionInLinearExtrusion.run();

        // =====================================================
        // =====================================================
        // Render
        // =====================================================
        // =====================================================
        // SwtRealtimeRendering.run();
        // RenderToFile.run();
        // RenderToBufferedImage.run();
        // ManualRenderTarget.run();
        // =====================================================
        // =====================================================
        // Working With VRML files
        // =====================================================
        // =====================================================
        // OpenVRML.run();

        // =====================================================
        // =====================================================
        // Working With Cylinder
        // =====================================================
        // =====================================================
        // CustomizedOffsetTopCylinder.run();
        // CreateFanCylinder.run();
        // CustomizedShearBottomCylinder.run();

        // =====================================================
        // =====================================================
        // Working With Point Cloud
        // =====================================================
        // =====================================================
        // DecodeMesh.run();
        // EncodeMesh.run();
        // EncodeSphereAsPointCloud.run();
        // EncodeMeshToPly.run();
        // DecodeMeshFromPly.run();
        // ExportToPlyAsPointCloud.run();
        // Export3DSceneAsPointCloud.run();



        // Stop before exiting
        System.out.println("\n\nProgram Finished. Press any key to exit....");
        System.in.read();
    }

    public static String getDataDir() {
        return (new File("Data")).getAbsolutePath() + "/";
    }
    private static String getOutputDir() {
        File file = new File("Output");
        if(!file.isDirectory())
            file.mkdirs();

        return file.getAbsolutePath();
    }

    public static String getOutputFilePath(String s) {
        return Paths.get(getOutputDir(), s).toString();
    }
}
