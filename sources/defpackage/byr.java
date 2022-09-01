package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* renamed from: byr  reason: default package */
/* loaded from: classes.dex */
public abstract class byr implements mka {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/dataservice/superpacks/AbstractSyncResultCallback");
    private final String b;

    public byr(String str) {
        this.b = str;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        if (!(th instanceof CancellationException)) {
            boolean z = th instanceof jyl;
            boolean z2 = true;
            if (th instanceof jro) {
                llp llpVar = ((jro) th).a;
                int i = ((lrl) llpVar).c;
                boolean z3 = z;
                for (int i2 = 0; i2 < i; i2++) {
                    Throwable th2 = (Throwable) llpVar.get(i2);
                    if (th2 instanceof jyl) {
                        z = true;
                        z3 = true;
                    } else if (!(th2 instanceof CancellationException)) {
                        z = true;
                    }
                }
                z2 = z;
                z = z3;
            }
            if (!z2) {
                return;
            }
            c(z, th);
            return;
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/AbstractSyncResultCallback", "onFailure", 36, "AbstractSyncResultCallback.java")).w("onFailure(): %s.sync cancelled; expected if new request supersedes pending one.", this.b);
    }

    @Override // defpackage.mka
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        jre jreVar = (jre) obj;
        if (jreVar == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/AbstractSyncResultCallback", "onSuccess", 23, "AbstractSyncResultCallback.java")).w("onSuccess(): %s.sync return null", this.b);
        } else {
            d(jreVar);
        }
    }

    protected abstract void c(boolean z, Throwable th);

    protected abstract void d(jre jreVar);
}
