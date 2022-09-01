package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

/* compiled from: PG */
/* renamed from: it  reason: default package */
/* loaded from: classes.dex */
final class it implements DialogInterface.OnClickListener, iy {
    cv a;
    final /* synthetic */ iz b;
    private ListAdapter c;
    private CharSequence d;

    public it(iz izVar) {
        this.b = izVar;
    }

    @Override // defpackage.iy
    public final int a() {
        return 0;
    }

    @Override // defpackage.iy
    public final int b() {
        return 0;
    }

    @Override // defpackage.iy
    public final Drawable c() {
        return null;
    }

    @Override // defpackage.iy
    public final CharSequence d() {
        return this.d;
    }

    @Override // defpackage.iy
    public final void e(ListAdapter listAdapter) {
        this.c = listAdapter;
    }

    @Override // defpackage.iy
    public final void f(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.iy
    public final void g(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.iy
    public final void h(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.iy
    public final void i(CharSequence charSequence) {
        this.d = charSequence;
    }

    @Override // defpackage.iy
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.iy
    public final void k() {
        cv cvVar = this.a;
        if (cvVar != null) {
            cvVar.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.iy
    public final void l(int i, int i2) {
        if (this.c == null) {
            return;
        }
        cu cuVar = new cu(this.b.a);
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            cuVar.k(charSequence);
        }
        ListAdapter listAdapter = this.c;
        int selectedItemPosition = this.b.getSelectedItemPosition();
        cq cqVar = cuVar.a;
        cqVar.q = listAdapter;
        cqVar.r = this;
        cqVar.x = selectedItemPosition;
        cqVar.w = true;
        cv b = cuVar.b();
        this.a = b;
        ListView c = b.c();
        ir.d(c, i);
        ir.c(c, i2);
        this.a.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.setSelection(i);
        if (this.b.getOnItemClickListener() != null) {
            this.b.performItemClick(null, i, this.c.getItemId(i));
        }
        k();
    }

    @Override // defpackage.iy
    public final boolean u() {
        cv cvVar = this.a;
        if (cvVar != null) {
            return cvVar.isShowing();
        }
        return false;
    }
}
