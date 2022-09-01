package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: akn  reason: default package */
/* loaded from: classes.dex */
final class akn extends Drawable.ConstantState {
    int a;
    akm b;
    ColorStateList c;
    PorterDuff.Mode d;
    boolean e;
    Bitmap f;
    ColorStateList g;
    PorterDuff.Mode h;
    int i;
    boolean j;
    boolean k;
    Paint l;

    public akn() {
        this.c = null;
        this.d = akp.a;
        this.b = new akm();
    }

    public final void a(int i, int i2) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        akm akmVar = this.b;
        akmVar.a(akmVar.d, akm.a, canvas, i, i2);
    }

    public final boolean b() {
        akm akmVar = this.b;
        if (akmVar.k == null) {
            akmVar.k = Boolean.valueOf(akmVar.d.c());
        }
        return akmVar.k.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new akp(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new akp(this);
    }

    public akn(akn aknVar) {
        this.c = null;
        this.d = akp.a;
        if (aknVar != null) {
            this.a = aknVar.a;
            this.b = new akm(aknVar.b);
            Paint paint = aknVar.b.c;
            if (paint != null) {
                this.b.c = new Paint(paint);
            }
            Paint paint2 = aknVar.b.b;
            if (paint2 != null) {
                this.b.b = new Paint(paint2);
            }
            this.c = aknVar.c;
            this.d = aknVar.d;
            this.e = aknVar.e;
        }
    }
}
