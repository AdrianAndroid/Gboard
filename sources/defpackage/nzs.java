package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: nzs  reason: default package */
/* loaded from: classes2.dex */
public final class nzs implements nyw {
    public final nyw a;
    public volatile boolean b;
    public List c = new ArrayList();

    public nzs(nyw nywVar) {
        this.a = nywVar;
    }

    private final void b(Runnable runnable) {
        synchronized (this) {
            if (!this.b) {
                this.c.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // defpackage.nyw
    public final void a(nvu nvuVar, nyv nyvVar, num numVar) {
        b(new bvr(this, nvuVar, nyvVar, numVar, 4));
    }

    @Override // defpackage.nyw
    public final void c(num numVar) {
        b(new nzm(this, numVar, 8));
    }

    @Override // defpackage.ofj
    public final void d(ofi ofiVar) {
        if (this.b) {
            this.a.d(ofiVar);
        } else {
            b(new nzm(this, ofiVar, 7));
        }
    }

    @Override // defpackage.ofj
    public final void e() {
        if (this.b) {
            this.a.e();
        } else {
            b(new nzp(this, 8));
        }
    }
}
