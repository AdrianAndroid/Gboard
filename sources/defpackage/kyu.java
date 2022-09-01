package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: kyu  reason: default package */
/* loaded from: classes.dex */
public final class kyu extends LinearLayout {
    public TextView a;
    public ImageView b;
    public final Drawable c;
    final /* synthetic */ kyv d;
    private kys e;
    private int f = 2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.graphics.drawable.RippleDrawable] */
    public kyu(kyv kyvVar, Context context) {
        super(context);
        aqq aqqVar;
        this.d = kyvVar;
        int i = kyvVar.l;
        if (i != 0) {
            Drawable a = ej.a(context, i);
            this.c = a;
            if (a != null && a.isStateful()) {
                a.setState(getDrawableState());
            }
        } else {
            this.c = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        if (kyvVar.h != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList a2 = kww.a(kyvVar.h);
            boolean z = kyvVar.u;
            gradientDrawable = new RippleDrawable(a2, true == z ? null : gradientDrawable, true == z ? null : gradientDrawable2);
        }
        aad.O(this, gradientDrawable);
        kyvVar.invalidate();
        aad.W(this, kyvVar.b, kyvVar.c, kyvVar.d, kyvVar.e);
        setGravity(17);
        setOrientation(!kyvVar.r ? 1 : 0);
        setClickable(true);
        Context context2 = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            aqqVar = new aqq(zc.b(context2, 1002));
        } else {
            aqqVar = new aqq((PointerIcon) null);
        }
        aad.ar(this, aqqVar);
    }

    private static final void c(View view) {
        if (view == null) {
            return;
        }
        view.addOnLayoutChangeListener(new dkr(view, 13, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(kys kysVar) {
        if (kysVar != this.e) {
            this.e = kysVar;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        kys kysVar = this.e;
        boolean z = false;
        if (this.b == null) {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.f133950_resource_name_obfuscated_res_0x7f0e0064, (ViewGroup) this, false);
            this.b = imageView;
            addView(imageView, 0);
        }
        if (this.a == null) {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.f133960_resource_name_obfuscated_res_0x7f0e0065, (ViewGroup) this, false);
            this.a = textView;
            addView(textView);
            this.f = acp.a(this.a);
        }
        this.a.setTextAppearance(this.d.f);
        ColorStateList colorStateList = this.d.g;
        if (colorStateList != null) {
            this.a.setTextColor(colorStateList);
        }
        TextView textView2 = this.a;
        ImageView imageView2 = this.b;
        CharSequence charSequence = null;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setImageDrawable(null);
        }
        boolean isEmpty = TextUtils.isEmpty(null);
        boolean z2 = !isEmpty;
        if (textView2 != null) {
            if (z2) {
                textView2.setText((CharSequence) null);
                int i = this.e.e;
                textView2.setVisibility(0);
                setVisibility(0);
            } else {
                textView2.setVisibility(8);
                textView2.setText((CharSequence) null);
            }
        }
        if (imageView2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
            int a = (!z2 || imageView2.getVisibility() != 0) ? 0 : (int) kvj.a(getContext(), 8);
            if (this.d.r) {
                if (a != yr.b(marginLayoutParams)) {
                    yr.f(marginLayoutParams, a);
                    marginLayoutParams.bottomMargin = 0;
                    imageView2.setLayoutParams(marginLayoutParams);
                    imageView2.requestLayout();
                }
            } else if (a != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = a;
                yr.f(marginLayoutParams, 0);
                imageView2.setLayoutParams(marginLayoutParams);
                imageView2.requestLayout();
            }
        }
        kys kysVar2 = this.e;
        CharSequence charSequence2 = kysVar2 != null ? kysVar2.b : null;
        if (Build.VERSION.SDK_INT > 23) {
            if (true == isEmpty) {
                charSequence = charSequence2;
            }
            ez.d(this, charSequence);
        }
        c(this.b);
        c(this.a);
        if (kysVar != null && !TextUtils.isEmpty(kysVar.b)) {
            setContentDescription(kysVar.b);
        }
        if (kysVar != null) {
            kyv kyvVar = kysVar.f;
            if (kyvVar != null) {
                int a2 = kyvVar.a();
                if (a2 != -1 && a2 == kysVar.c) {
                    z = true;
                }
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }
        setSelected(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.c;
        if (drawable == null || !drawable.isStateful() || !this.c.setState(drawableState)) {
            return;
        }
        invalidate();
        this.d.invalidate();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        abj b = abj.b(accessibilityNodeInfo);
        b.j(aqq.D(0, 1, this.e.c, 1, isSelected()));
        if (isSelected()) {
            b.b.setClickable(false);
            b.o(abi.a);
        }
        b.a().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.f154420_resource_name_obfuscated_res_0x7f14036c));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.d.m;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.a != null) {
            float f = this.d.j;
            int i4 = this.f;
            ImageView imageView = this.b;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.a;
                if (textView != null && textView.getLineCount() > 1) {
                    f = this.d.k;
                }
            } else {
                i4 = 1;
            }
            float textSize = this.a.getTextSize();
            int lineCount = this.a.getLineCount();
            int a = acp.a(this.a);
            if (f == textSize && (a < 0 || i4 == a)) {
                return;
            }
            if (this.d.q == 1 && f > textSize && lineCount == 1 && ((layout = this.a.getLayout()) == null || layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                return;
            }
            this.a.setTextSize(0, f);
            this.a.setMaxLines(i4);
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.e != null) {
            if (!performClick) {
                playSoundEffect(0);
            }
            this.e.a();
            return true;
        }
        return performClick;
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.a;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setSelected(z);
        }
    }
}
