package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: duz  reason: default package */
/* loaded from: classes.dex */
public final class duz implements dup {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/service/NgaGrpcClient");
    private static final lmz h = lmz.s(fhz.FIELD_CHANGE, fhz.APPLICATION_CONSUMED_CONTENT);
    public final dur c;
    public dun d;
    public dui e;
    public oqv g;
    private final Context j;
    private nsb k;
    private oqv l;
    private long i = Long.MIN_VALUE;
    public boolean f = false;
    public final mks b = gxo.a(6);

    public duz(Context context) {
        this.j = context;
        this.c = new dur(context);
    }

    @Override // defpackage.dup
    public final void a() {
        j("disconnecting", duu.d);
        if (!this.f) {
            return;
        }
        this.f = false;
        dun dunVar = this.d;
        if (dunVar == null) {
            return;
        }
        dtc dtcVar = (dtc) dunVar;
        if (!dtcVar.c.d(false)) {
            return;
        }
        dtcVar.d();
    }

    @Override // defpackage.dup
    public final void b() {
        j("sending dictation end request", duu.b);
    }

    @Override // defpackage.dup
    public final void c() {
        j("sending dictation start request", duu.a);
    }

    @Override // defpackage.dup
    public final void d(final fhz fhzVar) {
        if (fhzVar.equals(fhz.UNKNOWN_DONT_SEND)) {
            return;
        }
        dvf d = dvf.d();
        if (d != null) {
            d.e(fhzVar);
        }
        if (!h.contains(fhzVar)) {
            return;
        }
        final bkl a2 = this.c.a();
        j("sending keyboard tip event", new duy() { // from class: duw
            @Override // defpackage.duy
            public final void a(dui duiVar) {
                fhz fhzVar2 = fhz.this;
                bkl bklVar = a2;
                ltg ltgVar = duz.a;
                nfh h2 = ebl.h();
                nfh t = fhv.c.t();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((fhv) t.b).b = fhzVar2.a();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                bklVar.getClass();
                ((fhv) t.b).a = bklVar;
                if (h2.c) {
                    h2.cD();
                    h2.c = false;
                }
                fhy fhyVar = (fhy) h2.b;
                fhv fhvVar = (fhv) t.cz();
                fhy fhyVar2 = fhy.d;
                fhvVar.getClass();
                fhyVar.b = fhvVar;
                fhyVar.a = 7;
                duiVar.f((fhy) h2.cz());
            }
        });
    }

    @Override // defpackage.dup
    public final void e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime < this.i + 10000) {
            return;
        }
        this.i = elapsedRealtime;
        dtx.a("Connecting to NGA", kcu.N(new dod(this, this.c.a(), 17), this.b));
    }

    @Override // defpackage.dup
    public final void f(final int i) {
        j("sending keyboard tip event", new duy() { // from class: duv
            @Override // defpackage.duy
            public final void a(dui duiVar) {
                int i2 = i;
                ltg ltgVar = duz.a;
                nfh h2 = ebl.h();
                if (h2.c) {
                    h2.cD();
                    h2.c = false;
                }
                fhy fhyVar = (fhy) h2.b;
                fhy fhyVar2 = fhy.d;
                fhyVar.b = Integer.valueOf(i2 - 2);
                fhyVar.a = 2;
                duiVar.f((fhy) h2.cz());
            }
        });
    }

    public final nsb g() {
        nsb nsbVar;
        nwd nwdVar;
        nsb nsbVar2 = this.k;
        if (nsbVar2 != null) {
            return nsbVar2;
        }
        synchronized (this) {
            if (this.k == null) {
                mot a2 = mot.a((Application) this.j, nwc.b(new ComponentName(dzg.g(), "com.google.android.apps.search.assistant.surfaces.dictation.service.endpoint.AssistantDictationService")));
                a2.e = ebl.i(this.j);
                mks mksVar = this.b;
                a2.d = new off(mksVar, 1);
                a2.c.c = new off(mksVar, 1);
                mks a3 = gxo.a(9);
                a2.c.d = new off(a3, 1);
                if (Build.VERSION.SDK_INT >= 30) {
                    ozd ozdVar = new ozd(nwd.a.b);
                    ozdVar.c(4096);
                    nwdVar = ozdVar.b();
                } else {
                    nwdVar = nwd.a;
                }
                a2.g = nwdVar;
                this.k = a2.c.c();
            }
            nsbVar = this.k;
        }
        return nsbVar;
    }

    public final void h(dun dunVar, fgw fgwVar) {
        dtc dtcVar = (dtc) dunVar;
        if (dtcVar.c.d(true)) {
            dtcVar.d();
        }
        dunVar.g(fgwVar);
        this.f = true;
    }

    public final void i(String str, Runnable runnable) {
        dtx.a(str, kcu.N(runnable, this.b));
    }

    public final void j(String str, duy duyVar) {
        i(str, new dod(this, duyVar, 18));
    }

    public final oqv k() {
        oqv oqvVar = this.l;
        if (oqvVar != null) {
            return oqvVar;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = oqv.b(new fgx(0), g());
            }
        }
        return this.l;
    }
}
