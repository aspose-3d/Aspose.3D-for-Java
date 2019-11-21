package examples.scene;

import java.io.IOException;

import com.aspose.threed.Material;
import com.aspose.threed.Property;
import com.aspose.threed.PropertyCollection;
import com.aspose.threed.Scene;
import com.aspose.threed.Vector3;

import examples.RunExamples;

public class ThreeDProperties {

	public static void run() throws IOException {
		// TODO Auto-generated method stub

		//ExStart: ThreeDProperties
        String dataDir = RunExamples.getDataDir();
        Scene scene = new Scene(dataDir+ "EmbeddedTexture.fbx");
        Material material = scene.getRootNode().getChildNodes().get(0).getMaterial();
        PropertyCollection props = material.getProperties();
        //List all properties using for loop
        for (Property prop:props)
        {
            System.out.println("Name" + prop.getName() + " Value = " + prop.getValue());
        }
        //or using ordinal for loop
        for (int i = 0; i < props.size(); i++)
        {
            Property prop = props.get(i);
            System.out.println("Name" + prop.getName() + " Value = " + prop.getValue());
        }
        //Get property value by name
        Object diffuse = (Vector3)props.get("Diffuse");
        System.out.println(diffuse);
        //modify property value by name
        props.set("Diffuse", new Vector3(1, 0, 1));
        //Get property instance by name
        Property pdiffuse = props.findProperty("Diffuse");
        System.out.println(pdiffuse);
        //Since Property is also inherited from A3DObject
        //It's possible to get the property of the property
        System.out.println("Property flags = " + pdiffuse.getProperty("flags"));
        //and some properties that only defined in FBX file:
        System.out.println("Label = " + pdiffuse.getProperty("label"));
        System.out.println("Type Name = " + pdiffuse.getProperty("typeName"));
        //so traversal on property's property is possible
        for (Property pp: pdiffuse.getProperties())
        {
        	System.out.println("Diffuse. " + pp.getName() + " = " + pp.getValue());
        }
        //ExEnd: ThreeDProperties
	}

}
