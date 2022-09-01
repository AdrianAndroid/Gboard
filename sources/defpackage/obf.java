package defpackage;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: obf */
/* loaded from: classes2.dex */
public final class obf implements ntl, ofn {
    public final obb a;
    public final ScheduledExecutorService b;
    public final ntj c;
    public final nsc d;
    public final nvz e;
    public final obc f;
    public volatile List g;
    public ocq i;
    public nzf l;
    public volatile ocq m;
    public nvu o;
    public oac p;
    public oqv q;
    public oqv r;
    private final ntm s;
    private final String t;
    private final String u;
    private final nyz v;
    private final nyi w;
    public final Collection j = new ArrayList();
    public final oat k = new oax(this);
    public volatile nsm n = nsm.a(nsl.IDLE);
    public final lga h = lga.b();

    public obf(List list, String str, String str2, nyz nyzVar, ScheduledExecutorService scheduledExecutorService, nvz nvzVar, obb obbVar, ntj ntjVar, nyi nyiVar, ntm ntmVar, nsc nscVar) {
        jdg.w(!list.isEmpty(), "addressGroups is empty");
        b(list, "addressGroups contains null entry");
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.g = unmodifiableList;
        this.f = new obc(unmodifiableList);
        this.t = str;
        this.u = str2;
        this.v = nyzVar;
        this.b = scheduledExecutorService;
        this.e = nvzVar;
        this.a = obbVar;
        this.c = ntjVar;
        this.w = nyiVar;
        this.s = ntmVar;
        this.d = nscVar;
    }

    public static void b(List list, String str) {
        for (Object obj : list) {
            jdg.Q(obj, str);
        }
    }

    public static final String k(nvu nvuVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(nvuVar.o);
        if (nvuVar.p != null) {
            sb.append("(");
            sb.append(nvuVar.p);
            sb.append(")");
        }
        if (nvuVar.q != null) {
            sb.append("[");
            sb.append(nvuVar.q);
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // defpackage.ofn
    public final nyx a() {
        ocq ocqVar = this.m;
        if (ocqVar != null) {
            return ocqVar;
        }
        this.e.execute(new nzp(this, 11));
        return null;
    }

    @Override // defpackage.ntr
    public final ntm c() {
        return this.s;
    }

    public final void d(nsl nslVar) {
        this.e.c();
        e(nsm.a(nslVar));
    }

    public final void e(nsm nsmVar) {
        this.e.c();
        if (this.n.a != nsmVar.a) {
            boolean z = false;
            boolean z2 = this.n.a != nsl.SHUTDOWN;
            new StringBuilder("Cannot transition out of SHUTDOWN to ").append(nsmVar);
            jdg.G(z2, "Cannot transition out of SHUTDOWN to ".concat(nsmVar.toString()));
            this.n = nsmVar;
            obb obbVar = this.a;
            if (obbVar.a != null) {
                z = true;
            }
            jdg.G(z, "listener is null");
            obbVar.a.a(nsmVar);
            nsl nslVar = nsmVar.a;
            if (nslVar != nsl.TRANSIENT_FAILURE && nslVar != nsl.IDLE) {
                return;
            }
            obw obwVar = obbVar.b.b;
            boolean z3 = obwVar.c;
            if (obwVar.b) {
                return;
            }
            oce.a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$SubchannelImpl$1ManagedInternalSubchannelCallback", "onStateChange", "LoadBalancer should call Helper.refreshNameResolution() to refresh name resolution if subchannel state becomes TRANSIENT_FAILURE or IDLE. This will no longer happen automatically in the future releases");
            obbVar.b.j.k();
            obbVar.b.b.b = true;
        }
    }

    public final void f() {
        this.e.execute(new nzp(this, 13));
    }

    public final void g(nzf nzfVar, boolean z) {
        this.e.execute(new cah(this, nzfVar, z, 4));
    }

    public final void h(nvu nvuVar) {
        this.e.execute(new nzm(this, nvuVar, 10));
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.lang.Object] */
    public final void i() {
        nte nteVar;
        this.e.c();
        jdg.G(this.q == null, "Should have no reconnectTask scheduled");
        obc obcVar = this.f;
        if (obcVar.a == 0 && obcVar.b == 0) {
            lga lgaVar = this.h;
            lgaVar.d();
            lgaVar.e();
        }
        SocketAddress a = this.f.a();
        if (a instanceof nte) {
            nte nteVar2 = (nte) a;
            nteVar = nteVar2;
            a = nteVar2.b;
        } else {
            nteVar = null;
        }
        obc obcVar2 = this.f;
        nry nryVar = ((nsz) obcVar2.c.get(obcVar2.a)).c;
        String str = (String) nryVar.c(nsz.a);
        nyy nyyVar = new nyy();
        if (str == null) {
            str = this.t;
        }
        jdg.Q(str, "authority");
        nyyVar.a = str;
        nyyVar.b = nryVar;
        nyyVar.c = this.u;
        nyyVar.d = nteVar;
        obe obeVar = new obe();
        obeVar.a = this.s;
        oba obaVar = new oba(this.v.a(a, nyyVar, obeVar), this.w);
        obeVar.a = obaVar.c();
        ntj.b(this.c.f, obaVar);
        this.l = obaVar;
        this.j.add(obaVar);
        Runnable d = obaVar.d(new obd(this, obaVar));
        if (d != null) {
            this.e.b(d);
        }
        this.d.b(2, "Started transport {0}", obeVar.a);
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.g("logId", this.s.a);
        S.b("addressGroups", this.g);
        return S.toString();
    }
}
