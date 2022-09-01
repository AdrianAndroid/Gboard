package defpackage;

import android.view.animation.LinearInterpolator;
import com.google.android.libraries.search.p6glow.AssistantP6GlowView;
import j$.time.Duration;

/* compiled from: PG */
/* renamed from: kmf  reason: default package */
/* loaded from: classes.dex */
public final class kmf {
    public static final Duration a = Duration.ofMillis(600);
    private static final Duration c = Duration.ofMillis(450);
    public final AssistantP6GlowView b;
    private final float[] d = kmj.e(5.0f, 15.0f, new float[]{0.0f, 1.0f, 0.0f, 0.0f});
    private final float[] e = kmj.e(85.0f, 5.0f, new float[]{1.0f, 0.0f, 0.0f, 0.0f});
    private final float[] f = kmj.e(5.0f, 5.0f, new float[]{0.85f, 0.15f, 0.0f, 0.0f});
    private final float[] g = kmj.e(15.0f, 5.0f, new float[]{0.0f, 0.0f, 1.0f, 0.0f});
    private final float[] h = kmj.e(5.0f, 5.0f, new float[]{0.0f, 0.0f, 0.15f, 0.85f});
    private final float[] i = kmj.e(5.0f, 85.0f, new float[]{0.0f, 0.0f, 0.0f, 1.0f});
    private final float[] j = {5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 95.0f};
    private final float[] k = {95.0f, 0.0f, 0.0f, 0.0f, 0.0f, 5.0f};

    public kmf(AssistantP6GlowView assistantP6GlowView) {
        oll.e(assistantP6GlowView, "view");
        this.b = assistantP6GlowView;
    }

    public final ghr a(okf okfVar) {
        float[] p = this.b.p();
        ijk f = fpp.e(kmj.c(this.b)).f();
        gmi f2 = gmi.f(lrh.e(Float.valueOf(0.0f), Float.valueOf(1.0f)));
        f2.b = kmj.d(p, this.j);
        LinearInterpolator linearInterpolator = klu.a;
        f2.e(klu.d);
        f.n(f2);
        gmi m = giw.m(f.m());
        m.c = new joq(okfVar, 15);
        ghr h = m.h();
        h.b(1.0f, c);
        return h;
    }

    public final ghr b(okf okfVar, final okf okfVar2, okf okfVar3) {
        ijk f = fpp.e(kmj.c(this.b)).f();
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(0.2f);
        gmi f2 = gmi.f(lrh.e(valueOf, valueOf2));
        f2.b = kmj.d(this.j, this.d);
        f.n(f2);
        Float valueOf3 = Float.valueOf(0.8f);
        gmi f3 = gmi.f(lrh.i(valueOf2, valueOf3));
        f3.b = kmj.d(this.d, this.f);
        f.n(f3);
        Float valueOf4 = Float.valueOf(0.95f);
        gmi f4 = gmi.f(lrh.i(valueOf3, valueOf4));
        f4.b = kmj.d(this.f, this.e);
        f.n(f4);
        Float valueOf5 = Float.valueOf(1.0f);
        gmi f5 = gmi.f(lrh.i(valueOf4, valueOf5));
        f5.b = kmj.d(this.e, this.k);
        LinearInterpolator linearInterpolator = klu.a;
        f5.e(klu.d);
        f.n(f5);
        ijk f6 = fpp.e(kmj.c(this.b)).f();
        gmi f7 = gmi.f(lrh.e(valueOf, valueOf2));
        f7.b = kmj.d(this.k, this.g);
        f6.n(f7);
        gmi f8 = gmi.f(lrh.i(valueOf2, valueOf3));
        f8.b = kmj.d(this.g, this.h);
        f6.n(f8);
        gmi f9 = gmi.f(lrh.i(valueOf3, valueOf4));
        f9.b = kmj.d(this.h, this.i);
        f6.n(f9);
        gmi f10 = gmi.f(lrh.i(valueOf4, valueOf5));
        f10.b = kmj.d(this.i, this.j);
        f10.e(klu.d);
        f6.n(f10);
        gmi m = giw.m(f6.m());
        m.c = new kme(this, okfVar3, okfVar, 0);
        ghr h = m.h();
        gmi m2 = giw.m(f.m());
        m2.b = new Runnable() { // from class: kmd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                okf.this.a();
            }
        };
        m2.c = new kme(this, h, okfVar3, 1);
        ghr h2 = m2.h();
        h2.b(1.0f, a);
        return h2;
    }
}
