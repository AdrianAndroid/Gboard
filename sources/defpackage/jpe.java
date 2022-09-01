package defpackage;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jpe  reason: default package */
/* loaded from: classes.dex */
public final class jpe extends jre {
    private final llp a;
    private final llp b;
    private final llp c;
    private final llp d;
    private final boolean e;
    private final boolean f;
    private final byte[] g;
    private volatile transient String h;

    public jpe(llp llpVar, llp llpVar2, llp llpVar3, llp llpVar4, boolean z, boolean z2, byte[] bArr) {
        if (llpVar != null) {
            this.a = llpVar;
            if (llpVar2 != null) {
                this.b = llpVar2;
                if (llpVar3 != null) {
                    this.c = llpVar3;
                    if (llpVar4 != null) {
                        this.d = llpVar4;
                        this.e = z;
                        this.f = z2;
                        this.g = bArr;
                        return;
                    }
                    throw new NullPointerException("Null removed");
                }
                throw new NullPointerException("Null added");
            }
            throw new NullPointerException("Null newSelection");
        }
        throw new NullPointerException("Null oldSelection");
    }

    @Override // defpackage.jre
    public final llp a() {
        return this.c;
    }

    @Override // defpackage.jre
    public final llp b() {
        return this.b;
    }

    @Override // defpackage.jre
    public final llp c() {
        return this.a;
    }

    @Override // defpackage.jre
    public final llp d() {
        return this.d;
    }

    @Override // defpackage.jre
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jre) {
            jre jreVar = (jre) obj;
            if (lre.I(this.a, jreVar.c()) && lre.I(this.b, jreVar.b()) && lre.I(this.c, jreVar.a()) && lre.I(this.d, jreVar.d()) && this.e == jreVar.e() && this.f == jreVar.f()) {
                if (Arrays.equals(this.g, jreVar instanceof jpe ? ((jpe) jreVar).g : jreVar.g())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jre
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.jre
    public final byte[] g() {
        return this.g;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        if (true == this.f) {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ Arrays.hashCode(this.g);
    }

    @Override // defpackage.jre
    public final String toString() {
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    lfa T = jdg.T("");
                    T.b("old", this.a);
                    T.b("new", this.b);
                    T.h("metadata", this.g != null);
                    T.h("last batch", this.f);
                    this.h = T.toString();
                    if (this.h == null) {
                        throw new NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.h;
    }
}
