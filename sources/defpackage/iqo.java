package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.userfeaturecache.UserFeatureCache;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: iqo  reason: default package */
/* loaded from: classes.dex */
public final class iqo implements ifx {
    private final /* synthetic */ int a;

    public iqo(int i) {
        this.a = i;
    }

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        switch (this.a) {
            case 0:
                return new iqp();
            case 1:
                return new iqk();
            case 2:
                return new iqs();
            case 3:
                return new irl();
            case 4:
                return new itc();
            case 5:
                return new itd();
            case 6:
                return new iub(gxo.c(11));
            case 7:
                return new iuc();
            case 8:
                return new iuf();
            case 9:
                return new iuh(context);
            case 10:
                return new ium(context);
            case 11:
                return new iut(context);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new ivy(context);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new iwi();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new iwk(context);
            case 15:
                return new ixt();
            case 16:
                return new iyc();
            case 17:
                return new izo();
            case 18:
                return new UserFeatureCache(context);
            default:
                return new jab(context, gxo.c(11));
        }
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        switch (this.a) {
            case 0:
                return igg.b(iqm.class, iqp.class, igf.ON_DEMAND).a();
            case 1:
                ige b = igg.b(iqk.class, iqk.class, igf.AUTO_UI);
                ify a = igb.a();
                a.a = new iiy[]{gwz.b, gqm.a};
                b.g = a;
                return b.a();
            case 2:
                ify a2 = igb.a();
                a2.a = new iiy[]{gwz.c};
                a2.d(iqt.a);
                ige b2 = igg.b(iqq.class, iqs.class, igf.AUTO_ASYNC_BACKGROUND);
                b2.g = a2;
                return b2.a();
            case 3:
                return igg.b(irl.class, irl.class, igf.ON_DEMAND).a();
            case 4:
                ige b3 = igg.b(itc.class, itc.class, igf.AUTO_UI);
                ify a3 = igb.a();
                a3.a = new iiy[]{gwz.b, gqm.a};
                b3.g = a3;
                return b3.a();
            case 5:
                ige b4 = igg.b(itd.class, itd.class, igf.ON_DEMAND);
                ify a4 = igb.a();
                a4.f = 30;
                b4.g = a4;
                return b4.a();
            case 6:
                ige b5 = igg.b(ity.class, iub.class, igf.AUTO_UI);
                ify a5 = igb.a();
                a5.a = new iiy[]{gwu.b};
                b5.g = a5;
                return b5.a();
            case 7:
                ige b6 = igg.b(iuc.class, iuc.class, igf.ON_DEMAND);
                ify a6 = igb.a();
                a6.i = iwl.class;
                a6.a = new iiy[]{gwu.b};
                b6.g = a6;
                return b6.a();
            case 8:
                ige b7 = igg.b(iuf.class, iuf.class, igf.ON_DEMAND);
                ify a7 = igb.a();
                a7.a = new iiy[]{gwu.b};
                b7.g = a7;
                return b7.a();
            case 9:
                ige b8 = igg.b(iuh.class, iuh.class, igf.ON_DEMAND);
                ify a8 = igb.a();
                a8.a = new iiy[]{gwu.b};
                b8.g = a8;
                return b8.a();
            case 10:
                ige b9 = igg.b(ium.class, ium.class, igf.ON_DEMAND);
                ify a9 = igb.a();
                a9.a = new iiy[]{gwu.b};
                b9.g = a9;
                return b9.a();
            case 11:
                ige b10 = igg.b(iut.class, iut.class, igf.ON_DEMAND);
                ify a10 = igb.a();
                a10.a = new iiy[]{gwz.b};
                a10.i = iwl.class;
                b10.g = a10;
                return b10.a();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ige b11 = igg.b(ivw.class, ivy.class, igf.AUTO_ASYNC_BACKGROUND);
                ify a11 = igb.a();
                a11.a = new iiy[]{gwu.b};
                b11.g = a11;
                return b11.a();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ige b12 = igg.b(iwf.class, iwi.class, igf.ON_DEMAND);
                ify a12 = igb.a();
                a12.a = new iiy[]{gwu.b};
                b12.g = a12;
                return b12.a();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ige b13 = igg.b(iwl.class, iwk.class, igf.AUTO_ASYNC_BACKGROUND);
                ify a13 = igb.a();
                a13.a = new iiy[]{gwz.b, itl.b};
                a13.c = context.getResources().getString(R.string.f162280_resource_name_obfuscated_res_0x7f140705);
                a13.i = ixa.class;
                a13.d(itm.b);
                b13.g = a13;
                return b13.a();
            case 15:
                ige b14 = igg.b(ixp.class, ixt.class, igf.AUTO_ASYNC_BACKGROUND);
                ify a14 = igb.a();
                a14.d(itm.a);
                a14.a = new iiy[]{gwu.b, hgl.a};
                b14.g = a14;
                return b14.a();
            case 16:
                ige b15 = igg.b(iyb.class, iyc.class, igf.AUTO_UI);
                ify a15 = igb.a();
                a15.a = new iiy[]{gwz.c};
                b15.g = a15;
                return b15.a();
            case 17:
                ige b16 = igg.b(izo.class, izo.class, igf.ON_DEMAND);
                ify a16 = igb.a();
                a16.i = jac.class;
                b16.g = a16;
                return b16.a();
            case 18:
                ige b17 = igg.b(jac.class, UserFeatureCache.class, igf.AUTO_ASYNC_BACKGROUND);
                ify a17 = igb.a();
                a17.d(izv.a);
                a17.c = context.getResources().getString(R.string.f162280_resource_name_obfuscated_res_0x7f140705);
                a17.a = new iiy[]{gwu.b};
                b17.g = a17;
                return b17.a();
            default:
                ige b18 = igg.b(izz.class, jab.class, igf.AUTO_UI);
                ify a18 = igb.a();
                a18.a = new iiy[]{gwu.b};
                b18.g = a18;
                return b18.a();
        }
    }
}
