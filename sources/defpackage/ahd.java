package defpackage;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* renamed from: ahd  reason: default package */
/* loaded from: classes.dex */
final class ahd extends FutureTask {
    final /* synthetic */ ahe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahd(ahe aheVar, Callable callable) {
        super(callable);
        this.a = aheVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        try {
            this.a.e(get());
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (CancellationException unused) {
            this.a.e(null);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
