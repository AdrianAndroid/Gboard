package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: jr  reason: default package */
/* loaded from: classes.dex */
public final class jr {
    public final jq a = new jq();
    public final List b = new ArrayList();
    public final opu c;

    public jr(opu opuVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = opuVar;
    }

    public final int a() {
        return this.c.B() - this.b.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r4.a.f(r2) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(int r5) {
        /*
            r4 = this;
            r0 = -1
            if (r5 >= 0) goto L4
            return r0
        L4:
            opu r1 = r4.c
            int r1 = r1.B()
            r2 = r5
        Lb:
            if (r2 >= r1) goto L27
            jq r3 = r4.a
            int r3 = r3.a(r2)
            int r3 = r2 - r3
            int r3 = r5 - r3
            if (r3 != 0) goto L25
        L19:
            jq r5 = r4.a
            boolean r5 = r5.f(r2)
            if (r5 == 0) goto L24
            int r2 = r2 + 1
            goto L19
        L24:
            return r2
        L25:
            int r2 = r2 + r3
            goto Lb
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr.b(int):int");
    }

    public final int c() {
        return this.c.B();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(View view) {
        int C = this.c.C(view);
        if (C != -1 && !this.a.f(C)) {
            return C - this.a.a(C);
        }
        return -1;
    }

    public final View e(int i) {
        return this.c.D(b(i));
    }

    public final View f(int i) {
        return this.c.D(i);
    }

    public final void g(View view, int i, boolean z) {
        int b;
        if (i < 0) {
            b = this.c.B();
        } else {
            b = b(0);
        }
        this.a.c(b, z);
        if (z) {
            j(view);
        }
        opu opuVar = this.c;
        ((RecyclerView) opuVar.a).addView(view, b);
        Object obj = opuVar.a;
        mo j = RecyclerView.j(view);
        RecyclerView recyclerView = (RecyclerView) obj;
        ls lsVar = recyclerView.l;
        if (lsVar != null && j != null) {
            lsVar.r(j);
        }
        List list = recyclerView.u;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                ((ma) recyclerView.u.get(size)).a(view);
            }
        }
    }

    public final void h(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int b;
        if (i < 0) {
            b = this.c.B();
        } else {
            b = b(i);
        }
        this.a.c(b, z);
        if (z) {
            j(view);
        }
        opu opuVar = this.c;
        mo j = RecyclerView.j(view);
        if (j != null) {
            if (j.x() || j.A()) {
                j.j();
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + j + ((RecyclerView) opuVar.a).m());
            }
        }
        ((RecyclerView) opuVar.a).attachViewToParent(view, b, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(int i) {
        mo j;
        int b = b(i);
        this.a.g(b);
        opu opuVar = this.c;
        View D = opuVar.D(b);
        if (D != null && (j = RecyclerView.j(D)) != null) {
            if (!j.x() || j.A()) {
                j.f(256);
            } else {
                throw new IllegalArgumentException("called detach on an already detached child " + j + ((RecyclerView) opuVar.a).m());
            }
        }
        ((RecyclerView) opuVar.a).detachViewFromParent(b);
    }

    public final void j(View view) {
        this.b.add(view);
        opu opuVar = this.c;
        mo j = RecyclerView.j(view);
        if (j != null) {
            Object obj = opuVar.a;
            int i = j.p;
            if (i != -1) {
                j.o = i;
            } else {
                j.o = aad.d(j.a);
            }
            ((RecyclerView) obj).as(j, 4);
        }
    }

    public final boolean k(View view) {
        return this.b.contains(view);
    }

    public final void l(View view) {
        if (this.b.remove(view)) {
            this.c.E(view);
        }
    }

    public final String toString() {
        return this.a.toString() + ", hidden list:" + this.b.size();
    }
}
