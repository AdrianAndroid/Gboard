package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* renamed from: ksb  reason: default package */
/* loaded from: classes.dex */
public final class ksb implements abs {
    final /* synthetic */ AppBarLayout a;
    final /* synthetic */ boolean b;

    public ksb(AppBarLayout appBarLayout, boolean z) {
        this.a = appBarLayout;
        this.b = z;
    }

    @Override // defpackage.abs
    public final boolean a(View view) {
        AppBarLayout appBarLayout = this.a;
        appBarLayout.i(this.b, aad.ah(appBarLayout));
        return true;
    }
}
