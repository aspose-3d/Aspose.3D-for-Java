# Java API for 3D Image Processing

[Aspose.3D for Java API](https://products.aspose.com/3d/java) is built to create, edit, manipulate and save 3D formats. It empowers Java applications to connect with 3D documents without installing any software package on the computer. Aspose.3D for Java API assist developers to model and create massive worlds in games, superb scenes for design visualization, and engage virtual reality experiences. The API is user friendly and saves time and money than creating a similar solution from scratch.

Directory | Description
--------- | -----------
[Examples](https://github.com/aspose-3d/Aspose.3D-for-Java/tree/master/src/java/examples) | A collection of Java examples that help you learn the product features.

<p align="center">
  <a title="Download Examples ZIP" href="https://github.com/aspose-3d/Aspose.3D-for-Java/archive/master.zip">
	<img src="https://raw.github.com/AsposeExamples/java-examples-dashboard/master/images/downloadZip-Button-Large.png" />
  </a>
</p>

## 3D Processing API Features

- [Create](https://docs.aspose.com/3d/java/create-an-empty-3d-document/), load and save 3D scene.
- Work with 3D models and 3D objects.
- Setup target camera in 3D document.
- Add Node hierarchy and Share Geometric data of Mesh among Multiple Nodes of 3D Scene.
- Create 3D Mesh and expose Geometric Transformation.
- Convert all Polygons to Triangles in 3D Model.
- Work with [linear extrusion](https://docs.aspose.com/3d/java/working-with-linear-extrusion/), [cylinder](https://docs.aspose.com/3d/java/working-with-cylinder/), and [PointCloud](https://docs.aspose.com/3d/java/working-with-pointcloud/).

## Supported 3D File Formats

FBX 7.5 ASCII, FBX 7.5 Binary, FBX 7.4 ASCII, FBX 7.4 Binary, FBX 7.3 ASCII, FBX 7.3 Binary, FBX 7.2 ASCII, FBX 7.2 Binary, STL (ASCII, Binary), WavefrontOBJ, Discreet3DS, Universal3D, COLLADA, glTF, DXF, PLY (ASCII, Binary), X (ASCII, Binary), Draco, GLTF 2.0 (ASCII, Binary), 3MF, RVM (Text, Binary), ASE, GLB

## Read & Write 3D Formats

3DS, AMF, RVM, DAE, DRC, FBX, gITF, OBJ, PLY, STL, U3D, ATT

## Save 3D File As

HTML

## Read 3D Formats

3MF, ASE, DXF, JT, VRML 1.0, X

## Supported Environments

- **Microsoft Windows:** Windows Desktop & Server (x86, x64)
- **macOS:** Mac OS X
- **Linux:** Ubuntu, CentOS, and others
- **Java Versions:** `J2SE 9.0 (1.9+)` or above (for example Java 11)

## Get Started with Aspose.3D for Java

Aspose hosts all Java APIs at the [Aspose Repository](https://repository.aspose.com/webapp/#/artifacts/browse/tree/General/repo/com/aspose/aspose-3d). You can easily use Aspose.3D for Java API directly in your Maven projects with simple configurations. For the detailed instructions please visit [Installing Aspose.3D for Java from Aspose Repository](https://docs.aspose.com/3d/java/installation/) documentation page.

## Create 3D Mesh using Polygons via java Code

```java
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
```

## Perform Linear Extrusion using Java API

``` java
// For complete examples and data files, please go to https://github.com/aspose-3d/Aspose.3D-for-Java
// The path to the documents directory.
String MyDir = RunExamples.getDataDir();
// Initialize the base shape to be extruded
// Initialize the base profile to be extruded
RectangleShape profile = new RectangleShape();
profile.setRoundingRadius(0.3);
// Perform Linear extrusion by passing a 2D shape as input and extend the shape in the 3rd dimension
LinearExtrusion extrusion = new LinearExtrusion(profile, 10) {{ setSlices(100); setCenter(true); setTwist(360); setTwistOffset(new Vector3(10, 0, 0));}};
extrusion.setSlices(100);
extrusion.setCenter(true);
extrusion.setTwist(360);
extrusion.setTwistOffset(new Vector3(10, 0, 0));
// Create a scene
Scene scene = new Scene();
// Create a child node by passing extrusion
scene.getRootNode().createChildNode(extrusion);
// Save 3D scene
scene.save(MyDir +  "LinearExtrusion.obj", FileFormat.WAVEFRONTOBJ);
```

[Home](https://www.aspose.com/) | [Product Page](https://products.aspose.com/3d/java) | [Docs](https://docs.aspose.com/3d/java/) | [Demos](https://products.aspose.app/3d/family) | [API Reference](https://apireference.aspose.com/java/3d) | [Examples](https://github.com/aspose-3d/Aspose.3D-for-Java) | [Blog](https://blog.aspose.com/category/3d/) | [Free Support](https://forum.aspose.com/c/3d) | [Temporary License](https://purchase.aspose.com/temporary-license)
