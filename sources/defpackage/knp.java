package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: knp  reason: default package */
/* loaded from: classes.dex */
public final class knp implements Executor {
    public static final knp a = new knp(Looper.getMainLooper());
    private final Handler b;

    private knp(Looper looper) {
        this.b = new Handler(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }
}
