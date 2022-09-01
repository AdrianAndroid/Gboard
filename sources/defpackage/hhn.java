package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: hhn  reason: default package */
/* loaded from: classes.dex */
public final class hhn implements hhx {
    private static final ltg d = ltg.j("com/google/android/libraries/inputmethod/flag/FlagBatchUpdaterImpl");
    public final hhu a;
    public final lmx b = lmz.g();
    public final lmx c = lmz.g();
    private final AtomicBoolean e = new AtomicBoolean(false);

    public hhn(hhu hhuVar) {
        this.a = hhuVar;
    }

    public final void a() {
        if (!this.e.get()) {
            return;
        }
        throw new IllegalStateException("BatchUpdater has already been closed, please create a new one to do batch update.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.hhx, java.lang.AutoCloseable
    public final void close() {
        mko K;
        if (!this.e.compareAndSet(false, true)) {
            ((ltd) ((ltd) d.b()).k("com/google/android/libraries/inputmethod/flag/FlagBatchUpdaterImpl", "close", 101, "FlagBatchUpdaterImpl.java")).t("Batch update not started or has already completed.");
            return;
        }
        lmz g = this.b.g();
        if (!g.isEmpty()) {
            this.a.o(g, hhw.NOTIFY_FLAGS_CHANGED);
        }
        lmz g2 = this.c.g();
        if (g2.isEmpty()) {
            return;
        }
        hhu hhuVar = this.a;
        if (!hhuVar.u()) {
            idn k = hhuVar.k(hhw.PERSIST_FLAGS_TO_SHARED_PREFERENCES);
            if (hhuVar.p != null) {
                hhuVar.p.e(g2);
            }
            if (hhuVar.q != null) {
                hhuVar.q.e(g2);
            }
            K = kcu.K(k);
        } else if (hhuVar.o != null) {
            idn k2 = hhuVar.k(hhw.PERSIST_FLAGS_TO_DATA_STORE);
            ijk ijkVar = hhuVar.o;
            K = mio.g(((kqr) ijkVar.a).b(new hdp((Set) g2, 6), ijkVar.b), new hdp(k2, 4), mjl.a);
        } else {
            K = kcu.K(null);
        }
        hhu.r(K);
    }
}
