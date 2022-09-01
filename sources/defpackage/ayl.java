package defpackage;

import android.text.TextUtils;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: ayl  reason: default package */
/* loaded from: classes.dex */
public final class ayl {
    public String a;
    public long b;
    private final boolean c;
    private int d;
    private int e;
    private final ThreadFactory f = new ayn(0);

    public ayl(boolean z) {
        this.c = z;
    }

    public final ayp a() {
        if (!TextUtils.isEmpty(this.a)) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.d, this.e, this.b, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ayo(this.f, this.a, this.c));
            if (this.b != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new ayp(threadPoolExecutor);
        }
        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: ".concat(String.valueOf(this.a)));
    }

    public final void b(int i) {
        this.d = i;
        this.e = i;
    }
}
