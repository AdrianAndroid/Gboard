package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: lz  reason: default package */
/* loaded from: classes.dex */
public class lz extends ViewGroup.MarginLayoutParams {
    public mo c;
    public final Rect d = new Rect();
    public boolean e = true;
    boolean f = false;

    public lz(int i, int i2) {
        super(i, i2);
    }

    public final int a() {
        return this.c.c();
    }

    public final boolean b() {
        return this.c.y();
    }

    public final boolean c() {
        return this.c.v();
    }

    public lz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public lz(lz lzVar) {
        super((ViewGroup.LayoutParams) lzVar);
    }

    public lz(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public lz(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}
