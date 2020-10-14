package examples.objects;

import com.aspose.threed.*;

import java.util.ArrayList;
import java.util.List;

public class XPathLikeObjectQueries {
    public static void run() throws ParseException {
        // ExStart:XPathLikeObjectQueries
        //Create a scene for testing
        Scene s = new Scene();
        // Create a child node
        Node a = s.getRootNode().createChildNode("a");
        // Create a sub-child node
        a.createChildNode("a1");
        // Create a sub-child node
        a.createChildNode("a2");
        // Create a child node
        s.getRootNode().createChildNode("b");
        // Create a child node
        Node c = s.getRootNode().createChildNode("c");
        // Create a sub-child node
        c.createChildNode("c1").addEntity(new Camera("cam"));
        // Create a sub-child node
        c.createChildNode("c2").addEntity(new Light("light"));
        /*
        The hierarchy of the scene looks like:
         - Root
            - a
                - a1
                - a2
            - b
            - c
                - c1
                    - cam
                - c2
                    - light
                     */
        //select objects that has type Camera or name is 'light' whatever it's located.
        List<Object> objects = s.getRootNode().selectObjects("//*[(@Type = 'Camera') or (@Name = 'light')]");

        //Select single camera object under the child nodes of node named 'c' under the root node
        A3DObject c1 = (A3DObject) s.getRootNode().selectSingleObject("/c/*/<Camera>");

        // Select node named 'a1' under the root node, even if the 'a1' is not a directly child node of the
        A3DObject obj = (A3DObject) s.getRootNode().selectSingleObject("a1");

        //Select the node itself, since the '/' is selected directly on the root node, so the root node is selected.
        obj = (A3DObject) s.getRootNode().selectSingleObject("/");
        // ExEnd:XPathLikeObjectQueries
    }
}
