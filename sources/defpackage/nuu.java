package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: nuu  reason: default package */
/* loaded from: classes2.dex */
public final class nuu {
    public final Object a;
    public final Object b;
    public final /* synthetic */ Object c;

    public nuu() {
    }

    public nuu(kdr kdrVar, bev bevVar, awz awzVar, byte[] bArr, byte[] bArr2) {
        this.c = kdrVar;
        this.a = bevVar;
        this.b = awzVar;
    }

    public final void a(nvu nvuVar) {
        oce.a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{((oce) this.c).h, nvuVar});
        ocb ocbVar = ((oce) this.c).H;
        if (ocbVar.a.get() == oce.f) {
            ocbVar.d(null);
        }
        oce oceVar = (oce) this.c;
        if (oceVar.P != 3) {
            oceVar.F.b(3, "Failed to resolve name: {0}", nvuVar);
            ((oce) this.c).P = 3;
        }
        Object obj = this.a;
        if (obj != ((oce) this.c).r) {
            return;
        }
        ((obw) obj).a.b.a(nvuVar);
        oce oceVar2 = (oce) this.c;
        oqv oqvVar = oceVar2.S;
        if (oqvVar != null) {
            nvy nvyVar = (nvy) oqvVar.a;
            if (!nvyVar.c && !nvyVar.b) {
                return;
            }
        }
        if (oceVar2.Q == null) {
            oceVar2.Q = nxp.i();
        }
        long a = ((oce) this.c).Q.a();
        ((oce) this.c).F.b(1, "Scheduling DNS resolution backoff for {0} ns", Long.valueOf(a));
        oce oceVar3 = (oce) this.c;
        oceVar3.S = oceVar3.m.d(new obv(oceVar3, 1), a, TimeUnit.NANOSECONDS, ((oce) this.c).i.b());
    }

    public final void b(nvu nvuVar) {
        jdg.w(!nvuVar.k(), "the error status must not be OK");
        ((oce) this.c).m.execute(new nzm(this, nvuVar, 12));
    }

    public final void c(nuv nuvVar) {
        ((oce) this.c).m.execute(new obx(this, nuvVar));
    }

    public nuu(oce oceVar, obw obwVar, nux nuxVar) {
        this.c = oceVar;
        this.a = obwVar;
        jdg.Q(nuxVar, "resolver");
        this.b = nuxVar;
    }
}
