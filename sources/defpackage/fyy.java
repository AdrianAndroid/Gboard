package defpackage;

import android.content.Context;
import java.lang.Thread;

/* compiled from: PG */
/* renamed from: fyy  reason: default package */
/* loaded from: classes.dex */
final class fyy implements Thread.UncaughtExceptionHandler {
    private final Context a;
    private final Thread.UncaughtExceptionHandler b;

    public fyy(Context context, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = context;
        this.b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        fyb.y(this.a, th);
        this.b.uncaughtException(thread, th);
    }
}
