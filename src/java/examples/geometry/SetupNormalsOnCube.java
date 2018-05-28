package examples.geometry;

import com.aspose.threed.*;

import java.util.Arrays;


public class SetupNormalsOnCube {

        public static void run()
        {
            // ExStart:SetupNormalsOnCube
            // Raw normal data
            Vector4[] normals = new Vector4[]
            {
                new Vector4(-0.577350258,-0.577350258, 0.577350258, 1.0),
                new Vector4( 0.577350258,-0.577350258, 0.577350258, 1.0),
                new Vector4( 0.577350258, 0.577350258, 0.577350258, 1.0),
                new Vector4(-0.577350258, 0.577350258, 0.577350258, 1.0),
                new Vector4(-0.577350258,-0.577350258,-0.577350258, 1.0),
                new Vector4( 0.577350258,-0.577350258,-0.577350258, 1.0),
                new Vector4( 0.577350258, 0.577350258,-0.577350258, 1.0),
                new Vector4(-0.577350258, 0.577350258,-0.577350258, 1.0)
            };

            // Call Common class create mesh using polygon builder method to set mesh instance
            Mesh mesh = Common.createMeshUsingPolygonBuilder();

            VertexElementNormal elementNormal = (VertexElementNormal)mesh.createElement(VertexElementType.NORMAL, MappingMode.CONTROL_POINT, ReferenceMode.DIRECT);
            // Copy the data to the vertex element
            elementNormal.setData(normals);
            // ExEnd:SetupNormalsOnCube

            System.out.println("\nNormals has been setup successfully on cube.");
        }
}
