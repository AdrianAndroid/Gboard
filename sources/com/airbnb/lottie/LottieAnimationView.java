package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final ana a = new amj();
    public amp g;
    private boolean j;
    private String k;
    private int l;
    private ang r;
    private final ana h = new amk(this, 1);
    private final ana i = new amk(this, 0);
    public int b = 0;
    public final amy c = new amy();
    private boolean m = false;
    private boolean n = false;
    private boolean o = false;
    public boolean d = false;
    private boolean p = false;
    public boolean e = true;
    private int s = 1;
    public final Set f = new HashSet();
    private int q = 0;

    public LottieAnimationView(Context context) {
        super(context);
        l(null, R.attr.f14240_resource_name_obfuscated_res_0x7f040543);
    }

    private final void k() {
        ang angVar = this.r;
        if (angVar != null) {
            angVar.g(this.h);
            this.r.f(this.i);
        }
    }

    private final void l(AttributeSet attributeSet, int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, anh.a, i, 0);
        this.e = obtainStyledAttributes.getBoolean(1, true);
        boolean hasValue = obtainStyledAttributes.hasValue(10);
        boolean hasValue2 = obtainStyledAttributes.hasValue(5);
        boolean hasValue3 = obtainStyledAttributes.hasValue(16);
        if (!hasValue || !hasValue2) {
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(10, 0);
                if (resourceId != 0) {
                    d(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(5);
                if (string2 != null) {
                    e(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(16)) != null) {
                m(this.e ? ams.i(getContext(), string) : ams.j(getContext(), string, null));
            }
            this.b = obtainStyledAttributes.getResourceId(4, 0);
            if (obtainStyledAttributes.getBoolean(0, false)) {
                this.o = true;
                this.p = true;
            }
            if (obtainStyledAttributes.getBoolean(8, false)) {
                this.c.n(-1);
            }
            if (obtainStyledAttributes.hasValue(13)) {
                h(obtainStyledAttributes.getInt(13, 1));
            }
            if (obtainStyledAttributes.hasValue(12)) {
                g(obtainStyledAttributes.getInt(12, -1));
            }
            if (obtainStyledAttributes.hasValue(15)) {
                this.c.b.b = obtainStyledAttributes.getFloat(15, 1.0f);
            }
            this.c.h = obtainStyledAttributes.getString(7);
            f(obtainStyledAttributes.getFloat(9, 0.0f));
            boolean z2 = obtainStyledAttributes.getBoolean(3, false);
            amy amyVar = this.c;
            if (amyVar.i != z2) {
                amyVar.i = z2;
                if (amyVar.a != null) {
                    amyVar.g();
                }
            }
            if (obtainStyledAttributes.hasValue(2)) {
                this.c.f(new aoz("**"), and.E, new asj(new ani(uv.c(getContext(), obtainStyledAttributes.getResourceId(2, -1)).getDefaultColor())));
            }
            if (obtainStyledAttributes.hasValue(14)) {
                this.c.c = obtainStyledAttributes.getFloat(14, 1.0f);
            }
            if (obtainStyledAttributes.hasValue(11)) {
                int i2 = obtainStyledAttributes.getInt(11, 0);
                wo.b();
                if (i2 >= 3) {
                    i2 = 0;
                }
                j(wo.b()[i2]);
            }
            this.c.e = obtainStyledAttributes.getBoolean(6, false);
            obtainStyledAttributes.recycle();
            amy amyVar2 = this.c;
            if (ash.b(getContext()) != 0.0f) {
                z = true;
            }
            amyVar2.d = Boolean.valueOf(z).booleanValue();
            a();
            this.j = true;
            return;
        }
        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
    }

    private final void m(ang angVar) {
        this.g = null;
        this.c.h();
        k();
        angVar.e(this.h);
        angVar.d(this.i);
        this.r = angVar;
    }

    public final void b() {
        this.p = false;
        this.o = false;
        this.n = false;
        this.m = false;
        this.c.i();
        a();
    }

    @Override // android.view.View
    public final void buildDrawingCache(boolean z) {
        this.q++;
        super.buildDrawingCache(z);
        if (this.q == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            j(2);
        }
        this.q--;
        ami.a();
    }

    public final void c() {
        if (!isShown()) {
            this.m = true;
            return;
        }
        this.c.j();
        a();
    }

    public final void d(int i) {
        ang h;
        this.l = i;
        this.k = null;
        if (isInEditMode()) {
            h = new ang(new aml(this, i), true);
        } else if (this.e) {
            Context context = getContext();
            h = ams.h(context, i, ams.k(context, i));
        } else {
            h = ams.h(getContext(), i, null);
        }
        m(h);
    }

    public final void e(String str) {
        ang f;
        this.k = str;
        this.l = 0;
        if (isInEditMode()) {
            f = new ang(new amm(this, str), true);
        } else {
            f = this.e ? ams.f(getContext(), str) : ams.g(getContext(), str, null);
        }
        m(f);
    }

    public final void f(float f) {
        this.c.m(f);
    }

    public final void g(int i) {
        this.c.n(i);
    }

    public final void h(int i) {
        this.c.b.setRepeatMode(i);
    }

    public final boolean i() {
        return this.c.o();
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        amy amyVar = this.c;
        if (drawable2 == amyVar) {
            super.invalidateDrawable(amyVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void j(int i) {
        this.s = i;
        a();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            if (!this.p && !this.o) {
                return;
            }
            c();
            this.p = false;
            this.o = false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        if (i()) {
            this.o = false;
            this.n = false;
            this.m = false;
            amy amyVar = this.c;
            amyVar.f.clear();
            amyVar.b.cancel();
            a();
            this.o = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof amo)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        amo amoVar = (amo) parcelable;
        super.onRestoreInstanceState(amoVar.getSuperState());
        String str = amoVar.a;
        this.k = str;
        if (!TextUtils.isEmpty(str)) {
            e(this.k);
        }
        int i = amoVar.b;
        this.l = i;
        if (i != 0) {
            d(i);
        }
        f(amoVar.c);
        if (amoVar.d) {
            c();
        }
        this.c.h = amoVar.e;
        h(amoVar.f);
        g(amoVar.g);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        amo amoVar = new amo(super.onSaveInstanceState());
        amoVar.a = this.k;
        amoVar.b = this.l;
        amoVar.c = this.c.c();
        boolean z = true;
        if (!this.c.o() && (aad.ag(this) || !this.o)) {
            z = false;
        }
        amoVar.d = z;
        amy amyVar = this.c;
        amoVar.e = amyVar.h;
        amoVar.f = amyVar.b.getRepeatMode();
        amoVar.g = this.c.e();
        return amoVar;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        if (!this.j) {
            return;
        }
        if (isShown()) {
            if (this.n) {
                if (isShown()) {
                    this.c.k();
                    a();
                }
            } else if (this.m) {
                c();
            }
            this.n = false;
            this.m = false;
        } else if (!i()) {
        } else {
            b();
            this.n = true;
        }
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        k();
        super.setImageBitmap(bitmap);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        k();
        super.setImageDrawable(drawable);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i) {
        k();
        super.setImageResource(i);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        amy amyVar;
        if (!this.d && drawable == (amyVar = this.c) && amyVar.o()) {
            b();
        } else if (!this.d && (drawable instanceof amy)) {
            amy amyVar2 = (amy) drawable;
            if (amyVar2.o()) {
                amyVar2.i();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public final void a() {
        amp ampVar;
        amp ampVar2;
        int i = this.s;
        int i2 = i - 1;
        if (i != 0) {
            int i3 = 2;
            if (i2 == 0 ? !(((ampVar = this.g) == null || !ampVar.k || Build.VERSION.SDK_INT >= 28) && (((ampVar2 = this.g) == null || ampVar2.l <= 4) && Build.VERSION.SDK_INT != 24 && Build.VERSION.SDK_INT != 25)) : i2 != 1) {
                i3 = 1;
            }
            if (i3 == getLayerType()) {
                return;
            }
            setLayerType(i3, null);
            return;
        }
        throw null;
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l(attributeSet, R.attr.f14240_resource_name_obfuscated_res_0x7f040543);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l(attributeSet, i);
    }
}
