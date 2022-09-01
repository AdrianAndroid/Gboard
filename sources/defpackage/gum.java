package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: gum  reason: default package */
/* loaded from: classes.dex */
public class gum extends ai implements guf {
    private gug ac;
    private gtz ad;

    @Override // defpackage.an
    public final void R() {
        gug gugVar = this.ac;
        if (gugVar != null) {
            gugVar.f();
        }
        super.R();
    }

    @Override // defpackage.ai
    public final Dialog a(Bundle bundle) {
        gug gugVar = this.ac;
        gtz au = au(gugVar.c);
        this.ad = au;
        return au.a(gugVar.b, true);
    }

    protected gtz au(int i) {
        return new gun(new cu(fT(), i), i);
    }

    public final void av(ap apVar, String str, int i) {
        this.ac = new gug(str, i);
        o(apVar.hB());
    }

    @Override // defpackage.ai, defpackage.an
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (this.ac == null && bundle != null) {
            this.ac = gug.a(this, bundle);
        }
        gug gugVar = this.ac;
        if (gugVar != null) {
            gugVar.c(this);
        }
    }

    @Override // defpackage.ai, defpackage.an
    public final void h(Bundle bundle) {
        super.h(bundle);
        gug gugVar = this.ac;
        if (gugVar != null) {
            gugVar.e(bundle);
        }
    }

    @Override // defpackage.guf
    public final void hN() {
        ap B = B();
        if (B == null) {
            return;
        }
        bi hB = B.hB();
        bq i = hB.i();
        i.m(this);
        i.d();
        o(hB);
    }

    @Override // defpackage.ai, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        gug gugVar = this.ac;
        if (gugVar != null) {
            gugVar.b(this.ad, this.d);
        }
    }

    @Override // defpackage.ai, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        gug gugVar = this.ac;
        if (gugVar != null) {
            gugVar.d(this.ad, this.d);
        }
        super.onDismiss(dialogInterface);
    }
}
