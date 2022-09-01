package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* renamed from: zn  reason: default package */
/* loaded from: classes2.dex */
final class zn {
    static Rect a(View view) {
        return view.getClipBounds();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    static boolean c(View view) {
        return view.isInLayout();
    }
}
