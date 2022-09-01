package defpackage;

import android.view.animation.LinearInterpolator;
import com.google.android.libraries.search.p6glow.AssistantP6GlowView;

/* compiled from: PG */
/* renamed from: klo  reason: default package */
/* loaded from: classes.dex */
public final class klo {
    static final /* synthetic */ ome[] a;
    public boolean c;
    private final kli d;
    private final olu e;
    private final klz f;
    private final kmb g;
    private final kmg h;
    private final kmf i;
    private ghr k;
    public klj b = klj.GONE;
    private final olu j = new kll(false, this);

    static {
        olo oloVar = new olo(klo.class, "state", "getState()Lcom/google/android/libraries/search/p6glow/AssistantP6GlowAnimator$State;", 1);
        int i = olr.a;
        a = new ome[]{oloVar, new olo(klo.class, "thinkingAnimationRunning", "getThinkingAnimationRunning()Z", 1)};
    }

    public klo(AssistantP6GlowView assistantP6GlowView, giw giwVar, kli kliVar, byte[] bArr) {
        oll.e(assistantP6GlowView, "view");
        oll.e(assistantP6GlowView, "view");
        this.d = kliVar;
        this.e = new klx(new kln(assistantP6GlowView, this));
        this.f = new klz(assistantP6GlowView);
        this.g = new kmb(assistantP6GlowView, giwVar, null);
        this.h = new kmg(assistantP6GlowView, giwVar, null);
        this.i = new kmf(assistantP6GlowView);
        LinearInterpolator linearInterpolator = klu.a;
        assistantP6GlowView.m(klu.f);
    }

    private final ghr f(klj kljVar, okf okfVar) {
        kmf kmfVar = this.i;
        hgp hgpVar = new hgp(this, 7);
        hgp hgpVar2 = new hgp(this, 8);
        oll.e(kljVar, "previousState");
        kmfVar.b.setAlpha(1.0f);
        kmfVar.b.l(false);
        klj kljVar2 = klj.GONE;
        int ordinal = kljVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2) {
                return kmfVar.a(okfVar);
            }
            if (ordinal != 3) {
                throw new ojb();
            }
        }
        return kmfVar.b(okfVar, hgpVar, hgpVar2);
    }

    private final boolean g() {
        return ((Boolean) this.j.c(a[1])).booleanValue();
    }

    public final klj a() {
        olu oluVar = this.e;
        ome omeVar = a[0];
        oll.e(omeVar, "property");
        ker kerVar = ((klx) oluVar).b;
        if (kerVar instanceof klw) {
            String c = omeVar.c();
            throw new IllegalStateException("Value for " + c + " has not been initialized.");
        } else if (!(kerVar instanceof klv)) {
            throw new ojb();
        } else {
            return (klj) ((klv) kerVar).a;
        }
    }

    public final void b(klj kljVar) {
        oll.e(kljVar, "<set-?>");
        olu oluVar = this.e;
        oll.e(a[0], "property");
        klv klvVar = new klv(kljVar);
        klx klxVar = (klx) oluVar;
        if (!oll.g(klvVar, klxVar.b)) {
            klxVar.b = klvVar;
            klxVar.a.a(kljVar);
        }
    }

    public final void c(boolean z) {
        this.j.b(a[1], Boolean.valueOf(z));
    }

    public final void d(klj kljVar, klj kljVar2) {
        ghr a2;
        ghr a3;
        kki.h();
        klk klkVar = new klk(this, kljVar2);
        if (kljVar == klj.THINKING) {
            int ordinal = kljVar2.ordinal();
            if (ordinal == 0) {
                a3 = this.f.a(klj.THINKING, new klm(this.d, 0));
            } else if (ordinal == 1) {
                a3 = this.f.a(klj.THINKING, new hgp(this, 5));
            } else if (ordinal == 2) {
                a3 = this.f.a(klj.THINKING, new hgp(this, 6));
            } else if (ordinal != 3) {
                throw new ojb();
            } else {
                a3 = f(klj.THINKING, klkVar);
            }
            this.k = a3;
        } else if (g()) {
            this.c = true;
        } else {
            ghr ghrVar = this.k;
            if (ghrVar != null) {
                ghrVar.d();
            }
            int ordinal2 = kljVar2.ordinal();
            if (ordinal2 == 0) {
                a2 = this.f.a(kljVar, new klm(this.d, 1));
            } else if (ordinal2 == 1) {
                kmb kmbVar = this.g;
                oll.e(kljVar, "previousState");
                kmbVar.d.setAlpha(1.0f);
                kmbVar.d.l(false);
                int ordinal3 = kljVar.ordinal();
                if (ordinal3 == 0) {
                    float[] p = kmbVar.d.p();
                    float[] f = kmj.f(26.400002f);
                    float[] f2 = kmj.f(30.000002f);
                    ijk f3 = fpp.e(kmj.c(kmbVar.d)).f();
                    Float valueOf = Float.valueOf(0.0f);
                    Float valueOf2 = Float.valueOf(0.23f);
                    gmi f4 = gmi.f(lrh.e(valueOf, valueOf2));
                    f4.b = kmj.d(p, f);
                    LinearInterpolator linearInterpolator = klu.a;
                    f4.e(klu.b);
                    f3.n(f4);
                    Float valueOf3 = Float.valueOf(0.44f);
                    gmi f5 = gmi.f(lrh.i(valueOf2, valueOf3));
                    f5.b = kmj.d(f, f);
                    f5.e(klu.a);
                    f3.n(f5);
                    gmi f6 = gmi.f(lrh.i(valueOf3, Float.valueOf(1.0f)));
                    f6.b = kmj.d(f, f2);
                    f6.e(klu.c);
                    f3.n(f6);
                    giw giwVar = kmbVar.e;
                    gmi m = giw.m(f3.m());
                    m.c = new joq(klkVar, 13);
                    a2 = m.h();
                    a2.b(1.0f, kmb.b);
                } else if (ordinal3 == 1) {
                    float[] p2 = kmbVar.d.p();
                    float[] f7 = kmj.f(24.000002f);
                    float[] f8 = kmj.f(30.000002f);
                    ijk f9 = fpp.e(kmj.c(kmbVar.d)).f();
                    Float valueOf4 = Float.valueOf(0.0f);
                    Float valueOf5 = Float.valueOf(1.0f);
                    gmi f10 = gmi.f(lrh.e(valueOf4, valueOf5));
                    f10.b = kmj.d(p2, f7);
                    LinearInterpolator linearInterpolator2 = klu.a;
                    f10.e(klu.a);
                    f9.n(f10);
                    gmi f11 = gmi.f(lrh.i(valueOf5, Float.valueOf(2.0f)));
                    f11.b = kmj.d(f7, f8);
                    f11.e(klu.a);
                    f9.n(f11);
                    giw giwVar2 = kmbVar.e;
                    gmi m2 = giw.m(f9.m());
                    m2.c = new joq(klkVar, 12);
                    ghr h = m2.h();
                    h.b(2.0f, kmb.c);
                    a2 = h;
                } else if (ordinal3 == 2) {
                    float[] p3 = kmbVar.d.p();
                    float[] f12 = kmj.f(30.000002f);
                    ijk f13 = fpp.e(kmj.c(kmbVar.d)).f();
                    gmi f14 = gmi.f(lrh.e(Float.valueOf(0.0f), Float.valueOf(1.0f)));
                    f14.b = kmj.d(p3, f12);
                    LinearInterpolator linearInterpolator3 = klu.a;
                    f14.e(klu.a);
                    f13.n(f14);
                    giw giwVar3 = kmbVar.e;
                    gmi m3 = giw.m(f13.m());
                    m3.c = new joq(klkVar, 14);
                    a2 = m3.h();
                    a2.b(1.0f, kmb.a);
                } else if (ordinal3 != 3) {
                    throw new ojb();
                } else {
                    giw giwVar4 = kmbVar.e;
                    a2 = giw.c(kma.a);
                }
            } else if (ordinal2 == 2) {
                kmg kmgVar = this.h;
                kmgVar.d.setAlpha(1.0f);
                kmgVar.d.l(true);
                int abs = (Math.abs(kmgVar.e.nextInt()) % 3) + 1;
                ijk f15 = fpp.e(kmj.c(kmgVar.d)).f();
                float[] p4 = kmgVar.d.p();
                Float valueOf6 = Float.valueOf(0.0f);
                gmi f16 = gmi.f(lrh.e(valueOf6, valueOf6));
                f16.b = kmj.d(p4, p4);
                f16.e(kmg.a);
                f15.n(f16);
                for (int i = 0; i < abs; i++) {
                    int nextInt = kmgVar.e.nextInt() % 4;
                    int i2 = nextInt + ((((nextInt ^ 4) & ((-nextInt) | nextInt)) >> 31) & 4);
                    int i3 = 0;
                    while (i3 < 4) {
                        kmgVar.f[i3] = i3 == i2 ? 3.0f : 1.0f;
                        i3++;
                    }
                    float[] e = kmj.e(13.888889f, 13.888889f, kmgVar.f);
                    float f17 = i;
                    gmi f18 = gmi.f(lrh.i(Float.valueOf(f17), Float.valueOf(f17 + 1.0f)));
                    f18.b = kmj.d(p4, e, kmgVar.g);
                    f18.e(kmg.a);
                    f15.n(f18);
                    p4 = kmgVar.g;
                }
                giw giwVar5 = kmgVar.h;
                gmi m4 = giw.m(f15.m());
                m4.c = new joq(klkVar, 16);
                a2 = m4.h();
                a2.b(abs, kmg.b.multipliedBy(abs).plus(kmg.c));
            } else if (ordinal2 != 3) {
                throw new ojb();
            } else {
                a2 = f(kljVar, klkVar);
            }
            this.k = a2;
        }
    }

    public final void e(klj kljVar) {
        if (g()) {
            this.c = true;
        } else {
            d(klj.GONE, kljVar);
        }
    }
}
