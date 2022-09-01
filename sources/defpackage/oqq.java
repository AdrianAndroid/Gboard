package defpackage;

/* compiled from: PG */
/* renamed from: oqq  reason: default package */
/* loaded from: classes2.dex */
public abstract class oqq implements Runnable {
    protected final String b;

    public oqq(String str, Object... objArr) {
        this.b = oqs.i(str, objArr);
    }

    protected abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.b);
        try {
            b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
