package defpackage;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: kxd  reason: default package */
/* loaded from: classes.dex */
public final class kxd extends Drawable.ConstantState {
    public kxj a;
    public ktw b;
    public ColorFilter c;
    public ColorStateList d;
    public ColorStateList e;
    public ColorStateList f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public Rect i;
    public float j;
    public float k;
    public float l;
    public int m;
    public float n;
    public float o;
    public float p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public Paint.Style v;

    public kxd(kxd kxdVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.a = kxdVar.a;
        this.b = kxdVar.b;
        this.l = kxdVar.l;
        this.c = kxdVar.c;
        this.d = kxdVar.d;
        this.e = kxdVar.e;
        this.h = kxdVar.h;
        this.g = kxdVar.g;
        this.m = kxdVar.m;
        this.j = kxdVar.j;
        this.s = kxdVar.s;
        int i = kxdVar.q;
        this.q = 0;
        boolean z = kxdVar.u;
        this.u = false;
        this.k = kxdVar.k;
        this.n = kxdVar.n;
        this.o = kxdVar.o;
        float f = kxdVar.p;
        this.p = 0.0f;
        this.r = kxdVar.r;
        int i2 = kxdVar.t;
        this.t = 0;
        ColorStateList colorStateList = kxdVar.f;
        this.f = null;
        this.v = kxdVar.v;
        Rect rect = kxdVar.i;
        if (rect != null) {
            this.i = new Rect(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        kxe kxeVar = new kxe(this);
        kxeVar.e = true;
        return kxeVar;
    }

    public kxd(kxj kxjVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.a = kxjVar;
        this.b = null;
    }
}
