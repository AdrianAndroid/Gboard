package defpackage;

/* compiled from: PG */
/* renamed from: gxz  reason: default package */
/* loaded from: classes.dex */
final class gxz implements Runnable {
    final /* synthetic */ gya a;
    private final Runnable b;
    private final String c;
    private final long d = System.nanoTime();
    private final gxv e;

    public gxz(gya gyaVar, Runnable runnable, int i) {
        this.a = gyaVar;
        this.b = runnable;
        String str = runnable.getClass().getSimpleName() + "@" + Long.toHexString(System.identityHashCode(runnable)) + "/" + i;
        this.c = str;
        gxv gxvVar = new gxv(str, gyaVar.getQueue().size(), System.currentTimeMillis());
        this.e = gxvVar;
        gyaVar.a.k(gxvVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        long nanoTime = System.nanoTime();
        this.a.a.k(new gxy(currentThread.getName(), this.c, this.a.getQueue().size(), System.currentTimeMillis(), nanoTime - this.d));
        try {
            this.b.run();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        this.a.a.k(new gxw(currentThread.getName(), this.c, this.a.getQueue().size(), System.currentTimeMillis(), System.nanoTime() - nanoTime, th));
        if (th != null) {
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw th;
            }
        }
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.a(this.c);
        S.a(this.b);
        return S.toString();
    }
}
