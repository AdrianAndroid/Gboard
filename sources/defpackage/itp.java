package defpackage;

import j$.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: itp  reason: default package */
/* loaded from: classes.dex */
public final class itp implements fwh {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/trainingcache/consumer/materializermanager/MaterializerIterator");
    public final String b;
    public final itt c;
    public final ConcurrentLinkedQueue d = new ConcurrentLinkedQueue();
    private final Executor e;

    public itp(String str, itt ittVar, Executor executor) {
        this.b = str;
        this.c = ittVar;
        this.e = executor;
    }

    @Override // defpackage.fwh
    public final void b(fwg fwgVar) {
        jls jlsVar = (jls) this.d.poll();
        if (jlsVar == null) {
            long currentTimeMillis = System.currentTimeMillis();
            itt ittVar = this.c;
            Objects.requireNonNull(ittVar);
            kcu.U(kcu.O(new evl(ittVar, 20), this.e), new ito(this, fwgVar, currentTimeMillis), this.e);
            return;
        }
        fwgVar.b((byte[]) jlsVar.a, (byte[]) jlsVar.b);
        ieh.j().e(iwc.MATERIALIZER_TF_EXAMPLE, this.b);
    }

    @Override // defpackage.fwh
    public final void c(int i) {
        kcu.U(kcu.N(new dob(this, i, 10), this.e), new cbx(18), this.e);
    }

    @Override // defpackage.fwh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kcu.U(kcu.N(new ihi(this, 9), this.e), new hyw(this, 7), this.e);
        this.d.clear();
    }
}
