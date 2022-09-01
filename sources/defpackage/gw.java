package defpackage;

import android.graphics.Point;
import android.view.Display;

/* compiled from: PG */
/* renamed from: gw  reason: default package */
/* loaded from: classes.dex */
public final class gw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Display display, Point point) {
        display.getRealSize(point);
    }

    public static final float b(add addVar) {
        return ((qg) addVar.a).b;
    }

    public static final float c(add addVar) {
        return ((qg) addVar.a).a;
    }

    public static final void d(add addVar) {
        if (!addVar.c()) {
            addVar.a(0, 0, 0, 0);
            return;
        }
        float b = b(addVar);
        float c = c(addVar);
        int ceil = (int) Math.ceil(qh.a(b, c, addVar.b()));
        int ceil2 = (int) Math.ceil(qh.b(b, c, addVar.b()));
        addVar.a(ceil, ceil2, ceil, ceil2);
    }
}
