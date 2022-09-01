package defpackage;

/* compiled from: PG */
/* renamed from: mhx  reason: default package */
/* loaded from: classes.dex */
class mhx extends Throwable {
    public mhx() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
