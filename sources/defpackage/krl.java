package defpackage;

/* compiled from: PG */
/* renamed from: krl  reason: default package */
/* loaded from: classes.dex */
public abstract class krl extends mik implements Runnable {
    public static final /* synthetic */ int a = 0;
    private final mop b;

    public krl(mop mopVar, byte[] bArr) {
        this.b = mopVar;
    }

    @Override // defpackage.mik
    public final String b() {
        Object obj = this.b.a;
        return "query=[" + ((String) obj) + "]";
    }

    protected abstract void e(mop mopVar);

    @Override // java.lang.Runnable
    public final void run() {
        if (!isCancelled()) {
            try {
                Object obj = this.b.a;
                lcq b = ldh.b("Query: " + ((String) obj), ldi.a);
                e(this.b);
                b.close();
            } catch (Throwable th) {
                n(th);
            }
        }
    }
}
