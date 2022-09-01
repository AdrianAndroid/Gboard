package androidx.camera.core.processing;

import android.view.Surface;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OpenGlRenderer {
    static {
        System.loadLibrary("camerax_core_opengl_renderer_jni");
    }

    public OpenGlRenderer() {
        new AtomicBoolean(false);
        new ThreadLocal();
    }

    private static native void closeContext(long j);

    private static native List getShaderVariableNames();

    private static native int getTexName(long j);

    private static native long initContext(String str);

    private static native boolean renderTexture(long j, long j2, float[] fArr);

    private static native boolean setWindowSurface(long j, Surface surface);
}
