package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: cgx  reason: default package */
/* loaded from: classes.dex */
public final class cgx extends hjr {
    public final int b;
    public int c;
    private final ImageView e;
    private final View f;
    private final int g;
    private final int h;
    private final boolean i;
    private chh j = chh.DONE;

    public cgx(Context context, AttributeSet attributeSet, ImageView imageView, View view, int i, boolean z) {
        super(imageView);
        this.e = imageView;
        this.f = view;
        this.h = i;
        this.i = z;
        int i2 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842964});
            i2 = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
        }
        this.g = i2;
        int q = efq.q(context);
        this.c = q;
        this.b = q;
    }

    private final void w() {
        int i = this.d;
        hjr.v(this.f.getForeground(), false);
        int i2 = i - 1;
        ColorDrawable colorDrawable = null;
        if (i != 0) {
            if (i2 == 2) {
                this.f.setForeground(null);
                this.f.setBackgroundColor(this.c);
                this.e.setBackgroundColor(0);
                return;
            } else if (i2 == 3) {
                if (this.j == chh.PENDING) {
                    Context context = ((ImageView) this.a).getContext();
                    aji ajiVar = new aji(context);
                    ajh ajhVar = ajiVar.a;
                    float f = ajiVar.b.getDisplayMetrics().density;
                    ajhVar.d(f * 3.0f);
                    ajhVar.n = 11.0f * f;
                    ajhVar.g();
                    ajhVar.o = (int) (f * 12.0f);
                    ajiVar.invalidateSelf();
                    ajiVar.a.c(new int[]{-1});
                    ajiVar.a.g();
                    ajiVar.invalidateSelf();
                    ajiVar.b(gwc.a(context, 3.0f));
                    ajiVar.a.n = gwc.a(context, 12.0f);
                    ajiVar.invalidateSelf();
                    ajiVar.start();
                    this.f.setForeground(ajiVar);
                    View view = this.f;
                    if (this.i) {
                        colorDrawable = new ColorDrawable(Color.argb(128, 0, 0, 0));
                    }
                    view.setBackground(colorDrawable);
                } else {
                    this.f.setForeground(null);
                    this.f.setBackgroundResource(this.h);
                }
                this.e.setBackgroundResource(this.g);
                return;
            } else {
                this.f.setForeground(null);
                this.f.setBackground(null);
                this.e.setBackground(null);
                return;
            }
        }
        throw null;
    }

    @Override // defpackage.hjr, defpackage.bfh
    public final void a(Drawable drawable) {
        super.a(drawable);
        w();
    }

    @Override // defpackage.hjr, defpackage.bfb
    public final void b(Drawable drawable) {
        super.b(drawable);
        w();
    }

    @Override // defpackage.hjr, defpackage.bfh
    public final /* bridge */ /* synthetic */ void c(Object obj, bfp bfpVar) {
        c((Drawable) obj, bfpVar);
    }

    @Override // defpackage.hjr, defpackage.bfb
    public final void i(Drawable drawable) {
        super.i(drawable);
        w();
    }

    @Override // defpackage.hjr
    public final void l(Drawable drawable, bfp bfpVar) {
        super.c(drawable, bfpVar);
        w();
    }

    public final void p(chh chhVar) {
        if (this.j == chhVar) {
            return;
        }
        this.j = chhVar;
        w();
    }
}
