package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: nzn  reason: default package */
/* loaded from: classes2.dex */
public final class nzn extends nxp {
    public volatile boolean a;
    public List b = new ArrayList();
    public final nxp c;

    public nzn(nxp nxpVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = nxpVar;
    }

    private final void Y(Runnable runnable) {
        synchronized (this) {
            if (!this.a) {
                this.b.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // defpackage.nxp
    public final void e(num numVar) {
        if (this.a) {
            this.c.e(numVar);
        } else {
            Y(new nzm(this, numVar, 1));
        }
    }

    @Override // defpackage.nxp
    public final void f() {
        if (this.a) {
            this.c.f();
        } else {
            Y(new kvl(this, 20));
        }
    }

    @Override // defpackage.nxp
    public final void g(Object obj) {
        if (this.a) {
            this.c.g(obj);
        } else {
            Y(new nzm(this, obj, 0));
        }
    }

    @Override // defpackage.nxp
    public final void h(nvu nvuVar, num numVar) {
        Y(new kme(this, nvuVar, numVar, 6));
    }
}
