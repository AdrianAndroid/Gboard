package defpackage;

/* compiled from: PG */
/* renamed from: cdf  reason: default package */
/* loaded from: classes.dex */
public final class cdf implements AutoCloseable {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/delight5/dlam/training/DlamTrainingData");
    public cdd b = null;

    @Override // java.lang.AutoCloseable
    public final void close() {
        cdd cddVar = this.b;
        if (cddVar != null) {
            cddVar.close();
        }
    }
}
