package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: odn  reason: default package */
/* loaded from: classes2.dex */
public final class odn implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ oea b;
    final /* synthetic */ Future c;
    final /* synthetic */ Future d;
    final /* synthetic */ oec e;

    public odn(oec oecVar, Collection collection, oea oeaVar, Future future, Future future2) {
        this.e = oecVar;
        this.a = collection;
        this.b = oeaVar;
        this.c = future;
        this.d = future2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nvu nvuVar;
        for (oea oeaVar : this.a) {
            if (oeaVar != this.b) {
                oeaVar.a.c(oec.c);
            }
        }
        Future future = this.c;
        if (future != null) {
            future.cancel(false);
        }
        Future future2 = this.d;
        if (future2 != null) {
            future2.cancel(false);
        }
        oec oecVar = this.e;
        ocd ocdVar = ((oce) oecVar.D.a).y;
        synchronized (ocdVar.a) {
            ocdVar.b.remove(oecVar);
            if (ocdVar.b.isEmpty()) {
                nvuVar = ocdVar.c;
                ocdVar.b = new HashSet();
            } else {
                nvuVar = null;
            }
        }
        if (nvuVar != null) {
            ocdVar.d.x.j(nvuVar);
        }
    }
}
