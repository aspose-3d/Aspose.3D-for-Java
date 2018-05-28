package examples.geometry;

import com.aspose.threed.Mesh;
import com.aspose.threed.PolygonBuilder;
import com.aspose.threed.Vector4;
import com.aspose.threed.Vector4List;

import java.util.List;

public class Common {

        private static List<Vector4> defineControlPoints()
        {
            // ExStart:DefineControlPoints
            // Initialize control points
            Vector4List controlPoints = new Vector4List(8);
            controlPoints.add(new Vector4( -5.0, 0.0, 5.0, 1.0));
            controlPoints.add(new Vector4( 5.0, 0.0, 5.0, 1.0));
            controlPoints.add(new Vector4( 5.0, 10.0, 5.0, 1.0));
            controlPoints.add(new Vector4( -5.0, 10.0, 5.0, 1.0));
            controlPoints.add(new Vector4( -5.0, 0.0, -5.0, 1.0));
            controlPoints.add(new Vector4( 5.0, 0.0, -5.0, 1.0));
            controlPoints.add(new Vector4( 5.0, 10.0, -5.0, 1.0));
            controlPoints.add(new Vector4( -5.0, 10.0, -5.0, 1.0));
            // ExEnd:DefineControlPoints
            return controlPoints;
        }
        public static Mesh createMeshUsingPolygonBuilder()
        {
            // ExStart:CreateMeshUsingPolygonBuilder
            List<Vector4> controlPoints = defineControlPoints();

            // Initialize mesh object
            Mesh mesh = new Mesh();

            // Add control points to the mesh
            mesh.getControlPoints().addAll(controlPoints);

            // Indices of the vertices per each polygon
            int[] indices = new int[]
            {
                0,1,2,3, // Front face (Z+)
                1,5,6,2, // Right side (X+)
                5,4,7,6, // Back face (Z-)
                4,0,3,7, // Left side (X-)
                0,4,5,1, // Bottom face (Y-)
                3,2,6,7 // Top face (Y+)
            };

            int vertexId = 0;
            PolygonBuilder builder = new PolygonBuilder(mesh);
            for (int face = 0; face < 6; face++)
            {
                // Start defining a new polygon
                builder.begin();
                for (int v = 0; v < 4; v++)
                    // The indice of vertice per each polygon
                    builder.addVertex(indices[vertexId++]);
                // Finished one polygon
                builder.end();
            }

            // ExEnd:CreateMeshUsingPolygonBuilder
            return mesh;
        }
        public static Mesh createMeshUsingCreatePolygons()
        {
            // ExStart:CreateMeshUsingCreatePolygons
            List<Vector4> controlPoints = defineControlPoints();

            // Initialize mesh object
            Mesh mesh = new Mesh();
            // Add control points to the mesh
            mesh.getControlPoints().addAll(controlPoints);
            // Create polygons to mesh
            // Front face (Z+)
            mesh.createPolygon(new int[] { 0, 1, 2, 3 });
            // Right side (X+)
            mesh.createPolygon(new int[] { 1, 5, 6, 2 });
            // Back face (Z-)
            mesh.createPolygon(new int[] { 5, 4, 7, 6 });
            // Left side (X-)
            mesh.createPolygon(new int[] { 4, 0, 3, 7 });
            // Bottom face (Y-)
            mesh.createPolygon(new int[] { 0, 4, 5, 1 });
            // Top face (Y+)
            mesh.createPolygon(new int[] { 3, 2, 6, 7 });
            // ExEnd:CreateMeshUsingCreatePolygons
            return mesh;
        }
}
