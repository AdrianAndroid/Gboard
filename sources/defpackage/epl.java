package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.inputmethod.libs.theme.builder.ThemeBuilderActivity;

/* compiled from: PG */
/* renamed from: epl  reason: default package */
/* loaded from: classes.dex */
public final class epl implements bet {
    public final /* synthetic */ ThemeBuilderActivity a;

    public epl(ThemeBuilderActivity themeBuilderActivity) {
        this.a = themeBuilderActivity;
    }

    @Override // defpackage.bet
    public final /* bridge */ /* synthetic */ boolean b(Object obj, bfh bfhVar, boolean z) {
        kcu.U(ThemeBuilderActivity.t().hQ(new brs(this, (Bitmap) obj, 18)), new eay(this, 3), mjl.a);
        return true;
    }

    public final void c() {
        gyc.b.execute(new emq(this.a, 8));
    }

    @Override // defpackage.bet
    public final boolean fi(axd axdVar, bfh bfhVar, boolean z) {
        c();
        return true;
    }
}
