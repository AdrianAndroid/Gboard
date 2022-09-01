package defpackage;

import android.util.Printer;
import java.util.Arrays;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gya  reason: default package */
/* loaded from: classes.dex */
public final class gya extends ThreadPoolExecutor implements gzv {
    private static final AtomicInteger b = new AtomicInteger(0);
    final dsl a = new dsl();
    private final String c;

    public gya(String str, int i, int i2, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 2L, timeUnit, blockingQueue, threadFactory);
        this.c = str;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        gxx[] gxxVarArr;
        gzu.a(printer, "%s : %s", this.c, super.toString());
        dsl dslVar = this.a;
        gzw gzwVar = new gzw(printer);
        synchronized (dslVar.a) {
            gxxVarArr = (gxx[]) Arrays.copyOf((Object[]) dslVar.b, 64);
        }
        int i = ((AtomicInteger) dslVar.c).get();
        for (int i2 = 0; i2 < gxxVarArr.length; i2++) {
            gxx gxxVar = gxxVarArr[(i2 + i) % 64];
            if (gxxVar != null) {
                gzwVar.println(gxxVar.toString());
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        super.execute(new gxz(this, runnable, b.getAndIncrement()));
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "ThreadPoolExecutorWrapper";
    }
}
