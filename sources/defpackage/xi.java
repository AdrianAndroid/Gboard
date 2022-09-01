package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: xi  reason: default package */
/* loaded from: classes2.dex */
public final class xi implements Runnable {
    private final Callable a;
    private final xt b;
    private final Handler c;

    public xi(Handler handler, Callable callable, xt xtVar) {
        this.a = callable;
        this.b = xtVar;
        this.c = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        krm krmVar;
        try {
            krmVar = ((xe) this.a).call();
        } catch (Exception unused) {
            krmVar = null;
        }
        this.c.post(new bw(this.b, (Object) krmVar, 13));
    }
}
