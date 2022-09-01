package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: iqx  reason: default package */
/* loaded from: classes.dex */
public final class iqx {
    public final Context a;
    public final mks b;
    public final ngt c;
    public final jlr d;
    private final Object e = new Object();
    private hiz f = hiz.b;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, oiy] */
    public iqx(Context context, jma jmaVar, mks mksVar, ngt ngtVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = context;
        Context b = jlx.b();
        ScheduledExecutorService a = ((iqz) jmaVar.a).a();
        jlr jlrVar = (jlr) jmaVar.b.a();
        jdg.u(jlrVar);
        clc clcVar = new clc(13);
        jdg.u(ngtVar);
        this.d = new jlr(new krj(b, a, jlrVar, clcVar, ngtVar, null, null, null));
        this.b = mksVar;
        this.c = ngtVar;
    }

    public final hiz a(krr krrVar) {
        hiz e;
        synchronized (this.e) {
            e = hiz.L(this.f).e(new dus(this, krrVar, 6), mjl.a);
            this.f = e;
        }
        return e;
    }

    public final hiz b(jma jmaVar, hiv hivVar, Executor executor) {
        mjf c = ((krj) this.d.a).c().c(ldd.d(new kqy(jmaVar, 1, null, null, null)), mjl.a);
        return hiz.k(c.g((mkh) mio.h(c.c, new mjb(c, new opu(hivVar), 0, null, null, null, null), executor)).h());
    }
}
