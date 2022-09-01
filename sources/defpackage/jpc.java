package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: jpc  reason: default package */
/* loaded from: classes.dex */
public final class jpc extends jqj {
    public final llp a;
    public final boolean b;
    public final byte[] c;
    private volatile transient llp e;
    private volatile transient String f;

    public jpc(llp llpVar, boolean z, byte[] bArr) {
        if (llpVar != null) {
            this.a = llpVar;
            this.b = z;
            this.c = bArr;
            return;
        }
        throw new NullPointerException("Null slices");
    }

    @Override // defpackage.jqj
    public final llp a() {
        return this.a;
    }

    @Override // defpackage.jqj
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.jqj
    public final byte[] c() {
        return this.c;
    }

    @Override // defpackage.jqj
    public final llp d() {
        llp g;
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    if (!this.a.isEmpty()) {
                        llk f = llp.f(((lrl) this.a).c);
                        llp llpVar = this.a;
                        int i = ((lrl) llpVar).c;
                        for (int i2 = 0; i2 < i; i2++) {
                            f.h(((jug) llpVar.get(i2)).f());
                        }
                        g = f.g();
                    } else {
                        g = llp.q();
                    }
                    this.e = g;
                    if (this.e == null) {
                        throw new NullPointerException("packManifests() cannot return null");
                    }
                }
            }
        }
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jqj) {
            jqj jqjVar = (jqj) obj;
            if (lre.I(this.a, jqjVar.a()) && this.b == jqjVar.b()) {
                if (Arrays.equals(this.c, jqjVar instanceof jpc ? ((jpc) jqjVar).c : jqjVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ Arrays.hashCode(this.c);
    }

    @Override // defpackage.jqj
    public final String toString() {
        if (this.f == null) {
            synchronized (this) {
                if (this.f == null) {
                    lfa T = jdg.T("");
                    T.b("slices", this.a);
                    T.h("last batch", this.b);
                    T.h("sync metadata", this.c != null);
                    this.f = T.toString();
                    if (this.f == null) {
                        throw new NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.f;
    }
}
