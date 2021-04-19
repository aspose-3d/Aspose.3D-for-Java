/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.scene;

import com.aspose.threed.AmfSaveOptions;
import com.aspose.threed.Box;
import com.aspose.threed.Scene;
import com.aspose.threed.Transform;
import com.aspose.threed.Vector3;
import examples.RunExamples;

public class ExportSceneToCompressedAMF {
            public static void run() throws Exception {
            // ExStart:CompressedAMF
            // The path to the documents directory.
            String MyDir = RunExamples.getDataDir();
            Scene scene = new Scene();
            Box box = new Box();
            Transform tr = scene.getRootNode().createChildNode(box).getTransform();
            tr.setScale(new Vector3(12, 12, 12));
            tr.setTranslation(new Vector3(10, 0, 0));
            tr = scene.getRootNode().createChildNode(box).getTransform();
            tr.setScale(new Vector3(5, 5, 5));
            tr.setEulerAngles(new Vector3(50, 10, 0));
            scene.getRootNode().createChildNode();
            scene.getRootNode().createChildNode().createChildNode(box);
            scene.getRootNode().createChildNode().createChildNode(box);
            AmfSaveOptions opt = new AmfSaveOptions();
            opt.setEnableCompression(false);
            scene.save(MyDir + "test.amf", opt);
            // ExEnd:CompressedAMF
        }
    
}
