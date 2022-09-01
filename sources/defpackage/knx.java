package defpackage;

import android.net.Uri;
import com.google.android.libraries.stickers.megamode.MegamodeAvatarBannerView;

/* compiled from: PG */
/* renamed from: knx  reason: default package */
/* loaded from: classes.dex */
public final class knx extends mo {
    public final /* synthetic */ knz s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knx(knz knzVar, MegamodeAvatarBannerView megamodeAvatarBannerView) {
        super(megamodeAvatarBannerView);
        this.s = knzVar;
    }

    @Override // defpackage.mo
    public final void E(njs njsVar) {
        ((MegamodeAvatarBannerView) this.a).setOnClickListener(new ikq(this, njsVar, 4));
        MegamodeAvatarBannerView megamodeAvatarBannerView = (MegamodeAvatarBannerView) this.a;
        megamodeAvatarBannerView.d.setText(njsVar.c);
        megamodeAvatarBannerView.c(8);
        megamodeAvatarBannerView.e.setVisibility(0);
        megamodeAvatarBannerView.setClickable(false);
        ats g = atb.d(megamodeAvatarBannerView.c).g(Uri.parse(njsVar.b).buildUpon().appendPath("banner_left.png").build());
        if (megamodeAvatarBannerView.getResources().getConfiguration().getLayoutDirection() == 1) {
            g = g.n(new beu().M(new kno()));
        }
        g.e(new knw(megamodeAvatarBannerView)).r(megamodeAvatarBannerView.c);
    }
}
