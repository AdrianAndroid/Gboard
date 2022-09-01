package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: aha  reason: default package */
/* loaded from: classes.dex */
public final class aha extends ahc {
    public volatile agz a;
    public volatile agz b;
    public List c;
    private Executor k;

    public aha(Context context) {
        super(context.getApplicationContext());
    }

    public final void a() {
        if (this.b != null || this.a == null) {
            return;
        }
        boolean z = this.a.a;
        if (this.k == null) {
            this.k = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        agz agzVar = this.a;
        Executor executor = this.k;
        if (agzVar.f == 1) {
            agzVar.f = 2;
            executor.execute(agzVar.c);
            return;
        }
        int i = agzVar.f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public final void b(List list) {
        this.c = list;
        ahb ahbVar = this.e;
        if (ahbVar != null) {
            if (agu.b(2)) {
                new StringBuilder("onLoadComplete: ").append(ahbVar);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                ((agd) ahbVar).h(list);
                return;
            }
            if (agu.b(4)) {
                Log.i("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            ((agd) ahbVar).i(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(agz agzVar) {
        if (this.b == agzVar) {
            SystemClock.uptimeMillis();
            this.b = null;
            a();
        }
    }

    @Override // defpackage.ahc
    public final void d() {
        if (this.a != null) {
            if (!this.g) {
                this.j = true;
            }
            if (this.b != null) {
                boolean z = this.a.a;
                this.a = null;
                return;
            }
            boolean z2 = this.a.a;
            agz agzVar = this.a;
            agzVar.d.set(true);
            if (agzVar.c.cancel(false)) {
                this.b = this.a;
            }
            this.a = null;
        }
    }
}
