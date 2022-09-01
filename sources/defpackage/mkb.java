package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: mkb  reason: default package */
/* loaded from: classes.dex */
public final class mkb implements Runnable {
    final Future a;
    final mka b;

    public mkb(Future future, mka mkaVar) {
        this.a = future;
        this.b = mkaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable j;
        Future future = this.a;
        if (!(future instanceof mlm) || (j = ((mlm) future).j()) == null) {
            try {
                this.b.b(kcu.S(this.a));
                return;
            } catch (Error e) {
                e = e;
                this.b.a(e);
                return;
            } catch (RuntimeException e2) {
                e = e2;
                this.b.a(e);
                return;
            } catch (ExecutionException e3) {
                this.b.a(e3.getCause());
                return;
            }
        }
        this.b.a(j);
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.a(this.b);
        return S.toString();
    }
}
