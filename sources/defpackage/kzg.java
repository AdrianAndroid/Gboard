package defpackage;

/* compiled from: PG */
/* renamed from: kzg  reason: default package */
/* loaded from: classes.dex */
public abstract class kzg implements Runnable {
    public final fxa a;

    public kzg() {
        this.a = null;
    }

    public kzg(fxa fxaVar, byte[] bArr) {
        this.a = fxaVar;
    }

    public final void a(Exception exc) {
        fxa fxaVar = this.a;
        if (fxaVar != null) {
            fxaVar.e(exc);
        }
    }

    protected abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }
}
