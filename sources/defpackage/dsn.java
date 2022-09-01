package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.inputmethod.latin.R;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* renamed from: dsn  reason: default package */
/* loaded from: classes.dex */
public final class dsn {
    public static final lug a = hin.a;
    static volatile dsn b;
    static volatile HandlerThread c;
    public volatile Handler d;
    dsk e;
    public final dsi f = new dsi(Looper.getMainLooper());

    public static dsn a() {
        dsn dsnVar = b;
        if (dsnVar == null) {
            synchronized (dsn.class) {
                dsnVar = b;
                if (dsnVar == null) {
                    dsnVar = new dsn();
                    b = dsnVar;
                }
            }
        }
        return dsnVar;
    }

    public static ggr c() {
        nfh t = gge.h.t();
        int intValue = ((Long) dqq.b.c()).intValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        gge ggeVar = (gge) t.b;
        ggeVar.a |= 1;
        ggeVar.b = intValue;
        boolean booleanValue = ((Boolean) dqq.c.c()).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        gge ggeVar2 = (gge) t.b;
        ggeVar2.a |= 2;
        ggeVar2.c = booleanValue;
        boolean booleanValue2 = ((Boolean) dqq.l.c()).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        gge ggeVar3 = (gge) t.b;
        ggeVar3.a |= 4;
        ggeVar3.d = booleanValue2;
        int intValue2 = ((Long) dqq.m.c()).intValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        gge ggeVar4 = (gge) t.b;
        ggeVar4.a |= 8;
        ggeVar4.e = intValue2;
        int intValue3 = ((Long) dqq.n.c()).intValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        gge ggeVar5 = (gge) t.b;
        ggeVar5.a |= 16;
        ggeVar5.f = intValue3;
        boolean booleanValue3 = ((Boolean) dqq.q.c()).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        gge ggeVar6 = (gge) t.b;
        ggeVar6.a |= 32;
        ggeVar6.g = booleanValue3;
        gge ggeVar7 = (gge) t.cz();
        nfh t2 = ggr.r.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        ggr ggrVar = (ggr) t2.b;
        int i = ggrVar.a | 2;
        ggrVar.a = i;
        ggrVar.c = true;
        int i2 = i | 1;
        ggrVar.a = i2;
        ggrVar.b = true;
        int i3 = i2 | 64;
        ggrVar.a = i3;
        ggrVar.g = false;
        int i4 = i3 | 256;
        ggrVar.a = i4;
        ggrVar.i = true;
        ggeVar7.getClass();
        ggrVar.o = ggeVar7;
        ggrVar.a = 32768 | i4;
        return (ggr) t2.cz();
    }

    public static boolean m() {
        boolean z = true;
        if (b != null) {
            return true;
        }
        synchronized (dsn.class) {
            if (b == null) {
                z = false;
            }
        }
        return z;
    }

    public static dsn n(Context context, dso dsoVar) {
        dsn dsnVar = b;
        if (dsnVar == null) {
            synchronized (dsn.class) {
                dsnVar = b;
                if (dsnVar == null) {
                    dsnVar = new dsn();
                    b = dsnVar;
                }
            }
        }
        dsnVar.o(context, dsoVar, dsd.a(context));
        return dsnVar;
    }

    public final ggn b(ggh gghVar) {
        if (this.d == null) {
            ((luc) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/mozc/session/SessionExecutor", "evaluateSynchronously", 1043, "SessionExecutor.java")).t("handler is not initialized");
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        dsm dsmVar = new dsm(gghVar, countDownLatch);
        this.d.sendMessage(this.d.obtainMessage(4, dsmVar));
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            ((luc) ((luc) ((luc) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/mozc/session/SessionExecutor", "evaluateSynchronously", (char) 1055, "SessionExecutor.java")).t("Session thread is interrupted during evaluation.");
        }
        if (dsmVar.b == null) {
            return null;
        }
        ggn ggnVar = dsmVar.b.c;
        return ggnVar == null ? ggn.k : ggnVar;
    }

    public final gha d(ggy ggyVar) {
        nfh t = ggh.o.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggh gghVar = (ggh) t.b;
        gghVar.b = 26;
        int i = gghVar.a | 1;
        gghVar.a = i;
        ggyVar.getClass();
        gghVar.k = ggyVar;
        gghVar.a = i | 1024;
        ggn b2 = b((ggh) t.cz());
        if (b2 == null) {
            return null;
        }
        gha ghaVar = b2.h;
        return ghaVar == null ? gha.e : ghaVar;
    }

    public final void e(Runnable runnable) {
        if (this.d == null) {
            ((luc) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/mozc/session/SessionExecutor", "enqueueRunnable", 1173, "SessionExecutor.java")).t("handler is null.");
            return;
        }
        this.d.sendMessage(this.d.obtainMessage(7, new dsl(new iay(0, null, null), new drs(runnable, 3), this.f)));
    }

    public final void f(ggh gghVar, iay iayVar, dsj dsjVar) {
        g(gghVar, iayVar != null ? 3 : 2, iayVar, dsjVar, 0L);
    }

    public final void g(ggh gghVar, int i, iay iayVar, dsj dsjVar, long j) {
        if (this.d == null) {
            ((luc) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/mozc/session/SessionExecutor", "evaluateAsynchronouslyDelayed", 838, "SessionExecutor.java")).t("handler is null.");
            return;
        }
        dsh dshVar = new dsh(System.nanoTime(), gghVar, iayVar, dsjVar, dsjVar != null ? this.f : null);
        if (j > 0) {
            this.d.sendMessageDelayed(this.d.obtainMessage(i, dshVar), j);
        } else {
            this.d.sendMessage(this.d.obtainMessage(i, dshVar));
        }
    }

    public final void h() {
        nfh t = ggh.o.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggh gghVar = (ggh) t.b;
        gghVar.b = 10;
        gghVar.a |= 1;
        f((ggh) t.cz(), null, null);
    }

    public final void i() {
        this.f.a = System.nanoTime();
        if (this.d != null) {
            this.d.removeMessages(2);
            this.d.removeMessages(3);
            this.d.removeMessages(4);
            this.d.removeMessages(9);
            this.d.removeMessages(5);
        }
        this.f.removeMessages(0);
        this.f.removeMessages(1);
    }

    public final void j() {
        if (this.d == null) {
            return;
        }
        this.d.removeMessages(9);
    }

    public final void k(ggr ggrVar, List list) {
        if (this.d == null) {
            ((luc) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/mozc/session/SessionExecutor", "updateRequest", 1143, "SessionExecutor.java")).t("handler is null.");
            return;
        }
        nfh t = ggh.o.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggh gghVar = (ggh) t.b;
        gghVar.b = 17;
        int i = gghVar.a | 1;
        gghVar.a = i;
        ggrVar.getClass();
        gghVar.i = ggrVar;
        gghVar.a = i | 256;
        t.cP(list);
        this.d.sendMessage(this.d.obtainMessage(5, (ggh) t.cz()));
    }

    public final boolean l() {
        return this.d != null;
    }

    public final void o(Context context, dso dsoVar, dse dseVar) {
        if (!l()) {
            if (context.getResources().getBoolean(R.bool.f20610_resource_name_obfuscated_res_0x7f05008f) || !uv.e(context)) {
                HandlerThread handlerThread = c;
                if (handlerThread == null) {
                    synchronized (dsn.class) {
                        handlerThread = c;
                        if (handlerThread == null) {
                            handlerThread = new HandlerThread("MozcWorker");
                            handlerThread.setDaemon(true);
                            handlerThread.start();
                            c = handlerThread;
                        }
                    }
                }
                lug lugVar = dsf.a;
                this.e = new dsk(dsoVar, dseVar);
                this.d = new Handler(handlerThread.getLooper(), this.e);
                this.d.sendMessage(this.d.obtainMessage(0, context));
                return;
            }
            ((luc) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/mozc/session/SessionExecutor", "reset", 734, "SessionExecutor.java")).t("Device protected context is denied.");
        }
    }
}
