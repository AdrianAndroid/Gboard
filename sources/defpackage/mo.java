package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: mo  reason: default package */
/* loaded from: classes2.dex */
public class mo {
    private static final List s = Collections.emptyList();
    public final View a;
    public WeakReference b;
    int j;
    RecyclerView q;
    ls r;
    public int c = -1;
    public int d = -1;
    public long e = -1;
    public int f = -1;
    int g = -1;
    public mo h = null;
    public mo i = null;
    List k = null;
    List l = null;
    private int t = 0;
    me m = null;
    boolean n = false;
    public int o = 0;
    public int p = -1;

    public mo(View view) {
        if (view != null) {
            this.a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final boolean A() {
        return (this.j & 128) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean B() {
        return (this.j & 32) != 0;
    }

    public final LinearLayout C() {
        return (LinearLayout) this.a;
    }

    public final void D(List list, deb debVar, mhe mheVar) {
        C().removeAllViews();
        int i = 0;
        while (i < list.size()) {
            hln hlnVar = (hln) list.get(i);
            boolean z = i == list.size() + (-1);
            SoftKeyView g = debVar.g(i, hlnVar);
            g.o();
            debVar.l(g, false, z);
            C().addView(g, new LinearLayout.LayoutParams(mheVar.a(i), -1));
            i++;
        }
    }

    public void E(njs njsVar) {
    }

    public final int a() {
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.gx(this);
    }

    public final int b() {
        RecyclerView recyclerView;
        ls lsVar;
        int gx;
        if (this.r == null || (recyclerView = this.q) == null || (lsVar = recyclerView.l) == null || (gx = recyclerView.gx(this)) == -1 || this.r != lsVar) {
            return -1;
        }
        return gx;
    }

    public final int c() {
        int i = this.g;
        return i == -1 ? this.c : i;
    }

    public final List d() {
        if ((this.j & 1024) == 0) {
            List list = this.k;
            return (list == null || list.size() == 0) ? s : this.l;
        }
        return s;
    }

    public final void e(Object obj) {
        if (obj == null) {
            f(1024);
        } else if ((1024 & this.j) != 0) {
        } else {
            if (this.k == null) {
                ArrayList arrayList = new ArrayList();
                this.k = arrayList;
                this.l = Collections.unmodifiableList(arrayList);
            }
            this.k.add(obj);
        }
    }

    public final void f(int i) {
        this.j = i | this.j;
    }

    public final void g() {
        this.d = -1;
        this.g = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        List list = this.k;
        if (list != null) {
            list.clear();
        }
        this.j &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        this.j &= -33;
    }

    public final void j() {
        this.j &= -257;
    }

    public final void k(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        int i2 = this.g;
        if (i2 == -1) {
            i2 = this.c;
            this.g = i2;
        }
        if (z) {
            this.g = i2 + i;
        }
        this.c += i;
        if (this.a.getLayoutParams() != null) {
            ((lz) this.a.getLayoutParams()).e = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l() {
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.t = 0;
        this.h = null;
        this.i = null;
        h();
        this.o = 0;
        this.p = -1;
        RecyclerView.u(this);
    }

    public final void m(int i, int i2) {
        this.j = (i & i2) | (this.j & (i2 ^ (-1)));
    }

    public final void n(boolean z) {
        int i = this.t;
        int i2 = z ? i - 1 : i + 1;
        this.t = i2;
        if (i2 < 0) {
            this.t = 0;
            new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ").append(this);
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ".concat(toString()));
        } else if (!z && i2 == 1) {
            this.j |= 16;
        } else if (!z || i2 != 0) {
        } else {
            this.j &= -17;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(me meVar, boolean z) {
        this.m = meVar;
        this.n = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p() {
        this.m.n(this);
    }

    public final boolean q(int i) {
        return (i & this.j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r() {
        return (this.a.getParent() == null || this.a.getParent() == this.q) ? false : true;
    }

    public boolean s() {
        return (this.j & 1) != 0;
    }

    public final boolean t() {
        return (this.j & 4) != 0;
    }

    public final String toString() {
        String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
        StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
        if (w()) {
            sb.append(" scrap ");
            sb.append(true != this.n ? "[attachedScrap]" : "[changeScrap]");
        }
        if (t()) {
            sb.append(" invalid");
        }
        if (!s()) {
            sb.append(" unbound");
        }
        if (z()) {
            sb.append(" update");
        }
        if (v()) {
            sb.append(" removed");
        }
        if (A()) {
            sb.append(" ignored");
        }
        if (x()) {
            sb.append(" tmpDetached");
        }
        if (!u()) {
            sb.append(" not recyclable(" + this.t + ")");
        }
        if ((this.j & 512) != 0 || t()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean u() {
        return (this.j & 16) == 0 && !aad.af(this.a);
    }

    public final boolean v() {
        return (this.j & 8) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean w() {
        return this.m != null;
    }

    public final boolean x() {
        return (this.j & 256) != 0;
    }

    public final boolean y() {
        return (this.j & 2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean z() {
        return (this.j & 2) != 0;
    }
}
