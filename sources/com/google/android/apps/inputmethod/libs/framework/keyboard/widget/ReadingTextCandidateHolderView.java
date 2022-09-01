package com.google.android.apps.inputmethod.libs.framework.keyboard.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ReadingTextCandidateHolderView extends jdo implements des {
    private ict[] a;
    private List b;
    private boolean c;
    private boolean d;
    private final ico e;
    private final iaj f;
    private final ict g;

    public ReadingTextCandidateHolderView(Context context) {
        this(context, null);
    }

    private final void b() {
        List list = this.b;
        if (list == null || list.isEmpty()) {
            n();
        } else {
            ict[] ictVarArr = new ict[this.b.size()];
            int i = 0;
            for (hln hlnVar : this.b) {
                iaj iajVar = this.f;
                iajVar.k();
                iajVar.b = iah.PRESS;
                iajVar.n(-10003, null, hlnVar);
                ico icoVar = this.e;
                icoVar.v();
                icoVar.i(this.g);
                icoVar.t(hlnVar.b.toString());
                icoVar.u(this.f.b());
                icoVar.h = hlnVar.c;
                ictVarArr[i] = icoVar.c();
                i++;
            }
            super.gw(ictVarArr);
        }
        this.c = false;
    }

    private final void c() {
        boolean isShown = isShown();
        this.d = isShown;
        if (!isShown || !this.c) {
            return;
        }
        b();
    }

    @Override // defpackage.ded
    public final boolean F(hln hlnVar) {
        return false;
    }

    @Override // defpackage.des
    public final void a(List list) {
        this.b = list;
        if (this.d) {
            b();
        } else {
            this.c = true;
        }
        if (list == null) {
            return;
        }
        list.size();
    }

    @Override // defpackage.ded
    public final hln f(iay iayVar) {
        return null;
    }

    @Override // defpackage.ded
    public final hln g() {
        return null;
    }

    @Override // defpackage.jdo, defpackage.jda
    public final void gw(ict[] ictVarArr) {
        this.a = ictVarArr;
        super.gw(ictVarArr);
    }

    @Override // defpackage.ded
    public final hln h() {
        return null;
    }

    @Override // defpackage.ded
    public final void n() {
        this.b = null;
        if (this.d) {
            super.gw(this.a);
        } else {
            this.c = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        c();
    }

    @Override // defpackage.ded
    public final void q(boolean z) {
        throw null;
    }

    @Override // defpackage.ded
    public final void v(int[] iArr) {
        throw null;
    }

    @Override // defpackage.ded
    public final void w(float f) {
        throw null;
    }

    public ReadingTextCandidateHolderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ico d = ict.d();
        this.e = d;
        this.f = ial.c();
        d.v();
        d.n = R.layout.f146270_resource_name_obfuscated_res_0x7f0e05aa;
        d.x = true;
        d.q = false;
        this.g = d.c();
    }
}
