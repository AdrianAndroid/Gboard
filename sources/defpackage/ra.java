package defpackage;

/* compiled from: PG */
/* renamed from: ra  reason: default package */
/* loaded from: classes2.dex */
class ra extends Throwable {
    public ra() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
