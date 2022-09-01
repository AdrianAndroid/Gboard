package com.google.android.gms.learning.dynamite.training;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.libraries.micore.learning.training.nflrunner.NativeFLRunnerWrapper;
import com.google.android.libraries.micore.learning.training.nflrunner.NativeLCRunnerWrapper;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InAppTrainingServiceImpl extends gaz {
    public static final jns a = jnl.b("brella", "InAppTrngSvcImpl");
    public static mkr b;
    private static final mkr o;
    public final joy c;
    public Context f;
    public fwo g;
    public jnk h;
    public fwe i;
    public String j;
    public jpb k;
    private final AtomicBoolean p;
    private BroadcastReceiver q;
    private mkr r;
    private opu t;
    public final Object d = new Object();
    public mko e = null;
    public int l = 0;
    public byte[] m = null;
    public final Map n = DesugarCollections.synchronizedMap(new HashMap());
    private final IBinder s = new fyg(this);

    /* renamed from: $r8$lambda$MWhTgAxrux7SNa--rzihis4Qmn8  reason: not valid java name */
    public static /* synthetic */ NativeFLRunnerWrapper m26$r8$lambda$MWhTgAxrux7SNarzihis4Qmn8(jns jnsVar, joy joyVar, String str, joc jocVar, mlu mluVar, fwo fwoVar, jpb jpbVar, joz jozVar, mfx mfxVar, jno jnoVar, fwe fweVar, String str2, jnq jnqVar, joi joiVar, File file, ExecutorService executorService, mma mmaVar, jou jouVar) {
        return new NativeFLRunnerWrapper(jnsVar, joyVar, str, jocVar, mluVar, fwoVar, jpbVar, jozVar, mfxVar, jnoVar, fweVar, str2, jnqVar, joiVar, file, executorService, mmaVar, jouVar);
    }

    public static /* synthetic */ gck $r8$lambda$XdNzzuo7si2AiIP6IJfe6ZUE4bc(InAppTrainingServiceImpl inAppTrainingServiceImpl, List list) {
        return new gck(inAppTrainingServiceImpl.f, list, inAppTrainingServiceImpl.g, inAppTrainingServiceImpl.i, a);
    }

    public static /* synthetic */ NativeLCRunnerWrapper $r8$lambda$jNvh_bHKrImARTckqoVHwrS1HtY(jns jnsVar, joy joyVar, String str, joc jocVar, mlu mluVar, fwo fwoVar, jpb jpbVar, joz jozVar, mfx mfxVar, fwe fweVar, joi joiVar, File file, ExecutorService executorService, mma mmaVar, jou jouVar) {
        return new NativeLCRunnerWrapper(jnsVar, joyVar, str, jocVar, mluVar, fwoVar, jpbVar, jozVar, mfxVar, fweVar, joiVar, file, executorService, mmaVar, jouVar);
    }

    static {
        gjz gjzVar = gcn.a;
        nzv nzvVar = new nzv((byte[]) null);
        nzvVar.c("brella-inapptrngsvc-%d");
        o = kcu.B(gjz.f(nzv.d(nzvVar)));
    }

    public InAppTrainingServiceImpl() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.p = atomicBoolean;
        Objects.requireNonNull(atomicBoolean);
        this.c = new joy(new etm(atomicBoolean, 6));
    }

    public static void b(mko mkoVar, Context context) {
        try {
            kcu.S(mkoVar);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            a.j(e, "Training failed");
            mll mllVar = new mll(e);
            fyb.y(context, mllVar);
            throw mllVar;
        }
    }

    public static final void i(fyx fyxVar) {
        try {
            fyxVar.a();
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.gba
    public void addHttpUrlConnectionFactory(String str, gal galVar) {
        this.n.put(str, galVar);
    }

    public final void c(fyx fyxVar) {
        synchronized (this.d) {
            this.e = null;
        }
        i(fyxVar);
    }

    public final void d(final String str, final fzf fzfVar, final String str2, final joc jocVar, final byte[] bArr, final fyk fykVar) {
        jnk jnkVar;
        String str3;
        try {
            if (this.i.aE()) {
                jnkVar = this.h;
                jnkVar.d();
            } else {
                jnkVar = null;
            }
            jnk jnkVar2 = jnkVar;
            boolean z = fzfVar.b() == 1;
            final String str4 = this.j + "/" + str;
            final String s = mhb.s(str4, z ? fzfVar.a().a : "");
            if (z) {
                str3 = fzfVar.a().a;
            } else {
                str3 = fzfVar.c().c;
            }
            final String str5 = str3;
            final boolean z2 = z;
            Runnable runnable = new Runnable() { // from class: fyr
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:100:0x090b A[Catch: all -> 0x090f, TRY_ENTER, TryCatch #68 {all -> 0x0924, blocks: (B:5:0x002c, B:12:0x0038, B:489:0x004b, B:14:0x005f, B:16:0x0070, B:17:0x0075, B:19:0x007f, B:21:0x008f, B:22:0x0095, B:24:0x00b2, B:25:0x00b8, B:26:0x00d7, B:69:0x07cd, B:70:0x07db, B:98:0x08fc, B:99:0x090a, B:102:0x090e, B:82:0x08de, B:83:0x08ec, B:481:0x00d2, B:483:0x0913, B:491:0x0054, B:492:0x005a, B:72:0x07dd, B:73:0x07df, B:84:0x08ed, B:85:0x08ef, B:100:0x090b, B:101:0x090d), top: B:4:0x002c }] */
                /* JADX WARN: Removed duplicated region for block: B:188:0x033a  */
                /* JADX WARN: Removed duplicated region for block: B:191:0x033f  */
                /* JADX WARN: Removed duplicated region for block: B:216:0x0408 A[Catch: all -> 0x05a7, TRY_ENTER, TRY_LEAVE, TryCatch #66 {all -> 0x05a7, blocks: (B:213:0x03cc, B:216:0x0408, B:331:0x0413), top: B:212:0x03cc }] */
                /* JADX WARN: Removed duplicated region for block: B:231:0x04bd  */
                /* JADX WARN: Removed duplicated region for block: B:235:0x04cb A[Catch: all -> 0x04b0, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x04b0, blocks: (B:297:0x04ad, B:235:0x04cb, B:238:0x04d5, B:241:0x04e4, B:244:0x04ee), top: B:296:0x04ad }] */
                /* JADX WARN: Removed duplicated region for block: B:238:0x04d5 A[Catch: all -> 0x04b0, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x04b0, blocks: (B:297:0x04ad, B:235:0x04cb, B:238:0x04d5, B:241:0x04e4, B:244:0x04ee), top: B:296:0x04ad }] */
                /* JADX WARN: Removed duplicated region for block: B:241:0x04e4 A[Catch: all -> 0x04b0, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x04b0, blocks: (B:297:0x04ad, B:235:0x04cb, B:238:0x04d5, B:241:0x04e4, B:244:0x04ee), top: B:296:0x04ad }] */
                /* JADX WARN: Removed duplicated region for block: B:244:0x04ee A[Catch: all -> 0x04b0, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x04b0, blocks: (B:297:0x04ad, B:235:0x04cb, B:238:0x04d5, B:241:0x04e4, B:244:0x04ee), top: B:296:0x04ad }] */
                /* JADX WARN: Removed duplicated region for block: B:256:0x0503  */
                /* JADX WARN: Removed duplicated region for block: B:261:0x0512  */
                /* JADX WARN: Removed duplicated region for block: B:263:0x0537  */
                /* JADX WARN: Removed duplicated region for block: B:272:0x051d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:283:0x0515  */
                /* JADX WARN: Removed duplicated region for block: B:289:0x050e  */
                /* JADX WARN: Removed duplicated region for block: B:293:0x04a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:302:0x048f A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:356:0x03ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:381:0x0353  */
                /* JADX WARN: Removed duplicated region for block: B:392:0x02e6  */
                /* JADX WARN: Removed duplicated region for block: B:394:0x02e9 A[Catch: all -> 0x05fd, TRY_ENTER, TryCatch #56 {all -> 0x05fd, blocks: (B:181:0x0258, B:184:0x0300, B:385:0x029b, B:393:0x02ed, B:394:0x02e9, B:395:0x02ba, B:401:0x02e1, B:404:0x02d2), top: B:180:0x0258 }] */
                /* JADX WARN: Removed duplicated region for block: B:46:0x0208 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:71:0x07dc  */
                /* JADX WARN: Removed duplicated region for block: B:84:0x08ed A[Catch: all -> 0x08f6, TRY_ENTER, TryCatch #68 {all -> 0x0924, blocks: (B:5:0x002c, B:12:0x0038, B:489:0x004b, B:14:0x005f, B:16:0x0070, B:17:0x0075, B:19:0x007f, B:21:0x008f, B:22:0x0095, B:24:0x00b2, B:25:0x00b8, B:26:0x00d7, B:69:0x07cd, B:70:0x07db, B:98:0x08fc, B:99:0x090a, B:102:0x090e, B:82:0x08de, B:83:0x08ec, B:481:0x00d2, B:483:0x0913, B:491:0x0054, B:492:0x005a, B:72:0x07dd, B:73:0x07df, B:84:0x08ed, B:85:0x08ef, B:100:0x090b, B:101:0x090d), top: B:4:0x002c }] */
                /* JADX WARN: Type inference failed for: r11v11 */
                /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r11v6, types: [fwe] */
                /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, fwo] */
                /* JADX WARN: Type inference failed for: r2v10, types: [com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl] */
                /* JADX WARN: Type inference failed for: r2v12 */
                /* JADX WARN: Type inference failed for: r2v6, types: [com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl] */
                /* JADX WARN: Type inference failed for: r2v8, types: [com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl] */
                /* JADX WARN: Type inference failed for: r2v9 */
                /* JADX WARN: Type inference failed for: r2v97 */
                /* JADX WARN: Type inference failed for: r2v99 */
                /* JADX WARN: Type inference failed for: r3v12 */
                /* JADX WARN: Type inference failed for: r3v13 */
                /* JADX WARN: Type inference failed for: r3v14 */
                /* JADX WARN: Type inference failed for: r3v15 */
                /* JADX WARN: Type inference failed for: r3v23 */
                /* JADX WARN: Type inference failed for: r3v43 */
                /* JADX WARN: Type inference failed for: r4v12 */
                /* JADX WARN: Type inference failed for: r4v13, types: [mko] */
                /* JADX WARN: Type inference failed for: r4v14 */
                /* JADX WARN: Type inference failed for: r4v16, types: [mko] */
                /* JADX WARN: Type inference failed for: r4v17 */
                /* JADX WARN: Type inference failed for: r4v20 */
                /* JADX WARN: Type inference failed for: r4v44 */
                /* JADX WARN: Type inference failed for: r4v63 */
                /* JADX WARN: Type inference failed for: r4v64 */
                /* JADX WARN: Type inference failed for: r5v12, types: [int] */
                /* JADX WARN: Type inference failed for: r5v13 */
                /* JADX WARN: Type inference failed for: r5v22, types: [com.google.android.libraries.micore.learning.training.nflrunner.NativeFLRunnerDeps] */
                /* JADX WARN: Type inference failed for: r5v26, types: [nfm, mzc] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:421:0x0865 -> B:416:0x0860). Please submit an issue!!! */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 2356
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.fyr.run():void");
                }
            };
            synchronized (this.d) {
                if (this.e != null) {
                    a.h("Overlapping training runs");
                    this.g.e(job.IN_APP_TRAINING_BACKGROUND_SERVICE_OVERLAPPING_RUN);
                    c(new fyq(fykVar, 2));
                    if (jnkVar2 == null) {
                        return;
                    }
                    jnkVar2.close();
                } else if (!e(z, s, jocVar, fykVar)) {
                    if (jnkVar2 == null) {
                        return;
                    }
                    jnkVar2.close();
                } else {
                    mko hP = this.r.hP(runnable);
                    hP.d(new fso(hP, fykVar, 4), mjl.a);
                    this.e = hP;
                    this.r.execute(new fso(hP, this.f.getApplicationContext(), 5));
                    if (jnkVar2 == null) {
                        return;
                    }
                    jnkVar2.close();
                }
            }
        } catch (Throwable th) {
            fyb.y(this.f, th);
            throw th;
        }
    }

    public final boolean e(boolean z, String str, joc jocVar, fyk fykVar) {
        Set b2;
        if (this.p.get()) {
            this.g.e(job.BACKGROUND_TRAINING_INTERRUPT_CUSTOM_INTERRUPTION_FLAG);
            c(new fyq(fykVar, 1));
            return false;
        }
        if (z) {
            b2 = this.k.a(jocVar, str);
        } else {
            b2 = this.k.b(jocVar, str);
        }
        this.k.c(b2, null);
        if (b2.isEmpty()) {
            return true;
        }
        String.valueOf(b2);
        c(new fyq(fykVar, 0));
        return false;
    }

    public final boolean f() {
        this.p.set(true);
        for (Map.Entry entry : this.c.a.entrySet()) {
            ((Executor) entry.getValue()).execute((Runnable) entry.getKey());
        }
        synchronized (this.d) {
            mko mkoVar = this.e;
            if (mkoVar != null) {
                mkoVar.cancel(true);
                this.e = null;
                return true;
            }
            return false;
        }
    }

    public final int g(List list, String str, fzf fzfVar, byte[] bArr) {
        if (fzfVar.b() == 2 || this.i.an()) {
            return $r8$lambda$XdNzzuo7si2AiIP6IJfe6ZUE4bc((InAppTrainingServiceImpl) this.t.a, list).a(str, fzfVar, bArr);
        }
        return 1;
    }

    public final void h(String str, String str2, String str3, int i, joc jocVar, byte[] bArr, fyk fykVar) {
        nfh t = jnz.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        jnz jnzVar = (jnz) t.b;
        str2.getClass();
        jnzVar.a = str2;
        jnzVar.b = lvw.y(i);
        jnz jnzVar2 = (jnz) t.cz();
        if (!this.i.al()) {
            d(str, fyb.b(jnzVar2), str3, jocVar, bArr, fykVar);
        } else {
            d(str, fyb.b(jnzVar2), str3, jocVar, bArr, new fyw(this, str, str2, str3, i, jocVar, bArr, fykVar));
        }
    }

    public final gca j(fxa fxaVar) {
        return new gca((fwo) this.h.c(fwo.class), this.j, new gsd(this, fxaVar, null, null), null);
    }

    @Override // defpackage.gba
    public IBinder onBind(Intent intent) {
        String.valueOf(intent);
        return this.s;
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.gba
    public void onCreate(ftm ftmVar) {
        mkr mkrVar = o;
        opu opuVar = new opu(this);
        try {
            this.f = (Context) ftl.c(ftmVar);
            this.r = mkrVar;
            this.t = opuVar;
            fxf.a();
            jnk b2 = jnk.b(this.f.getApplicationContext());
            this.h = b2;
            this.g = (fwo) b2.c(fwo.class);
            this.i = (fwe) this.h.c(fwe.class);
            this.j = this.f.getApplicationContext().getPackageName();
            this.k = (jpb) this.h.c(jpb.class);
            fyv fyvVar = new fyv(this);
            this.q = fyvVar;
            gcl.g(this.f, fyvVar, new IntentFilter("android.intent.action.SCREEN_ON"));
            this.g.e(job.BACKGROUND_TRAINING_TASK_CREATE);
        } catch (Throwable th) {
            fwo fwoVar = this.g;
            if (fwoVar != null) {
                fwoVar.e(job.BACKGROUND_TRAINING_TASK_CREATE_ERROR);
            }
            fyb.y((Context) ftl.c(ftmVar), th);
            throw th;
        }
    }

    @Override // defpackage.gba
    public void onDestroy() {
        try {
            this.g.e(job.BACKGROUND_TRAINING_TASK_DESTROY);
            if (f()) {
                this.g.e(job.BACKGROUND_TRAINING_INTERRUPT_SERVICE_DESTROYED);
            }
            this.f.unregisterReceiver(this.q);
            this.h.close();
            if (this.i.aE()) {
                return;
            }
            this.h = null;
        } catch (RuntimeException e) {
            this.g.e(job.BACKGROUND_TRAINING_TASK_DESTROY_ERROR);
            fyb.y(this.f, e);
            throw e;
        }
    }

    @Override // defpackage.gba
    public void onRebind(Intent intent) {
    }

    @Override // defpackage.gba
    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    @Override // defpackage.gba
    public void onTrimMemory(int i) {
        try {
            if (i < this.i.m()) {
                return;
            }
            this.g.e(job.BACKGROUND_TRAINING_INTERRUPT_LOW_MEMORY);
            f();
        } catch (Throwable th) {
            fyb.y(this.f, th);
            throw th;
        }
    }

    @Override // defpackage.gba
    public boolean onUnbind(Intent intent) {
        return false;
    }

    @Override // defpackage.gba
    public void setPRFSdkImpl() {
    }
}
