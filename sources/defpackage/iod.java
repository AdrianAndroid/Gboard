package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.inputmethod.latin.R;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: iod  reason: default package */
/* loaded from: classes.dex */
public final class iod implements ma {
    public final aih a;
    public ValueAnimator b;
    public boolean c;
    public boolean d;
    public int e = -1;
    private final String f;
    private final int g;
    private final int h;
    private int i;

    public iod(aih aihVar, String str) {
        this.a = aihVar;
        this.f = str;
        Context fS = aihVar.fS();
        TypedValue typedValue = new TypedValue();
        fS.getTheme().resolveAttribute(16843534, typedValue, true);
        this.g = typedValue.resourceId;
        this.h = us.a(fS, R.color.f30660_resource_name_obfuscated_res_0x7f060748);
    }

    public static Intent d(aih aihVar) {
        ap B = aihVar.B();
        if (B != null) {
            return B.getIntent();
        }
        return null;
    }

    @Override // defpackage.ma
    public final void a(View view) {
        if (this.a.b.c(view) != this.e || this.c) {
            return;
        }
        view.setTag(R.id.f67540_resource_name_obfuscated_res_0x7f0b0868, Boolean.TRUE);
        Drawable background = view.getBackground();
        this.i = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.g), Integer.valueOf(this.h));
        this.b = ofObject;
        ofObject.setDuration(200L);
        this.b.addUpdateListener(new ioa(view, 0));
        this.b.addListener(new iob(this));
        this.b.setRepeatMode(2);
        this.b.setRepeatCount(4);
        this.b.start();
        view.postDelayed(new idx(this, view, 10), 15000L);
    }

    @Override // defpackage.ma
    public final void b(View view) {
        if (Boolean.TRUE.equals(view.getTag(R.id.f67540_resource_name_obfuscated_res_0x7f0b0868))) {
            e(view, false);
        }
    }

    public final int c(PreferenceGroup preferenceGroup, AtomicInteger atomicInteger) {
        int c;
        int k = preferenceGroup.k();
        for (int i = 0; i < k; i++) {
            Preference o = preferenceGroup.o(i);
            if (o.A) {
                if (!this.f.equals(o.t)) {
                    atomicInteger.incrementAndGet();
                    if ((o instanceof PreferenceGroup) && (c = c((PreferenceGroup) o, atomicInteger)) != -1) {
                        return c;
                    }
                } else {
                    return atomicInteger.get();
                }
            }
        }
        return -1;
    }

    public final void e(View view, boolean z) {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b = null;
        }
        if (!z) {
            view.setTag(R.id.f67540_resource_name_obfuscated_res_0x7f0b0868, null);
            f(view);
        } else if (!Boolean.TRUE.equals(view.getTag(R.id.f67540_resource_name_obfuscated_res_0x7f0b0868))) {
        } else {
            int i = this.h;
            int i2 = this.g;
            view.setTag(R.id.f67540_resource_name_obfuscated_res_0x7f0b0868, null);
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
            ofObject.setDuration(500L);
            ofObject.addUpdateListener(new ioa(view, 1));
            ofObject.addListener(new ioc(this, view));
            ofObject.start();
        }
    }

    public final void f(View view) {
        view.setBackgroundResource(this.g);
        int i = this.i;
        if (i != 0) {
            view.setBackgroundColor(i);
            this.i = 0;
        }
    }
}
