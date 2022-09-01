package defpackage;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import j$.time.Duration;

/* compiled from: PG */
/* renamed from: ghr  reason: default package */
/* loaded from: classes.dex */
public final class ghr {
    private static final ltg d = ltg.j("com/google/android/libraries/animation/AnimationController");
    public final ghn a;
    public float b = 0.0f;
    public int c = 1;
    private final ghq e;
    private final oir f;

    public ghr(oir oirVar, ghn ghnVar, ghq ghqVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Duration duration = Duration.ZERO;
        jdg.Q(ghnVar, "animatable can not be null");
        this.f = oirVar;
        this.a = ghnVar;
        this.e = ghqVar;
        ghnVar.a(Float.valueOf(0.0f));
    }

    public final void a(float f, float f2, Duration duration) {
        jdg.w(!duration.equals(Duration.ZERO), "duration has to be more than zero. Use setValue() to change value without duration.");
        d();
        oir oirVar = this.f;
        ghn ghnVar = new ghn() { // from class: ghp
            @Override // defpackage.ghn
            public final void a(Object obj) {
                ghr ghrVar = ghr.this;
                float floatValue = ((Float) obj).floatValue();
                Float valueOf = Float.valueOf(floatValue);
                ghrVar.b = floatValue;
                ghrVar.a.a(valueOf);
            }
        };
        ghs ghsVar = new ghs(this, 1);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(duration.toMillis());
        ofFloat.addUpdateListener(new op(ghnVar, 15));
        ofFloat.addListener(new gia(ghsVar));
        oirVar.a = ofFloat;
        ofFloat.start();
    }

    public final void b(float f, Duration duration) {
        ((ltd) ((ltd) d.b()).k("com/google/android/libraries/animation/AnimationController", "animateTo", 91, "AnimationController.java")).T(f, duration);
        a(this.b, f, duration);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.lang.Runnable] */
    public final void c() {
        ghq ghqVar = this.e;
        if (ghqVar != null) {
            int i = this.c;
            Object obj = ((ghs) ghqVar).a;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 1) {
                gmi.g(((gmi) obj).b);
            } else if (i2 != 2) {
            } else {
                gmi.g(((gmi) obj).c);
            }
        }
    }

    public final void d() {
        oir oirVar = this.f;
        Object obj = oirVar.a;
        if (obj != null) {
            ((ValueAnimator) obj).isRunning();
            ((ValueAnimator) oirVar.a).cancel();
            oirVar.a = null;
        }
    }
}
