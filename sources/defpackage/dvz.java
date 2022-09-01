package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.google.android.inputmethod.latin.R;
import j$.time.Duration;
import j$.util.Collection$EL;
import j$.util.Optional;

/* compiled from: PG */
/* renamed from: dvz  reason: default package */
/* loaded from: classes.dex */
public final class dvz implements dwj {
    public static final Interpolator a = new LinearInterpolator();
    public static final Interpolator b = new LinearInterpolator();
    private static final Duration f = Duration.ofMillis(400);
    private static final Duration g = Duration.ofSeconds(2);
    private static final Duration h = Duration.ofMillis(800);
    private static final Duration i = Duration.ofMillis(1600);
    public final dwh c;
    public dwk d;
    private AppCompatTextView j;
    private dxf k;
    public String e = "";
    private llp l = llp.q();

    public dvz(dwh dwhVar) {
        this.c = dwhVar;
    }

    public static float d(float f2, float f3, float f4, float f5, Interpolator interpolator, float f6) {
        return f2 + ((f3 - f2) * interpolator.getInterpolation(Math.min(1.0f, Math.max(0.0f, (f6 - f4) / (f5 - f4)))));
    }

    private static ValueAnimator h(final View view, Duration duration) {
        view.setAlpha(0.0f);
        view.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        Duration duration2 = g;
        ofFloat.setDuration(duration2.toMillis());
        ofFloat.setRepeatCount(-1);
        final float millis = ((float) duration.toMillis()) / ((float) duration2.toMillis());
        long millis2 = h.toMillis();
        long millis3 = duration2.toMillis();
        long millis4 = i.toMillis();
        long millis5 = duration2.toMillis();
        final float dimension = view.getContext().getResources().getDimension(R.dimen.f41100_resource_name_obfuscated_res_0x7f07059d);
        final float dimension2 = view.getContext().getResources().getDimension(R.dimen.f41110_resource_name_obfuscated_res_0x7f07059e);
        final float f2 = (((float) millis2) / ((float) millis3)) + millis;
        final float f3 = millis + (((float) millis4) / ((float) millis5));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dvy
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float f4 = dimension;
                float f5 = dimension2;
                float f6 = millis;
                float f7 = f2;
                float f8 = f3;
                View view2 = view;
                Interpolator interpolator = dvz.a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float d = dvz.d(f4, f5, f6, f7, dvz.b, floatValue);
                float d2 = dvz.d(0.5f, 0.0f, f6, f8, dvz.a, floatValue);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
                int i2 = (int) d;
                layoutParams.width = i2;
                layoutParams.height = i2;
                view2.setLayoutParams(layoutParams);
                view2.setAlpha(d2);
            }
        });
        return ofFloat;
    }

    @Override // defpackage.dwj
    public final int a() {
        return R.layout.f143670_resource_name_obfuscated_res_0x7f0e047f;
    }

    @Override // defpackage.dwj
    public final /* synthetic */ Optional b() {
        return Optional.empty();
    }

    @Override // defpackage.dwj
    public final void c(dwk dwkVar, View view, Context context) {
        this.d = dwkVar;
        view.setOnClickListener(new cjr(this, 20));
        view.findViewById(R.id.f66440_resource_name_obfuscated_res_0x7f0b07ed).setOnClickListener(new dwx(this, 1));
        this.j = (AppCompatTextView) view.findViewById(R.id.f66470_resource_name_obfuscated_res_0x7f0b07f0);
        dxf b2 = dxf.b(context);
        this.k = b2;
        AppCompatTextView appCompatTextView = this.j;
        if (appCompatTextView != null && b2 != null) {
            appCompatTextView.setText(b2.a(this.e));
        }
        if (((Boolean) dsu.j.c()).booleanValue()) {
            llp s = llp.s(h(view.findViewById(R.id.f66450_resource_name_obfuscated_res_0x7f0b07ee), Duration.ZERO), h(view.findViewById(R.id.f66460_resource_name_obfuscated_res_0x7f0b07ef), f));
            this.l = s;
            Collection$EL.stream(s).forEach(dug.e);
        }
    }

    @Override // defpackage.dwj
    public final void e() {
        Collection$EL.stream(this.l).forEach(dug.d);
        this.l = llp.q();
        this.j = null;
        this.k = null;
        this.d = null;
    }

    @Override // defpackage.dwj
    public final void f() {
    }

    @Override // defpackage.dwj
    public final void g() {
    }
}
