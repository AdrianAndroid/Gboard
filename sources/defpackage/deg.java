package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.List;

/* compiled from: PG */
/* renamed from: deg  reason: default package */
/* loaded from: classes.dex */
public final class deg extends LinearLayout {
    public final deh a = new deh();
    public final int b;
    public final deb c;
    public int d;
    public final int e;

    public deg(Context context, deb debVar, int i, int i2, int i3) {
        super(context);
        setOrientation(0);
        this.c = debVar;
        setBackgroundResource(jbt.j(context, i));
        this.b = i2;
        this.e = i3;
        setMinimumHeight(0);
    }

    public final SoftKeyView a(hln hlnVar, boolean z) {
        SoftKeyView g = this.c.g(getChildCount(), hlnVar);
        g.o();
        c(g, false, z);
        if (!this.a.c(g)) {
            this.a.a(true);
            List list = this.a.a;
            if (!list.isEmpty()) {
                SoftKeyView softKeyView = (SoftKeyView) list.get(list.size() - 1);
                c(softKeyView, false, true);
                softKeyView.setPadding(0, 0, 0, 0);
            }
            this.c.k(g);
            return null;
        }
        addView(g);
        return g;
    }

    public final void b(boolean z) {
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            c((SoftKeyView) getChildAt(i), z, i == childCount + (-1));
            i++;
        }
    }

    public final void c(SoftKeyView softKeyView, boolean z, boolean z2) {
        this.c.l(softKeyView, z, z2);
    }
}
