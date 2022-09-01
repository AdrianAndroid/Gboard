package defpackage;

/* compiled from: PG */
/* renamed from: nvy  reason: default package */
/* loaded from: classes2.dex */
public final class nvy implements Runnable {
    final Runnable a;
    public boolean b;
    public boolean c;

    public nvy(Runnable runnable) {
        jdg.Q(runnable, "task");
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.b) {
            this.c = true;
            this.a.run();
        }
    }
}
