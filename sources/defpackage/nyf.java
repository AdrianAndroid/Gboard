package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: nyf  reason: default package */
/* loaded from: classes2.dex */
final class nyf extends oah {
    private final nzf a;
    private final AtomicInteger b = new AtomicInteger(-2147483647);
    private volatile nvu c;

    public nyf(nzf nzfVar, String str) {
        jdg.Q(nzfVar, "delegate");
        this.a = nzfVar;
        jdg.Q(str, "authority");
    }

    @Override // defpackage.oah
    protected final nzf a() {
        return this.a;
    }

    @Override // defpackage.oah, defpackage.ocq
    public final void j(nvu nvuVar) {
        jdg.Q(nvuVar, "status");
        synchronized (this) {
            if (this.b.get() < 0) {
                this.c = nvuVar;
                this.b.addAndGet(Integer.MAX_VALUE);
                if (this.b.get() != 0) {
                    return;
                }
                super.j(nvuVar);
            }
        }
    }

    @Override // defpackage.oah, defpackage.nyx
    public final nyu m(nuq nuqVar, num numVar, nsa nsaVar, nxp[] nxpVarArr) {
        if (this.b.get() >= 0) {
            return new oad(this.c, nxpVarArr, null, null, null);
        }
        return this.a.m(nuqVar, numVar, nsaVar, nxpVarArr);
    }
}
