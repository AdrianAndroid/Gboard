package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
@Deprecated
/* renamed from: mot  reason: default package */
/* loaded from: classes2.dex */
public final class mot extends nta {
    public static final ltg a = ltg.j("com/google/frameworks/client/data/android/binder/OnDeviceChannelBuilder");
    public final Context b;
    public final ocj c;
    public final Executor f;
    public oda d = off.c(oao.p);
    public nwd g = nwd.a;
    public nwh e = nwg.a();

    private mot(nwc nwcVar, Context context) {
        Executor ajnVar;
        this.b = context;
        ocj ocjVar = new ocj(nwcVar, nwcVar.d(), new ofz(this, 1));
        this.c = ocjVar;
        ocjVar.j = nsy.b();
        ocjVar.k = nsk.a();
        ocjVar.p = false;
        ocjVar.o = false;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        jdg.z(true, "idle timeout is %s, but must be positive", 1L);
        if (timeUnit.toDays(1L) >= 30) {
            ocjVar.l = -1L;
        } else {
            ocjVar.l = Math.max(timeUnit.toMillis(1L), ocj.b);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            ajnVar = uu.a(context);
        } else {
            ajnVar = new ajn(new Handler(context.getMainLooper()), 1);
        }
        jdg.Q(ajnVar, "androidMainThreadExecutor");
        this.f = ajnVar;
    }

    public static synchronized mot a(Application application, nwc nwcVar) {
        mot motVar;
        synchronized (mot.class) {
            motVar = new mot(nwcVar, application);
        }
        return motVar;
    }

    @Override // defpackage.nta
    public final nug b() {
        return this.c;
    }
}
