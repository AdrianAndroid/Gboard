package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* compiled from: PG */
/* renamed from: gun  reason: default package */
/* loaded from: classes.dex */
public class gun extends gtz {
    protected final cu e;

    public gun(cu cuVar, int i) {
        super(i);
        this.e = cuVar;
        Context a = cuVar.a();
        if (gwc.i(a) || LayoutInflater.from(a).getFactory2() != null) {
            return;
        }
        da.s(a).f();
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void A(CharSequence charSequence) {
        this.e.g(charSequence);
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void B(int i, DialogInterface.OnClickListener onClickListener) {
        this.e.h(i, onClickListener);
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void C(int i, DialogInterface.OnClickListener onClickListener) {
        this.e.n(i, onClickListener);
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void D(int i) {
        this.e.j(i);
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void E(CharSequence charSequence) {
        this.e.k(charSequence);
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void F(int i) {
        cq cqVar = this.e.a;
        cqVar.t = null;
        cqVar.s = i;
    }

    @Override // defpackage.gtz
    protected final Dialog b() {
        return this.e.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gtz
    public void g(String str, Activity activity) {
        if (activity instanceof cx) {
            new gum().av((cx) activity, str, this.b);
        } else {
            super.g(str, activity);
        }
    }

    @Override // defpackage.gub
    public final Context r() {
        return this.e.a();
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void s(View view) {
        this.e.d(view);
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void t(int i, DialogInterface.OnClickListener onClickListener) {
        this.e.l(i, onClickListener);
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void u(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        this.e.c(listAdapter, onClickListener);
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void v() {
        this.e.a.n = true;
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void w(int i) {
        this.e.a.c = i;
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void x(Drawable drawable) {
        this.e.e(drawable);
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void y(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        cq cqVar = this.e.a;
        cqVar.p = charSequenceArr;
        cqVar.r = onClickListener;
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void z(int i) {
        this.e.f(i);
    }
}
