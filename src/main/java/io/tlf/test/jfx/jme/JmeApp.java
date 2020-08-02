package io.tlf.test.jfx.jme;

import com.jayfella.jfx.embedded.SimpleJfxApplication;
import com.jayfella.jme.jfx.JavaFxUI;
import com.jme3.app.state.AppState;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import javafx.scene.control.Button;

public class JmeApp extends SimpleJfxApplication {
    public JmeApp(AppState... initialStates) {
        super(initialStates);
    }


    @Override
    public void initApp() {
        //Init jme stuff
        Box b = new Box(1, 1, 1);
        Geometry geom = new Geometry("Box", b);
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Blue);
        geom.setMaterial(mat);
        rootNode.attachChild(geom);

        //Init jfx stuff
        JavaFxUI.initialize(this);
        Button button = new Button("Click Me");
        JavaFxUI.getInstance().attachChild(button);
    }
}
