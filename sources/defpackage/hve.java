package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* renamed from: hve  reason: default package */
/* loaded from: classes.dex */
public final class hve {
    public static final /* synthetic */ int a = 0;
    private static final lug b = hin.a;
    private static final hvf c = new hvb();

    public static hvf a(Context context) {
        hvf hvfVar = c;
        if (jdg.Z(Build.MANUFACTURER, "oppo")) {
            try {
                Class<?> cls = Class.forName("android.view.OppoFreeformManager");
                return new hwk(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), cls.getMethod("isInFreeformMode", new Class[0]), cls.getMethod("getFreeformStackBounds", Rect.class));
            } catch (ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException e) {
                ((luc) ((luc) ((luc) b.b()).i(e)).k("com/google/android/libraries/inputmethod/keyboardmode/FreeformModeManagerFactory", "getFreeformModeManager", (char) 139, "FreeformModeManagerFactory.java")).t("IFreeformModeManager could not be created.");
                return hvfVar;
            }
        } else if (!jdg.Z(Build.MANUFACTURER, "xiaomi")) {
            return hvfVar;
        } else {
            hvd hvdVar = new hvd(context);
            ContentResolver contentResolver = hvdVar.a.getContentResolver();
            hvdVar.b = hvdVar.d("gb_boosting");
            hvdVar.c = hvdVar.d("quick_reply");
            hvdVar.e(contentResolver, "gb_boosting");
            hvdVar.e(contentResolver, "quick_reply");
            return hvdVar;
        }
    }
}
