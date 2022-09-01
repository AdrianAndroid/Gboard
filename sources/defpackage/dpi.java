package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import com.google.android.inputmethod.latin.R;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: dpi  reason: default package */
/* loaded from: classes.dex */
public final class dpi implements dpb {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/lstm/LstmExtension");
    public Context b;
    public ieh c;
    private boolean f;
    private mks g;
    private mks h;
    private mks i;
    private dpe j;
    private dpq k;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final hsw l = new dpf(this);
    private final hst m = new dpg(this);

    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Map, java.lang.Object] */
    public final void c() {
        final boolean z = true;
        if (!this.e.getAndSet(true)) {
            this.h.a(new dph(this), 10000L, TimeUnit.MILLISECONDS);
        }
        dpe dpeVar = this.j;
        if (dpeVar.b() || dpeVar.a() || this.f) {
            this.f = true;
            this.c.e(dpn.LSTM_TRAINING_ENABLED, Boolean.valueOf(this.j.b()));
            if (this.k == null) {
                this.k = new dpq();
            }
            Object obj = this.j.b;
            dpd dpdVar = dpd.FEDERATED_TRAINING;
            synchronized (((kcq) obj).c) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Long l = (Long) ((kcq) obj).a.get(dpdVar);
                if (l == null) {
                    ((kcq) obj).a.put(dpdVar, Long.valueOf(elapsedRealtime));
                } else {
                    if (l.longValue() != 0 && elapsedRealtime - l.longValue() < 600000) {
                        return;
                    }
                    lug.i("LstmExtension");
                    ((kcq) obj).a.put(dpdVar, Long.valueOf(elapsedRealtime));
                }
                final dpq dpqVar = this.k;
                Context context = this.b;
                dpe dpeVar2 = this.j;
                mks mksVar = this.g;
                SystemClock.elapsedRealtime();
                String str = (String) dpj.c.c();
                exb exbVar = (exb) ijl.b().a(exb.class);
                String concat = String.valueOf(str).concat(true != (exbVar != null && exbVar.a) ? "" : "_dp");
                nfh t = kac.g.t();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((kac) t.b).c = "BrellaLstmTrainingClientFederation";
                if (!TextUtils.isEmpty(concat)) {
                    nfh t2 = kae.c.t();
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    ((kae) t2.b).b = concat;
                    String str2 = (String) dpj.b.c();
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    str2.getClass();
                    ((kae) t2.b).a = str2;
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    kac kacVar = (kac) t.b;
                    kae kaeVar = (kae) t2.cz();
                    kaeVar.getClass();
                    kacVar.b = kaeVar;
                    kacVar.a = 5;
                }
                nfh t3 = kag.l.t();
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                kag kagVar = (kag) t3.b;
                kagVar.a = "unused";
                kagVar.b = 163021350;
                kagVar.c = 241621127;
                long millis = dpq.b.toMillis();
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                kag kagVar2 = (kag) t3.b;
                kagVar2.i = millis;
                kagVar2.e = true;
                kagVar2.f = 0.25f;
                kagVar2.h = true;
                kagVar2.d = true;
                kagVar2.g = false;
                long millis2 = Duration.ofDays(2L).toMillis();
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                kag kagVar3 = (kag) t3.b;
                kagVar3.j = millis2;
                kagVar3.k = 0;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                kag kagVar4 = (kag) t3.cz();
                kagVar4.getClass();
                ((kac) t.b).e = kagVar4;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((kac) t.b).f = true;
                kac kacVar2 = (kac) t.cz();
                int i = kacVar2.cO;
                if (i == 0) {
                    i = nhh.a.b(kacVar2).b(kacVar2);
                    kacVar2.cO = i;
                }
                String hexString = Integer.toHexString(i);
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                hexString.getClass();
                ((kac) t.b).d = hexString;
                SystemClock.elapsedRealtime();
                kac kacVar3 = (kac) t.cz();
                if (!dpeVar2.a() || kacVar3.a != 5 || (dca.b(context) && !ino.M(context).aj(R.string.f162700_resource_name_obfuscated_res_0x7f140730))) {
                    z = false;
                }
                Context applicationContext = context.getApplicationContext();
                fwl a2 = fwm.a();
                a2.e(kacVar3.c);
                a2.c(kacVar3.a == 5 ? ((kae) kacVar3.b).b : "bogusPopulation");
                kag kagVar5 = kacVar3.e;
                if (kagVar5 == null) {
                    kagVar5 = kag.l;
                }
                a2.a = kagVar5.c;
                long longValue = ((Long) dpj.g.c()).longValue();
                if (longValue > 0) {
                    a2.c = fyb.d(0, TimeUnit.SECONDS.toMillis(longValue));
                }
                gen c = gbh.c(applicationContext, mksVar, a2.a());
                c.k(new gel() { // from class: dpp
                    @Override // defpackage.gel
                    public final void e(Object obj2) {
                        dpq dpqVar2 = dpq.this;
                        fwk fwkVar = (fwk) obj2;
                        if (!z) {
                            gen a3 = fwkVar.a();
                            a3.k(new ewr(1));
                            a3.j(new doq(2));
                            return;
                        }
                        gen b = fwkVar.b();
                        b.k(new dop(dpqVar2, 2));
                        b.j(new doq(3));
                    }
                });
                c.j(exf.b);
            }
        }
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        boolean b = this.j.b();
        printer.println("Federated training: " + b);
        boolean a2 = this.j.a();
        printer.println("Brella in-app training: " + a2);
        boolean z2 = this.d.get();
        printer.println("Cache client creation failed: " + z2);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "LstmExtension";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        dpe dpeVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.b = context;
        this.c = ieh.j();
        this.g = gxo.a(10);
        this.h = gxo.c(10);
        if (((Boolean) dpj.e.c()).booleanValue()) {
            this.i = this.h;
        } else {
            this.i = gyc.a;
        }
        bze a2 = bzd.a(this.b);
        bzt a3 = bzu.a("lstm");
        a3.e = 100;
        a3.f = 100;
        a2.i(a3.a());
        Context context2 = this.b;
        synchronized (dpe.class) {
            if (dpe.a == null) {
                dpe.a = new dpe(context2);
            }
            dpeVar = dpe.a;
        }
        this.j = dpeVar;
        this.l.e(this.i);
        this.m.g(this.i);
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        this.c.g(dpo.LSTM_EXTENSION_ON_CREATE_APP, elapsedRealtime2);
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/lstm/LstmExtension", "onCreate", 114, "LstmExtension.java")).v("onCreate(): Finished in %d ms", elapsedRealtime2);
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.l.f();
        this.m.h();
    }
}
