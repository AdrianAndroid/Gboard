package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: amh  reason: default package */
/* loaded from: classes.dex */
public final class amh implements Runnable {
    private final int a;
    private final /* synthetic */ int b;
    private final Object c;

    public amh(int i, RecyclerView recyclerView, int i2) {
        this.b = i2;
        this.a = i;
        this.c = recyclerView;
    }

    public amh(Collection collection, int i, int i2) {
        this.b = i2;
        nq.h(collection, "initCallbacks cannot be null");
        this.c = new ArrayList(collection);
        this.a = i;
    }

    public amh(deb debVar, int i, int i2) {
        this.b = i2;
        this.c = new WeakReference(debVar);
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2 = this.b;
        if (i2 == 0) {
            ((RecyclerView) this.c).ae(this.a);
        } else if (i2 == 1) {
            int size = this.c.size();
            int i3 = 0;
            if (this.a != 1) {
                while (i3 < size) {
                    ((us) this.c.get(i3)).e();
                    i3++;
                }
                return;
            }
            while (i3 < size) {
                ((us) this.c.get(i3)).d();
                i3++;
            }
        } else {
            deb debVar = (deb) ((WeakReference) this.c).get();
            if (debVar == null) {
                return;
            }
            SoftKeyView f = debVar.f();
            ico icoVar = debVar.a;
            icoVar.v();
            icoVar.n = debVar.c.m;
            f.n(debVar.a.c());
            if (!debVar.d.b(f) || this.a - 1 <= 0) {
                return;
            }
            debVar.j(i);
        }
    }
}
