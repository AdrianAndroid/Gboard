package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: PG */
/* renamed from: kxj  reason: default package */
/* loaded from: classes.dex */
public final class kxj {
    public static final kxa a = new kxg(0.5f);
    public final kxa b;
    public final kxa c;
    public final kxa d;
    public final kxa e;
    final kxc f;
    final kxc g;
    final kxc h;
    final kxc i;
    public final kxc j;
    public final kxc k;
    public final kxc l;
    public final kxc m;

    public kxj() {
        this.j = laq.l();
        this.k = laq.l();
        this.l = laq.l();
        this.m = laq.l();
        this.b = new kwy(0.0f);
        this.c = new kwy(0.0f);
        this.d = new kwy(0.0f);
        this.e = new kwy(0.0f);
        this.f = laq.g();
        this.g = laq.g();
        this.h = laq.g();
        this.i = laq.g();
    }

    public kxj(kxi kxiVar) {
        this.j = kxiVar.i;
        this.k = kxiVar.j;
        this.l = kxiVar.k;
        this.m = kxiVar.l;
        this.b = kxiVar.a;
        this.c = kxiVar.b;
        this.d = kxiVar.c;
        this.e = kxiVar.d;
        this.f = kxiVar.e;
        this.g = kxiVar.f;
        this.h = kxiVar.g;
        this.i = kxiVar.h;
    }

    public static kxi a(Context context, AttributeSet attributeSet, int i, int i2) {
        return b(context, attributeSet, i, i2, new kwy(0.0f));
    }

    public static kxi b(Context context, AttributeSet attributeSet, int i, int i2, kxa kxaVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kxf.a, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, resourceId2);
        }
        TypedArray obtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(kxf.b);
        try {
            int i3 = obtainStyledAttributes2.getInt(0, 0);
            int i4 = obtainStyledAttributes2.getInt(3, i3);
            int i5 = obtainStyledAttributes2.getInt(4, i3);
            int i6 = obtainStyledAttributes2.getInt(2, i3);
            int i7 = obtainStyledAttributes2.getInt(1, i3);
            kxa f = f(obtainStyledAttributes2, 5, kxaVar);
            kxa f2 = f(obtainStyledAttributes2, 8, f);
            kxa f3 = f(obtainStyledAttributes2, 9, f);
            kxa f4 = f(obtainStyledAttributes2, 7, f);
            kxa f5 = f(obtainStyledAttributes2, 6, f);
            kxi kxiVar = new kxi();
            kxc k = laq.k(i4);
            kxiVar.i = k;
            kxi.c(k);
            kxiVar.a = f2;
            kxc k2 = laq.k(i5);
            kxiVar.j = k2;
            kxi.c(k2);
            kxiVar.b = f3;
            kxc k3 = laq.k(i6);
            kxiVar.k = k3;
            kxi.c(k3);
            kxiVar.c = f4;
            kxc k4 = laq.k(i7);
            kxiVar.l = k4;
            kxi.c(k4);
            kxiVar.d = f5;
            return kxiVar;
        } finally {
            obtainStyledAttributes2.recycle();
        }
    }

    private static kxa f(TypedArray typedArray, int i, kxa kxaVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return kxaVar;
        }
        if (peekValue.type == 5) {
            return new kwy(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return peekValue.type == 6 ? new kxg(peekValue.getFraction(1.0f, 1.0f)) : kxaVar;
    }

    public final kxi c() {
        return new kxi(this);
    }

    public final kxj d(float f) {
        kxi c = c();
        c.b(f);
        return c.a();
    }

    public final boolean e(RectF rectF) {
        boolean z = this.i.getClass().equals(kxc.class) && this.g.getClass().equals(kxc.class) && this.f.getClass().equals(kxc.class) && this.h.getClass().equals(kxc.class);
        float a2 = this.b.a(rectF);
        return z && ((this.c.a(rectF) > a2 ? 1 : (this.c.a(rectF) == a2 ? 0 : -1)) == 0 && (this.e.a(rectF) > a2 ? 1 : (this.e.a(rectF) == a2 ? 0 : -1)) == 0 && (this.d.a(rectF) > a2 ? 1 : (this.d.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.k instanceof kxh) && (this.j instanceof kxh) && (this.l instanceof kxh) && (this.m instanceof kxh));
    }
}
