package com.google.android.apps.inputmethod.libs.expression.candidatesupplier;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewAnimator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ImageCandidatePopupView extends cin {
    public final ViewAnimator c;
    public final ImageView d;
    public final hjr e;
    public final ConstraintLayout f;
    public final View g;
    public final View h;
    public final View i;
    public final View j;
    public final View k;
    public final View l;
    public final View m;
    public ValueAnimator n;
    public final th o;
    public final th p;

    public ImageCandidatePopupView(Context context) {
        this(context, null);
    }

    @Override // defpackage.cin
    public final void a() {
        this.e.r();
        this.d.setOnClickListener(null);
        this.g.setOnClickListener(null);
        this.h.setOnClickListener(null);
        this.l.setOnClickListener(null);
        this.i.setOnClickListener(null);
        this.j.setOnClickListener(null);
        this.k.setOnClickListener(null);
        this.c.setDisplayedChild(0);
        clearAnimation();
        setPadding(0, 0, 0, 0);
    }

    @Override // android.view.View
    public final void clearAnimation() {
        super.clearAnimation();
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.n = null;
        }
    }

    public ImageCandidatePopupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = dbf.a(context).inflate(R.layout.f134970_resource_name_obfuscated_res_0x7f0e00d7, (ViewGroup) this, true);
        aad.q(inflate, R.id.f56280_resource_name_obfuscated_res_0x7f0b0272).setOutlineProvider(b);
        ViewAnimator viewAnimator = (ViewAnimator) aad.q(inflate, R.id.f56390_resource_name_obfuscated_res_0x7f0b027d);
        this.c = viewAnimator;
        ImageView imageView = (ImageView) aad.q(viewAnimator, R.id.f56320_resource_name_obfuscated_res_0x7f0b0276);
        this.d = imageView;
        this.e = new hjr(imageView);
        ConstraintLayout constraintLayout = (ConstraintLayout) aad.q(viewAnimator, R.id.f56330_resource_name_obfuscated_res_0x7f0b0277);
        this.f = constraintLayout;
        this.g = aad.q(viewAnimator, R.id.f56410_resource_name_obfuscated_res_0x7f0b027f);
        this.h = aad.q(viewAnimator, R.id.f56340_resource_name_obfuscated_res_0x7f0b0278);
        this.l = aad.q(viewAnimator, R.id.f56290_resource_name_obfuscated_res_0x7f0b0273);
        this.m = aad.q(viewAnimator, R.id.f56310_resource_name_obfuscated_res_0x7f0b0275);
        this.i = aad.q(viewAnimator, R.id.f56380_resource_name_obfuscated_res_0x7f0b027c);
        this.j = aad.q(viewAnimator, R.id.f56370_resource_name_obfuscated_res_0x7f0b027b);
        this.k = aad.q(viewAnimator, R.id.f56350_resource_name_obfuscated_res_0x7f0b0279);
        th thVar = new th();
        thVar.d(constraintLayout);
        thVar.f(R.id.f56300_resource_name_obfuscated_res_0x7f0b0274, 7, R.id.f56290_resource_name_obfuscated_res_0x7f0b0273, 6, 0);
        thVar.f(R.id.f56290_resource_name_obfuscated_res_0x7f0b0273, 7, R.id.f56310_resource_name_obfuscated_res_0x7f0b0275, 6, 35);
        thVar.f(R.id.f56310_resource_name_obfuscated_res_0x7f0b0275, 7, R.id.f56410_resource_name_obfuscated_res_0x7f0b027f, 6, 0);
        this.o = thVar;
        th thVar2 = new th();
        thVar2.d(constraintLayout);
        thVar2.f(R.id.f56300_resource_name_obfuscated_res_0x7f0b0274, 7, R.id.f56410_resource_name_obfuscated_res_0x7f0b027f, 6, 35);
        thVar2.f(R.id.f56410_resource_name_obfuscated_res_0x7f0b027f, 6, R.id.f56300_resource_name_obfuscated_res_0x7f0b0274, 7, 0);
        this.p = thVar2;
    }
}
