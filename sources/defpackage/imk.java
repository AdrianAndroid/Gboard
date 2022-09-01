package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* renamed from: imk  reason: default package */
/* loaded from: classes.dex */
public final class imk {
    public final View a;
    public final int b;
    public final int c;
    public final int d;
    public final Rect e;

    public imk(View view, int i, int i2, int i3) {
        Rect rect = new Rect();
        this.e = rect;
        this.a = view;
        this.b = i2;
        this.c = i3;
        this.d = i;
        jdy.j(view, rect);
    }
}
