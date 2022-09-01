package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: nwl  reason: default package */
/* loaded from: classes2.dex */
public final class nwl extends nwn implements nzf, nwi {
    public final Executor a;
    public final nwh b;
    public final nwj c;
    public ocp d;
    private final oda n;
    private int p = 1001;
    private final AtomicInteger o = new AtomicInteger();
    private final nxp q = new nxp();

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public nwl(android.content.Context r7, defpackage.nwc r8, defpackage.nwd r9, java.util.concurrent.Executor r10, defpackage.oda r11, defpackage.oda r12, defpackage.nwh r13, defpackage.nry r14) {
        /*
            r6 = this;
            nrw r0 = defpackage.nry.a()
            nrx r1 = defpackage.oak.a
            nvj r2 = defpackage.nvj.NONE
            r0.b(r1, r2)
            nrx r1 = defpackage.oak.b
            r0.b(r1, r14)
            nrx r14 = defpackage.ntd.b
            nwc r1 = defpackage.nwc.c(r7)
            r0.b(r14, r1)
            nrx r14 = defpackage.ntd.a
            r0.b(r14, r8)
            nrx r14 = defpackage.nwl.h
            r1 = 0
            r0.b(r14, r1)
            nry r14 = r0.a()
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getSimpleName()
            android.content.ComponentName r1 = r8.a()
            java.lang.String r1 = r1.toShortString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "->"
            r2.append(r0)
            r2.append(r1)
            java.lang.Class<nwl> r0 = defpackage.nwl.class
            java.lang.String r1 = r2.toString()
            ntm r0 = defpackage.ntm.a(r0, r1)
            r6.<init>(r11, r14, r0)
            r11 = 1001(0x3e9, float:1.403E-42)
            r6.p = r11
            r6.n = r12
            r6.b = r13
            java.lang.Object r11 = r12.a()
            r6.a = r11
            java.util.concurrent.atomic.AtomicInteger r11 = new java.util.concurrent.atomic.AtomicInteger
            r11.<init>()
            r6.o = r11
            nxp r11 = new nxp
            r11.<init>()
            r6.q = r11
            nxl r11 = new nxl
            android.content.Intent r8 = r8.a
            android.content.Intent r3 = r8.cloneFilter()
            int r4 = r9.b
            r0 = r11
            r1 = r10
            r2 = r7
            r5 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r6.c = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwl.<init>(android.content.Context, nwc, nwd, java.util.concurrent.Executor, oda, oda, nwh, nry):void");
    }

    private static nyu w(nvu nvuVar, nxp[] nxpVarArr) {
        ofg.n(nxpVarArr).b();
        return new oad(nvuVar, nxpVarArr, null, null, null);
    }

    @Override // defpackage.nwi
    public final synchronized void a(IBinder iBinder) {
        n(nxf.b(iBinder, this.a));
    }

    @Override // defpackage.nwi
    public final synchronized void b(nvu nvuVar) {
        p(nvuVar, true);
    }

    @Override // defpackage.ocq
    public final synchronized Runnable d(ocp ocpVar) {
        this.d = ocpVar;
        return new kvl(this, 17);
    }

    @Override // defpackage.nwn
    protected final void e(Parcel parcel) {
        nxp nxpVar = this.q;
        parcel.readInt();
        nxpVar.J();
    }

    @Override // defpackage.nwn
    protected final void f(Parcel parcel) {
        nvj nvjVar;
        nry nryVar = this.k;
        int callingUid = Binder.getCallingUid();
        nrw b = nryVar.b();
        b.b(f, Integer.valueOf(callingUid));
        nrx nrxVar = oak.a;
        if (callingUid == Process.myUid()) {
            nvjVar = nvj.PRIVACY_AND_INTEGRITY;
        } else {
            nvjVar = nvj.INTEGRITY;
        }
        b.b(nrxVar, nvjVar);
        this.k = b.a();
        if (v(2)) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readInt != 1) {
                p(nvu.l.f("Wire format version mismatch"), true);
            } else if (readStrongBinder == null) {
                p(nvu.l.f("Malformed SETUP_TRANSPORT data"), true);
            } else {
                this.a.execute(new kht(this, readStrongBinder, 15));
            }
        }
    }

    @Override // defpackage.nwn
    public final void g(nvu nvuVar) {
        this.d.c(nvuVar);
    }

    @Override // defpackage.nwn
    public final void h() {
        if (this.o.getAndSet(0) > 0) {
            this.d.a(false);
        }
        ((nxl) this.c).c(nvu.c);
        this.d.d();
    }

    @Override // defpackage.nwn
    public final void i() {
        super.i();
        this.n.b(this.a);
    }

    @Override // defpackage.ocq
    public final synchronized void j(nvu nvuVar) {
        jdg.Q(nvuVar, "reason");
        p(nvuVar, false);
    }

    @Override // defpackage.ocq
    public final synchronized void k(nvu nvuVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nwn
    public final void l(nwy nwyVar) {
        if (nwyVar.e() && this.o.decrementAndGet() == 0) {
            this.d.a(false);
        }
        super.l(nwyVar);
    }

    @Override // defpackage.nyx
    public final synchronized nyu m(nuq nuqVar, num numVar, nsa nsaVar, nxp[] nxpVarArr) {
        if (v(3)) {
            int i = this.p;
            int i2 = i + 1;
            this.p = i2;
            if (i2 == 16777215) {
                this.p = 1001;
            }
            ofg n = ofg.n(nxpVarArr);
            nwu nwuVar = new nwu(this, this.k, i, oao.h(nsaVar));
            if (this.j.putIfAbsent(Integer.valueOf(i), nwuVar) == null) {
                if (nwuVar.a && this.o.getAndIncrement() == 0) {
                    this.d.a(true);
                }
                nxg nxgVar = new nxg(this, i, nuqVar, numVar, n);
                if (nuqVar.a.a()) {
                    return new nxm(nwuVar, nxgVar);
                }
                return new nxb(nwuVar, nxgVar);
            }
            nvu f = nvu.k.f("Clashing call IDs");
            p(f, true);
            return w(f, nxpVarArr);
        }
        return w(s() ? this.l : nvu.k.f("newStream() before transportReady()"), nxpVarArr);
    }
}
