package com.google.android.apps.inputmethod.libs.expression.animatedview;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AnimatedImageView extends FrameLayout implements cha {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/animatedview/AnimatedImageView");
    private final ImageView b;
    private final View c;
    private final int d;
    private final cgx e;
    private int f;
    private Size g = new Size(0, 0);

    public AnimatedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z;
        int i;
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setClickable(false);
        imageView.setFocusable(false);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImportantForAccessibility(2);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843037});
            int i2 = obtainStyledAttributes.getInt(0, -1);
            ImageView.ScaleType[] values = ImageView.ScaleType.values();
            if (i2 >= 0 && i2 < values.length) {
                imageView.setScaleType(values[i2]);
            }
            obtainStyledAttributes.recycle();
        }
        this.b = imageView;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setClickable(false);
        view.setFocusable(false);
        view.setDuplicateParentStateEnabled(true);
        view.setImportantForAccessibility(2);
        this.c = view;
        if (attributeSet == null) {
            this.d = 0;
            this.f = 0;
            i = R.drawable.f49360_resource_name_obfuscated_res_0x7f0802b1;
            z = false;
        } else {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, chi.a, 0, 0);
            this.d = obtainStyledAttributes2.getResourceId(0, 0);
            int resourceId = obtainStyledAttributes2.getResourceId(2, R.drawable.f49360_resource_name_obfuscated_res_0x7f0802b1);
            this.f = obtainStyledAttributes2.getInt(1, 0);
            boolean z2 = obtainStyledAttributes2.getBoolean(3, false);
            obtainStyledAttributes2.recycle();
            z = z2;
            i = resourceId;
        }
        this.e = new cgx(context, attributeSet, imageView, view, i, z);
    }

    private final ats h(Uri uri, iil iilVar, atk atkVar) {
        beu beuVar = (beu) ((beu) beu.a().w(awt.c)).J(atkVar);
        if (g()) {
            beuVar = (beu) beuVar.y(this.d);
        }
        return ((ats) hjq.a(getContext()).c().n(beuVar).J(atkVar)).i(hjq.b(uri, iilVar));
    }

    @Override // defpackage.cha
    public final ImageView.ScaleType a() {
        return this.b.getScaleType();
    }

    @Override // defpackage.cha
    public final /* synthetic */ void b(cqp cqpVar, cgz cgzVar) {
        c(cqpVar, cgzVar, atk.NORMAL);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    @Override // defpackage.cha
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.cqp r9, defpackage.cgz r10, defpackage.atk r11) {
        /*
            r8 = this;
            r0 = 1
            bet r0 = defpackage.efq.s(r10, r0)
            cgx r1 = r8.e
            int r2 = r1.b
            int r3 = r9.a()
            if (r3 == 0) goto L13
            int r2 = r9.a()
        L13:
            r1.c = r2
            int r1 = r9.c()
            int r2 = r9.b()
            java.lang.String r3 = "AnimatedImageView.java"
            java.lang.String r4 = "com/google/android/apps/inputmethod/libs/expression/animatedview/AnimatedImageView"
            if (r2 == 0) goto L26
            if (r1 != 0) goto L3d
            r1 = 0
        L26:
            ltg r5 = com.google.android.apps.inputmethod.libs.expression.animatedview.AnimatedImageView.a
            ltv r5 = r5.c()
            ltd r5 = (defpackage.ltd) r5
            java.lang.String r6 = "prepareWithSize"
            r7 = 151(0x97, float:2.12E-43)
            ltv r5 = r5.k(r4, r6, r7, r3)
            ltd r5 = (defpackage.ltd) r5
            java.lang.String r6 = "Images should provide a non-zero width and height"
            r5.t(r6)
        L3d:
            android.util.Size r5 = new android.util.Size
            r5.<init>(r1, r2)
            r8.g = r5
            r8.invalidate()
            r8.requestLayout()
            java.io.File r1 = r9.u()
            if (r1 == 0) goto L78
            android.content.Context r9 = r8.getContext()
            atw r9 = defpackage.hjq.a(r9)
            ats r9 = r9.c()
            beu r10 = defpackage.beu.a()
            ats r9 = r9.n(r10)
            ats r9 = r9.e(r0)
            bel r9 = r9.J(r11)
            ats r9 = (defpackage.ats) r9
            ats r9 = r9.g(r1)
            cgx r10 = r8.e
            r9.s(r10)
            return
        L78:
            android.net.Uri r1 = r9.s()
            android.net.Uri r2 = android.net.Uri.EMPTY
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L9c
            ltg r10 = com.google.android.apps.inputmethod.libs.expression.animatedview.AnimatedImageView.a
            hip r11 = defpackage.hip.a
            ltd r10 = r10.a(r11)
            java.lang.String r11 = "loadImage"
            r0 = 225(0xe1, float:3.15E-43)
            ltv r10 = r10.k(r4, r11, r0, r3)
            ltd r10 = (defpackage.ltd) r10
            java.lang.String r11 = "loadImage request failed due to null download URL; [%s]"
            r10.w(r11, r9)
            return
        L9c:
            iil r2 = r9.i()
            ats r1 = r8.h(r1, r2, r11)
            ats r0 = r1.e(r0)
            android.net.Uri r1 = r9.g()
            r2 = 0
            if (r1 == 0) goto Ld8
            android.net.Uri r3 = android.net.Uri.EMPTY
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto Lb8
            goto Ld8
        Lb8:
            r2 = 2
            bet r10 = defpackage.efq.s(r10, r2)
            iil r9 = r9.i()
            mbn r2 = r9.v
            mbn r3 = defpackage.mbn.GIS_GIF_FULL_IMAGE
            if (r2 != r3) goto Lca
            iil r9 = defpackage.iil.m
            goto Ld0
        Lca:
            mbn r3 = defpackage.mbn.TENOR_GIF_FULL_IMAGE
            if (r2 != r3) goto Ld0
            iil r9 = defpackage.iil.h
        Ld0:
            ats r9 = r8.h(r1, r9, r11)
            ats r2 = r9.e(r10)
        Ld8:
            if (r2 == 0) goto Lde
            ats r0 = r0.l(r2)
        Lde:
            cgx r9 = r8.e
            r0.s(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.expression.animatedview.AnimatedImageView.c(cqp, cgz, atk):void");
    }

    @Override // defpackage.cha
    public final void d() {
        hjq.a(getContext()).l(this.e);
        this.e.p(chh.DONE);
    }

    @Override // defpackage.cha
    public final void e(chh chhVar) {
        setClickable(chhVar == chh.DONE);
        this.e.p(chhVar);
    }

    @Override // defpackage.cha
    public final void f(ImageView.ScaleType scaleType) {
        this.b.setScaleType(scaleType);
    }

    @Override // defpackage.cha
    public final boolean g() {
        return this.d != 0;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        addView(this.b);
        addView(this.c);
        setBackground(null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3 = this.f;
        if (i3 == 0) {
            if (View.MeasureSpec.getMode(i) == 0) {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/animatedview/AnimatedImageView", "measureVariableHeight", 191, "AnimatedImageView.java")).t("measured with unspecified width");
            }
            int size = View.MeasureSpec.getSize(i);
            Size r = efq.r(this.g, this.b.getDrawable());
            int height = (int) ((r.getHeight() * (size / r.getWidth())) + 0.5f);
            setMeasuredDimension(size, height);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        } else if (i3 != 1) {
        } else {
            if (View.MeasureSpec.getMode(i2) == 0) {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/animatedview/AnimatedImageView", "measureVariableWidth", 203, "AnimatedImageView.java")).t("measured with unspecified height");
            }
            int size2 = View.MeasureSpec.getSize(i2);
            Size r2 = efq.r(this.g, this.b.getDrawable());
            int width = (int) ((r2.getWidth() * (size2 / r2.getHeight())) + 0.5f);
            setMeasuredDimension(width, size2);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), i2);
        }
    }
}
