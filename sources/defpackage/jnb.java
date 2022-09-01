package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: jnb  reason: default package */
/* loaded from: classes.dex */
public final class jnb implements kpj {
    public final jil a;
    private final Context b;
    private final jml c;
    private final AtomicLong d = new AtomicLong();
    private final AtomicLong e = new AtomicLong();

    public jnb(Context context, jml jmlVar, jil jilVar) {
        this.b = context;
        this.c = jmlVar;
        this.a = jilVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    @Override // defpackage.kpj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r5) {
        /*
            r4 = this;
            java.lang.String r0 = "NetworkUsageMonitor"
            android.content.Context r1 = r4.b
            r2 = 0
            java.lang.String r3 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch: java.lang.SecurityException -> Le
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.SecurityException -> Le
            goto L14
        Le:
            java.lang.String r1 = "%s: Couldn't retrieve ConnectivityManager."
            defpackage.jmk.b(r1, r0)
            r1 = r2
        L14:
            if (r1 != 0) goto L17
            goto L1b
        L17:
            android.net.NetworkInfo r2 = r1.getActiveNetworkInfo()
        L1b:
            if (r2 != 0) goto L23
            java.lang.String r1 = "%s: Fail to get network type "
            defpackage.jmk.b(r1, r0)
            goto L41
        L23:
            int r0 = r2.getType()
            r1 = 1
            if (r0 == r1) goto L41
            int r0 = r2.getType()
            r1 = 9
            if (r0 == r1) goto L41
            int r0 = r2.getType()
            r1 = 17
            if (r0 == r1) goto L41
            java.util.concurrent.atomic.AtomicLong r0 = r4.e
            long r1 = (long) r5
            r0.getAndAdd(r1)
            goto L47
        L41:
            java.util.concurrent.atomic.AtomicLong r0 = r4.d
            long r1 = (long) r5
            r0.getAndAdd(r1)
        L47:
            jil r5 = r4.a
            jiq r5 = r5.b
            if (r5 != 0) goto L4f
            jiq r5 = defpackage.jiq.f
        L4f:
            java.lang.String r5 = r5.b
            java.util.concurrent.atomic.AtomicLong r5 = r4.d
            r5.get()
            java.util.concurrent.atomic.AtomicLong r5 = r4.e
            r5.get()
            int r5 = defpackage.jmk.a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jnb.a(int):void");
    }

    @Override // defpackage.kpj
    public final void b() {
        jml jmlVar = this.c;
        jil jilVar = this.a;
        nfh nfhVar = (nfh) jilVar.N(5);
        nfhVar.cG(jilVar);
        long andSet = this.e.getAndSet(0L);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        jil jilVar2 = (jil) nfhVar.b;
        jil jilVar3 = jil.h;
        jilVar2.a |= 16;
        jilVar2.f = andSet;
        long andSet2 = this.d.getAndSet(0L);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        jil jilVar4 = (jil) nfhVar.b;
        jilVar4.a |= 32;
        jilVar4.g = andSet2;
        jco.k(jmlVar.b((jil) nfhVar.cz()), new hyw(this, 13), mjl.a);
    }
}
