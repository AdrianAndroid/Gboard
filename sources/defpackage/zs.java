package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zs  reason: default package */
/* loaded from: classes2.dex */
public final class zs {
    static int a(View view) {
        return view.getScrollIndicators();
    }

    public static abc b(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        abc m = abc.m(rootWindowInsets);
        m.q(m);
        m.o(view.getRootView());
        return m;
    }

    static void c(View view, int i) {
        view.setScrollIndicators(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
