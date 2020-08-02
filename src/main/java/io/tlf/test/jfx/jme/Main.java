package io.tlf.test.jfx.jme;

import com.jme3.util.LWJGLBufferAllocator;
import javafx.application.Application;
import org.lwjgl.system.Configuration;

public final class Main {
    private Main() {

    }

    public static void main(String[] args) {
        // some general settings for JFX for maximum compatibility

        Configuration.GLFW_CHECK_THREAD0.set(false); // need to disable to work on macos
        Configuration.MEMORY_ALLOCATOR.set("jemalloc"); // use jemalloc
        System.setProperty("prism.lcdtext", "false"); // JavaFx

        System.setProperty(LWJGLBufferAllocator.PROPERTY_CONCURRENT_BUFFER_ALLOCATOR, "true");

        Application.launch(JfxApp.class, args);
    }
}
