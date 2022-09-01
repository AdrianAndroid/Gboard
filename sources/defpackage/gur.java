package defpackage;

import android.os.Bundle;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* renamed from: gur  reason: default package */
/* loaded from: classes.dex */
public final class gur extends cd {
    public final AppBarLayout a;

    public gur(AppBarLayout appBarLayout) {
        this.a = appBarLayout;
    }

    public static void B(an anVar, boolean z) {
        Bundle bundle = anVar.m;
        if (bundle == null) {
            bundle = new Bundle();
            anVar.Z(bundle);
        }
        bundle.putBoolean("AppBarLayoutController:EXPANDED", z);
    }

    public static boolean C(AppBarLayout appBarLayout) {
        AppBarLayout.Behavior behavior = (AppBarLayout.Behavior) ((tr) appBarLayout.getLayoutParams()).a;
        return behavior == null || behavior.F() == 0;
    }

    @Override // defpackage.cd
    public final void v(an anVar) {
        if (!(anVar instanceof ai)) {
            B(anVar, C(this.a));
        }
    }

    @Override // defpackage.cd
    public final void w(an anVar) {
        if (!(anVar instanceof ai)) {
            Bundle bundle = anVar.m;
            boolean z = true;
            if (bundle != null) {
                z = bundle.getBoolean("AppBarLayoutController:EXPANDED", true);
            }
            this.a.i(z, false);
        }
    }
}
