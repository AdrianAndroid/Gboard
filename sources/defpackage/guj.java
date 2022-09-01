package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ListAdapter;

/* compiled from: PG */
/* renamed from: guj  reason: default package */
/* loaded from: classes.dex */
final class guj extends gtz {
    private final AlertDialog.Builder e;

    public guj(Context context, int i) {
        super(i);
        this.e = new AlertDialog.Builder(context, i);
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void A(CharSequence charSequence) {
        this.e.setMessage(charSequence);
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void B(int i, DialogInterface.OnClickListener onClickListener) {
        this.e.setNeutralButton(i, onClickListener);
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void C(int i, DialogInterface.OnClickListener onClickListener) {
        this.e.setPositiveButton(i, onClickListener);
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void D(int i) {
        this.e.setTitle(i);
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void E(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void F(int i) {
        this.e.setView(i);
    }

    @Override // defpackage.gtz
    protected final Dialog b() {
        return this.e.create();
    }

    @Override // defpackage.gub
    public final Context r() {
        return this.e.getContext();
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void s(View view) {
        this.e.setCustomTitle(view);
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void t(int i, DialogInterface.OnClickListener onClickListener) {
        this.e.setNegativeButton(i, onClickListener);
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void u(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        this.e.setAdapter(listAdapter, onClickListener);
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void v() {
        this.e.setCancelable(true);
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void w(int i) {
        this.e.setIcon(i);
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void x(Drawable drawable) {
        this.e.setIcon(drawable);
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void y(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        this.e.setItems(charSequenceArr, onClickListener);
    }

    @Override // defpackage.gub
    public final /* bridge */ /* synthetic */ void z(int i) {
        this.e.setMessage(i);
    }
}
