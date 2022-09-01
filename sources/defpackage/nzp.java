package defpackage;

import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: nzp  reason: default package */
/* loaded from: classes2.dex */
public final class nzp implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public nzp(nzm nzmVar, int i, byte[] bArr) {
        this.b = i;
        this.a = nzmVar;
    }

    public nzp(nzr nzrVar, int i) {
        this.b = i;
        this.a = nzrVar;
    }

    public nzp(nzs nzsVar, int i) {
        this.b = i;
        this.a = nzsVar;
    }

    public nzp(nzt nztVar, int i) {
        this.b = i;
        this.a = nztVar;
    }

    public nzp(obd obdVar, int i) {
        this.b = i;
        this.a = obdVar;
    }

    public nzp(obf obfVar, int i) {
        this.b = i;
        this.a = obfVar;
    }

    public nzp(oce oceVar, int i) {
        this.b = i;
        this.a = oceVar;
    }

    public nzp(ocp ocpVar, int i) {
        this.b = i;
        this.a = ocpVar;
    }

    public nzp(opu opuVar, int i, byte[] bArr, byte[] bArr2) {
        this.b = i;
        this.a = opuVar;
    }

    public nzp(opu opuVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = i;
        this.a = opuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ocp] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ocp] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, nzf] */
    /* JADX WARN: Type inference failed for: r0v59, types: [ntl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.lang.Object, nzf] */
    @Override // java.lang.Runnable
    public final void run() {
        long j;
        boolean z;
        boolean z2 = true;
        switch (this.b) {
            case 0:
                this.a.a(false);
                return;
            case 1:
                this.a.a(true);
                return;
            case 2:
                obs obsVar = (obs) this.a;
                jdg.G(obsVar.a.z.get(), "Channel must have been shut down");
                oce oceVar = obsVar.a;
                oceVar.A = true;
                oceVar.n(false);
                obsVar.a.j();
                return;
            case 3:
                jdg.G(((obs) ((nzr) this.a).f).a.z.get(), "Channel must have been shut down");
                return;
            case 4:
                ((nzt) this.a).f.f();
                return;
            case 5:
                ((nzt) this.a).r();
                return;
            case 6:
                ((nzt) this.a).f.d();
                return;
            case 7:
                ((nzt) this.a).f.e();
                return;
            case 8:
                ((nzs) this.a).a.e();
                return;
            case 9:
                ((lbi) ((opu) this.a).a).a.k(nvu.l.f("Keepalive failed. The connection is likely gone"));
                return;
            case 10:
                obf obfVar = (obf) this.a;
                obfVar.q = null;
                obfVar.d.a(2, "CONNECTING after backoff");
                ((obf) this.a).d(nsl.CONNECTING);
                ((obf) this.a).i();
                return;
            case 11:
                if (((obf) this.a).n.a != nsl.IDLE) {
                    return;
                }
                ((obf) this.a).d.a(2, "CONNECTING as requested");
                ((obf) this.a).d(nsl.CONNECTING);
                ((obf) this.a).i();
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                obf obfVar2 = (obf) ((nzm) this.a).b;
                ocq ocqVar = obfVar2.i;
                obfVar2.r = null;
                obfVar2.i = null;
                ocqVar.j(nvu.l.f("InternalSubchannel closed transport due to address change"));
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((obf) this.a).d.a(2, "Terminated");
                ?? r0 = this.a;
                obb obbVar = ((obf) r0).a;
                obbVar.b.j.u.remove(r0);
                ntj.c(obbVar.b.j.G.e, r0);
                obbVar.b.j.j();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                obd obdVar = (obd) this.a;
                obf obfVar3 = obdVar.c;
                obfVar3.p = null;
                if (obfVar3.o != null) {
                    if (obfVar3.m != null) {
                        z2 = false;
                    }
                    jdg.G(z2, "Unexpected non-null activeTransport");
                    obd obdVar2 = (obd) this.a;
                    obdVar2.a.j(obdVar2.c.o);
                    return;
                }
                nzf nzfVar = obfVar3.l;
                nzf nzfVar2 = obdVar.a;
                if (nzfVar != nzfVar2) {
                    return;
                }
                obfVar3.m = nzfVar2;
                ((obd) this.a).c.l = null;
                ((obd) this.a).c.d(nsl.READY);
                return;
            case 15:
                obd obdVar3 = (obd) this.a;
                obdVar3.c.j.remove(obdVar3.a);
                if (((obd) this.a).c.n.a != nsl.SHUTDOWN || !((obd) this.a).c.j.isEmpty()) {
                    return;
                }
                ((obd) this.a).c.f();
                return;
            case 16:
                synchronized (this.a) {
                    Object obj = this.a;
                    if (((obi) obj).g != 6) {
                        ((obi) obj).g = 6;
                    } else {
                        z2 = false;
                    }
                }
                if (!z2) {
                    return;
                }
                ((obi) this.a).h.a.k(nvu.l.f("Keepalive failed. The connection is likely gone"));
                return;
            case 17:
                synchronized (this.a) {
                    Object obj2 = this.a;
                    ((obi) obj2).d = null;
                    int i = ((obi) obj2).g;
                    j = 0;
                    if (i == 2) {
                        ((obi) obj2).g = 4;
                        ((obi) obj2).c = ((obi) obj2).a.schedule(((obi) obj2).e, 0L, TimeUnit.NANOSECONDS);
                        z = true;
                    } else {
                        if (i == 3) {
                            ((obi) obj2).d = ((obi) obj2).a.schedule(((obi) obj2).f, -((obi) obj2).b.a(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
                            ((obi) this.a).g = 2;
                        }
                        z = false;
                    }
                }
                if (!z) {
                    return;
                }
                lbi lbiVar = ((obi) this.a).h;
                Object obj3 = lbiVar.a;
                opu opuVar = new opu(lbiVar, null, null, null);
                mjl mjlVar = mjl.a;
                synchronized (((ogh) obj3).k) {
                    jdg.F(((ogh) obj3).i != null);
                    if (((ogh) obj3).s) {
                        oas.c(opuVar, mjlVar, ((ogh) obj3).f());
                        return;
                    }
                    oas oasVar = ((ogh) obj3).r;
                    if (oasVar != null) {
                        z2 = false;
                    } else {
                        j = ((ogh) obj3).e.nextLong();
                        lga b = lga.b();
                        b.e();
                        oas oasVar2 = new oas(j, b);
                        ((ogh) obj3).r = oasVar2;
                        ((ogh) obj3).B.e++;
                        oasVar = oasVar2;
                    }
                    if (z2) {
                        ((ogh) obj3).i.e(false, (int) (j >>> 32), (int) j);
                    }
                    synchronized (oasVar) {
                        if (!oasVar.d) {
                            oasVar.c.put(opuVar, mjlVar);
                            return;
                        } else {
                            oas.a(mjlVar, oasVar.e != null ? oas.d(opuVar) : oas.b());
                            return;
                        }
                    }
                }
            case 18:
                if (((oce) this.a).z.get()) {
                    return;
                }
                oce oceVar2 = (oce) this.a;
                if (oceVar2.r == null) {
                    return;
                }
                oceVar2.g(false);
                ((oce) this.a).h();
                return;
            default:
                ((oce) ((opu) this.a).a).i();
                return;
        }
    }
}
