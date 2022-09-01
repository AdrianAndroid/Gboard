package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gjz  reason: default package */
/* loaded from: classes.dex */
public final class gjz {
    public static boolean a() {
        npv.b();
        return nps.a.a().e();
    }

    public static boolean b(Context context) {
        return "com.google.android.gms".equals(context.getPackageName());
    }

    public static final long c() {
        if (gix.a) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.elapsedRealtime() * 1000000;
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final ExecutorService e(int i, ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public static final ExecutorService f(ThreadFactory threadFactory) {
        return e(1, threadFactory);
    }

    public static fwq g(jod jodVar) {
        int x = lvw.x(jodVar.a);
        int i = 1;
        if (x != 0 && x == 3) {
            i = 0;
        }
        ney neyVar = jodVar.b;
        if (neyVar == null) {
            neyVar = ney.c;
        }
        return fyb.d(i, nis.a(neyVar));
    }

    public static jnz h(fwm fwmVar) {
        nfh t = jnz.d.t();
        String str = fwmVar.e;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        str.getClass();
        ((jnz) t.b).a = str;
        ((jnz) t.b).b = lvw.y(k(fwmVar.f));
        fwq fwqVar = fwmVar.k;
        if (fwqVar != null) {
            jod j = j(fwqVar);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            j.getClass();
            ((jnz) t.b).c = j;
        }
        return (jnz) t.cz();
    }

    public static joa i(fwm fwmVar) {
        nfh t = joa.f.t();
        String uri = fwmVar.g.toString();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        uri.getClass();
        ((joa) t.b).a = uri;
        String uri2 = fwmVar.j.toString();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        uri2.getClass();
        ((joa) t.b).c = uri2;
        jod j = j(fwmVar.k);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        j.getClass();
        ((joa) t.b).d = j;
        Uri uri3 = fwmVar.l;
        if (uri3 != null) {
            String uri4 = uri3.toString();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            uri4.getClass();
            ((joa) t.b).e = uri4;
        }
        return (joa) t.cz();
    }

    public static jod j(fwq fwqVar) {
        if (fwqVar == null) {
            return jod.c;
        }
        nfh t = jod.c.t();
        int l = l(fwqVar.a);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((jod) t.b).a = l - 2;
        ney b = nis.b(fwqVar.b);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        b.getClass();
        ((jod) t.b).b = b;
        return (jod) t.cz();
    }

    public static int k(int i) {
        if (i != 0) {
            if (i == 1) {
                return 3;
            }
            if (i == 2) {
                return 4;
            }
            return i != 3 ? 1 : 5;
        }
        return 2;
    }

    public static int l(int i) {
        if (i == 0) {
            return 3;
        }
        if (i != 1) {
            throw new IllegalStateException("Unknown value for scheduling mode");
        }
        return 4;
    }
}
