package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: oeu  reason: default package */
/* loaded from: classes2.dex */
public final class oeu extends nvk implements ntl {
    public static final Logger b = Logger.getLogger(oeu.class.getName());
    public static final oex c = new oeq();
    public final oda d;
    public Executor e;
    public final List f;
    public final long g;
    public boolean h;
    public boolean i;
    public nvu j;
    public boolean k;
    public final oaw l;
    public boolean n;
    public final nsu p;
    public final nsy q;
    public final ntj r;
    public final nyi s;
    public final nxo t;
    public final nxp[] u;
    public final nxp v;
    private final ntm w;
    private boolean x;
    public final Object m = new Object();
    public final Set o = new HashSet();

    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Map, java.lang.Object] */
    public oeu(oev oevVar, oaw oawVar, nsu nsuVar) {
        List unmodifiableList;
        oda odaVar = oevVar.e;
        jdg.Q(odaVar, "executorPool");
        this.d = odaVar;
        mok mokVar = oevVar.o;
        HashMap hashMap = new HashMap();
        for (oqv oqvVar : ((HashMap) mokVar.b).values()) {
            for (oqv oqvVar2 : oqvVar.b.values()) {
                hashMap.put(((nuq) oqvVar2.a).b, oqvVar2);
            }
        }
        Collections.unmodifiableList(new ArrayList(((HashMap) mokVar.b).values()));
        this.t = new oav(Collections.unmodifiableMap(hashMap));
        jdg.Q(oevVar.p, "fallbackRegistry");
        this.l = oawVar;
        synchronized (this.m) {
            unmodifiableList = Collections.unmodifiableList(llp.r(((nwk) oawVar).a));
        }
        this.w = ntm.b("Server", String.valueOf(unmodifiableList));
        jdg.Q(nsuVar, "rootContext");
        this.p = new nsu(nsuVar.f, nsuVar.g + 1);
        this.q = oevVar.f;
        this.f = Collections.unmodifiableList(new ArrayList(oevVar.b));
        List list = oevVar.c;
        this.u = (nxp[]) list.toArray(new nxp[list.size()]);
        this.g = oevVar.h;
        ntj ntjVar = oevVar.m;
        this.r = ntjVar;
        this.s = new nyi(ofl.a);
        this.v = oevVar.q;
        nti ntiVar = (nti) ntjVar.g.put(Long.valueOf(ntj.a(this)), new nti());
        ntj.b(ntjVar.c, this);
    }

    public final void a() {
        synchronized (this.m) {
            if (this.i && this.o.isEmpty() && this.n) {
                if (!this.x) {
                    this.x = true;
                    ntj ntjVar = this.r;
                    ntj.c(ntjVar.c, this);
                    nti ntiVar = (nti) ntjVar.g.remove(Long.valueOf(ntj.a(this)));
                    Executor executor = this.e;
                    if (executor != null) {
                        this.d.b(executor);
                        this.e = null;
                    }
                    this.m.notifyAll();
                } else {
                    throw new AssertionError("Server already terminated");
                }
            }
        }
    }

    @Override // defpackage.ntr
    public final ntm c() {
        return this.w;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.g("logId", this.w.a);
        S.b("transportServer", this.l);
        return S.toString();
    }
}
