package defpackage;

import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: mlg  reason: default package */
/* loaded from: classes.dex */
final class mlg extends TimeoutException {
    public mlg(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
