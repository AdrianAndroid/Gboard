package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import javax.net.SocketFactory;

/* compiled from: PG */
/* renamed from: iix  reason: default package */
/* loaded from: classes.dex */
final class iix implements lgb {
    static final hhl a = hhq.a("http_client_shutdown_on_finish_input", false);
    static final hhl b = hhq.a("http_client_shutdown_on_finish_input_view", false);
    private static final long c = gvu.MEBIBYTES.b(2);
    private static final Object d = new Object();
    private static oqd e;
    private final iif f;
    private final Executor g;
    private oqd h;

    public iix(iif iifVar) {
        mks a2 = gxo.a(10);
        this.f = iifVar;
        this.g = a2;
    }

    public static void c() {
        System.currentTimeMillis();
        synchronized (d) {
            oqd oqdVar = e;
            if (oqdVar != null) {
                oqdVar.c.a().shutdown();
                opk opkVar = oqdVar.s;
                ArrayList arrayList = new ArrayList();
                synchronized (opkVar) {
                    Iterator it = opkVar.e.iterator();
                    while (it.hasNext()) {
                        orf orfVar = (orf) it.next();
                        if (orfVar.m.isEmpty()) {
                            orfVar.j = true;
                            arrayList.add(orfVar);
                            it.remove();
                        }
                    }
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    oqs.s(((orf) arrayList.get(i)).d);
                }
                gvt.a(oqdVar.k);
                e = null;
            }
        }
        System.currentTimeMillis();
    }

    private final oqd d() {
        oqd oqdVar;
        System.currentTimeMillis();
        synchronized (d) {
            oqdVar = e;
            if (oqdVar == null) {
                oqc oqcVar = new oqc();
                oqcVar.i = new opc(new File(guw.a().getCacheDir(), "okhttp3_cache"), c);
                opr oprVar = new opr();
                synchronized (oprVar) {
                    oprVar.a = 64;
                }
                oprVar.e();
                oqcVar.a = oprVar;
                oqcVar.s = true;
                oqcVar.t = true;
                oqcVar.j = new iiw(SocketFactory.getDefault());
                oqdVar = oqcVar.a();
                e = oqdVar;
                new iiv().f(this.g);
                System.currentTimeMillis();
            }
        }
        oqc a2 = oqdVar.a();
        opq opqVar = this.f.a;
        if (opqVar != null) {
            a2.h = opqVar;
        }
        return a2.a();
    }

    @Override // defpackage.lgb
    /* renamed from: b */
    public final oqd a() {
        oqd oqdVar;
        System.currentTimeMillis();
        synchronized (d) {
            oqd oqdVar2 = this.h;
            if (oqdVar2 == null) {
                this.h = d();
                System.currentTimeMillis();
            } else {
                opc opcVar = oqdVar2.k;
                if (opcVar != null) {
                    if (opcVar.a.g() || oqdVar2.c.a().isShutdown()) {
                        this.h = d();
                        System.currentTimeMillis();
                    }
                } else {
                    throw new IllegalStateException("Client must have a cache");
                }
            }
            oqdVar = this.h;
        }
        return oqdVar;
    }
}
