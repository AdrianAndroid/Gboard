package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ija  reason: default package */
/* loaded from: classes.dex */
public class ija {
    private final boolean a;
    private final Runnable b;
    private final Runnable c;
    private int d = 0;

    public ija(boolean z, Runnable runnable, Runnable runnable2) {
        if (!z || runnable2 == null) {
            this.a = z;
            this.b = runnable;
            this.c = runnable2;
            return;
        }
        throw new IllegalArgumentException("unreadyCallback should be null when unregisterOnReady is true");
    }

    public final void a() {
        if (this.d != 2) {
            this.d = 1;
            return;
        }
        throw new IllegalStateException("The listener has been used and unregistered");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.a) {
            f();
        }
        this.b.run();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void d(Executor executor) {
        throw null;
    }

    public void e(Executor executor) {
        throw null;
    }

    public void f() {
        if (this.d == 1) {
            this.d = 2;
        }
    }
}
