package defpackage;

/* compiled from: PG */
/* renamed from: frs  reason: default package */
/* loaded from: classes.dex */
public final class frs {
    private static frs b;
    private static final frt c = new frt(0, false, false, 0, 0);
    public frt a;

    private frs() {
    }

    public static synchronized frs a() {
        frs frsVar;
        synchronized (frs.class) {
            if (b == null) {
                b = new frs();
            }
            frsVar = b;
        }
        return frsVar;
    }

    public final synchronized void b(frt frtVar) {
        if (frtVar == null) {
            this.a = c;
            return;
        }
        frt frtVar2 = this.a;
        if (frtVar2 != null && frtVar2.a >= frtVar.a) {
            return;
        }
        this.a = frtVar;
    }
}
