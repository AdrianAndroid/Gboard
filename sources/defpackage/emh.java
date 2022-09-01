package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Printer;
import android.view.View;
import android.view.Window;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: emh  reason: default package */
/* loaded from: classes.dex */
public final class emh implements elu {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/sharing/SharingLinkReceiveModule");
    public emf b;
    public Context c;
    private final hst d = new emg(this);

    public final void c() {
        emf emfVar = this.b;
        if (emfVar != null) {
            emfVar.dismiss();
            this.b = null;
        }
    }

    public final void d() {
        if (!this.c.getResources().getBoolean(R.bool.f19350_resource_name_obfuscated_res_0x7f05000b)) {
            return;
        }
        try {
            gen c = mnl.a().c(new Intent());
            c.l(gyc.b, new dop(this, 4));
            c.h(gyc.b, new doq(this, 5));
        } catch (IncompatibleClassChangeError | NullPointerException e) {
            ((ltd) ((ltd) ((ltd) a.b()).i(e)).k("com/google/android/apps/inputmethod/libs/sharing/SharingLinkReceiveModule", "getPendingDynamicLinkAndMaybeShowDialog", 'i', "SharingLinkReceiveModule.java")).t("Failed to handle Firebase related method");
            e();
        }
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    public final void e() {
        hsk b;
        IBinder F;
        Window window;
        if (!ddc.f(this.c) || !jai.b.b() || (b = hsx.b()) == null || (F = b.F()) == null || (window = b.getWindow().getWindow()) == null) {
            return;
        }
        View decorView = window.getDecorView();
        els elsVar = new els(decorView.getContext());
        kcu.U(elsVar.l(ddc.a(this.c)), new bpn(this, elsVar, decorView, F, 5), gyc.b);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "SharingReceiveModule";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        this.c = context;
        this.d.g(gyc.b);
    }

    @Override // defpackage.ifw
    public final void gn() {
        c();
        this.d.h();
    }
}
