package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* renamed from: abc  reason: default package */
/* loaded from: classes.dex */
public final class abc {
    public static final abc a;
    public final aba b;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            a = aaz.c;
        } else {
            a = aba.d;
        }
    }

    private abc(WindowInsets windowInsets) {
        this.b = Build.VERSION.SDK_INT >= 30 ? new aaz(this, windowInsets) : Build.VERSION.SDK_INT >= 29 ? new aay(this, windowInsets) : Build.VERSION.SDK_INT >= 28 ? new aax(this, windowInsets) : new aaw(this, windowInsets);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static vq h(vq vqVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, vqVar.b - i);
        int max2 = Math.max(0, vqVar.c - i2);
        int max3 = Math.max(0, vqVar.d - i3);
        int max4 = Math.max(0, vqVar.e - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? vqVar : vq.d(max, max2, max3, max4);
    }

    public static abc m(WindowInsets windowInsets) {
        return n(windowInsets, null);
    }

    public static abc n(WindowInsets windowInsets, View view) {
        nq.g(windowInsets);
        abc abcVar = new abc(windowInsets);
        if (view != null && aad.ag(view)) {
            abcVar.q(aad.x(view));
            abcVar.o(view.getRootView());
        }
        return abcVar;
    }

    @Deprecated
    public final int a() {
        return this.b.c().e;
    }

    @Deprecated
    public final int b() {
        return this.b.c().b;
    }

    @Deprecated
    public final int c() {
        return this.b.c().d;
    }

    @Deprecated
    public final int d() {
        return this.b.c().c;
    }

    public final WindowInsets e() {
        aba abaVar = this.b;
        if (abaVar instanceof aav) {
            return ((aav) abaVar).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abc) {
            return xu.b(this.b, ((abc) obj).b);
        }
        return false;
    }

    public final vq f(int i) {
        return this.b.a(i);
    }

    @Deprecated
    public final vq g() {
        return this.b.j();
    }

    public final int hashCode() {
        aba abaVar = this.b;
        if (abaVar == null) {
            return 0;
        }
        return abaVar.hashCode();
    }

    @Deprecated
    public final abc i() {
        return this.b.p();
    }

    @Deprecated
    public final abc j() {
        return this.b.k();
    }

    @Deprecated
    public final abc k() {
        return this.b.l();
    }

    public final abc l(int i, int i2, int i3, int i4) {
        return this.b.d(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(View view) {
        this.b.e(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(vq[] vqVarArr) {
        this.b.f(vqVarArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(abc abcVar) {
        this.b.h(abcVar);
    }

    public final boolean r() {
        return this.b.n();
    }

    public abc() {
        this.b = new aba(this);
    }
}
