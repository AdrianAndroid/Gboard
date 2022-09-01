package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: moe  reason: default package */
/* loaded from: classes2.dex */
public final class moe implements mog, moh {
    private static final ThreadFactory c = kjh.b;
    public final moi a;
    public final moi b;
    private final Context d;
    private final Set e;
    private final Executor f;

    public moe(Context context, String str, Set set, moi moiVar) {
        mmv mmvVar = new mmv(context, str, 2);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), c);
        this.a = mmvVar;
        this.e = set;
        this.f = threadPoolExecutor;
        this.b = moiVar;
        this.d = context;
    }

    public final void a() {
        if (this.e.size() <= 0) {
            gni.e(null);
        } else if (!lj.b(this.d)) {
            gni.e(null);
        } else {
            this.f.execute(new fso(new ger(), new jiz(this, 16), 16));
        }
    }
}
