package examples.geometry;

import com.aspose.threed.*;

import java.util.Arrays;


public class SetUVOnCube {

        public static void run()

        {
            // ExStart:SetupUVOnCube
            // UVs
            Vector4[] uvs = new Vector4[]
            {
                new Vector4( 0.0, 1.0,0.0, 1.0),
                new Vector4( 1.0, 0.0,0.0, 1.0),
                new Vector4( 0.0, 0.0,0.0, 1.0),
                new Vector4( 1.0, 1.0,0.0, 1.0)
            };

            // Indices of the uvs per each polygon
            int[] uvsId = new int[]
            {
                0,1,3,2,2,3,5,4,4,5,7,6,6,7,9,8,1,10,11,3,12,0,2,13
            };

            // Call Common class create mesh using polygon builder method to set mesh instance
            Mesh mesh = Common.createMeshUsingPolygonBuilder();

            // Create UVset
            VertexElementUV elementUV = mesh.createElementUV(TextureMapping.DIFFUSE, MappingMode.POLYGON_VERTEX, ReferenceMode.INDEX_TO_DIRECT);
            // Copy the data to the UV vertex element
            elementUV.setData(uvs);
            elementUV.setIndices(uvsId);
            // ExEnd:SetupUVOnCube

            System.out.println("\nUVs has been setup successfully on cube.");
        }
}
