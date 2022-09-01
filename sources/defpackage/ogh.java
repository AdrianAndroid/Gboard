package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* renamed from: ogh  reason: default package */
/* loaded from: classes2.dex */
public final class ogh implements nzf, oft, ogq {
    private static final Map D;
    public static final Logger a = Logger.getLogger(ogh.class.getName());
    public final ofo B;
    final nte C;
    private final ntm E;
    private final oei G;
    private final ScheduledExecutorService H;
    private boolean J;
    private boolean K;
    public final InetSocketAddress b;
    public final String c;
    public final String d;
    public final ohr g;
    public ocp h;
    public ofu i;
    public ogr j;
    public final Object k;
    public final Executor m;
    public int n;
    public ogg o;
    public nry p;
    public nvu q;
    public oas r;
    public boolean s;
    public SSLSocketFactory u;
    public final ogu x;
    public obi y;
    public final Runnable z;
    public final Random e = new Random();
    public final Map l = new HashMap();
    public int v = 0;
    public final Deque w = new LinkedList();
    private final oat L = new ogd(this);
    private final int I = 4194304;
    public final int f = 65535;
    private int F = 3;
    public final SocketFactory t = SocketFactory.getDefault();
    public final int A = Integer.MAX_VALUE;

    static {
        EnumMap enumMap = new EnumMap(ohf.class);
        enumMap.put((EnumMap) ohf.NO_ERROR, (ohf) nvu.k.f("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) ohf.PROTOCOL_ERROR, (ohf) nvu.k.f("Protocol error"));
        enumMap.put((EnumMap) ohf.INTERNAL_ERROR, (ohf) nvu.k.f("Internal error"));
        enumMap.put((EnumMap) ohf.FLOW_CONTROL_ERROR, (ohf) nvu.k.f("Flow control error"));
        enumMap.put((EnumMap) ohf.STREAM_CLOSED, (ohf) nvu.k.f("Stream closed"));
        enumMap.put((EnumMap) ohf.FRAME_TOO_LARGE, (ohf) nvu.k.f("Frame too large"));
        enumMap.put((EnumMap) ohf.REFUSED_STREAM, (ohf) nvu.l.f("Refused stream"));
        enumMap.put((EnumMap) ohf.CANCEL, (ohf) nvu.c.f("Cancelled"));
        enumMap.put((EnumMap) ohf.COMPRESSION_ERROR, (ohf) nvu.k.f("Compression error"));
        enumMap.put((EnumMap) ohf.CONNECT_ERROR, (ohf) nvu.k.f("Connect error"));
        enumMap.put((EnumMap) ohf.ENHANCE_YOUR_CALM, (ohf) nvu.i.f("Enhance your calm"));
        enumMap.put((EnumMap) ohf.INADEQUATE_SECURITY, (ohf) nvu.g.f("Inadequate security"));
        D = Collections.unmodifiableMap(enumMap);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [ofl, java.lang.Object] */
    public ogh(oga ogaVar, InetSocketAddress inetSocketAddress, String str, String str2, nry nryVar, lgb lgbVar, ohr ohrVar, nte nteVar, Runnable runnable) {
        Object obj = new Object();
        this.k = obj;
        jdg.Q(inetSocketAddress, "address");
        this.b = inetSocketAddress;
        this.c = str;
        Executor executor = ogaVar.a;
        jdg.Q(executor, "executor");
        this.m = executor;
        this.G = new oei(ogaVar.a);
        ScheduledExecutorService scheduledExecutorService = ogaVar.b;
        jdg.Q(scheduledExecutorService, "scheduledExecutorService");
        this.H = scheduledExecutorService;
        this.u = ogaVar.c;
        ogu oguVar = ogaVar.d;
        jdg.Q(oguVar, "connectionSpec");
        this.x = oguVar;
        jdg.Q(lgbVar, "stopwatchFactory");
        this.g = ohrVar;
        this.d = oao.k(str2);
        this.C = nteVar;
        this.z = runnable;
        this.B = new ofo(ogaVar.e.a);
        this.E = ntm.a(getClass(), inetSocketAddress.toString());
        nrw a2 = nry.a();
        a2.b(oak.b, nryVar);
        this.p = a2.a();
        synchronized (obj) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static nvu b(ohf ohfVar) {
        nvu nvuVar = (nvu) D.get(ohfVar);
        if (nvuVar != null) {
            return nvuVar;
        }
        nvu nvuVar2 = nvu.d;
        int i = ohfVar.s;
        return nvuVar2.f("Unknown http2 error code: " + i);
    }

    public static String e(ovp ovpVar) {
        our ourVar = new our();
        while (ovpVar.b(ourVar, 1L) != -1) {
            if (ourVar.c(ourVar.b - 1) == 10) {
                long i = ourVar.i((byte) 10, 0L, Long.MAX_VALUE);
                if (i == -1) {
                    our ourVar2 = new our();
                    ourVar.G(ourVar2, 0L, Math.min(32L, ourVar.b));
                    long min = Math.min(ourVar.b, Long.MAX_VALUE);
                    String d = ourVar2.r().d();
                    throw new EOFException("\\n not found: limit=" + min + " content=" + d + "…");
                }
                return ovt.a(ourVar, i);
            }
        }
        throw new EOFException("\\n not found: ".concat(ourVar.r().d()));
    }

    private final void s() {
        if (this.q == null || !this.l.isEmpty() || !this.w.isEmpty() || this.s) {
            return;
        }
        this.s = true;
        obi obiVar = this.y;
        if (obiVar != null) {
            obiVar.d();
        }
        oas oasVar = this.r;
        if (oasVar != null) {
            Throwable f = f();
            synchronized (oasVar) {
                if (!oasVar.d) {
                    oasVar.d = true;
                    oasVar.e = f;
                    Map map = oasVar.c;
                    oasVar.c = null;
                    for (Map.Entry entry : map.entrySet()) {
                        oas.c((opu) entry.getKey(), (Executor) entry.getValue(), f);
                    }
                }
            }
            this.r = null;
        }
        if (!this.J) {
            this.J = true;
            this.i.i(ohf.NO_ERROR, new byte[0]);
        }
        this.i.close();
    }

    @Override // defpackage.oft
    public final void a(Throwable th) {
        n(0, ohf.INTERNAL_ERROR, nvu.l.e(th));
    }

    @Override // defpackage.ntr
    public final ntm c() {
        return this.E;
    }

    @Override // defpackage.ocq
    public final Runnable d(ocp ocpVar) {
        this.h = ocpVar;
        ofs ofsVar = new ofs(this.G, this);
        ofv ofvVar = new ofv(ofsVar, new ohn(oix.d(ofsVar)));
        synchronized (this.k) {
            this.i = new ofu(this, ofvVar);
            this.j = new ogr(this, this.i);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.G.execute(new ogf(this, countDownLatch, ofsVar));
        try {
            synchronized (this.k) {
                ofu ofuVar = this.i;
                try {
                    ((ofv) ofuVar.b).a.b();
                } catch (IOException e) {
                    ofuVar.a.a(e);
                }
                ohq ohqVar = new ohq();
                ohqVar.d(7, this.f);
                ofu ofuVar2 = this.i;
                ofuVar2.c.h(2, ohqVar);
                try {
                    ((ofv) ofuVar2.b).a.g(ohqVar);
                } catch (IOException e2) {
                    ofuVar2.a.a(e2);
                }
            }
            countDownLatch.countDown();
            this.G.execute(new obv(this, 17));
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    public final Throwable f() {
        synchronized (this.k) {
            nvu nvuVar = this.q;
            if (nvuVar != null) {
                return nvuVar.g();
            }
            return nvu.l.f("Connection closed").g();
        }
    }

    public final void g(int i, nvu nvuVar, nyv nyvVar, boolean z, ohf ohfVar, num numVar) {
        synchronized (this.k) {
            ogc ogcVar = (ogc) this.l.remove(Integer.valueOf(i));
            if (ogcVar != null) {
                if (ohfVar != null) {
                    this.i.f(i, ohf.CANCEL);
                }
                if (nvuVar != null) {
                    oar oarVar = ogcVar.j;
                    if (numVar == null) {
                        numVar = new num();
                    }
                    oarVar.g(nvuVar, nyvVar, z, numVar);
                }
                if (!q()) {
                    s();
                    h(ogcVar);
                }
            }
        }
    }

    public final void h(ogc ogcVar) {
        if (this.K && this.w.isEmpty() && this.l.isEmpty()) {
            this.K = false;
            obi obiVar = this.y;
            if (obiVar != null) {
                obiVar.c();
            }
        }
        if (ogcVar.c) {
            this.L.c(ogcVar, false);
        }
    }

    public final void i(ohf ohfVar, String str) {
        n(0, ohfVar, b(ohfVar).b(str));
    }

    @Override // defpackage.ocq
    public final void j(nvu nvuVar) {
        synchronized (this.k) {
            if (this.q != null) {
                return;
            }
            this.q = nvuVar;
            this.h.c(nvuVar);
            s();
        }
    }

    @Override // defpackage.ocq
    public final void k(nvu nvuVar) {
        j(nvuVar);
        synchronized (this.k) {
            Iterator it = this.l.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                it.remove();
                ((ogc) entry.getValue()).j.f(nvuVar, false, new num());
                h((ogc) entry.getValue());
            }
            for (ogc ogcVar : this.w) {
                ogcVar.j.g(nvuVar, nyv.MISCARRIED, true, new num());
                h(ogcVar);
            }
            this.w.clear();
            s();
        }
    }

    public final void l(ogc ogcVar) {
        if (!this.K) {
            this.K = true;
            obi obiVar = this.y;
            if (obiVar != null) {
                obiVar.b();
            }
        }
        if (ogcVar.c) {
            this.L.c(ogcVar, true);
        }
    }

    @Override // defpackage.nyx
    public final /* bridge */ /* synthetic */ nyu m(nuq nuqVar, num numVar, nsa nsaVar, nxp[] nxpVarArr) {
        jdg.Q(nuqVar, "method");
        jdg.Q(numVar, "headers");
        ofg n = ofg.n(nxpVarArr);
        synchronized (this.k) {
            try {
                try {
                    return new ogc(nuqVar, numVar, this.i, this, this.j, this.k, this.I, this.f, this.c, this.d, n, this.B, nsaVar);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void n(int i, ohf ohfVar, nvu nvuVar) {
        synchronized (this.k) {
            if (this.q == null) {
                this.q = nvuVar;
                this.h.c(nvuVar);
            }
            if (ohfVar != null && !this.J) {
                this.J = true;
                this.i.i(ohfVar, new byte[0]);
            }
            Iterator it = this.l.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Integer) entry.getKey()).intValue() > i) {
                    it.remove();
                    ((ogc) entry.getValue()).j.g(nvuVar, nyv.REFUSED, false, new num());
                    h((ogc) entry.getValue());
                }
            }
            for (ogc ogcVar : this.w) {
                ogcVar.j.g(nvuVar, nyv.MISCARRIED, true, new num());
                h(ogcVar);
            }
            this.w.clear();
            s();
        }
    }

    public final void o(ogc ogcVar) {
        boolean z = true;
        jdg.G(ogcVar.j.H == -1, "StreamId already assigned");
        this.l.put(Integer.valueOf(this.F), ogcVar);
        l(ogcVar);
        oar oarVar = ogcVar.j;
        int i = this.F;
        if (oarVar.H != -1) {
            z = false;
        }
        jdg.H(z, "the stream has been started with id %s", i);
        oarVar.H = i;
        ogr ogrVar = oarVar.C;
        int i2 = ogrVar.c;
        if (oarVar != null) {
            oarVar.G = new ogp(ogrVar, i, i2, oarVar);
            oarVar.I.j.o();
            if (oarVar.E) {
                ofu ofuVar = oarVar.B;
                try {
                    ((ofv) ofuVar.b).a.j(oarVar.H, oarVar.v);
                } catch (IOException e) {
                    ofuVar.a.a(e);
                }
                oarVar.I.g.b();
                oarVar.v = null;
                our ourVar = oarVar.w;
                if (ourVar.b > 0) {
                    oarVar.C.a(oarVar.x, oarVar.G, ourVar, oarVar.y);
                }
                oarVar.E = false;
            }
            if (ogcVar.u() == nup.UNARY || ogcVar.u() == nup.SERVER_STREAMING) {
                boolean z2 = ogcVar.i;
            } else {
                this.i.d();
            }
            int i3 = this.F;
            if (i3 < 2147483645) {
                this.F = i3 + 2;
                return;
            }
            this.F = Integer.MAX_VALUE;
            n(Integer.MAX_VALUE, ohf.NO_ERROR, nvu.l.f("Stream ids exhausted"));
            return;
        }
        throw new NullPointerException("stream");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean p(int i) {
        boolean z;
        synchronized (this.k) {
            z = false;
            if (i < this.F && (i & 1) == 1) {
                z = true;
            }
        }
        return z;
    }

    public final boolean q() {
        boolean z = false;
        while (!this.w.isEmpty() && this.l.size() < this.v) {
            o((ogc) this.w.poll());
            z = true;
        }
        return z;
    }

    @Override // defpackage.ogq
    public final ogp[] r() {
        ogp[] ogpVarArr;
        synchronized (this.k) {
            ogpVarArr = new ogp[this.l.size()];
            int i = 0;
            for (ogc ogcVar : this.l.values()) {
                ogpVarArr[i] = ogcVar.j.k();
                i++;
            }
        }
        return ogpVarArr;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.g("logId", this.E.a);
        S.b("address", this.b);
        return S.toString();
    }
}
