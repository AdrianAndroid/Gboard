package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.google.android.libraries.inputmethod.widgets.StrokeView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ese  reason: default package */
/* loaded from: classes.dex */
public final class ese implements eqr {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/core/property/PropertyBackgroundShape");
    static final ColorStateList b = ColorStateList.valueOf(Color.argb(70, 0, 0, 0));
    private final int c;
    private final ColorStateList d;
    private final ColorStateList e;
    private final ColorStateList f;
    private final float g;
    private final float h;
    private final float i;
    private final float j;
    private final Rect k;
    private final RectF l;
    private final int m;
    private final int n;
    private final float o;
    private final float p;
    private final int[][] q;

    public ese(int i, ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, float f, float f2, float f3, float f4, Rect rect, RectF rectF, int i2, int i3, float f5, float f6, int[][] iArr) {
        this.c = i;
        this.d = colorStateList;
        this.e = colorStateList2;
        this.f = colorStateList3;
        this.g = f;
        this.h = f2;
        this.i = f3;
        this.j = f4;
        this.k = rect;
        this.l = rectF;
        this.m = i2;
        this.n = i3;
        this.o = f5;
        this.p = f6;
        this.q = iArr;
    }

    private static int e(View view, Rect rect, int i) {
        if (i > rect.bottom && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, (marginLayoutParams.bottomMargin - i) + rect.bottom);
            view.setLayoutParams(marginLayoutParams);
            rect.bottom = i;
        }
        return Math.min(rect.bottom, i);
    }

    private final Drawable f(View view, Rect rect) {
        if (m()) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/theme/core/property/PropertyBackgroundShape", "applySimpleDrawable", 210, "PropertyBackgroundShape.java")).w("No shadow support. tag:%s", view.getTag());
        }
        if (l()) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/theme/core/property/PropertyBackgroundShape", "applySimpleDrawable", 213, "PropertyBackgroundShape.java")).w("No edge support. tag:%s", view.getTag());
        }
        GradientDrawable h = h();
        i(h);
        return new InsetDrawable((Drawable) new eqa(h, this.d), rect.left, rect.top, rect.right, rect.bottom);
    }

    private final Drawable g(View view, Rect rect) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (n()) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/theme/core/property/PropertyBackgroundShape", "applyStackingDrawable", 273, "PropertyBackgroundShape.java")).w("No translucent color support. tag:%s", view.getTag());
        }
        int e = e(view, rect, this.m);
        ArrayList arrayList = new ArrayList(3);
        int i9 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom - e;
        if (m()) {
            GradientDrawable h = h();
            i(h);
            arrayList.add(new InsetDrawable((Drawable) new eqa(h, this.f), i9, i10, i11, i12));
            i3 = e;
            i4 = 0;
            i = 0;
            i2 = 0;
        } else {
            i = i10;
            i2 = i11;
            i3 = i12;
            i4 = i9;
        }
        if (l()) {
            GradientDrawable h2 = h();
            i(h2);
            arrayList.add(new InsetDrawable((Drawable) new eqa(h2, this.e), i4, i, i2, i3));
            i5 = this.n;
            i6 = i5;
            i7 = i6;
            i8 = i7;
        } else {
            i5 = i4;
            i6 = i;
            i7 = i2;
            i8 = i3;
        }
        GradientDrawable h3 = h();
        j(h3, -this.n);
        arrayList.add(new InsetDrawable((Drawable) new eqa(h3, this.d), i5, i6, i7, i8));
        return new LayerDrawable((Drawable[]) lre.ak(arrayList, Drawable.class));
    }

    private static GradientDrawable h() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-16777216);
        return gradientDrawable;
    }

    private final void i(GradientDrawable gradientDrawable) {
        j(gradientDrawable, 0.0f);
    }

    private final void j(GradientDrawable gradientDrawable, float f) {
        if (k()) {
            gradientDrawable.setCornerRadius(this.g + f);
            return;
        }
        float f2 = this.g + f;
        float f3 = this.h + f;
        float f4 = this.j + f;
        float f5 = this.i + f;
        gradientDrawable.setCornerRadii(new float[]{f2, f2, f3, f3, f4, f4, f5, f5});
    }

    private final boolean k() {
        float f = this.g;
        return f == this.h && f == this.i && f == this.j;
    }

    private final boolean l() {
        return this.n != 0;
    }

    private final boolean m() {
        return this.m != 0;
    }

    private final boolean n() {
        return Color.alpha(this.d.getDefaultColor()) < 255;
    }

    @Override // defpackage.eqr
    public final ColorStateList a() {
        return this.d;
    }

    @Override // defpackage.eqr
    public final /* synthetic */ ColorStateList b() {
        return null;
    }

    @Override // defpackage.eqr
    public final /* synthetic */ Drawable c(Context context) {
        return null;
    }

    @Override // defpackage.eqr
    public final void d(View view) {
        eqk f;
        Drawable background = view.getBackground();
        if (background == null) {
            return;
        }
        if (this.c == 0) {
            if (view instanceof MaterialButton) {
                MaterialButton materialButton = (MaterialButton) view;
                materialButton.f(this.d);
                float f2 = this.g;
                if (f2 > 0.0f && k()) {
                    int i = (int) f2;
                    if (materialButton.j()) {
                        ktg ktgVar = materialButton.b;
                        if (!ktgVar.o || ktgVar.g != i) {
                            ktgVar.g = i;
                            ktgVar.o = true;
                            ktgVar.e(ktgVar.b.d(i));
                        }
                    }
                }
                ColorStateList colorStateList = this.e;
                if (!materialButton.j()) {
                    return;
                }
                ktg ktgVar2 = materialButton.b;
                if (ktgVar2.k == colorStateList) {
                    return;
                }
                ktgVar2.k = colorStateList;
                kxe a2 = ktgVar2.a();
                kxe b2 = ktgVar2.b();
                if (a2 == null) {
                    return;
                }
                a2.n(ktgVar2.h, ktgVar2.k);
                if (b2 == null) {
                    return;
                }
                b2.t(ktgVar2.h);
                return;
            } else if (view instanceof CardView) {
                CardView cardView = (CardView) view;
                cardView.c(this.d);
                float f3 = this.g;
                if (f3 > 0.0f && k()) {
                    cardView.e(f3);
                }
                if (!(view instanceof MaterialCardView)) {
                    return;
                }
                MaterialCardView materialCardView = (MaterialCardView) view;
                int i2 = this.n;
                ktk ktkVar = materialCardView.g;
                if (i2 != ktkVar.i) {
                    ktkVar.i = i2;
                    ktkVar.j();
                }
                materialCardView.invalidate();
                ColorStateList colorStateList2 = this.e;
                ktk ktkVar2 = materialCardView.g;
                if (ktkVar2.o != colorStateList2) {
                    ktkVar2.o = colorStateList2;
                    ktkVar2.j();
                }
                materialCardView.invalidate();
                return;
            } else if (background instanceof RippleDrawable) {
                ((RippleDrawable) background).setColor(this.d);
                return;
            } else {
                view.setBackground(new eqa(background, this.d));
                return;
            }
        }
        Rect rect = new Rect();
        background.getPadding(rect);
        Rect rect2 = this.k;
        RectF rectF = this.l;
        Rect rect3 = new Rect();
        rect3.left = rect2.left + ((int) (rect.left * rectF.left));
        rect3.top = rect2.top + ((int) (rect.top * rectF.top));
        rect3.right = rect2.right + ((int) (rect.right * rectF.right));
        rect3.bottom = rect2.bottom + ((int) (rect.bottom * rectF.bottom));
        int i3 = 0;
        if (view instanceof StrokeView) {
            if (background instanceof LayerDrawable) {
                Drawable drawable = ((LayerDrawable) background).getDrawable(0);
                if (drawable instanceof GradientDrawable) {
                    i((GradientDrawable) drawable);
                }
            } else if (background instanceof GradientDrawable) {
                i((GradientDrawable) background);
            }
            f = new InsetDrawable((Drawable) new eqa(background, this.e), rect3.left, rect3.top, rect3.right, rect3.bottom);
        } else if (m()) {
            if (n()) {
                if (l()) {
                    ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/theme/core/property/PropertyBackgroundShape", "applyTranslucentKeytopDrawable", 227, "PropertyBackgroundShape.java")).w("No edge support. tag:%s", view.getTag());
                }
                int e = e(view, rect3, this.m);
                StateListDrawable stateListDrawable = new StateListDrawable();
                int defaultColor = this.d.getDefaultColor();
                int defaultColor2 = this.f.getDefaultColor();
                int[][] iArr = this.q;
                int length = iArr.length;
                while (i3 < length) {
                    int[] iArr2 = iArr[i3];
                    stateListDrawable.addState(iArr2, erq.a(this.d.getColorForState(iArr2, defaultColor), this.f.getColorForState(iArr2, defaultColor2), this.g, this.h, this.i, this.j, e));
                    i3++;
                    length = length;
                    iArr = iArr;
                    defaultColor = defaultColor;
                    defaultColor2 = defaultColor2;
                }
                f = new InsetDrawable((Drawable) stateListDrawable, rect3.left, rect3.top, rect3.right, rect3.bottom - e);
            } else {
                f = g(view, rect3);
            }
        } else if (l()) {
            if (n()) {
                f = f(view, rect3);
            } else {
                f = g(view, rect3);
            }
        } else {
            f = f(view, rect3);
        }
        float f4 = this.o;
        if (f4 > 0.0f || this.p > 0.0f) {
            f = new eqk(f, Math.round(f4), Math.round(this.p));
        }
        view.setBackground(f);
        view.setPadding(rect3.left, rect3.top, rect3.right, rect3.bottom);
    }
}
