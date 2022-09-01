package defpackage;

import android.util.Log;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: obv  reason: default package */
/* loaded from: classes2.dex */
public final class obv implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public obv(nxw nxwVar, int i) {
        this.b = i;
        this.a = nxwVar;
    }

    public obv(nxx nxxVar, int i) {
        this.b = i;
        this.a = nxxVar;
    }

    public obv(obv obvVar, int i, byte[] bArr) {
        this.b = i;
        this.a = obvVar;
    }

    public obv(obw obwVar, int i) {
        this.b = i;
        this.a = obwVar;
    }

    public obv(oca ocaVar, int i) {
        this.b = i;
        this.a = ocaVar;
    }

    public obv(ocb ocbVar, int i) {
        this.b = i;
        this.a = ocbVar;
    }

    public obv(oce oceVar, int i) {
        this.b = i;
        this.a = oceVar;
    }

    public obv(odc odcVar, int i) {
        this.b = i;
        this.a = odcVar;
    }

    public obv(odl odlVar, int i) {
        this.b = i;
        this.a = odlVar;
    }

    public obv(odw odwVar, int i) {
        this.b = i;
        this.a = odwVar;
    }

    public obv(odz odzVar, int i) {
        this.b = i;
        this.a = odzVar;
    }

    public obv(oec oecVar, int i) {
        this.b = i;
        this.a = oecVar;
    }

    public obv(oet oetVar, int i) {
        this.b = i;
        this.a = oetVar;
    }

    public obv(ofs ofsVar, int i) {
        this.b = i;
        this.a = ofsVar;
    }

    public obv(ogh oghVar, int i) {
        this.b = i;
        this.a = oghVar;
    }

    public obv(opk opkVar, int i) {
        this.b = i;
        this.a = opkVar;
    }

    public obv(orb orbVar, int i) {
        this.b = i;
        this.a = orbVar;
    }

    public obv(oxa oxaVar, int i) {
        this.b = i;
        this.a = oxaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        oeb oebVar;
        odv odvVar;
        long j;
        Iterator it;
        switch (this.b) {
            case 0:
                oce oceVar = (oce) this.a;
                if (oceVar.r == null) {
                    return;
                }
                oceVar.h();
                return;
            case 1:
                oce oceVar2 = (oce) this.a;
                oceVar2.S = null;
                oceVar2.l();
                return;
            case 2:
                ((obw) this.a).d.k();
                return;
            case 3:
                ((ocb) this.a).c.i();
                return;
            case 4:
                Object obj = this.a;
                Collection collection = ((oca) obj).f.c.v;
                if (collection == null) {
                    return;
                }
                collection.remove(obj);
                if (!((oca) this.a).f.c.v.isEmpty()) {
                    return;
                }
                oce oceVar3 = ((oca) this.a).f.c;
                oceVar3.O.c(oceVar3.w, false);
                oce oceVar4 = ((oca) this.a).f.c;
                oceVar4.v = null;
                if (!oceVar4.z.get()) {
                    return;
                }
                ocd ocdVar = ((oca) this.a).f.c.y;
                nvu nvuVar = oce.c;
                synchronized (ocdVar.a) {
                    if (ocdVar.c != null) {
                        return;
                    }
                    ocdVar.c = nvuVar;
                    boolean isEmpty = ocdVar.b.isEmpty();
                    if (!isEmpty) {
                        return;
                    }
                    ocdVar.d.x.j(nvuVar);
                    return;
                }
            case 5:
                ((nxw) this.a).g.h(oce.d);
                return;
            case 6:
                ((odc) this.a).a.c();
                return;
            case 7:
                odl odlVar = (odl) this.a;
                if (!odlVar.e) {
                    odlVar.f = null;
                    return;
                }
                long a = odlVar.a();
                odl odlVar2 = (odl) this.a;
                long j2 = odlVar2.d - a;
                if (j2 > 0) {
                    odlVar2.f = odlVar2.a.schedule(new obv(odlVar2, 8), j2, TimeUnit.NANOSECONDS);
                    return;
                }
                odlVar2.e = false;
                odlVar2.f = null;
                odlVar2.c.run();
                return;
            case 8:
                odl odlVar3 = (odl) this.a;
                odlVar3.b.execute(new obv(odlVar3, 7));
                return;
            case 9:
                oec oecVar = (oec) this.a;
                if (oecVar.y) {
                    return;
                }
                oecVar.u.e();
                return;
            case 10:
                oec oecVar2 = (oec) ((odw) this.a).b;
                oea p = oecVar2.p(oecVar2.q.e, false);
                synchronized (((oec) ((odw) this.a).b).l) {
                    Object obj2 = this.a;
                    if (((odv) ((odw) obj2).a).b) {
                        z = true;
                    } else {
                        Object obj3 = ((odw) obj2).b;
                        ((oec) obj3).q = ((oec) obj3).q.a(p);
                        Object obj4 = ((odw) this.a).b;
                        if (!((oec) obj4).v(((oec) obj4).q) || ((oebVar = ((oec) ((odw) this.a).b).o) != null && !oebVar.a())) {
                            Object obj5 = ((odw) this.a).b;
                            ((oec) obj5).q = ((oec) obj5).q.b();
                            ((oec) ((odw) this.a).b).w = null;
                            z = false;
                        } else {
                            Object obj6 = ((odw) this.a).b;
                            odvVar = new odv(((oec) obj6).l);
                            ((oec) obj6).w = odvVar;
                            z = false;
                        }
                    }
                    odvVar = null;
                }
                if (z) {
                    p.a.c(nvu.c.f("Unneeded hedging"));
                    return;
                }
                if (odvVar != null) {
                    oec oecVar3 = (oec) ((odw) this.a).b;
                    odvVar.b(oecVar3.h.schedule(new odw(oecVar3, odvVar, 0), oecVar3.j.b, TimeUnit.NANOSECONDS));
                }
                ((oec) ((odw) this.a).b).t(p);
                return;
            case 11:
                odz odzVar = (odz) ((obv) this.a).a;
                ((odz) ((obv) this.a).a).b.t(odzVar.b.p(odzVar.a.d + 1, false));
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((odz) this.a).b.f.execute(new obv(this, 11, null));
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                oec oecVar4 = ((odz) this.a).b;
                if (oecVar4.y) {
                    return;
                }
                oecVar4.u.e();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((oet) this.a).a.k(nvu.c.f("Handshake timeout exceeded"));
                return;
            case 15:
                try {
                    Object obj7 = this.a;
                    ovn ovnVar = ((ofs) obj7).f;
                    if (ovnVar != null) {
                        our ourVar = ((ofs) obj7).b;
                        long j3 = ourVar.b;
                        if (j3 > 0) {
                            ovnVar.ik(ourVar, j3);
                        }
                    }
                } catch (IOException e) {
                    ((ofs) this.a).c.a(e);
                }
                try {
                    ovn ovnVar2 = ((ofs) this.a).f;
                    if (ovnVar2 != null) {
                        ovnVar2.close();
                    }
                } catch (IOException e2) {
                    ((ofs) this.a).c.a(e2);
                }
                try {
                    Socket socket = ((ofs) this.a).g;
                    if (socket == null) {
                        return;
                    }
                    socket.close();
                    return;
                } catch (IOException e3) {
                    ((ofs) this.a).c.a(e3);
                    return;
                }
            case 16:
                nxx nxxVar = (nxx) this.a;
                long j4 = nxxVar.a;
                long max = Math.max(j4 + j4, j4);
                if (!nxxVar.b.c.compareAndSet(nxxVar.a, max)) {
                    return;
                }
                nxy.a.logp(Level.WARNING, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", new Object[]{nxxVar.b.b, Long.valueOf(max)});
                return;
            case 17:
                ogh oghVar = (ogh) this.a;
                oghVar.m.execute(oghVar.o);
                synchronized (((ogh) this.a).k) {
                    Object obj8 = this.a;
                    ((ogh) obj8).v = Integer.MAX_VALUE;
                    ((ogh) obj8).q();
                }
                return;
            case 18:
                break;
            case 19:
                synchronized (this.a) {
                    Object obj9 = this.a;
                    if ((!((orb) obj9).i) || ((orb) obj9).j) {
                        return;
                    }
                    try {
                        ((orb) obj9).f();
                    } catch (IOException unused) {
                        ((orb) this.a).k = true;
                    }
                    try {
                        if (((orb) this.a).h()) {
                            ((orb) this.a).e();
                            ((orb) this.a).g = 0;
                        }
                    } catch (IOException unused2) {
                        Object obj10 = this.a;
                        ((orb) obj10).l = true;
                        ((orb) obj10).e = oix.d(oix.f());
                    }
                    return;
                }
            default:
                ows owsVar = ((oxa) this.a).r;
                if (owsVar != null) {
                    try {
                        owsVar.d();
                    } catch (IOException e4) {
                        Log.e(oxa.a, "Exception when closing OutputChannel", e4);
                    }
                }
                HttpURLConnection httpURLConnection = ((oxa) this.a).q;
                if (httpURLConnection == null) {
                    return;
                }
                httpURLConnection.disconnect();
                ((oxa) this.a).q = null;
                return;
        }
        while (true) {
            Object obj11 = this.a;
            long nanoTime = System.nanoTime();
            synchronized (obj11) {
                Iterator it2 = ((opk) obj11).e.iterator();
                long j5 = Long.MIN_VALUE;
                int i = 0;
                orf orfVar = null;
                int i2 = 0;
                while (it2.hasNext()) {
                    orf orfVar2 = (orf) it2.next();
                    List list = orfVar2.m;
                    int i3 = 0;
                    while (true) {
                        if (i3 < list.size()) {
                            Reference reference = (Reference) list.get(i3);
                            if (reference.get() != null) {
                                i3++;
                            } else {
                                String str = orfVar2.b.a.a.e;
                                StringBuilder sb = new StringBuilder();
                                it = it2;
                                sb.append("A connection to ");
                                sb.append(str);
                                sb.append(" was leaked. Did you forget to close a response body?");
                                otu.c.i(sb.toString(), ((ori) reference).a);
                                list.remove(i3);
                                orfVar2.j = true;
                                if (list.isEmpty()) {
                                    orfVar2.n = nanoTime - ((opk) obj11).c;
                                } else {
                                    it2 = it;
                                }
                            }
                        } else {
                            it = it2;
                            if (list.size() > 0) {
                                i2++;
                            }
                        }
                    }
                    i++;
                    long j6 = nanoTime - orfVar2.n;
                    long j7 = j6 > j5 ? j6 : j5;
                    if (j6 > j5) {
                        orfVar = orfVar2;
                    }
                    j5 = j7;
                    it2 = it;
                }
                j = ((opk) obj11).c;
                if (j5 < j && i <= ((opk) obj11).b) {
                    if (i > 0) {
                        j -= j5;
                    } else if (i2 <= 0) {
                        ((opk) obj11).f = false;
                        j = -1;
                    }
                }
                ((opk) obj11).e.remove(orfVar);
                oqs.s(orfVar.d);
                j = 0;
            }
            if (j == -1) {
                return;
            }
            if (j > 0) {
                long j8 = j / 1000000;
                long j9 = j - (1000000 * j8);
                synchronized (this.a) {
                    try {
                        this.a.wait(j8, (int) j9);
                    } catch (InterruptedException unused3) {
                    }
                }
            }
        }
    }
}
