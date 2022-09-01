package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: hjh  reason: default package */
/* loaded from: classes.dex */
public final class hjh implements Runnable {
    public final miy a;
    private final llp b;
    private final Executor c;
    private final AtomicInteger d = new AtomicInteger(0);

    public hjh(llw llwVar, miy miyVar, Executor executor) {
        this.b = llwVar.entrySet().k();
        this.a = miyVar;
        this.c = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int andIncrement = this.d.getAndIncrement();
        if (andIncrement >= this.b.size()) {
            return;
        }
        Map.Entry entry = (Map.Entry) this.b.get(andIncrement);
        Object key = entry.getKey();
        mld mldVar = (mld) entry.getValue();
        int i = andIncrement - 1;
        if (!mldVar.isCancelled() && (i < 0 || !((mld) ((Map.Entry) this.b.get(i)).getValue()).isCancelled())) {
            try {
                mldVar.p(kcu.P(new dus(this, key, 4), this.c));
            } catch (Error | RuntimeException e) {
                mldVar.n(e);
            }
            if (andIncrement == this.b.size() - 1) {
                return;
            }
            mldVar.d(this, this.c);
            return;
        }
        while (andIncrement < this.b.size()) {
            ((mld) ((Map.Entry) this.b.get(andIncrement)).getValue()).cancel(true);
            andIncrement++;
        }
        this.d.set(this.b.size());
    }

    public final String toString() {
        lfa T = jdg.T("SequentialFutureRunnable");
        T.f("index", this.d.get());
        T.f("size", this.b.size());
        return T.toString();
    }
}
