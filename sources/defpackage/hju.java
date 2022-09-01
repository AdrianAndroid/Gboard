package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: hju  reason: default package */
/* loaded from: classes.dex */
public final class hju {
    public static final bet a = new hjt();

    public static void a(bfh bfhVar, int i) {
        View view;
        if (bfhVar instanceof bfb) {
            view = ((bfb) bfhVar).a;
        } else if (!(bfhVar instanceof bfd)) {
            throw new IllegalStateException("Unsupported target type: ".concat(String.valueOf(String.valueOf(bfhVar))));
        } else {
            view = ((bfd) bfhVar).a;
        }
        view.setVisibility(i);
    }
}
