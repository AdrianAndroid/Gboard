package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: me  reason: default package */
/* loaded from: classes.dex */
public final class me {
    public final ArrayList a;
    public final List d;
    public final /* synthetic */ RecyclerView g;
    public knf h;
    public ArrayList b = null;
    public final ArrayList c = new ArrayList();
    public int e = 2;
    int f = 2;

    public me(RecyclerView recyclerView) {
        this.g = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.d = Collections.unmodifiableList(arrayList);
    }

    public final int a(int i) {
        if (i < 0 || i >= this.g.J.a()) {
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + this.g.J.a() + this.g.m());
        }
        RecyclerView recyclerView = this.g;
        return !recyclerView.J.g ? i : recyclerView.g.a(i);
    }

    public final View b(int i) {
        return p(i, Long.MAX_VALUE).a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(mo moVar, boolean z) {
        RecyclerView.u(moVar);
        View view = moVar.a;
        mq mqVar = this.g.N;
        if (mqVar != null) {
            yd j = mqVar.j();
            aad.M(view, j instanceof mp ? (yd) ((mp) j).b.remove(view) : null);
        }
        if (z) {
            int size = this.g.n.size();
            for (int i = 0; i < size; i++) {
                ((mf) this.g.n.get(i)).a();
            }
            ls lsVar = this.g.l;
            if (lsVar != null) {
                lsVar.t(moVar);
            }
            RecyclerView recyclerView = this.g;
            if (recyclerView.J != null) {
                recyclerView.Q.t(moVar);
            }
        }
        moVar.r = null;
        moVar.q = null;
        knf q = q();
        int i2 = moVar.f;
        ArrayList arrayList = q.h(i2).a;
        if (((md) ((SparseArray) q.b).get(i2)).b <= arrayList.size()) {
            uq.d(moVar.a);
            return;
        }
        moVar.l();
        arrayList.add(moVar);
    }

    public final void d() {
        this.a.clear();
        i();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set, java.lang.Object] */
    public final void e() {
        RecyclerView recyclerView;
        ls lsVar;
        knf knfVar = this.h;
        if (knfVar == null || (lsVar = (recyclerView = this.g).l) == null || !recyclerView.p) {
            return;
        }
        knfVar.c.add(lsVar);
    }

    public final void f(ls lsVar) {
        g(lsVar, false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Set, java.lang.Object] */
    public final void g(ls lsVar, boolean z) {
        knf knfVar = this.h;
        if (knfVar != null) {
            knfVar.c.remove(lsVar);
            if (knfVar.c.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < ((SparseArray) knfVar.b).size(); i++) {
                SparseArray sparseArray = (SparseArray) knfVar.b;
                ArrayList arrayList = ((md) sparseArray.get(sparseArray.keyAt(i))).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    uq.d(((mo) arrayList.get(i2)).a);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(View view) {
        mo j = RecyclerView.j(view);
        j.m = null;
        j.n = false;
        j.i();
        l(j);
    }

    public final void i() {
        int size = this.c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j(size);
        }
        this.c.clear();
        if (RecyclerView.b) {
            this.g.I.b();
        }
    }

    public final void j(int i) {
        c((mo) this.c.get(i), true);
        this.c.remove(i);
    }

    public final void k(View view) {
        mo j = RecyclerView.j(view);
        if (j.x()) {
            this.g.removeDetachedView(view, false);
        }
        if (j.w()) {
            j.p();
        } else if (j.B()) {
            j.i();
        }
        l(j);
        if (this.g.B == null || j.u()) {
            return;
        }
        this.g.B.e(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(mo moVar) {
        boolean z;
        boolean z2 = true;
        boolean z3 = false;
        if (moVar.w() || moVar.a.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(moVar.w());
            sb.append(" isAttached:");
            if (moVar.a.getParent() == null) {
                z2 = false;
            }
            sb.append(z2);
            sb.append(this.g.m());
            throw new IllegalArgumentException(sb.toString());
        } else if (moVar.x()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + moVar + this.g.m());
        } else if (!moVar.A()) {
            boolean z4 = (moVar.j & 16) == 0 && aad.af(moVar.a);
            if (moVar.u()) {
                if (this.f <= 0 || moVar.q(526)) {
                    z = false;
                } else {
                    int size = this.c.size();
                    if (size >= this.f && size > 0) {
                        j(0);
                        size--;
                    }
                    if (RecyclerView.b && size > 0 && !this.g.I.d(moVar.c)) {
                        do {
                            size--;
                            if (size < 0) {
                                break;
                            }
                        } while (this.g.I.d(((mo) this.c.get(size)).c));
                        size++;
                    }
                    this.c.add(size, moVar);
                    z = true;
                }
                if (!z) {
                    c(moVar, true);
                    z3 = z;
                    this.g.Q.t(moVar);
                    if (z3 || z2 || !z4) {
                        return;
                    }
                    uq.d(moVar.a);
                    moVar.r = null;
                    moVar.q = null;
                    return;
                }
                z3 = z;
            }
            z2 = false;
            this.g.Q.t(moVar);
            if (z3) {
            }
        } else {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(this.g.m()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(View view) {
        mo j = RecyclerView.j(view);
        if (j.q(12) || !j.y() || this.g.B == null || !j.d().isEmpty() || j.t()) {
            if (j.t() && !j.v()) {
                RecyclerView recyclerView = this.g;
                if (!recyclerView.l.b) {
                    throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.m()));
                }
            }
            j.o(this, false);
            this.a.add(j);
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        j.o(this, true);
        this.b.add(j);
    }

    public final void n(mo moVar) {
        if (moVar.n) {
            this.b.remove(moVar);
        } else {
            this.a.remove(moVar);
        }
        moVar.m = null;
        moVar.n = false;
        moVar.i();
    }

    public final void o() {
        ly lyVar = this.g.m;
        this.f = this.e + (lyVar != null ? lyVar.y : 0);
        int size = this.c.size();
        while (true) {
            size--;
            if (size < 0 || this.c.size() <= this.f) {
                return;
            }
            j(size);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0443, code lost:
        if ((r9 + r6) >= r20) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c2, code lost:
        if (r18.g.J.g == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01fc, code lost:
        if (r8.e != r9.hf(r8.c)) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0504 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.mo p(int r19, long r20) {
        /*
            Method dump skipped, instructions count: 1345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me.p(int, long):mo");
    }

    public final knf q() {
        if (this.h == null) {
            this.h = new knf((byte[]) null, (byte[]) null);
            e();
        }
        return this.h;
    }
}
