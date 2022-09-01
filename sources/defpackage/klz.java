package defpackage;

import android.view.animation.LinearInterpolator;
import com.google.android.libraries.search.p6glow.AssistantP6GlowView;
import j$.time.Duration;

/* compiled from: PG */
/* renamed from: klz  reason: default package */
/* loaded from: classes.dex */
public final class klz {
    private static final Duration b = Duration.ofMillis(350);
    private static final Duration c = Duration.ofMillis(367);
    public final AssistantP6GlowView a;

    public klz(AssistantP6GlowView assistantP6GlowView) {
        oll.e(assistantP6GlowView, "view");
        this.a = assistantP6GlowView;
    }

    private final ghr b(okf okfVar) {
        float[] p = this.a.p();
        fpp e = fpp.e(kmj.c(this.a));
        gmi f = gmi.f(lrh.e(Float.valueOf(0.0f), Float.valueOf(1.0f)));
        LinearInterpolator linearInterpolator = klu.a;
        f.e(klu.e);
        f.b = kmj.d(p, klu.f);
        gmi m = giw.m(e.d(f));
        m.c = new kht(this, okfVar, 7);
        ghr h = m.h();
        h.b(1.0f, c);
        return h;
    }

    public final ghr a(klj kljVar, okf okfVar) {
        oll.e(kljVar, "previousState");
        klj kljVar2 = klj.GONE;
        int ordinal = kljVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return b(okfVar);
            }
            if (ordinal == 2) {
                return b(okfVar);
            }
            if (ordinal == 3) {
                float alpha = this.a.getAlpha();
                fpp e = fpp.e(new kly(this));
                gmi gmiVar = new gmi(lrh.e(Float.valueOf(0.0f), Float.valueOf(1.0f)));
                LinearInterpolator linearInterpolator = klu.a;
                gmiVar.e(klu.d);
                gmiVar.b = new ghv(this.a.getAlpha());
                gmi m = giw.m(e.d(gmiVar));
                m.c = new kht(this, okfVar, 6);
                ghr h = m.h();
                h.a(alpha, 0.0f, b);
                return h;
            }
            throw new ojb();
        }
        return giw.c(kma.b);
    }
}
