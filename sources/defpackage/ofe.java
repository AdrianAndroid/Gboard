package defpackage;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: ofe  reason: default package */
/* loaded from: classes2.dex */
public final class ofe {
    private static final ofe c = new ofe();
    public final IdentityHashMap a = new IdentityHashMap();
    public ScheduledExecutorService b;

    public static Object a(ofd ofdVar) {
        return c.b(ofdVar);
    }

    public static void d(ofd ofdVar, Object obj) {
        c.e(ofdVar, obj);
    }

    final synchronized Object b(ofd ofdVar) {
        ofc ofcVar;
        ofcVar = (ofc) this.a.get(ofdVar);
        if (ofcVar == null) {
            ofcVar = new ofc(ofdVar.a());
            this.a.put(ofdVar, ofcVar);
        }
        ScheduledFuture scheduledFuture = ofcVar.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            ofcVar.c = null;
        }
        ofcVar.b++;
        return ofcVar.a;
    }

    final synchronized void e(ofd ofdVar, Object obj) {
        ofc ofcVar = (ofc) this.a.get(ofdVar);
        if (ofcVar == null) {
            new StringBuilder("No cached instance found for ").append(ofdVar);
            throw new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(ofdVar)));
        }
        boolean z = true;
        jdg.w(obj == ofcVar.a, "Releasing the wrong instance");
        jdg.G(ofcVar.b > 0, "Refcount has already reached zero");
        int i = ofcVar.b - 1;
        ofcVar.b = i;
        if (i != 0) {
            return;
        }
        if (ofcVar.c != null) {
            z = false;
        }
        jdg.G(z, "Destroy task already scheduled");
        if (this.b == null) {
            this.b = Executors.newSingleThreadScheduledExecutor(oao.i("grpc-shared-destroyer-%d"));
        }
        ofcVar.c = this.b.schedule(new obj(new bvr(this, ofcVar, ofdVar, obj, 8)), 1L, TimeUnit.SECONDS);
    }
}
