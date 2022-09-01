package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: nwk  reason: default package */
/* loaded from: classes2.dex */
public final class nwk implements oaw, nwz {
    public final nwc a;
    public final nxa b = new nxa(this);
    private final oda c;
    private final llp d;
    private final nwe e;
    private ScheduledExecutorService f;
    private boolean g;
    private final oqv h;
    private opu i;

    public nwk(nwc nwcVar, oda odaVar, List list, oqv oqvVar, nwe nweVar, byte[] bArr) {
        this.a = nwcVar;
        this.c = odaVar;
        jdg.Q(list, "streamTracerFactories");
        this.d = llp.o(list);
        jdg.Q(oqvVar, "serverSecurityPolicy");
        this.h = oqvVar;
        this.e = nweVar;
    }

    @Override // defpackage.oaw
    public final synchronized void a() {
        if (!this.g) {
            this.g = true;
            this.b.a();
            opu opuVar = this.i;
            synchronized (((oeu) opuVar.a).m) {
                Object obj = opuVar.a;
                if (!((oeu) obj).k) {
                    ArrayList arrayList = new ArrayList(((oeu) obj).o);
                    Object obj2 = opuVar.a;
                    nvu nvuVar = ((oeu) obj2).j;
                    ((oeu) obj2).k = true;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        oey oeyVar = (oey) arrayList.get(i);
                        if (nvuVar == null) {
                            oeyVar.j();
                        } else {
                            oeyVar.k(nvuVar);
                        }
                    }
                    synchronized (((oeu) opuVar.a).m) {
                        Object obj3 = opuVar.a;
                        ((oeu) obj3).n = true;
                        ((oeu) obj3).a();
                    }
                }
            }
            this.c.b(this.f);
            this.f = null;
        }
    }

    @Override // defpackage.oaw
    public final synchronized void c(opu opuVar) {
        this.i = opuVar;
        this.f = (ScheduledExecutorService) this.c.a();
    }

    public final String toString() {
        String obj = this.a.toString();
        return "BinderServer[" + obj + "]";
    }

    @Override // defpackage.nwz
    public final synchronized boolean y(int i, Parcel parcel) {
        IBinder readStrongBinder;
        if (i == 1) {
            if (parcel.readInt() > 0 && (readStrongBinder = parcel.readStrongBinder()) != null) {
                int callingUid = Binder.getCallingUid();
                nrw a = nry.a();
                a.b(ntd.b, this.a);
                a.b(ntd.a, new nws(callingUid));
                a.b(nwn.f, Integer.valueOf(callingUid));
                a.b(nwn.g, this.a.d());
                a.b(nwn.h, this.e);
                a.b(nwp.a, new nwo(callingUid, this.h, (byte[]) null));
                a.b(oak.a, nvj.PRIVACY_AND_INTEGRITY);
                nwm nwmVar = new nwm(this.c, a.a(), this.d, readStrongBinder);
                opu opuVar = this.i;
                synchronized (((oeu) opuVar.a).m) {
                    ((oeu) opuVar.a).o.add(nwmVar);
                }
                oet oetVar = new oet((oeu) opuVar.a, nwmVar);
                long j = oetVar.c.g;
                if (j != Long.MAX_VALUE) {
                    oetVar.b = ((nwn) oetVar.a).i.schedule(new obv(oetVar, 14), j, TimeUnit.MILLISECONDS);
                } else {
                    oetVar.b = new FutureTask(new mkm(5), null);
                }
                oeu oeuVar = oetVar.c;
                ntj.b((nti) oeuVar.r.g.get(Long.valueOf(ntj.a(oeuVar))), oetVar.a);
                nwmVar.m(oetVar);
                return true;
            }
        }
        return false;
    }
}
