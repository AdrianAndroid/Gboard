package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* renamed from: ktn  reason: default package */
/* loaded from: classes.dex */
public final class ktn extends ib {
    private static final int[] e = {R.attr.f17100_resource_name_obfuscated_res_0x7f0406cb};
    private static final int[][] f = {new int[]{16842910, R.attr.f17100_resource_name_obfuscated_res_0x7f0406cb}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    ColorStateList b;
    final ColorStateList c;
    public int[] d;
    private ColorStateList g;
    private boolean h;
    private final boolean i;
    private final boolean j;
    private final CharSequence k;
    private Drawable l;
    private Drawable m;
    private boolean n;
    private final PorterDuff.Mode o;
    private final akf p = akf.a(getContext(), R.drawable.f49540_resource_name_obfuscated_res_0x7f0802d8);
    private final ajz q = new ktm(this);

    public ktn(Context context, AttributeSet attributeSet) {
        super(kzb.a(context, attributeSet, R.attr.f8800_resource_name_obfuscated_res_0x7f0402cc, R.style.f207420_resource_name_obfuscated_res_0x7f150a2e), attributeSet);
        ColorStateList m;
        int l;
        new LinkedHashSet();
        Context context2 = getContext();
        this.l = acf.a(this);
        ColorStateList colorStateList = this.b;
        this.b = colorStateList == null ? super.getButtonTintList() != null ? super.getButtonTintList() : null : colorStateList;
        id idVar = this.a;
        if (idVar != null) {
            idVar.b = true;
            idVar.a();
        }
        int[] iArr = kto.a;
        kve.c(context2, attributeSet, R.attr.f8800_resource_name_obfuscated_res_0x7f0402cc, R.style.f207420_resource_name_obfuscated_res_0x7f150a2e);
        kve.d(context2, attributeSet, iArr, R.attr.f8800_resource_name_obfuscated_res_0x7f0402cc, R.style.f207420_resource_name_obfuscated_res_0x7f150a2e, new int[0]);
        gkn w = gkn.w(context2, attributeSet, iArr, R.attr.f8800_resource_name_obfuscated_res_0x7f0402cc, R.style.f207420_resource_name_obfuscated_res_0x7f150a2e);
        this.m = w.n(0);
        if (this.l == null) {
            this.l = ej.a(context2, R.drawable.f49530_resource_name_obfuscated_res_0x7f0802d7);
            this.n = true;
            if (this.m == null) {
                this.m = ej.a(context2, R.drawable.f49550_resource_name_obfuscated_res_0x7f0802d9);
            }
        }
        this.c = (!w.t(1) || (l = w.l(1, 0)) == 0 || (m = uv.c(context2, l)) == null) ? w.m(1) : m;
        this.o = kvj.b(w.i(2, -1), PorterDuff.Mode.SRC_IN);
        this.h = w.s(7, false);
        this.i = w.s(4, true);
        this.j = w.s(6, false);
        this.k = w.p(5);
        w.r();
        c();
    }

    private final void c() {
        int intrinsicHeight;
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        akf akfVar;
        Animator.AnimatorListener animatorListener;
        this.l = kvj.e(this.l, this.b, ace.b(this));
        this.m = kvj.e(this.m, this.c, this.o);
        if (this.n) {
            akf akfVar2 = this.p;
            if (akfVar2 != null) {
                ajz ajzVar = this.q;
                if (ajzVar != null) {
                    Drawable drawable = akfVar2.e;
                    if (drawable != null) {
                        ake.c((AnimatedVectorDrawable) drawable, ajzVar.a());
                    }
                    ArrayList arrayList = akfVar2.c;
                    if (arrayList != null) {
                        arrayList.remove(ajzVar);
                        if (akfVar2.c.size() == 0 && (animatorListener = akfVar2.b) != null) {
                            akfVar2.a.c.removeListener(animatorListener);
                            akfVar2.b = null;
                        }
                    }
                }
                this.p.c(this.q);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable2 = this.l;
                if ((drawable2 instanceof AnimatedStateListDrawable) && (akfVar = this.p) != null) {
                    ((AnimatedStateListDrawable) drawable2).addTransition(R.id.f52980_resource_name_obfuscated_res_0x7f0b00ed, R.id.f130300_resource_name_obfuscated_res_0x7f0b21d6, akfVar, false);
                }
            }
        }
        Drawable drawable3 = this.l;
        if (drawable3 != null && (colorStateList2 = this.b) != null) {
            wf.g(drawable3, colorStateList2);
        }
        Drawable drawable4 = this.m;
        if (drawable4 != null && (colorStateList = this.c) != null) {
            wf.g(drawable4, colorStateList);
        }
        Drawable drawable5 = this.l;
        Drawable drawable6 = this.m;
        if (drawable5 == null) {
            drawable5 = drawable6;
        } else if (drawable6 != null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable5, drawable6});
            if (drawable6.getIntrinsicWidth() == -1 || drawable6.getIntrinsicHeight() == -1) {
                int intrinsicWidth = drawable5.getIntrinsicWidth();
                intrinsicHeight = drawable5.getIntrinsicHeight();
                i = intrinsicWidth;
            } else if (drawable6.getIntrinsicWidth() > drawable5.getIntrinsicWidth() || drawable6.getIntrinsicHeight() > drawable5.getIntrinsicHeight()) {
                float intrinsicWidth2 = drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight();
                if (intrinsicWidth2 >= drawable5.getIntrinsicWidth() / drawable5.getIntrinsicHeight()) {
                    i = drawable5.getIntrinsicWidth();
                    intrinsicHeight = (int) (i / intrinsicWidth2);
                } else {
                    intrinsicHeight = drawable5.getIntrinsicHeight();
                    i = (int) (intrinsicWidth2 * intrinsicHeight);
                }
            } else {
                i = drawable6.getIntrinsicWidth();
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            layerDrawable.setLayerSize(1, i, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable5 = layerDrawable;
        }
        super.setButtonDrawable(drawable5);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public final Drawable getButtonDrawable() {
        return this.l;
    }

    @Override // android.widget.CompoundButton
    public final ColorStateList getButtonTintList() {
        return this.b;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.b == null && this.c == null) {
            this.h = true;
            if (this.g == null) {
                int[][] iArr = f;
                int length = iArr.length;
                int f2 = kxc.f(this, R.attr.f9400_resource_name_obfuscated_res_0x7f040317);
                int f3 = kxc.f(this, R.attr.f9430_resource_name_obfuscated_res_0x7f04031a);
                int f4 = kxc.f(this, R.attr.f10000_resource_name_obfuscated_res_0x7f040356);
                int f5 = kxc.f(this, R.attr.f9670_resource_name_obfuscated_res_0x7f040334);
                this.g = new ColorStateList(iArr, new int[]{kxc.h(f4, f3, 1.0f), kxc.h(f4, f2, 1.0f), kxc.h(f4, f5, 0.54f), kxc.h(f4, f5, 0.38f), kxc.h(f4, f5, 0.38f)});
            }
            ace.c(this, this.g);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.j) {
            mergeDrawableStates(onCreateDrawableState, e);
        }
        this.d = kvj.f(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Drawable a;
        if (!this.i || !TextUtils.isEmpty(getText()) || (a = acf.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int i = 1;
        if (true == kvj.c(this)) {
            i = -1;
        }
        int width = ((getWidth() - a.getIntrinsicWidth()) / 2) * i;
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() == null) {
            return;
        }
        Rect bounds = a.getBounds();
        wf.e(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.j) {
            String valueOf = String.valueOf(accessibilityNodeInfo.getText());
            String valueOf2 = String.valueOf(this.k);
            accessibilityNodeInfo.setText(valueOf + ", " + valueOf2);
        }
    }

    @Override // defpackage.ib, android.widget.CompoundButton
    public final void setButtonDrawable(int i) {
        setButtonDrawable(ej.a(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintList(ColorStateList colorStateList) {
        if (this.b == colorStateList) {
            return;
        }
        this.b = colorStateList;
        c();
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintMode(PorterDuff.Mode mode) {
        id idVar = this.a;
        if (idVar != null) {
            idVar.a = mode;
            idVar.c = true;
            idVar.a();
        }
        c();
    }

    @Override // defpackage.ib, android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        this.l = drawable;
        this.n = false;
        c();
    }
}
