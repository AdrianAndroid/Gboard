package defpackage;

/* compiled from: PG */
/* renamed from: mla  reason: default package */
/* loaded from: classes.dex */
final class mla implements Runnable {
    final /* synthetic */ Runnable a;

    public mla(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    public final String toString() {
        return this.a.toString();
    }
}
