package examples.objects;

import com.aspose.threed.*;

import java.util.Arrays;

public class SplitMeshbyMaterial {

        public static void run() {
            // ExStart:SplitMeshbyMaterial

            // Create a mesh of box(A box is composed by 6 planes)
            Mesh box = (new Box()).toMesh();
            // Create a material element on this mesh
            VertexElementMaterial mat = (VertexElementMaterial) box.createElement(VertexElementType.MATERIAL, MappingMode.POLYGON, ReferenceMode.INDEX);
            // And specify different material index for each plane
            mat.setIndices(new int[]{0, 1, 2, 3, 4, 5});
            // Now split it into 6 sub meshes, we specified 6 different materials on each plane, each plane will become a sub mesh.
            // We used the CloneData policy, each plane will has the same control point information or control point-based vertex element information.
            Mesh[] planes = PolygonModifier.splitMesh(box, SplitMeshPolicy.CLONE_DATA);

            mat.getIndices().clear();
            mat.setIndices(new int[]{0, 0, 0, 1, 1, 1});
            // Now split it into 2 sub meshes, first mesh will contains 0/1/2 planes, and second mesh will contains the 3/4/5th planes.
            // We used the CompactData policy, each plane will has its own control point information or control point-based vertex element information.
            planes = PolygonModifier.splitMesh(box, SplitMeshPolicy.COMPACT_DATA);

            // ExEnd:SplitMeshbyMaterial
            System.out.println("\nSpliting a mesh by specifying the material successfully.");
        }
}
