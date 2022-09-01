package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
/* renamed from: ktk  reason: default package */
/* loaded from: classes.dex */
public final class ktk {
    public static final Drawable a;
    private static final double u = Math.cos(Math.toRadians(45.0d));
    public final MaterialCardView b;
    public final kxe d;
    public final kxe e;
    public int f;
    public int g;
    public int h;
    public int i;
    public Drawable j;
    public Drawable k;
    public ColorStateList l;
    public ColorStateList m;
    public kxj n;
    public ColorStateList o;
    public Drawable p;
    public LayerDrawable q;
    public kxe r;
    public boolean t;
    private kxe v;
    public final Rect c = new Rect();
    public boolean s = false;

    static {
        a = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public ktk(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        this.b = materialCardView;
        kxe kxeVar = new kxe(materialCardView.getContext(), attributeSet, i, R.style.f207340_resource_name_obfuscated_res_0x7f150a22);
        this.d = kxeVar;
        kxeVar.j(materialCardView.getContext());
        kxeVar.s();
        kxi c = kxeVar.i().c();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, ktl.a, i, R.style.f191260_resource_name_obfuscated_res_0x7f1501bb);
        if (obtainStyledAttributes.hasValue(3)) {
            c.b(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.e = new kxe();
        g(c.a());
        obtainStyledAttributes.recycle();
    }

    private final float o() {
        float q = q(this.n.j, this.d.b());
        kxc kxcVar = this.n.k;
        kxe kxeVar = this.d;
        float max = Math.max(q, q(kxcVar, kxeVar.a.a.c.a(kxeVar.h())));
        kxc kxcVar2 = this.n.l;
        kxe kxeVar2 = this.d;
        float q2 = q(kxcVar2, kxeVar2.a.a.d.a(kxeVar2.h()));
        kxc kxcVar3 = this.n.m;
        kxe kxeVar3 = this.d;
        return Math.max(max, Math.max(q2, q(kxcVar3, kxeVar3.a.a.e.a(kxeVar3.h()))));
    }

    private final boolean p() {
        return this.d.r();
    }

    private static final float q(kxc kxcVar, float f) {
        if (kxcVar instanceof kxh) {
            double d = f;
            Double.isNaN(d);
            return (float) ((1.0d - u) * d);
        } else if (!(kxcVar instanceof kxb)) {
            return 0.0f;
        } else {
            return f / 2.0f;
        }
    }

    public final float a() {
        return this.b.a() + (n() ? o() : 0.0f);
    }

    public final float b() {
        return (this.b.a() * 1.5f) + (n() ? o() : 0.0f);
    }

    public final Drawable c() {
        if (this.p == null) {
            int i = kww.b;
            this.v = new kxe(this.n);
            this.p = new RippleDrawable(this.l, null, this.v);
        }
        if (this.q == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.p, this.e, this.k});
            this.q = layerDrawable;
            layerDrawable.setId(2, R.id.f65980_resource_name_obfuscated_res_0x7f0b07b0);
        }
        return this.q;
    }

    public final Drawable d(Drawable drawable) {
        int i;
        int i2;
        if (this.b.a) {
            i2 = (int) Math.ceil(b());
            i = (int) Math.ceil(a());
        } else {
            i = 0;
            i2 = 0;
        }
        return new ktj(drawable, i, i2, i, i2);
    }

    public final void e(ColorStateList colorStateList) {
        this.d.l(colorStateList);
    }

    public final void f(boolean z) {
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setAlpha(true != z ? 0 : 255);
        }
    }

    public final void g(kxj kxjVar) {
        this.n = kxjVar;
        this.d.ic(kxjVar);
        kxe kxeVar = this.d;
        kxeVar.g = !kxeVar.r();
        this.e.ic(kxjVar);
        kxe kxeVar2 = this.v;
        if (kxeVar2 != null) {
            kxeVar2.ic(kxjVar);
        }
    }

    public final void h() {
        float f = 0.0f;
        float o = (m() || n()) ? o() : 0.0f;
        MaterialCardView materialCardView = this.b;
        if (materialCardView.b && materialCardView.a) {
            double c = gw.c(materialCardView.f);
            Double.isNaN(c);
            f = (float) ((1.0d - u) * c);
        }
        int i = (int) (o - f);
        MaterialCardView materialCardView2 = this.b;
        materialCardView2.c.set(this.c.left + i, this.c.top + i, this.c.right + i, this.c.bottom + i);
        gw.d(materialCardView2.f);
    }

    public final void i() {
        this.d.k(((View) this.b.f.b).getElevation());
    }

    public final void j() {
        this.e.n(this.i, this.o);
    }

    public final boolean k() {
        return (this.h & 80) == 80;
    }

    public final boolean l() {
        return (this.h & 8388613) == 8388613;
    }

    public final boolean m() {
        return this.b.b && !p();
    }

    public final boolean n() {
        return this.b.b && p() && this.b.a;
    }
}
