package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.hint.banner.IBannerExtension;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: ffo  reason: default package */
/* loaded from: classes.dex */
public final class ffo implements ifx {
    private final /* synthetic */ int a;

    public ffo(int i) {
        this.a = i;
    }

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        switch (this.a) {
            case 0:
                return new ffn(context);
            case 1:
                return new fec();
            case 2:
                return new ffr();
            case 3:
                return new fgr();
            case 4:
                return new grt(context);
            case 5:
                return new gvi();
            case 6:
                return new gwr();
            case 7:
                return new had();
            case 8:
                return new hag(hrx.y(context));
            case 9:
                return new hhj();
            case 10:
                return new hko();
            case 11:
                return new hnt();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new hoi();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new hor(context, ieh.j());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new hsg();
            case 15:
                return new hxw(context);
            case 16:
                return new hya();
            case 17:
                return new hzm();
            case 18:
                return new iez(context);
            case 19:
                return new ifo();
            default:
                return new ilk(context);
        }
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        switch (this.a) {
            case 0:
                ige b = igg.b(ffi.class, ffn.class, igf.AUTO_ASYNC);
                ify a = igb.a();
                a.a = new iiy[]{gwu.b};
                b.g = a;
                return b.a();
            case 1:
                ige b2 = igg.b(fdl.class, fec.class, igf.AUTO_ASYNC);
                ify a2 = igb.a();
                a2.d(ffa.i);
                a2.a = new iiy[]{gwu.b};
                b2.g = a2;
                return b2.a();
            case 2:
                ige b3 = igg.b(ffs.class, ffr.class, igf.AUTO_ASYNC);
                ify a3 = igb.a();
                a3.d(ffa.e);
                a3.a = new iiy[]{gwu.b};
                b3.g = a3;
                return b3.a();
            case 3:
                ige b4 = igg.b(fgn.class, fgr.class, igf.AUTO_UI);
                ify a4 = igb.a();
                a4.a = new iiy[]{gwz.b};
                a4.n.add("zte");
                a4.a("phone");
                b4.g = a4;
                return b4.a();
            case 4:
                ige b5 = igg.b(grt.class, grt.class, igf.AUTO_UI);
                ify a5 = igb.a();
                a5.a = new iiy[]{gwz.b};
                b5.g = a5;
                return b5.a();
            case 5:
                ige b6 = igg.b(gvi.class, gvi.class, igf.AUTO_ASYNC_BACKGROUND);
                ify a6 = igb.a();
                a6.a = new iiy[]{gwu.b};
                a6.d(gvc.a);
                b6.g = a6;
                return b6.a();
            case 6:
                return igg.b(gwr.class, gwr.class, igf.AUTO_ASYNC_BACKGROUND).a();
            case 7:
                ige b7 = igg.b(had.class, had.class, igf.ON_DEMAND);
                ify a7 = igb.a();
                a7.d(gzy.a);
                b7.g = a7;
                return b7.a();
            case 8:
                ify a8 = igb.a();
                a8.a = new iiy[]{gwz.b};
                ige b8 = igg.b(hag.class, hag.class, igf.AUTO_UI);
                b8.g = a8;
                return b8.a();
            case 9:
                ige b9 = igg.b(hhj.class, hhj.class, igf.AUTO_UI);
                ify a9 = igb.a();
                a9.a = new iiy[]{gwu.b};
                b9.g = a9;
                return b9.a();
            case 10:
                ige b10 = igg.b(IBannerExtension.class, hko.class, igf.ON_DEMAND);
                ify a10 = igb.a();
                a10.a = new iiy[]{gwz.b};
                b10.g = a10;
                return b10.a();
            case 11:
                ige b11 = igg.b(hnt.class, hnt.class, igf.AUTO_ASYNC);
                ify a11 = igb.a();
                a11.a = new iiy[]{gqm.a};
                b11.g = a11;
                return b11.a();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ige b12 = igg.b(hnw.class, hoi.class, igf.ON_DEMAND);
                ify a12 = igb.a();
                a12.d(hof.b);
                a12.c = context.getString(R.string.f161080_resource_name_obfuscated_res_0x7f14068c);
                b12.g = a12;
                return b12.a();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ify a13 = igb.a();
                a13.a = new iiy[]{gwz.c};
                ige b13 = igg.b(hnx.class, hor.class, igf.AUTO_ASYNC_BACKGROUND);
                b13.g = a13;
                return b13.a();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ige b14 = igg.b(hsg.class, hsg.class, igf.ON_DEMAND);
                ify a14 = igb.a();
                a14.c = context.getString(R.string.f161080_resource_name_obfuscated_res_0x7f14068c);
                b14.g = a14;
                return b14.a();
            case 15:
                ige b15 = igg.b(hxw.class, hxw.class, igf.AUTO_UI);
                ify a15 = igb.a();
                a15.a = new iiy[]{gwz.a};
                b15.g = a15;
                return b15.a();
            case 16:
                ige b16 = igg.b(hya.class, hya.class, igf.AUTO_ASYNC_BACKGROUND);
                ify a16 = igb.a();
                a16.a = new iiy[]{gwu.b};
                b16.g = a16;
                return b16.a();
            case 17:
                return igg.b(hzm.class, hzm.class, igf.ON_DEMAND).a();
            case 18:
                return igg.b(iex.class, iez.class, igf.AUTO_UI).a();
            case 19:
                return igg.b(ifo.class, ifo.class, igf.ON_DEMAND).a();
            default:
                ige b17 = igg.b(ilc.class, ilk.class, igf.AUTO_UI);
                ify a17 = igb.a();
                a17.a = new iiy[]{hhq.a};
                b17.g = a17;
                return b17.a();
        }
    }
}
