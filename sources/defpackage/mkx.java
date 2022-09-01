package defpackage;

/* compiled from: PG */
/* renamed from: mkx  reason: default package */
/* loaded from: classes.dex */
final class mkx extends mif implements Runnable {
    private final Runnable a;

    public mkx(Runnable runnable) {
        jdg.u(runnable);
        this.a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mik
    public final String b() {
        return "task=[" + this.a + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (Error | RuntimeException e) {
            n(e);
            throw e;
        }
    }
}
