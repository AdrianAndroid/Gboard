package defpackage;

/* compiled from: PG */
/* renamed from: ltr  reason: default package */
/* loaded from: classes.dex */
public final class ltr extends Exception {
    public ltr(Throwable th, lub lubVar, StackTraceElement[] stackTraceElementArr) {
        super(lubVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
