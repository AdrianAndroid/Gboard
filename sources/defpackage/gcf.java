package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.micore.learning.base.ErrorStatusException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: gcf  reason: default package */
/* loaded from: classes.dex */
public final class gcf implements jog {
    public final Context a;
    public final fwe b;
    public final jns c;
    public final fwo d;
    public final String e;
    public final String f;
    public final mfx g;
    public final long h;
    public boolean i;
    public boolean j;
    public nem k;
    public final gil n;
    public final kdr o;
    private final ndy q;
    private gce r;
    private final String s;
    private final mzg t;
    public final gcc l = new gcc(this);
    public int m = 1;
    public ijk p = null;

    public gcf(Context context, jns jnsVar, fwe fweVar, fwo fwoVar, String str, String str2, ndy ndyVar, nem nemVar, mfx mfxVar, gil gilVar, String str3, mzg mzgVar, byte[] bArr) {
        nfh t;
        this.a = context;
        this.b = fweVar;
        this.d = fwoVar;
        this.e = str;
        this.f = str2;
        this.q = ndyVar;
        this.k = nemVar;
        this.c = jnsVar.c("InAppExampleIterator");
        this.n = gilVar;
        this.s = str3;
        kdr kdrVar = null;
        this.t = mzgVar;
        if (fweVar.aa()) {
            if (mfxVar != null) {
                t = (nfh) mfxVar.N(5);
                t.cG(mfxVar);
            } else {
                t = mfx.h.t();
            }
            nfh t2 = mfy.c.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mfy mfyVar = (mfy) t2.b;
            str.getClass();
            mfyVar.a |= 1;
            mfyVar.b = str;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mfx mfxVar2 = (mfx) t.b;
            mfy mfyVar2 = (mfy) t2.cz();
            mfyVar2.getClass();
            mfxVar2.b = mfyVar2;
            mfxVar2.a |= 1;
            nfh t3 = mfz.c.t();
            nfh t4 = mgb.c.t();
            if (t4.c) {
                t4.cD();
                t4.c = false;
            }
            mgb mgbVar = (mgb) t4.b;
            str2.getClass();
            mgbVar.a |= 1;
            mgbVar.b = str2;
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mfz mfzVar = (mfz) t3.b;
            mgb mgbVar2 = (mgb) t4.cz();
            mgbVar2.getClass();
            mfzVar.b = mgbVar2;
            mfzVar.a = 1 | mfzVar.a;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mfx mfxVar3 = (mfx) t.b;
            mfz mfzVar2 = (mfz) t3.cz();
            mfzVar2.getClass();
            mfxVar3.f = mfzVar2;
            mfxVar3.a |= 4096;
            this.g = fwoVar.a((mfx) t.cz());
        } else {
            this.g = mfx.h;
        }
        this.o = fweVar.af() ? new kdr() : kdrVar;
        this.h = fweVar.v();
    }

    public static final String c(String str, String str2, Status status) {
        int i = status.f;
        return String.format("%s received (statusCode: %s): %s", str, (i < 0 || i > 50) ? ">50" : Integer.toString(i), str2);
    }

    private final void d() {
        jdg.F(this.r == null);
        mld e = mld.e();
        gcb gcbVar = new gcb(this, e);
        Intent intent = new Intent();
        String str = this.s;
        if (str != null) {
            intent.setAction(String.format("com.google.android.gms.learning.%s.EXAMPLE_STORE", str)).setComponent(fzg.a);
        } else {
            intent.setAction("com.google.android.gms.learning.EXAMPLE_STORE_V2").setPackage(this.e);
            intent.setData(new Uri.Builder().scheme("app").authority(this.e).path(this.f).build());
        }
        if (this.a.bindService(intent, gcbVar, 1)) {
            this.d.g(job.IN_APP_EXAMPLE_STORE_V2_PROTOCOL_USED, this.e);
            try {
                try {
                    fxv fxvVar = (fxv) e.get(this.h, TimeUnit.SECONDS);
                    mld e2 = mld.e();
                    this.l.a.set(e2);
                    kdr kdrVar = this.o;
                    try {
                        fxvVar.e(this.f, this.q.q(), this.k.D(), new fxr(this, kdrVar != null ? ((lgh) kdrVar.d).a() : 0L, e2), this.t.q());
                        try {
                            try {
                                lfc lfcVar = (lfc) e2.get(this.h, TimeUnit.SECONDS);
                                if (lfcVar.b != null) {
                                    b(job.IN_APP_EXAMPLE_STORE_START_QUERY_CLIENT_FAILURE);
                                    throw ErrorStatusException.b(14, c("onStartQueryFailure", this.f, (Status) lfcVar.b), new Object[0]);
                                } else {
                                    this.r = new gce(this, (fxm) lfcVar.a, gcbVar);
                                    return;
                                }
                            } catch (TimeoutException unused) {
                                b(job.IN_APP_EXAMPLE_STORE_START_QUERY_TIMEOUT);
                                throw ErrorStatusException.b(14, "startQuery timed out (%ss): %s", Long.valueOf(this.h), this.f);
                            }
                        } catch (CancellationException unused2) {
                            b(job.IN_APP_EXAMPLE_STORE_START_QUERY_CONNECTION_DIED);
                            String str2 = this.f;
                            throw ErrorStatusException.b(14, "startQuery failed due to dead process: " + str2, new Object[0]);
                        } catch (ExecutionException e3) {
                            throw new mll(e3);
                        }
                    } catch (RemoteException e4) {
                        b(e4 instanceof DeadObjectException ? job.IN_APP_EXAMPLE_STORE_START_QUERY_CONNECTION_DIED : job.IN_APP_EXAMPLE_STORE_START_QUERY_REMOTE_EXC);
                        throw ErrorStatusException.c(14, e4, "startQuery failed", new Object[0]);
                    }
                } catch (CancellationException unused3) {
                    throw ErrorStatusException.b(14, "Service connection died for in-app proxy service", new Object[0]);
                } catch (ExecutionException e5) {
                    throw new mll(e5);
                } catch (TimeoutException unused4) {
                    b(job.IN_APP_EXAMPLE_STORE_BIND_SERVICE_TIMEOUT);
                    throw ErrorStatusException.b(14, "service connection timed out (%ss) for in-app proxy service", Long.valueOf(this.h));
                }
            } catch (Exception e6) {
                this.a.unbindService(gcbVar);
                throw e6;
            }
        }
        b(job.IN_APP_EXAMPLE_STORE_BIND_SERVICE_ERROR);
        if (this.b.aR()) {
            this.a.unbindService(gcbVar);
        }
        throw ErrorStatusException.b(14, "bindService failed for example store service: ".concat(intent.toString()), new Object[0]);
    }

    public final void a() {
        try {
            kdr kdrVar = this.o;
            long a = kdrVar != null ? ((lgh) kdrVar.d).a() : 0L;
            if (this.r == null) {
                gbi j = this.d.j(3, this.g);
                d();
                j.close();
            }
            this.p = this.r.a();
            kdr kdrVar2 = this.o;
            if (kdrVar2 != null) {
                ((AtomicLong) kdrVar2.b).addAndGet(((lgh) kdrVar2.d).a() - a);
            }
            if (this.p == null) {
                this.m = 2;
                return;
            }
            this.m = 3;
            kdr kdrVar3 = this.o;
            if (kdrVar3 == null) {
                return;
            }
            ((AtomicInteger) kdrVar3.c).incrementAndGet();
            ((AtomicInteger) this.o.e).addAndGet(((nem) this.p.b).d());
        } catch (ErrorStatusException e) {
            this.j = true;
            throw e;
        }
    }

    public final void b(job jobVar) {
        this.d.g(jobVar, this.e);
        if (this.b.aF()) {
            this.d.i(8, this.g, jobVar.a());
        }
    }

    @Override // defpackage.jog, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        fyb.aB();
        if (this.i) {
            return;
        }
        this.i = true;
        gce gceVar = this.r;
        if (gceVar != null) {
            gceVar.close();
        }
        kdr kdrVar = this.o;
        if (kdrVar == null) {
            return;
        }
        kdrVar.i();
        this.o.j();
        TimeUnit.NANOSECONDS.toMillis(this.o.l());
        TimeUnit.NANOSECONDS.toMillis(this.o.k());
        TimeUnit.NANOSECONDS.toMillis(this.o.m());
        TimeUnit.NANOSECONDS.toMillis(this.o.h());
        this.d.i(2, this.g, this.o.i());
        this.d.i(3, this.g, this.o.j());
        this.d.i(4, this.g, TimeUnit.NANOSECONDS.toMillis(this.o.l()));
        this.d.i(5, this.g, TimeUnit.NANOSECONDS.toMillis(this.o.k()));
        this.d.i(6, this.g, TimeUnit.NANOSECONDS.toMillis(this.o.m()));
        this.d.i(7, this.g, TimeUnit.NANOSECONDS.toMillis(this.o.h()));
        fwo fwoVar = this.d;
        mfx mfxVar = this.g;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        double l = this.o.l();
        double i = this.o.i() + 1;
        Double.isNaN(l);
        Double.isNaN(i);
        fwoVar.i(1, mfxVar, timeUnit.toMillis((long) (l / i)));
    }
}
