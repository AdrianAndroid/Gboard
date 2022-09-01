package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: ofg  reason: default package */
/* loaded from: classes2.dex */
public final class ofg {
    public static final ofg a = new ofg(new nxp[0], null, null, null);
    public final nxp[] b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public ofg(nxp[] nxpVarArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = nxpVarArr;
    }

    public static ofg m(List list) {
        if (list.isEmpty()) {
            return a;
        }
        int size = list.size();
        nxp[] nxpVarArr = new nxp[size];
        for (int i = 0; i < size; i++) {
            nxpVarArr[i] = ((nvn) list.get(i)).a();
        }
        return new ofg(nxpVarArr, null, null, null);
    }

    public static ofg n(nxp[] nxpVarArr) {
        ofg ofgVar = new ofg(nxpVarArr, null, null, null);
        for (nxp nxpVar : nxpVarArr) {
        }
        return ofgVar;
    }

    public final void a() {
        nxp[] nxpVarArr;
        for (nxp nxpVar : this.b) {
        }
    }

    public final void b() {
        nxp[] nxpVarArr;
        for (nxp nxpVar : this.b) {
        }
    }

    public final void c(long j) {
        for (nxp nxpVar : this.b) {
            nxpVar.a(j);
        }
    }

    public final void d(long j) {
        for (nxp nxpVar : this.b) {
            nxpVar.b(j);
        }
    }

    public final void e(nvu nvuVar) {
        if (this.c.compareAndSet(false, true)) {
            for (nxp nxpVar : this.b) {
                nxpVar.c(nvuVar);
            }
        }
    }

    public final void f() {
        nxp[] nxpVarArr;
        for (nxp nxpVar : this.b) {
        }
    }

    public final void g() {
        nxp[] nxpVarArr;
        for (nxp nxpVar : this.b) {
        }
    }

    public final void h() {
        nxp[] nxpVarArr;
        for (nxp nxpVar : this.b) {
        }
    }

    public final void i() {
        nxp[] nxpVarArr;
        for (nxp nxpVar : this.b) {
        }
    }

    public final void j() {
        nxp[] nxpVarArr;
        for (nxp nxpVar : this.b) {
        }
    }

    public final void k() {
        nxp[] nxpVarArr;
        for (nxp nxpVar : this.b) {
        }
    }

    public final void l() {
        nxp[] nxpVarArr;
        for (nxp nxpVar : this.b) {
        }
    }
}
