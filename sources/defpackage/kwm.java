package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: kwm  reason: default package */
/* loaded from: classes.dex */
public final class kwm extends kwd {
    public static final int[] a = {533, 567, 850, 750};
    public static final int[] b = {1267, 1000, 333, 0};
    private static final Property i = new kwl(Float.class);
    public final Interpolator[] c;
    public final kvp d;
    public boolean f;
    public float g;
    private ObjectAnimator m;
    private ObjectAnimator n;
    public int e = 0;
    ajz h = null;

    public kwm(Context context, kwn kwnVar) {
        super(2);
        this.d = kwnVar;
        this.c = new Interpolator[]{we.f(context, R.anim.f240_resource_name_obfuscated_res_0x7f010039), we.f(context, R.anim.f250_resource_name_obfuscated_res_0x7f01003a), we.f(context, R.anim.f260_resource_name_obfuscated_res_0x7f01003b), we.f(context, R.anim.f270_resource_name_obfuscated_res_0x7f01003c)};
    }

    @Override // defpackage.kwd
    public final void a() {
        ObjectAnimator objectAnimator = this.m;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.kwd
    public final void b(ajz ajzVar) {
        this.h = ajzVar;
    }

    @Override // defpackage.kwd
    public final void c() {
        ObjectAnimator objectAnimator = this.n;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (!this.j.isVisible()) {
            return;
        }
        this.n.setFloatValues(this.g, 1.0f);
        this.n.setDuration((1.0f - this.g) * 1800.0f);
        this.n.start();
    }

    @Override // defpackage.kwd
    public final void d() {
        if (this.m == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, i, 0.0f, 1.0f);
            this.m = ofFloat;
            ofFloat.setDuration(1800L);
            this.m.setInterpolator(null);
            this.m.setRepeatCount(-1);
            this.m.addListener(new kwj(this));
        }
        if (this.n == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, i, 1.0f);
            this.n = ofFloat2;
            ofFloat2.setDuration(1800L);
            this.n.setInterpolator(null);
            this.n.addListener(new kwk(this));
        }
        this.e = 0;
        int e = kxc.e(this.d.c[0], this.j.h);
        int[] iArr = this.l;
        iArr[0] = e;
        iArr[1] = e;
        this.m.start();
    }

    @Override // defpackage.kwd
    public final void e() {
        this.h = null;
    }
}
