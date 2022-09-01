package defpackage;

/* compiled from: PG */
/* renamed from: nzh  reason: default package */
/* loaded from: classes2.dex */
abstract class nzh implements Runnable {
    private final nsu a;

    /* JADX INFO: Access modifiers changed from: protected */
    public nzh(nsu nsuVar) {
        this.a = nsuVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        nsu a = this.a.a();
        try {
            a();
        } finally {
            this.a.f(a);
        }
    }
}
