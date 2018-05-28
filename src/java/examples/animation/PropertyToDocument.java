package examples.animation;

import com.aspose.threed.*;
import examples.RunExamples;
import examples.geometry.Common;

public class PropertyToDocument {

        public static void run() throws Exception {
            // ExStart:AddAnimationPropertyToDocument
            // Initialize scene object
            Scene scene = new Scene();

            // Call Common class create mesh using polygon builder method to set mesh instance
            Mesh mesh = Common.createMeshUsingPolygonBuilder();

            // Each cube node has their own translation
            Node cube1 = scene.getRootNode().createChildNode("cube1", mesh);

            // Find translation property on node's transform object
            Property translation = cube1.getTransform().findProperty("Translation");

            // Create a curve mapping based on translation property
            CurveMapping mapping = new CurveMapping(scene, translation);

            // Create the animation curve on X component of the scale
            Curve curve;
            mapping.bindCurve("X", curve = new Curve());
            // Move node's translation to (10, 0, 10) at 0 sec using bezier interpolation
            curve.add(0, 10.0f, Interpolation.BEZIER);
            curve.add(0, 10.0f, Interpolation.BEZIER);
            // Move node's translation to (20, 0, -10) at 3 sec
            curve.add(3, 20.0f, Interpolation.BEZIER);
            // Move node's translation to (30, 0, 0) at 5 sec
            curve.add(5, 30.0f, Interpolation.LINEAR);

            // Create the animation curve on Z component of the scale
            mapping.bindCurve("Z", curve = new Curve());
            // Move node's translation to (10, 0, 10) at 0 sec using bezier interpolation
            curve.add(0, 10.0f, Interpolation.BEZIER);
            // Move node's translation to (20, 0, -10) at 3 sec
            curve.add(3, -10.0f, Interpolation.BEZIER);
            // Move node's translation to (30, 0, 0) at 5 sec
            curve.add(5, 0.0f, Interpolation.LINEAR);

            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            MyDir = MyDir + RunExamples.getOutputFilePath("PropertyToDocument.fbx");

            // Save 3D scene in the supported file formats
            scene.save(MyDir, FileFormat.FBX7500ASCII);
            // ExEnd:AddAnimationPropertyToDocument

            System.out.println("\nAnimation property added successfully to document.\nFile saved at " + MyDir);

        }
}
