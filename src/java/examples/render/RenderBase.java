package examples.render;

import com.aspose.threed.*;

import java.awt.*;

public class RenderBase {
    protected static Camera setupScene(Scene scene) {
        Light light;
        Node node = scene.getRootNode().createChildNode("light", light = new Light());
        light.setNearPlane(0.1);
        light.setColor(new Vector3(Color.white));
        node.getTransform().setTranslation(9.4785, 5, 3.18);
        light.setLookAt(Vector3.ORIGIN);
        light.setFalloff(90);

        Node plane = scene.getRootNode().createChildNode("plane", (new Plane(20, 20)).toMesh());
        applyMaterial(plane, new Color(0xff8c00));
        plane.getTransform().setTranslation(0, 0, 0);
        ((Mesh)plane.getEntity()).setReceiveShadows(true);

        Mesh m = (new Torus("", 1, 0.4, 50, 50, Math.PI*2)).toMesh();
        Node torus = scene.getRootNode().createChildNode("torus", m);
        applyMaterial(torus, new Color(0x330c93)).setTransparency(0.3);

        torus.getTransform().setTranslation(2, 1, 1);
        Quaternion q1 = Quaternion.fromEulerAngle(Math.PI * 0.5, 0, 0);
        Quaternion q2 = Quaternion.fromAngleAxis(- Math.PI * 0.5, Vector3.X_AXIS);
        Quaternion q3 = q1.concat(q2);
        Node cylinder = scene.getRootNode().createChildNode("cylinder-q1", new Cylinder(0.1, 1, 2, 20, 1, false));
        cylinder.getTransform().setRotation(q1);
        cylinder.getTransform().setTranslation(-5, 2, 0);
        applyMaterial(cylinder, new Color(0x34fc00));


        cylinder = scene.getRootNode().createChildNode("cylinder-q2", new Cylinder(0.1, 1, 2, 20, 1, false));
        cylinder.getTransform().setRotation(q2);
        cylinder.getTransform().setTranslation(0, 2, 0);
        applyMaterial(cylinder, new Color(0x226666));

        cylinder = scene.getRootNode().createChildNode("cylinder-q3", new Cylinder(0.5, 1, 2, 20, 1, false));
        cylinder.getTransform().setRotation(q3);
        cylinder.getTransform().setTranslation(5, 2, 0);
        applyMaterial(cylinder, new Color(0xAA6C39));


        Camera camera = new Camera();
        scene.getRootNode().createChildNode(camera);
        camera.setNearPlane(0.1);
        camera.getParentNode().getTransform().setTranslation(10, 5, 10);
        camera.setLookAt(Vector3.ORIGIN);
        return camera;
    }

    private static PhongMaterial applyMaterial(Node node, Color color) {
        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(new Vector3(color));
        node.setMaterial(material);
        return material;
    }
}
