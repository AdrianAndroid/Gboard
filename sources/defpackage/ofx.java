package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: ofx  reason: default package */
/* loaded from: classes2.dex */
public final class ofx implements ofd {
    private final /* synthetic */ int a;

    public ofx(int i) {
        this.a = i;
    }

    @Override // defpackage.ofd
    public final /* synthetic */ Object a() {
        if (this.a == 0) {
            return Executors.newCachedThreadPool(oao.i("grpc-okhttp-%d"));
        }
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, oao.i("grpc-timer-%d"));
        try {
            newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(newScheduledThreadPool, true);
        } catch (NoSuchMethodException unused) {
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
        return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
    }

    @Override // defpackage.ofd
    public final /* synthetic */ void b(Object obj) {
        if (this.a == 0) {
            ((ExecutorService) obj).shutdown();
        } else {
            ((ScheduledExecutorService) obj).shutdown();
        }
    }
}
