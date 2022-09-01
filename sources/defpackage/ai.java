package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.LiveData$LifecycleBoundObserver;

/* compiled from: PG */
/* renamed from: ai  reason: default package */
/* loaded from: classes.dex */
public class ai extends an implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler ac;
    private boolean ai;
    private boolean ak;
    private boolean al;
    private boolean am;
    public Dialog d;
    private final Runnable ad = new ad(this);
    private final DialogInterface.OnCancelListener ae = new ae(this);
    public final DialogInterface.OnDismissListener a = new af(this);
    private int af = 0;
    public int b = 0;
    private boolean ag = true;
    public boolean c = true;
    private int ah = -1;
    private final age aj = new ag(this);
    public boolean e = false;

    private final void au(boolean z, boolean z2) {
        if (this.al) {
            return;
        }
        this.al = true;
        this.am = false;
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.d.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.ac.getLooper()) {
                    onDismiss(this.d);
                } else {
                    this.ac.post(this.ad);
                }
            }
        }
        this.ak = true;
        if (this.ah >= 0) {
            bi E = E();
            int i = this.ah;
            if (i < 0) {
                throw new IllegalArgumentException("Bad id: " + i);
            }
            E.E(new bh(E, i), z);
            this.ah = -1;
            return;
        }
        bq i2 = E().i();
        i2.s();
        i2.m(this);
        if (z) {
            i2.k();
        } else {
            i2.j();
        }
    }

    public Dialog a(Bundle bundle) {
        if (bi.S(3)) {
            new StringBuilder("onCreateDialog called for DialogFragment ").append(this);
        }
        return new Dialog(fT(), this.b);
    }

    public void dismiss() {
        au(false, false);
    }

    @Override // defpackage.an
    public void e(Bundle bundle) {
        super.e(bundle);
        this.ac = new Handler();
        this.c = this.E == 0;
        if (bundle != null) {
            this.af = bundle.getInt("android:style", 0);
            this.b = bundle.getInt("android:theme", 0);
            this.ag = bundle.getBoolean("android:cancelable", true);
            this.c = bundle.getBoolean("android:showsDialog", this.c);
            this.ah = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.an
    public void f() {
        super.f();
        Dialog dialog = this.d;
        if (dialog != null) {
            this.ak = true;
            dialog.setOnDismissListener(null);
            this.d.dismiss();
            if (!this.al) {
                onDismiss(this.d);
            }
            this.d = null;
            this.e = false;
        }
    }

    @Override // defpackage.an
    public final LayoutInflater fW(Bundle bundle) {
        LayoutInflater ao = ao();
        if (!this.c || this.ai) {
            if (bi.S(2)) {
                new StringBuilder("getting layout inflater for DialogFragment ").append(this);
            }
            return ao;
        }
        if (!this.e) {
            try {
                this.ai = true;
                Dialog a = a(bundle);
                this.d = a;
                if (this.c) {
                    m(a, this.af);
                    Context fS = fS();
                    if (fS instanceof Activity) {
                        this.d.setOwnerActivity((Activity) fS);
                    }
                    this.d.setCancelable(this.ag);
                    this.d.setOnCancelListener(this.ae);
                    this.d.setOnDismissListener(this.a);
                    this.e = true;
                } else {
                    this.d = null;
                }
            } finally {
                this.ai = false;
            }
        }
        if (bi.S(2)) {
            new StringBuilder("get layout inflater for DialogFragment ").append(this);
        }
        Dialog dialog = this.d;
        return dialog != null ? ao.cloneInContext(dialog.getContext()) : ao;
    }

    @Override // defpackage.an
    public final void fX(Context context) {
        super.fX(context);
        agd agdVar = this.Y;
        age ageVar = this.aj;
        agc.b("observeForever");
        aga agaVar = new aga(agdVar, ageVar);
        agb agbVar = (agb) agdVar.c.f(ageVar, agaVar);
        if (!(agbVar instanceof LiveData$LifecycleBoundObserver)) {
            if (agbVar == null) {
                agaVar.d(true);
            }
            if (this.am) {
                return;
            }
            this.al = false;
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    @Override // defpackage.an
    public final void fY() {
        super.fY();
        if (!this.am && !this.al) {
            this.al = true;
        }
        this.Y.g(this.aj);
    }

    @Override // defpackage.an
    public final void fZ(Bundle bundle) {
        Bundle bundle2;
        super.fZ(bundle);
        if (this.d == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.d.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.an
    public final void ga(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.ga(layoutInflater, viewGroup, bundle);
        if (this.O != null || this.d == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.d.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.an
    public void h(Bundle bundle) {
        Dialog dialog = this.d;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.af;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        if (!this.ag) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.c) {
            bundle.putBoolean("android:showsDialog", false);
        }
        int i3 = this.ah;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.an
    public final ar ht() {
        return new ah(this, super.ht());
    }

    @Override // defpackage.an
    public final void i() {
        super.i();
        Dialog dialog = this.d;
        if (dialog != null) {
            this.ak = false;
            dialog.show();
            View decorView = this.d.getWindow().getDecorView();
            vl.b(decorView, this);
            vp.b(decorView, this);
            vr.b(decorView, this);
        }
    }

    @Override // defpackage.an
    public final void j() {
        super.j();
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void m(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public final void n(bi biVar, String str) {
        this.al = false;
        this.am = true;
        bq i = biVar.i();
        i.s();
        i.o(this, str);
        i.j();
    }

    public final void o(bi biVar) {
        this.al = false;
        this.am = true;
        bq i = biVar.i();
        i.s();
        i.o(this, null);
        i.d();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.ak) {
            if (bi.S(3)) {
                new StringBuilder("onDismiss called for DialogFragment ").append(this);
            }
            au(true, true);
        }
    }

    public final void setShowsDialog(boolean z) {
        this.c = false;
    }
}
