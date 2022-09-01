package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.expression.extension.IBitmojiExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IGifKeyboardExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IStickerExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IUniversalMediaExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.RichSymbolExtension;
import com.google.android.apps.inputmethod.libs.translate.ITranslateUIExtension;
import com.google.android.inputmethod.latin.R;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: eew  reason: default package */
/* loaded from: classes.dex */
public final class eew implements ifx {
    private final /* synthetic */ int a;

    public eew(int i) {
        this.a = i;
    }

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        switch (this.a) {
            case 0:
                return new eev();
            case 1:
                return new edj();
            case 2:
                return new efy(context);
            case 3:
                return new ehs();
            case 4:
                return new ehy();
            case 5:
                return new ejy();
            case 6:
                return new elz();
            case 7:
                return new ema();
            case 8:
                return new emh();
            case 9:
                return new emp();
            case 10:
                return new enu();
            case 11:
                return new eos(context);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new eow();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new epc();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new eph();
            case 15:
                return new ewx();
            case 16:
                return new ezx();
            case 17:
                return new fcx();
            case 18:
                return new fdc();
            case 19:
                return new fdq();
            default:
                return new fdu();
        }
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        switch (this.a) {
            case 0:
                ige b = igg.b(RichSymbolExtension.class, eev.class, igf.ON_DEMAND);
                ify a = igb.a();
                a.a = new iiy[]{gwz.b};
                a.b(new iga(null, new String[]{"ja"}, null, false));
                b.g = a;
                igc i = hek.i();
                i.b(ibz.a(context.getString(R.string.f155010_resource_name_obfuscated_res_0x7f1403a8)));
                b.e = i;
                iao b2 = iap.b();
                b2.d(R.id.f54800_resource_name_obfuscated_res_0x7f0b01c8, jbt.n(context, R.string.f155010_resource_name_obfuscated_res_0x7f1403a8));
                b.f = b2;
                return b.a();
            case 1:
                ify a2 = igb.a();
                a2.i = IGifKeyboardExtension.class;
                a2.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
                a2.a = new iiy[]{gqm.a};
                a2.g = ((Long) cvb.g.c()).longValue();
                ige b3 = igg.b(edj.class, edj.class, igf.AUTO_ASYNC);
                b3.g = a2;
                return b3.a();
            case 2:
                ige b4 = igg.b(IBitmojiExtension.class, efy.class, igf.ON_DEMAND);
                ify a3 = igb.a();
                a3.a = new iiy[]{gwz.b, irz.a, hsd.a, irs.a};
                a3.g = ((Long) cvb.g.c()).longValue();
                a3.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
                b4.g = a3;
                igc i2 = hek.i();
                i2.b(ibz.a(context.getString(R.string.f154910_resource_name_obfuscated_res_0x7f14039d)));
                b4.e = i2;
                iao b5 = iap.b();
                b5.d(R.id.f54800_resource_name_obfuscated_res_0x7f0b01c8, jbt.n(context, R.string.f154910_resource_name_obfuscated_res_0x7f14039d));
                b4.f = b5;
                return b4.a();
            case 3:
                ify a4 = igb.a();
                a4.i = IStickerExtension.class;
                a4.a = new iiy[]{gqm.a};
                a4.g = ((Long) cvb.g.c()).longValue();
                a4.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
                ige b6 = igg.b(ehs.class, ehs.class, igf.AUTO_ASYNC);
                b6.g = a4;
                return b6.a();
            case 4:
                String string = context.getString(R.string.f155020_resource_name_obfuscated_res_0x7f1403a9);
                ify a5 = igb.a();
                a5.a = new iiy[]{gwz.b, irz.a, hsd.a, irs.a};
                a5.g = ((Long) cvb.g.c()).longValue();
                a5.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
                igc i3 = hek.i();
                i3.b(ibz.a(string));
                iao b7 = iap.b();
                b7.d(R.id.f54800_resource_name_obfuscated_res_0x7f0b01c8, jbt.n(context, R.string.f155020_resource_name_obfuscated_res_0x7f1403a9));
                ige b8 = igg.b(IStickerExtension.class, ehy.class, igf.ON_DEMAND);
                b8.g = a5;
                b8.e = i3;
                b8.f = b7;
                return b8.a();
            case 5:
                String string2 = context.getString(R.string.f155040_resource_name_obfuscated_res_0x7f1403ac);
                ify a6 = igb.a();
                a6.a = new iiy[]{gwz.b, hsd.a, irs.a};
                a6.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
                igc i4 = hek.i();
                i4.b(ibz.a(string2));
                iao b9 = iap.b();
                b9.d(R.id.f54800_resource_name_obfuscated_res_0x7f0b01c8, jbt.n(context, R.string.f155040_resource_name_obfuscated_res_0x7f1403ac));
                ige b10 = igg.b(IUniversalMediaExtension.class, ejy.class, igf.ON_DEMAND);
                b10.g = a6;
                b10.e = i4;
                b10.f = b9;
                return b10.a();
            case 6:
                return igg.b(elz.class, elz.class, igf.ON_DEMAND).a();
            case 7:
                gqe a7 = gqh.a();
                a7.i(context.getString(R.string.f153940_resource_name_obfuscated_res_0x7f14032f));
                a7.f(R.drawable.f47050_resource_name_obfuscated_res_0x7f0801af);
                a7.g(R.string.f156210_resource_name_obfuscated_res_0x7f140421);
                a7.d(R.string.f156210_resource_name_obfuscated_res_0x7f140421);
                a7.l(new ega(context, 17));
                a7.e(true);
                gqh a8 = a7.a();
                ify a9 = igb.a();
                a9.a = new iiy[]{gwz.b, irz.a};
                a9.d(emb.a);
                ige b11 = igg.b(elt.class, ema.class, igf.ON_DEMAND);
                b11.d = a8;
                b11.g = a9;
                return b11.a();
            case 8:
                ige b12 = igg.b(elu.class, emh.class, igf.AUTO_ASYNC_BACKGROUND);
                ify a10 = igb.a();
                a10.d(emb.b);
                a10.a = new iiy[]{gwz.b, irs.a};
                b12.g = a10;
                return b12.a();
            case 9:
                ige b13 = igg.b(elv.class, emp.class, igf.AUTO_ASYNC_BACKGROUND);
                ify a11 = igb.a();
                a11.d(emb.a);
                a11.a = new iiy[]{gwz.b, irs.a};
                a11.b(new iga(emb.i, null, null, true));
                a11.b(new iga(emb.j, null, null, false));
                b13.g = a11;
                return b13.a();
            case 10:
                ige b14 = igg.b(enr.class, enu.class, igf.ON_DEMAND);
                ify a12 = igb.a();
                a12.d(iqt.b);
                b14.g = a12;
                return b14.a();
            case 11:
                ige b15 = igg.b(eon.class, eos.class, igf.AUTO_UI);
                ify a13 = igb.a();
                a13.a = new iiy[]{gwz.b};
                a13.d(eop.a);
                a13.c = "disable_split_prompt_module";
                a13.d = false;
                a13.a("foldable");
                a13.m.add(4);
                b15.g = a13;
                return b15.a();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return igg.b(ixa.class, eow.class, igf.AUTO_UI).a();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                gqe a14 = gqh.a();
                a14.i(context.getString(R.string.f153920_resource_name_obfuscated_res_0x7f14032d));
                a14.f(R.drawable.f46950_resource_name_obfuscated_res_0x7f0801a5);
                a14.g(R.string.f156100_resource_name_obfuscated_res_0x7f140416);
                a14.l(new emq(context, 6));
                a14.e(true);
                gqh a15 = a14.a();
                ige b16 = igg.b(epd.class, epc.class, igf.ON_DEMAND);
                b16.d = a15;
                ify a16 = igb.a();
                a16.a = new iiy[]{gwz.b, irs.a};
                a16.d(doa.dv);
                b16.g = a16;
                return b16.a();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                String string3 = context.getString(R.string.f155030_resource_name_obfuscated_res_0x7f1403ab);
                gqe a17 = gqh.a();
                a17.i(context.getString(R.string.f153980_resource_name_obfuscated_res_0x7f140333));
                a17.f(R.drawable.f47070_resource_name_obfuscated_res_0x7f0801b1);
                a17.g(R.string.f156400_resource_name_obfuscated_res_0x7f140434);
                a17.d(R.string.f175930_resource_name_obfuscated_res_0x7f140c9f);
                a17.k(-10123, string3);
                gqh a18 = a17.a();
                ify a19 = igb.a();
                a19.a = new iiy[]{gwz.b};
                a19.b = R.string.f175190_resource_name_obfuscated_res_0x7f140c55;
                igc i5 = hek.i();
                i5.b(ibz.a(string3));
                ige b17 = igg.b(epg.class, eph.class, igf.ON_DEMAND);
                b17.d = a18;
                b17.g = a19;
                b17.e = i5;
                return b17.a();
            case 15:
                ige b18 = igg.b(eww.class, ewx.class, igf.ON_DEMAND);
                ify a20 = igb.a();
                a20.a = new iiy[]{gwz.b, hgl.a};
                b18.g = a20;
                return b18.a();
            case 16:
                gqe a21 = gqh.a();
                a21.i(context.getString(R.string.f154000_resource_name_obfuscated_res_0x7f140335));
                a21.f(R.drawable.f47090_resource_name_obfuscated_res_0x7f0801b3);
                a21.g(R.string.f156430_resource_name_obfuscated_res_0x7f140437);
                a21.d(R.string.f176740_resource_name_obfuscated_res_0x7f140cf5);
                a21.e(true);
                a21.k(-10124, ITranslateUIExtension.class);
                gqh a22 = a21.a();
                ify a23 = igb.a();
                a23.a = new iiy[]{gwz.b, hsd.a, irs.a};
                ige b19 = igg.b(ITranslateUIExtension.class, ezx.class, igf.ON_DEMAND);
                b19.d = a22;
                b19.g = a23;
                return b19.a();
            case 17:
                ige b20 = igg.b(fcy.class, fcx.class, igf.AUTO_ASYNC);
                ify a24 = igb.a();
                a24.f = 31;
                a24.d(ffa.f);
                a24.c = context.getString(R.string.f161110_resource_name_obfuscated_res_0x7f14068f);
                a24.a = new iiy[]{gwz.b};
                b20.g = a24;
                return b20.a();
            case 18:
                ige b21 = igg.b(fcz.class, fdc.class, igf.AUTO_ASYNC);
                ify a25 = igb.a();
                a25.f = 31;
                a25.d(ffa.u);
                a25.a = new iiy[]{gwz.b};
                b21.g = a25;
                return b21.a();
            case 19:
                ige b22 = igg.b(fdj.class, fdq.class, igf.AUTO_ASYNC_BACKGROUND);
                ify a26 = igb.a();
                a26.d(fbh.z);
                a26.c = context.getString(R.string.f161110_resource_name_obfuscated_res_0x7f14068f);
                a26.a = new iiy[]{gwz.b};
                b22.g = a26;
                return b22.a();
            default:
                ige b23 = igg.b(fdk.class, fdu.class, igf.AUTO_ASYNC_BACKGROUND);
                ify a27 = igb.a();
                a27.c(fbh.e, false);
                a27.c = context.getString(R.string.f161110_resource_name_obfuscated_res_0x7f14068f);
                a27.a = new iiy[]{gwz.b};
                b23.g = a27;
                return b23.a();
        }
    }
}
