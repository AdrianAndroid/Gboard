package defpackage;

import android.view.View;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: dfj  reason: default package */
/* loaded from: classes.dex */
public final class dfj {
    public final deb a;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public final List e = new ArrayList();
    public final List f = new ArrayList();
    public final deh g = new deh();

    public dfj(deb debVar) {
        this.a = debVar;
        d();
    }

    public final int a() {
        return this.f.size() - 1;
    }

    public final int b(int i) {
        return ((Integer) this.f.get(i)).intValue();
    }

    public final int c(int i) {
        return ((Integer) this.f.get(i + 1)).intValue() - ((Integer) this.f.get(i)).intValue();
    }

    public final void d() {
        this.d = 0;
        this.e.clear();
        this.f.clear();
        this.f.add(0);
        for (View view : this.g.a) {
            this.a.k((SoftKeyView) view);
        }
    }

    public final void e() {
        this.g.a(true);
        for (View view : this.g.a) {
            this.e.add(Integer.valueOf(view.getLayoutParams().width));
            this.a.k((SoftKeyView) view);
        }
        this.g.b(this.b, this.c, 0);
        this.f.add(Integer.valueOf(this.e.size()));
    }
}
