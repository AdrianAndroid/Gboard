package defpackage;

import android.util.SparseArray;
import java.io.Closeable;

/* compiled from: PG */
/* renamed from: hyn  reason: default package */
/* loaded from: classes.dex */
public final class hyn implements Closeable {
    private static final ltg d = ltg.i();
    public final mks a = gxp.a().f("AnrDetector", 10);
    public final SparseArray b = new SparseArray();
    public mti c;

    public final void a(mti mtiVar) {
        oll.e(mtiVar, "nativeCall");
        mkq mkqVar = (mkq) this.b.get(mtiVar.ar);
        if (mkqVar != null) {
            if (!mkqVar.cancel(false)) {
                this.a.execute(new hvg(mtiVar, 11));
            }
            this.b.remove(mtiVar.ar);
        } else {
            ((ltd) d.d()).j(ltp.e("com/google/android/libraries/inputmethod/lethe/anr/AnrDetector", "stopNativeCall", 80, "AnrDetector.kt")).u("Failed to find startNativeCall for operation %d", mtiVar.ar);
        }
        this.c = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mti mtiVar = this.c;
        if (mtiVar != null) {
            a(mtiVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hyn) && oll.g(this.a, ((hyn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        mks mksVar = this.a;
        return "AnrDetector(backgroundExecutor=" + mksVar + ")";
    }
}
