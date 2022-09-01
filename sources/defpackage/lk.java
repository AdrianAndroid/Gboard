package defpackage;

import android.content.res.Configuration;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: lk  reason: default package */
/* loaded from: classes.dex */
public final class lk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(Configuration configuration) {
        return configuration.getLayoutDirection();
    }

    public static Object b(ExecutorService executorService, Callable callable, int i) {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
