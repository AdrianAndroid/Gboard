package defpackage;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* compiled from: PG */
/* renamed from: aaq  reason: default package */
/* loaded from: classes.dex */
final class aaq {
    public static Field a;
    public static Field b;
    public static Field c;
    public static boolean d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            c = declaredField3;
            declaredField3.setAccessible(true);
            d = true;
        } catch (ReflectiveOperationException e) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo ".concat(String.valueOf(e.getMessage())), e);
        }
    }
}
