package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kcw  reason: default package */
/* loaded from: classes.dex */
public final class kcw extends kcu implements kca, kci, kch, kdt {
    private static final ltg b = ltg.j("com/google/android/libraries/performance/primes/metrics/battery/BatteryMetricServiceImpl");
    private final Context c;
    private final kcl d;
    private final Executor e;
    private final kdg f;
    private final kcq g;
    private final kdq h;
    final AtomicBoolean a = new AtomicBoolean();
    private final AtomicBoolean i = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    public kcw(kdr kdrVar, Context context, kcl kclVar, mks mksVar, nox noxVar, kdg kdgVar, kcq kcqVar, oiy oiyVar, Executor executor) {
        new ConcurrentHashMap();
        this.h = kdrVar.a(executor, noxVar, oiyVar);
        this.c = context;
        this.d = kclVar;
        this.e = Build.VERSION.SDK_INT < 31 ? executor : mksVar;
        this.f = kdgVar;
        this.g = kcqVar;
    }

    private final mko ae(final onb onbVar) {
        return kcu.P(new mix() { // from class: kcv
            @Override // defpackage.mix
            public final mko a() {
                return kcw.this.aa(onbVar, null);
            }
        }, this.e);
    }

    @Override // defpackage.kca
    public void a(Activity activity, Bundle bundle) {
        if (!this.i.getAndSet(true)) {
            b(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0315, code lost:
        if ((r5 / r8) <= 3.472222222222222E-5d) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0097 A[Catch: all -> 0x0554, TryCatch #1 {, blocks: (B:9:0x0014, B:14:0x004b, B:17:0x004f, B:21:0x0055, B:22:0x0090, B:25:0x010d, B:202:0x0097, B:204:0x009d, B:206:0x00a5, B:208:0x00aa, B:210:0x00b0, B:211:0x00b2, B:213:0x00b9, B:214:0x00c2, B:216:0x00c8, B:217:0x00d1, B:219:0x00d7, B:220:0x00e0, B:222:0x00e6, B:223:0x00ef, B:225:0x00f5, B:226:0x00fa, B:228:0x00fe, B:230:0x0102, B:232:0x0109, B:243:0x0060, B:244:0x0074, B:246:0x0034), top: B:8:0x0014, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ defpackage.mko aa(defpackage.onb r18, defpackage.kbh r19) {
        /*
            Method dump skipped, instructions count: 1369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcw.aa(onb, kbh):mko");
    }

    public mko ab() {
        if (!gkm.d(this.c)) {
            return mkk.a;
        }
        try {
            jdg.F(this.a.getAndSet(false));
            return ae(onb.FOREGROUND_TO_BACKGROUND);
        } catch (Exception e) {
            return kcu.J(e);
        }
    }

    public mko ac() {
        if (!gkm.d(this.c)) {
            return mkk.a;
        }
        if (this.a.getAndSet(true)) {
            ((ltd) ((ltd) b.d()).k("com/google/android/libraries/performance/primes/metrics/battery/BatteryMetricServiceImpl", "onAppToForeground", 135, "BatteryMetricServiceImpl.java")).t("App is already in the foreground.");
            return kcu.I();
        }
        return ae(onb.BACKGROUND_TO_FOREGROUND);
    }

    @Override // defpackage.kdt
    public void ad() {
        this.d.a(this);
    }

    @Override // defpackage.kci
    public void b(Activity activity) {
        if (!this.a.get()) {
            ac();
        }
    }

    @Override // defpackage.kch
    public void c(Activity activity) {
        ab();
    }
}
