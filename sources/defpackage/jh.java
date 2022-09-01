package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: jh  reason: default package */
/* loaded from: classes.dex */
public final class jh {
    public Typeface b;
    public boolean c;
    private final TextView d;
    private nu e;
    private nu f;
    private nu g;
    private nu h;
    private nu i;
    private nu j;
    private nu k;
    private final jo l;
    public int a = 0;
    private int m = -1;

    public jh(TextView textView) {
        this.d = textView;
        this.l = new jo(textView);
    }

    public static final void s(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i;
        int i2;
        CharSequence subSequence;
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (Build.VERSION.SDK_INT < 30) {
            nq.g(text);
            if (Build.VERSION.SDK_INT >= 30) {
                ue.d(editorInfo, text);
                return;
            }
            if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
                i = editorInfo.initialSelEnd;
            } else {
                i = editorInfo.initialSelStart;
            }
            if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
                i2 = editorInfo.initialSelStart;
            } else {
                i2 = editorInfo.initialSelEnd;
            }
            int length = text.length();
            if (i < 0 || i2 > length) {
                abu.a(editorInfo, null, 0, 0);
                return;
            }
            int i3 = editorInfo.inputType & 4095;
            if (i3 == 129 || i3 == 225 || i3 == 18) {
                abu.a(editorInfo, null, 0, 0);
                return;
            } else if (length > 2048) {
                int i4 = i2 - i;
                int i5 = i4 > 1024 ? 0 : i4;
                int i6 = 2048 - i5;
                double d = i6;
                Double.isNaN(d);
                int min = Math.min(text.length() - i2, i6 - Math.min(i, (int) (d * 0.8d)));
                int min2 = Math.min(i, i6 - min);
                int i7 = i - min2;
                if (abu.b(text, i7, 0)) {
                    i7++;
                    min2--;
                }
                if (abu.b(text, (i2 + min) - 1, 1)) {
                    min--;
                }
                int i8 = min2 + i5;
                int i9 = i8 + min;
                if (i5 != i4) {
                    subSequence = TextUtils.concat(text.subSequence(i7, i7 + min2), text.subSequence(i2, min + i2));
                } else {
                    subSequence = text.subSequence(i7, i9 + i7);
                }
                abu.a(editorInfo, subSequence, min2, i8);
                return;
            } else {
                abu.a(editorInfo, text, i, i2);
                return;
            }
        }
        ue.d(editorInfo, text);
    }

    private static nu t(Context context, C0000if c0000if, int i) {
        ColorStateList a = c0000if.a(context, i);
        if (a != null) {
            nu nuVar = new nu();
            nuVar.d = true;
            nuVar.a = a;
            return nuVar;
        }
        return null;
    }

    private final void u(Drawable drawable, nu nuVar) {
        if (drawable == null || nuVar == null) {
            return;
        }
        mv.h(drawable, nuVar, this.d.getDrawableState());
    }

    private final void v() {
        nu nuVar = this.k;
        this.e = nuVar;
        this.f = nuVar;
        this.g = nuVar;
        this.h = nuVar;
        this.i = nuVar;
        this.j = nuVar;
    }

    private final void w(Context context, gkn gknVar) {
        String q;
        int[] iArr = ei.a;
        this.a = gknVar.i(2, this.a);
        if (Build.VERSION.SDK_INT >= 28) {
            int i = gknVar.i(11, -1);
            this.m = i;
            if (i != -1) {
                this.a &= 2;
            }
        }
        int i2 = 10;
        boolean z = false;
        if (gknVar.t(10) || gknVar.t(12)) {
            Typeface typeface = null;
            this.b = null;
            if (true == gknVar.t(12)) {
                i2 = 12;
            }
            int i3 = this.m;
            int i4 = this.a;
            if (!context.isRestricted()) {
                jb jbVar = new jb(this, i3, i4, new WeakReference(this.d));
                try {
                    int i5 = this.a;
                    int resourceId = ((TypedArray) gknVar.a).getResourceId(i2, 0);
                    if (resourceId != 0) {
                        if (gknVar.c == null) {
                            gknVar.c = new TypedValue();
                        }
                        typeface = vm.d((Context) gknVar.b, resourceId, (TypedValue) gknVar.c, i5, jbVar);
                    }
                    if (typeface != null) {
                        if (Build.VERSION.SDK_INT >= 28 && this.m != -1) {
                            this.b = jg.a(Typeface.create(typeface, 0), this.m, (this.a & 2) != 0);
                        } else {
                            this.b = typeface;
                        }
                    }
                    this.c = this.b == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.b != null || (q = gknVar.q(i2)) == null) {
                return;
            }
            if (Build.VERSION.SDK_INT < 28 || this.m == -1) {
                this.b = Typeface.create(q, this.a);
                return;
            }
            Typeface create = Typeface.create(q, 0);
            int i6 = this.m;
            if ((this.a & 2) != 0) {
                z = true;
            }
            this.b = jg.a(create, i6, z);
        } else if (!gknVar.t(1)) {
        } else {
            this.c = false;
            int i7 = gknVar.i(1, 1);
            if (i7 == 1) {
                this.b = Typeface.SANS_SERIF;
            } else if (i7 == 2) {
                this.b = Typeface.SERIF;
            } else if (i7 != 3) {
            } else {
                this.b = Typeface.MONOSPACE;
            }
        }
    }

    public final int a() {
        return this.l.a();
    }

    public final int b() {
        return this.l.b();
    }

    public final int c() {
        return this.l.c();
    }

    public final int d() {
        return this.l.a;
    }

    public final void e() {
        if (this.e != null || this.f != null || this.g != null || this.h != null) {
            Drawable[] compoundDrawables = this.d.getCompoundDrawables();
            u(compoundDrawables[0], this.e);
            u(compoundDrawables[1], this.f);
            u(compoundDrawables[2], this.g);
            u(compoundDrawables[3], this.h);
        }
        if (this.i == null && this.j == null) {
            return;
        }
        Drawable[] c = jc.c(this.d);
        u(c[0], this.i);
        u(c[2], this.j);
    }

    public final void f() {
        this.l.e();
    }

    public final void g(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        int i2;
        int resourceId;
        Context context = this.d.getContext();
        C0000if d = C0000if.d();
        gkn w = gkn.w(context, attributeSet, ei.h, i, 0);
        TextView textView = this.d;
        aad.L(textView, textView.getContext(), ei.h, attributeSet, (TypedArray) w.a, i, 0);
        int l = w.l(0, -1);
        if (w.t(3)) {
            this.e = t(context, d, w.l(3, 0));
        }
        if (w.t(1)) {
            this.f = t(context, d, w.l(1, 0));
        }
        if (w.t(4)) {
            this.g = t(context, d, w.l(4, 0));
        }
        if (w.t(2)) {
            this.h = t(context, d, w.l(2, 0));
        }
        if (w.t(5)) {
            this.i = t(context, d, w.l(5, 0));
        }
        if (w.t(6)) {
            this.j = t(context, d, w.l(6, 0));
        }
        w.r();
        boolean z3 = this.d.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (l != -1) {
            gkn u = gkn.u(context, l, ei.x);
            if (z3 || !u.t(14)) {
                z = false;
                z2 = false;
            } else {
                z = u.s(14, false);
                z2 = true;
            }
            w(context, u);
            str = u.t(15) ? u.q(15) : null;
            str2 = (Build.VERSION.SDK_INT < 26 || !u.t(13)) ? null : u.q(13);
            u.r();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        gkn w2 = gkn.w(context, attributeSet, ei.x, i, 0);
        if (!z3 && w2.t(14)) {
            z = w2.s(14, false);
            z2 = true;
        }
        if (w2.t(15)) {
            str = w2.q(15);
        }
        String str3 = str;
        if (Build.VERSION.SDK_INT >= 26 && w2.t(13)) {
            str2 = w2.q(13);
        }
        String str4 = str2;
        if (Build.VERSION.SDK_INT >= 28 && w2.t(0) && w2.h(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
        }
        w(context, w2);
        w2.r();
        if (!z3 && z2) {
            i(z);
        }
        Typeface typeface = this.b;
        if (typeface != null) {
            if (this.m == -1) {
                this.d.setTypeface(typeface, this.a);
            } else {
                this.d.setTypeface(typeface);
            }
        }
        if (str4 != null) {
            jf.d(this.d, str4);
        }
        if (str3 != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                je.b(this.d, je.a(str3));
            } else {
                jc.b(this.d, jd.a(str3.split(",")[0]));
            }
        }
        jo joVar = this.l;
        TypedArray obtainStyledAttributes = joVar.i.obtainStyledAttributes(attributeSet, ei.i, i, 0);
        TextView textView2 = joVar.h;
        aad.L(textView2, textView2.getContext(), ei.i, attributeSet, obtainStyledAttributes, i, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            joVar.a = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr = new int[length];
            if (length > 0) {
                for (int i3 = 0; i3 < length; i3++) {
                    iArr[i3] = obtainTypedArray.getDimensionPixelSize(i3, -1);
                }
                joVar.f = jo.l(iArr);
                joVar.j();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!joVar.k()) {
            joVar.a = 0;
        } else if (joVar.a == 1) {
            if (!joVar.g) {
                DisplayMetrics displayMetrics = joVar.i.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i2 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i2 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                joVar.g(dimension2, dimension3, dimension);
            }
            joVar.i();
        }
        if (acd.d) {
            jo joVar2 = this.l;
            if (joVar2.a != 0) {
                int[] iArr2 = joVar2.f;
                if (iArr2.length > 0) {
                    if (jf.a(this.d) != -1.0f) {
                        jf.b(this.d, this.l.b(), this.l.a(), this.l.c(), 0);
                    } else {
                        jf.c(this.d, iArr2, 0);
                    }
                }
            }
        }
        gkn v = gkn.v(context, attributeSet, ei.i);
        int l2 = v.l(8, -1);
        Drawable c = l2 != -1 ? d.c(context, l2) : null;
        int l3 = v.l(13, -1);
        Drawable c2 = l3 != -1 ? d.c(context, l3) : null;
        int l4 = v.l(9, -1);
        Drawable c3 = l4 != -1 ? d.c(context, l4) : null;
        int l5 = v.l(6, -1);
        Drawable c4 = l5 != -1 ? d.c(context, l5) : null;
        int l6 = v.l(10, -1);
        Drawable c5 = l6 != -1 ? d.c(context, l6) : null;
        int l7 = v.l(7, -1);
        Drawable c6 = l7 != -1 ? d.c(context, l7) : null;
        if (c5 != null || c6 != null) {
            Drawable[] c7 = jc.c(this.d);
            TextView textView3 = this.d;
            if (c5 == null) {
                c5 = c7[0];
            }
            if (c2 == null) {
                c2 = c7[1];
            }
            if (c6 == null) {
                c6 = c7[2];
            }
            if (c4 == null) {
                c4 = c7[3];
            }
            jc.a(textView3, c5, c2, c6, c4);
        } else if (c != null || c2 != null || c3 != null || c4 != null) {
            Drawable[] c8 = jc.c(this.d);
            Drawable drawable = c8[0];
            if (drawable != null || c8[2] != null) {
                TextView textView4 = this.d;
                if (c2 == null) {
                    c2 = c8[1];
                }
                Drawable drawable2 = c8[2];
                if (c4 == null) {
                    c4 = c8[3];
                }
                jc.a(textView4, drawable, c2, drawable2, c4);
            } else {
                Drawable[] compoundDrawables = this.d.getCompoundDrawables();
                TextView textView5 = this.d;
                if (c == null) {
                    c = compoundDrawables[0];
                }
                if (c2 == null) {
                    c2 = compoundDrawables[1];
                }
                if (c3 == null) {
                    c3 = compoundDrawables[2];
                }
                if (c4 == null) {
                    c4 = compoundDrawables[3];
                }
                textView5.setCompoundDrawablesWithIntrinsicBounds(c, c2, c3, c4);
            }
        }
        if (v.t(11)) {
            up.e(this.d, v.m(11));
        }
        if (v.t(12)) {
            PorterDuff.Mode a = ke.a(v.i(12, -1), null);
            TextView textView6 = this.d;
            if (Build.VERSION.SDK_INT >= 24) {
                acr.g(textView6, a);
            } else if (textView6 instanceof acv) {
                ((acv) textView6).eV(a);
            }
        }
        int h = v.h(15, -1);
        int h2 = v.h(18, -1);
        int h3 = v.h(19, -1);
        v.r();
        if (h != -1) {
            up.f(this.d, h);
        }
        if (h2 != -1) {
            up.g(this.d, h2);
        }
        if (h3 != -1) {
            up.h(this.d, h3);
        }
    }

    public final void h(Context context, int i) {
        String q;
        gkn u = gkn.u(context, i, ei.x);
        if (u.t(14)) {
            i(u.s(14, false));
        }
        if (u.t(0) && u.h(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
        }
        w(context, u);
        if (Build.VERSION.SDK_INT >= 26 && u.t(13) && (q = u.q(13)) != null) {
            jf.d(this.d, q);
        }
        u.r();
        Typeface typeface = this.b;
        if (typeface != null) {
            this.d.setTypeface(typeface, this.a);
        }
    }

    final void i(boolean z) {
        this.d.setAllCaps(z);
    }

    public final void j(int i, int i2, int i3, int i4) {
        jo joVar = this.l;
        if (joVar.k()) {
            DisplayMetrics displayMetrics = joVar.i.getResources().getDisplayMetrics();
            joVar.g(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (!joVar.i()) {
                return;
            }
            joVar.e();
        }
    }

    public final void k(int[] iArr, int i) {
        jo joVar = this.l;
        if (joVar.k()) {
            int length = iArr.length;
            if (length <= 0) {
                joVar.g = false;
            } else {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = joVar.i.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                joVar.f = jo.l(iArr2);
                if (!joVar.j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: ".concat(String.valueOf(Arrays.toString(iArr))));
                }
            }
            if (!joVar.i()) {
                return;
            }
            joVar.e();
        }
    }

    public final void l(int i) {
        jo joVar = this.l;
        if (joVar.k()) {
            if (i == 0) {
                joVar.a = 0;
                joVar.d = -1.0f;
                joVar.e = -1.0f;
                joVar.c = -1.0f;
                joVar.f = new int[0];
                joVar.b = false;
            } else if (i == 1) {
                DisplayMetrics displayMetrics = joVar.i.getResources().getDisplayMetrics();
                joVar.g(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (!joVar.i()) {
                    return;
                }
                joVar.e();
            } else {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
        }
    }

    public final void m(ColorStateList colorStateList) {
        if (this.k == null) {
            this.k = new nu();
        }
        nu nuVar = this.k;
        nuVar.a = colorStateList;
        nuVar.d = colorStateList != null;
        v();
    }

    public final void n(PorterDuff.Mode mode) {
        if (this.k == null) {
            this.k = new nu();
        }
        nu nuVar = this.k;
        nuVar.b = mode;
        nuVar.c = mode != null;
        v();
    }

    public final void o(int i, float f) {
        if (acd.d || p()) {
            return;
        }
        this.l.f(i, f);
    }

    public final boolean p() {
        return this.l.h();
    }

    public final int[] q() {
        return this.l.f;
    }

    public final void r() {
        if (!acd.d) {
            f();
        }
    }
}
