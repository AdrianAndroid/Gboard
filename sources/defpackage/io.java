package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: io  reason: default package */
/* loaded from: classes.dex */
final class io extends ij {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d = null;
    private PorterDuff.Mode e = null;
    private boolean f = false;
    private boolean g = false;

    public io(SeekBar seekBar) {
        super(seekBar);
        this.b = seekBar;
    }

    private final void c() {
        Drawable drawable = this.c;
        if (drawable != null) {
            if (!this.f && !this.g) {
                return;
            }
            Drawable mutate = drawable.mutate();
            this.c = mutate;
            if (this.f) {
                wf.g(mutate, this.d);
            }
            if (this.g) {
                wf.h(this.c, this.e);
            }
            if (!this.c.isStateful()) {
                return;
            }
            this.c.setState(this.b.getDrawableState());
        }
    }

    @Override // defpackage.ij
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.f16540_resource_name_obfuscated_res_0x7f040675);
        gkn w = gkn.w(this.b.getContext(), attributeSet, ei.g, R.attr.f16540_resource_name_obfuscated_res_0x7f040675, 0);
        SeekBar seekBar = this.b;
        aad.L(seekBar, seekBar.getContext(), ei.g, attributeSet, (TypedArray) w.a, R.attr.f16540_resource_name_obfuscated_res_0x7f040675, 0);
        Drawable o = w.o(0);
        if (o != null) {
            this.b.setThumb(o);
        }
        Drawable n = w.n(1);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.c = n;
        if (n != null) {
            n.setCallback(this.b);
            wg.b(n, aad.f(this.b));
            if (n.isStateful()) {
                n.setState(this.b.getDrawableState());
            }
            c();
        }
        this.b.invalidate();
        if (w.t(3)) {
            this.e = ke.a(w.i(3, -1), this.e);
            this.g = true;
        }
        if (w.t(2)) {
            this.d = w.m(2);
            this.f = true;
        }
        w.r();
        c();
    }
}
