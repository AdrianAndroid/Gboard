package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* renamed from: cgn  reason: default package */
/* loaded from: classes.dex */
final class cgn implements cge {
    public ViewGroup b;
    public View c;
    public SoftKeyView d;
    private final hwu f;
    public final cgl a = new cgl();
    public final jdp e = new cgm(this, 0);

    public cgn() {
        cgi cgiVar = new cgi(this, 2);
        this.f = cgiVar;
        hsx.c().a(ice.HEADER, cgiVar);
    }

    private final boolean f(boolean z) {
        ViewGroup viewGroup = this.b;
        int i = 0;
        if (viewGroup == null) {
            return false;
        }
        if ((viewGroup.getVisibility() == 0) == z) {
            return false;
        }
        ViewGroup viewGroup2 = this.b;
        if (true != z) {
            i = 8;
        }
        viewGroup2.setVisibility(i);
        return true;
    }

    @Override // defpackage.cge
    public final void a() {
        this.a.b();
        hsx.c().l(ice.HEADER, this.f);
    }

    @Override // defpackage.cge
    public final void b(View view) {
        if (this.a.f(view)) {
            f(true);
            SoftKeyView softKeyView = this.d;
            if (softKeyView == null) {
                return;
            }
            softKeyView.setVisibility(4);
        }
    }

    @Override // defpackage.cge
    public final void c() {
        SoftKeyView softKeyView;
        this.a.g(false);
        if (!f(false) || (softKeyView = this.d) == null) {
            return;
        }
        softKeyView.setVisibility(0);
    }

    public final void d() {
        SoftKeyView softKeyView = this.d;
        if (softKeyView == null || softKeyView.getVisibility() != 0 || !e()) {
            return;
        }
        softKeyView.setVisibility(4);
    }

    public final boolean e() {
        ViewGroup viewGroup = this.b;
        return viewGroup != null && viewGroup.getVisibility() == 0;
    }
}
