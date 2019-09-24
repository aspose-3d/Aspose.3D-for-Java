package examples.geometry;

import com.aspose.threed.Node;
import com.aspose.threed.Vector3;

public class ExposeGeometricTransformation {
    public static void run() throws Exception {
        //ExStart: 1
        // Initialize node
        Node n = new Node();
        // Get Geometric Translation
        n.getTransform().setGeometricTranslation(new Vector3(10, 0, 0));
        // The first Console.WriteLine will output the transform matrix that includes the geometric transformation
        // while the second one will not.
        System.out.println(n.evaluateGlobalTransform(true));
        System.out.println(n.evaluateGlobalTransform(false));
        //ExEnd: 1
    }
}
