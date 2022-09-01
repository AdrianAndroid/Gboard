package defpackage;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: iyu  reason: default package */
/* loaded from: classes.dex */
public final class iyu {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/userfeaturecache/ProtoStoreWrapper");
    public volatile ngz b;
    public final opu c;
    private final ExecutorService d;

    public iyu(ExecutorService executorService, ngz ngzVar, opu opuVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = executorService;
        this.c = opuVar;
        this.b = ngzVar;
        kcu.U(mkh.q(opuVar.k()), new hyw(this, 11), executorService);
    }

    public final synchronized void a(leq leqVar, mka mkaVar) {
        opu opuVar = this.c;
        mko g = mio.g(mio.h(mkh.q(((kqr) opuVar.a).b(leqVar, this.d)), new ivo(this, 2), mjl.a), new iul(this, 9), mjl.a);
        kcu.U(g, new ivq(13), mjl.a);
        if (mkaVar != null) {
            kcu.U(g, mkaVar, mjl.a);
        }
    }

    public final synchronized void b(leq leqVar, mka mkaVar) {
        a(new fyn(this, leqVar, 16), mkaVar == null ? null : new hyw(mkaVar, 12));
    }
}
