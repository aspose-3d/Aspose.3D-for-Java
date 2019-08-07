package examples.objects;

import com.aspose.threed.Mesh;

import java.io.IOException;

public class CreatePolygonInMesh {
    //This method is supported by version 19.8 or greater
    public static void run() throws IOException {
        // ExStart:1
        // Initialize Mesh
        Mesh mesh = new Mesh();
        //The old CreatePolygon needs to create a temporary array for holding the face indices
        //mesh.createPolygon(new int[] { 0, 1, 2 });
        //The new overloads doesn't need extra allocation, and it's optimized internally.
        mesh.createPolygon(0, 1, 2);
        //Or You can create a polygon using 4 vertices(quad)
        //mesh.CreatePolygon(0, 1, 2, 3);
        // ExEnd:1
    }
}
