package defpackage;

import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: obx  reason: default package */
/* loaded from: classes2.dex */
public final class obx implements Runnable {
    final /* synthetic */ nuv a;
    final /* synthetic */ nuu b;

    public obx(nuu nuuVar, nuv nuvVar) {
        this.b = nuuVar;
        this.a = nuvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nvu nvuVar;
        Object obj;
        nuu nuuVar = this.b;
        oce oceVar = (oce) nuuVar.c;
        if (oceVar.q != nuuVar.b) {
            return;
        }
        nuv nuvVar = this.a;
        List list = nuvVar.a;
        oceVar.F.b(1, "Resolved address: {0}, config={1}", list, nuvVar.b);
        oce oceVar2 = (oce) this.b.c;
        if (oceVar2.P != 2) {
            oceVar2.F.b(2, "Address resolved: {0}", list);
            ((oce) this.b.c).P = 2;
        }
        ((oce) this.b.c).Q = null;
        nuv nuvVar2 = this.a;
        nus nusVar = nuvVar2.c;
        ntk ntkVar = (ntk) nuvVar2.b.c(ntk.a);
        oco ocoVar = (nusVar == null || (obj = nusVar.b) == null) ? null : (oco) obj;
        nvu nvuVar2 = nusVar != null ? nusVar.a : null;
        oce oceVar3 = (oce) this.b.c;
        if (!oceVar3.K) {
            if (ocoVar != null) {
                oceVar3.F.a(2, "Service config from name resolver discarded by channel settings");
            }
            Object obj2 = this.b.c;
            ocoVar = oce.e;
            if (ntkVar != null) {
                ((oce) obj2).F.a(2, "Config selector from name resolver discarded by channel settings");
            }
            ((oce) this.b.c).H.d(ocoVar.a());
        } else {
            if (ocoVar != null) {
                if (ntkVar != null) {
                    oceVar3.H.d(ntkVar);
                    if (ocoVar.a() != null) {
                        ((oce) this.b.c).F.a(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                    }
                } else {
                    oceVar3.H.d(ocoVar.a());
                }
            } else if (nvuVar2 == null) {
                ocoVar = oce.e;
                oceVar3.H.d(null);
            } else if (!oceVar3.J) {
                oceVar3.F.a(2, "Fallback to error due to invalid first service config without default config");
                this.b.b(nusVar.a);
                return;
            } else {
                ocoVar = oceVar3.I;
            }
            if (!ocoVar.equals(((oce) this.b.c).I)) {
                nsc nscVar = ((oce) this.b.c).F;
                Object[] objArr = new Object[1];
                objArr[0] = ocoVar == oce.e ? " to empty" : "";
                nscVar.b(2, "Service config changed{0}", objArr);
                ((oce) this.b.c).I = ocoVar;
            }
            try {
                ((oce) this.b.c).J = true;
            } catch (RuntimeException e) {
                Logger logger = oce.a;
                Level level = Level.WARNING;
                logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener$1NamesResolved", "run", "[" + ((oce) this.b.c).h + "] Unexpected exception from parsing service config", (Throwable) e);
            }
        }
        nry nryVar = this.a.b;
        nuu nuuVar2 = this.b;
        if (nuuVar2.a != ((oce) nuuVar2.c).r) {
            return;
        }
        nrw b = nryVar.b();
        nrx nrxVar = ntk.a;
        if (((nry) b.a).b.containsKey(nrxVar)) {
            IdentityHashMap identityHashMap = new IdentityHashMap(((nry) b.a).b);
            identityHashMap.remove(nrxVar);
            b.a = new nry(identityHashMap);
        }
        Object obj3 = b.b;
        if (obj3 != null) {
            ((IdentityHashMap) obj3).remove(nrxVar);
        }
        Map map = ocoVar.c;
        if (map != null) {
            b.b(nuc.a, map);
            b.a();
        }
        nya nyaVar = ((obw) this.b.a).a;
        nty o = nxo.o(list, b.a(), ocoVar.b);
        List list2 = o.a;
        nry nryVar2 = o.b;
        ofa ofaVar = (ofa) o.c;
        if (ofaVar == null) {
            try {
                oqv oqvVar = nyaVar.d;
                Object obj4 = oqvVar.b;
                nud a = ((nue) oqvVar.a).a((String) obj4);
                if (a == null) {
                    throw new nye("Trying to load '" + ((String) obj4) + "' because using default policy, but it's unavailable");
                }
                ofaVar = new ofa(a, null);
            } catch (nye e2) {
                nyaVar.a.d(nsl.TRANSIENT_FAILURE, new nyc(nvu.k.f(e2.getMessage())));
                nyaVar.b.c();
                nyaVar.c = null;
                nyaVar.b = new nyd();
                nvuVar = nvu.b;
            }
        }
        nud nudVar = nyaVar.c;
        if (nudVar == null || !ofaVar.a.b().equals(nudVar.b())) {
            nyaVar.a.d(nsl.CONNECTING, new nyb());
            nyaVar.b.c();
            nyaVar.c = ofaVar.a;
            nuc nucVar = nyaVar.b;
            nyaVar.b = nyaVar.c.a(nyaVar.a);
            nyaVar.a.a().b(2, "Load balancer changed from {0} to {1}", nucVar.getClass().getSimpleName(), nyaVar.b.getClass().getSimpleName());
        }
        Object obj5 = ofaVar.b;
        if (obj5 != null) {
            nyaVar.a.a().b(1, "Load-balancing config: {0}", obj5);
        }
        nuc nucVar2 = nyaVar.b;
        if (!o.a.isEmpty()) {
            nucVar2.b(nxo.o(o.a, nryVar2, obj5));
            nvuVar = nvu.b;
        } else {
            nvu nvuVar3 = nvu.l;
            nvuVar = nvuVar3.f("NameResolver returned no usable address. addrs=" + list2 + ", attrs=" + nryVar2);
        }
        if (nvuVar.k()) {
            return;
        }
        nuu nuuVar3 = this.b;
        StringBuilder sb = new StringBuilder();
        Object obj6 = this.b.b;
        sb.append(obj6);
        nuuVar3.a(nvuVar.b(obj6.toString().concat(" was used")));
    }
}
