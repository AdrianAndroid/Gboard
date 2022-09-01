package defpackage;

import android.os.Build;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aba  reason: default package */
/* loaded from: classes.dex */
public class aba {
    static final abc d;
    final abc e;

    static {
        aau aarVar;
        if (Build.VERSION.SDK_INT >= 30) {
            aarVar = new aat();
        } else if (Build.VERSION.SDK_INT >= 29) {
            aarVar = new aas();
        } else {
            aarVar = new aar();
        }
        d = aarVar.a().i().j().k();
    }

    public aba(abc abcVar) {
        this.e = abcVar;
    }

    public vq a(int i) {
        return vq.a;
    }

    public vq c() {
        return vq.a;
    }

    public abc d(int i, int i2, int i3, int i4) {
        return d;
    }

    public void e(View view) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aba)) {
            return false;
        }
        aba abaVar = (aba) obj;
        return i() == abaVar.i() && n() == abaVar.n() && xu.b(c(), abaVar.c()) && xu.b(j(), abaVar.j()) && xu.b(o(), abaVar.o());
    }

    public void f(vq[] vqVarArr) {
    }

    public void h(abc abcVar) {
    }

    public int hashCode() {
        return xu.a(Boolean.valueOf(i()), Boolean.valueOf(n()), c(), j(), o());
    }

    public boolean i() {
        return false;
    }

    public vq j() {
        return vq.a;
    }

    public abc k() {
        return this.e;
    }

    public abc l() {
        return this.e;
    }

    public void m(vq vqVar) {
    }

    public boolean n() {
        return false;
    }

    public yn o() {
        return null;
    }

    public abc p() {
        return this.e;
    }

    public vq q() {
        return c();
    }

    public vq r() {
        return c();
    }

    public vq s() {
        return c();
    }
}
