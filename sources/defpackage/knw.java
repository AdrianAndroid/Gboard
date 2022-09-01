package defpackage;

import android.graphics.drawable.Drawable;
import android.util.Log;
import com.google.android.libraries.stickers.megamode.MegamodeAvatarBannerView;

/* compiled from: PG */
/* renamed from: knw  reason: default package */
/* loaded from: classes.dex */
final class knw implements bet {
    final /* synthetic */ MegamodeAvatarBannerView a;

    public knw(MegamodeAvatarBannerView megamodeAvatarBannerView) {
        this.a = megamodeAvatarBannerView;
    }

    @Override // defpackage.bet
    public final /* bridge */ /* synthetic */ boolean b(Object obj, bfh bfhVar, boolean z) {
        Drawable drawable = (Drawable) obj;
        this.a.c(0);
        this.a.e.setVisibility(8);
        this.a.setClickable(true);
        return false;
    }

    @Override // defpackage.bet
    public final boolean fi(axd axdVar, bfh bfhVar, boolean z) {
        Log.e("MegamodeAvatrBannerView", "Error loading promo banner in megamode", axdVar);
        return false;
    }
}
