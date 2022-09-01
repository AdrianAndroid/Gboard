package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: yo  reason: default package */
/* loaded from: classes2.dex */
public final class yo {
    public static void a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        Gravity.apply(i, i2, i3, rect, rect2, i4);
    }

    static void b(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
        Gravity.apply(i, i2, i3, rect, i4, i5, rect2, i6);
    }

    static void c(int i, Rect rect, Rect rect2, int i2) {
        Gravity.applyDisplay(i, rect, rect2, i2);
    }

    public static void d(Context context, bmf bmfVar, List list, bed bedVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bef befVar = (bef) it.next();
            try {
                befVar.e(context, bmfVar);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(String.valueOf(befVar.getClass().getName())), e);
            }
        }
        if (bedVar != null) {
            bedVar.e(context, bmfVar);
        }
    }
}
