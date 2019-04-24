package examples.render;

import com.aspose.threed.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import java.awt.*;
import java.io.IOException;

public class SwtRealtimeRendering extends RenderBase {

    public static void run() throws IOException, ParseException {
        //Initialize UI
        Display display = new Display();
        display.setData("org.eclipse.swt.internal.win32.useOwnDC", Boolean.TRUE);
        final Shell shell = new Shell(display);
        shell.setText("Aspose.3D Real-time rendering with SWT");
        shell.setSize(800, 600);
        //Initialize renderer and scene
        Renderer renderer = Renderer.createRenderer();
        IRenderWindow window = renderer.getRenderFactory().createRenderWindow(new RenderParameters(), shell.handle);
        Scene scene = new Scene();
        Camera camera = setupScene(scene);
        Viewport vp = window.createViewport(camera);
        vp.setBackgroundColor(Color.pink);

        Node light = (Node)scene.getRootNode().selectSingleObject("light");


        //Initialize events
        shell.addListener(SWT.Traverse, event -> {
            if(event.detail == SWT.TRAVERSE_ESCAPE) {
                shell.close();
                event.detail = SWT.TRAVERSE_NONE;
                event.doit = false;
            }
        });
        shell.addListener(SWT.Resize, event -> {
            Rectangle rect = new Rectangle();
            window.setSize(new Dimension(rect.width, rect.height));
        });

        //event loop
        shell.open();
        while(!shell.isDisposed()) {
            display.readAndDispatch();
            //update light's position before rendering
            double time = System.currentTimeMillis() / 1000.0;
            double x = Math.cos(time) * 10;
            double z = Math.sin(time) * 10;
            light.getTransform().setTranslation(x, 5, z);
            //render
            renderer.render(window);
        }
        //shut down
        renderer.close();
        display.dispose();
    }
}
