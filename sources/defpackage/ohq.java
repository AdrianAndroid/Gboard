package defpackage;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ohq  reason: default package */
/* loaded from: classes2.dex */
public final class ohq {
    private static ohq c;
    public int a;
    public final Object b;

    public ohq() {
        this.b = new int[10];
    }

    public ohq(ImageView imageView) {
        this.a = 0;
        this.b = imageView;
    }

    private ohq(byte[] bArr) {
        this.a = 0;
        this.b = new qo();
    }

    public ohq(char[] cArr) {
        this.b = new Object[256];
    }

    public static synchronized ohq g() {
        ohq ohqVar;
        synchronized (ohq.class) {
            if (c == null) {
                c = new ohq((byte[]) null);
            }
            ohqVar = c;
        }
        return ohqVar;
    }

    public final int a(int i) {
        return ((int[]) this.b)[i];
    }

    public final int b() {
        if ((this.a & 2) != 0) {
            return ((int[]) this.b)[1];
        }
        return -1;
    }

    public final boolean c(int i) {
        return ((1 << i) & this.a) != 0;
    }

    public final void d(int i, int i2) {
        if (i >= 10) {
            return;
        }
        this.a |= 1 << i;
        ((int[]) this.b)[i] = i2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map, java.lang.Object] */
    public final synchronized fme e() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.b.values());
        int i = this.a;
        if (i > 0) {
            arrayList.add(new fmm("UNKNOWN", 1002, i));
            this.a = 0;
        }
        this.b.clear();
        return new fme(arrayList);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map, java.lang.Object] */
    public final synchronized void f(fmm fmmVar) {
        xv xvVar = new xv(fmmVar.a, Integer.valueOf(fmmVar.b));
        fmm fmmVar2 = (fmm) this.b.get(xvVar);
        if (fmmVar2 != null) {
            fmmVar2.c = mhq.w(fmmVar2.c, fmmVar.c);
            return;
        }
        ?? r1 = this.b;
        if (((qv) r1).d >= 100) {
            this.a = mhq.w(this.a, fmmVar.c);
        } else {
            r1.put(xvVar, fmmVar);
        }
    }

    public final void h() {
        if (((ImageView) this.b).getDrawable() != null) {
            ((ImageView) this.b).getDrawable().setLevel(this.a);
        }
    }

    public final void i() {
        Drawable drawable = ((ImageView) this.b).getDrawable();
        if (drawable != null) {
            ke.c(drawable);
        }
    }

    public final void j(AttributeSet attributeSet, int i) {
        int l;
        gkn w = gkn.w(((ImageView) this.b).getContext(), attributeSet, ei.f, i, 0);
        Object obj = this.b;
        aad.L((View) obj, ((ImageView) obj).getContext(), ei.f, attributeSet, (TypedArray) w.a, i, 0);
        try {
            Drawable drawable = ((ImageView) this.b).getDrawable();
            if (drawable == null && (l = w.l(1, -1)) != -1 && (drawable = ej.a(((ImageView) this.b).getContext(), l)) != null) {
                ((ImageView) this.b).setImageDrawable(drawable);
            }
            if (drawable != null) {
                ke.c(drawable);
            }
            if (w.t(2)) {
                aci.c((ImageView) this.b, w.m(2));
            }
            if (w.t(3)) {
                aci.d((ImageView) this.b, ke.a(w.i(3, -1), null));
            }
        } finally {
            w.r();
        }
    }

    public final void k(Drawable drawable) {
        this.a = drawable.getLevel();
    }

    public final void l(int i) {
        if (i != 0) {
            Drawable a = ej.a(((ImageView) this.b).getContext(), i);
            if (a != null) {
                ke.c(a);
            }
            ((ImageView) this.b).setImageDrawable(a);
        } else {
            ((ImageView) this.b).setImageDrawable(null);
        }
        i();
    }

    public final boolean m() {
        return !(((ImageView) this.b).getBackground() instanceof RippleDrawable);
    }

    public final Object n() {
        int i = this.a;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = (Object[]) this.b;
            Object obj = objArr[i2];
            objArr[i2] = null;
            this.a = i2;
            return obj;
        }
        return null;
    }

    public final void o(Object obj) {
        int i = this.a;
        if (i < 256) {
            ((Object[]) this.b)[i] = obj;
            this.a = i + 1;
        }
    }
}
