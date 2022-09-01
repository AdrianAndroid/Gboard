package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Printer;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dqn  reason: default package */
/* loaded from: classes.dex */
public final class dqn implements dqe {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/migration/MigrationModule");
    public Context b;
    public dqi c;
    private final hst d = new dqm(this);

    public final void c() {
        if (!this.b.getResources().getBoolean(R.bool.f19350_resource_name_obfuscated_res_0x7f05000b)) {
            return;
        }
        try {
            gen c = mnl.a().c(new Intent());
            c.l(gyc.b, new dop(this, 3));
            c.h(gyc.b, new doq(this, 4));
        } catch (IncompatibleClassChangeError | NullPointerException e) {
            ((ltd) ((ltd) ((ltd) a.b()).i(e)).k("com/google/android/apps/inputmethod/libs/migration/MigrationModule", "getPendingDynamicLinkAndMaybeShowDialog", ']', "MigrationModule.java")).t("Failed to handle Firebase related method");
            d();
        }
    }

    public final void d() {
        hsk b;
        IBinder F;
        if (!ddc.e(this.b) || !jai.b.b() || (b = hsx.b()) == null || (F = b.F()) == null) {
            return;
        }
        this.c.c(b.getWindow().getWindow(), F, true);
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "MigrationModule";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        this.b = context;
        this.c = new dqi(context);
        this.d.g(gyc.a);
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.c.a();
        this.d.h();
    }
}
