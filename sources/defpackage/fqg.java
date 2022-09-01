package defpackage;

/* compiled from: PG */
/* renamed from: fqg  reason: default package */
/* loaded from: classes.dex */
public abstract class fqg {
    public final fmv[] b;
    public final boolean c;
    public final int d;

    /* JADX INFO: Access modifiers changed from: protected */
    public fqg(fmv[] fmvVarArr, boolean z, int i) {
        this.b = fmvVarArr;
        boolean z2 = false;
        if (fmvVarArr != null && z) {
            z2 = true;
        }
        this.c = z2;
        this.d = i;
    }

    public static fqf b() {
        return new fqf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(fnr fnrVar, fxa fxaVar);
}
