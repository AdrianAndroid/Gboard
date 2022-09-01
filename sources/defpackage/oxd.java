package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import org.chromium.net.InlineExecutionProhibitedException;

/* compiled from: PG */
/* renamed from: oxd  reason: default package */
/* loaded from: classes2.dex */
public final class oxd implements Executor {
    private final /* synthetic */ int a;
    private final Object b;

    public oxd(int i) {
        this.a = i;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            throw new lgj("The thread must already be associated to a Looper.");
        }
        this.b = new WeakReference(myLooper);
    }

    public oxd(Executor executor, int i) {
        this.a = i;
        this.b = executor;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.a == 0) {
            oxc oxcVar = new oxc(runnable, Thread.currentThread());
            this.b.execute(oxcVar);
            InlineExecutionProhibitedException inlineExecutionProhibitedException = oxcVar.b;
            if (inlineExecutionProhibitedException != null) {
                throw inlineExecutionProhibitedException;
            }
            oxcVar.a = null;
            return;
        }
        Looper looper = (Looper) ((WeakReference) this.b).get();
        if (looper == null) {
            return;
        }
        if (looper.getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(looper).post(runnable);
        }
    }
}
