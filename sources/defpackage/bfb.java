package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: bfb  reason: default package */
/* loaded from: classes.dex */
public abstract class bfb implements bfh {
    public final View a;
    private final jwy b;

    public bfb(View view) {
        ce.m(view);
        this.a = view;
        this.b = new jwy(view);
    }

    protected abstract void b(Drawable drawable);

    @Override // defpackage.bfh
    public final bep d() {
        Object tag = this.a.getTag(R.id.f55940_resource_name_obfuscated_res_0x7f0b0242);
        if (tag != null) {
            if (tag instanceof bep) {
                return (bep) tag;
            }
            throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.bfh
    public final void e(bfg bfgVar) {
        jwy jwyVar = this.b;
        int b = jwyVar.b();
        int a = jwyVar.a();
        if (jwy.d(b, a)) {
            bfgVar.g(b, a);
            return;
        }
        if (!jwyVar.c.contains(bfgVar)) {
            jwyVar.c.add(bfgVar);
        }
        if (jwyVar.b != null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = ((View) jwyVar.a).getViewTreeObserver();
        jwyVar.b = new bfi(jwyVar, 1, null, null);
        viewTreeObserver.addOnPreDrawListener(jwyVar.b);
    }

    @Override // defpackage.bfh
    public final void f(Drawable drawable) {
        i(drawable);
    }

    @Override // defpackage.bfh
    public final void fg(Drawable drawable) {
        this.b.c();
        b(drawable);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.bfh
    public final void g(bfg bfgVar) {
        this.b.c.remove(bfgVar);
    }

    @Override // defpackage.bfh
    public final void h(bep bepVar) {
        this.a.setTag(R.id.f55940_resource_name_obfuscated_res_0x7f0b0242, bepVar);
    }

    protected void i(Drawable drawable) {
    }

    @Override // defpackage.bdj
    public final void m() {
    }

    @Override // defpackage.bdj
    public final void n() {
    }

    @Override // defpackage.bdj
    public final void o() {
    }

    public final String toString() {
        return "Target for: ".concat(this.a.toString());
    }
}
