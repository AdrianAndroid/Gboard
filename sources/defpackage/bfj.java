package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
@Deprecated
/* renamed from: bfj  reason: default package */
/* loaded from: classes.dex */
public abstract class bfj extends bey {
    public final View a;
    public final gkn b;

    public bfj(View view) {
        ce.m(view);
        this.a = view;
        this.b = new gkn(view);
    }

    @Override // defpackage.bey, defpackage.bfh
    public final bep d() {
        Object tag = this.a.getTag(R.id.f55940_resource_name_obfuscated_res_0x7f0b0242);
        if (tag != null) {
            if (tag instanceof bep) {
                return (bep) tag;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.bfh
    public final void e(bfg bfgVar) {
        gkn gknVar = this.b;
        int c = gknVar.c();
        int b = gknVar.b();
        if (gkn.e(c, b)) {
            bfgVar.g(c, b);
            return;
        }
        if (!gknVar.a.contains(bfgVar)) {
            gknVar.a.add(bfgVar);
        }
        if (gknVar.c != null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = ((View) gknVar.b).getViewTreeObserver();
        gknVar.c = new bfi(gknVar, 0, null);
        viewTreeObserver.addOnPreDrawListener(gknVar.c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.bfh
    public final void g(bfg bfgVar) {
        this.b.a.remove(bfgVar);
    }

    @Override // defpackage.bey, defpackage.bfh
    public final void h(bep bepVar) {
        this.a.setTag(R.id.f55940_resource_name_obfuscated_res_0x7f0b0242, bepVar);
    }

    public final String toString() {
        return "Target for: ".concat(this.a.toString());
    }
}
