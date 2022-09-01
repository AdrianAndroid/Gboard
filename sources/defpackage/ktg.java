package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* renamed from: ktg  reason: default package */
/* loaded from: classes.dex */
public final class ktg {
    public final MaterialButton a;
    public kxj b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public boolean p;
    public LayerDrawable r;
    public int s;
    public boolean n = false;
    public boolean o = false;
    public boolean q = true;

    public ktg(MaterialButton materialButton, kxj kxjVar) {
        this.a = materialButton;
        this.b = kxjVar;
    }

    private final kxe f(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (kxe) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final kxe a() {
        return f(false);
    }

    public final kxe b() {
        return f(true);
    }

    public final kxu c() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.r.getNumberOfLayers() > 2) {
            return (kxu) this.r.getDrawable(2);
        }
        return (kxu) this.r.getDrawable(1);
    }

    public final void d() {
        this.n = true;
        this.a.f(this.j);
        this.a.g(this.i);
    }

    public final void e(kxj kxjVar) {
        this.b = kxjVar;
        if (a() != null) {
            a().ic(kxjVar);
        }
        if (b() != null) {
            b().ic(kxjVar);
        }
        if (c() != null) {
            c().ic(kxjVar);
        }
    }
}
