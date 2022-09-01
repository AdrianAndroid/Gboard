package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* renamed from: ajn  reason: default package */
/* loaded from: classes.dex */
public final class ajn implements Executor {
    private final Handler a;
    private final /* synthetic */ int b;

    public ajn(int i) {
        this.b = i;
        this.a = new Handler(Looper.getMainLooper());
    }

    public ajn(Handler handler, int i) {
        this.b = i;
        this.a = handler;
    }

    public ajn(Looper looper, int i) {
        this.b = i;
        this.a = new gco(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.b;
        if (i == 0) {
            this.a.post(runnable);
        } else if (i != 1) {
            if (i == 2) {
                this.a.post(runnable);
            } else {
                this.a.post(runnable);
            }
        } else {
            Handler handler = this.a;
            nq.g(runnable);
            if (handler.post(runnable)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            Handler handler2 = this.a;
            sb.append(handler2);
            throw new RejectedExecutionException(handler2.toString().concat(" is shutting down"));
        }
    }

    public ajn(int i, byte[] bArr) {
        this.b = i;
        this.a = new gco(Looper.getMainLooper());
    }
}
