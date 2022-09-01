package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: bxb  reason: default package */
/* loaded from: classes.dex */
public final class bxb {
    public final Executor b;
    public final hqi a = new bxa(this);
    public final AtomicReference c = new AtomicReference(null);
    public int d = 1;
    private hpy e = null;

    public bxb(Executor executor) {
        this.b = executor;
    }

    public final void a(int i, hpy hpyVar) {
        hpy hpyVar2 = this.e;
        this.d = i;
        if (i != 6 && i != 7) {
            this.e = hpyVar;
        }
        opu opuVar = (opu) this.c.get();
        if (opuVar != null) {
            Object obj = opuVar.a;
            int i2 = i - 1;
            if (i2 != 5 && i2 != 6) {
                if (hpyVar == null) {
                    hpyVar = hpy.a;
                }
                ((bwz) obj).c = hpyVar;
                return;
            }
            if (hpyVar2 == null) {
                hpyVar2 = hpy.a;
            }
            ((bwz) obj).c = hpyVar2;
        }
    }
}
