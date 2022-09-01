package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.expression.extension.ContentSuggestionExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IEmojiOrGifExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IEmojiSearchExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IEmoticonExtension;
import com.google.android.apps.inputmethod.libs.hint.CentralizedHintManager;
import com.google.android.apps.inputmethod.libs.search.fastaccessbar.FastAccessBarExtension;
import com.google.android.inputmethod.latin.R;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: djv  reason: default package */
/* loaded from: classes.dex */
public final class djv implements ifx {
    private final /* synthetic */ int a;

    public djv(int i) {
        this.a = i;
    }

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        switch (this.a) {
            case 0:
                return new djw();
            case 1:
                return new CentralizedHintManager();
            case 2:
                return new dma();
            case 3:
                return new dnw();
            case 4:
                return new dpa(context);
            case 5:
                return new dpi();
            case 6:
                return new dpm();
            case 7:
                return new dpu(context);
            case 8:
                return new dql();
            case 9:
                return new dqt();
            case 10:
                return new dqu(context);
            case 11:
                return new drz();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new dtd();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new dxi();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new dyq();
            case 15:
                return new dyw(context, ino.M(context));
            case 16:
                return new dzm(context);
            case 17:
                return new eao();
            case 18:
                return new eaz(new hso());
            case 19:
                return new ebe();
            default:
                return new ecp(context);
        }
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        switch (this.a) {
            case 0:
                ige b = igg.b(djy.class, djw.class, igf.ON_DEMAND);
                ify a = igb.a();
                a.b(new iga(null, new String[]{"zh", "ko"}, null, false));
                a.c = context.getString(R.string.f161080_resource_name_obfuscated_res_0x7f14068c);
                b.g = a;
                return b.a();
            case 1:
                ige b2 = igg.b(dhw.class, CentralizedHintManager.class, igf.AUTO_UI);
                ify a2 = igb.a();
                a2.a = new iiy[]{gwz.b};
                b2.g = a2;
                return b2.a();
            case 2:
                ige b3 = igg.b(dls.class, dma.class, igf.AUTO_UI);
                ify a3 = igb.a();
                a3.a = new iiy[]{gwu.b};
                b3.g = a3;
                return b3.a();
            case 3:
                ige b4 = igg.b(dns.class, dnw.class, igf.ON_DEMAND);
                ify a4 = igb.a();
                a4.c = context.getString(R.string.f161080_resource_name_obfuscated_res_0x7f14068c);
                b4.g = a4;
                return b4.a();
            case 4:
                return igg.b(doz.class, dpa.class, igf.ON_DEMAND).a();
            case 5:
                ige b5 = igg.b(dpb.class, dpi.class, igf.AUTO_ASYNC_BACKGROUND);
                ify a5 = igb.a();
                a5.a = new iiy[]{gwz.c, hgl.a};
                a5.d(dpj.f);
                b5.g = a5;
                return b5.a();
            case 6:
                ige b6 = igg.b(dpc.class, dpm.class, igf.ON_DEMAND);
                ify a6 = igb.a();
                a6.i = dpb.class;
                a6.c = context.getString(R.string.f161080_resource_name_obfuscated_res_0x7f14068c);
                b6.g = a6;
                return b6.a();
            case 7:
                ige b7 = igg.b(dpu.class, dpu.class, igf.ON_DEMAND);
                ify a7 = igb.a();
                a7.a = new iiy[]{gwu.b};
                b7.g = a7;
                return b7.a();
            case 8:
                return igg.b(dqd.class, dql.class, igf.ON_DEMAND).a();
            case 9:
                ige b8 = igg.b(dqr.class, dqt.class, igf.AUTO_ASYNC);
                ify a8 = igb.a();
                a8.a = new iiy[]{gwu.b};
                b8.g = a8;
                return b8.a();
            case 10:
                ige b9 = igg.b(dqu.class, dqu.class, igf.ON_DEMAND);
                ify a9 = igb.a();
                a9.a = new iiy[]{gwu.b};
                b9.g = a9;
                return b9.a();
            case 11:
                ige b10 = igg.b(dru.class, drz.class, igf.ON_DEMAND);
                ify a10 = igb.a();
                a10.c = context.getString(R.string.f161080_resource_name_obfuscated_res_0x7f14068c);
                b10.g = a10;
                return b10.a();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ige b11 = igg.b(dst.class, dtd.class, igf.AUTO_ASYNC);
                ify a11 = igb.a();
                a11.a = new iiy[]{gwz.b, jcj.a, hsd.a};
                a11.d(dsu.a);
                a11.c = context.getString(R.string.f161950_resource_name_obfuscated_res_0x7f1406e4);
                b11.g = a11;
                return b11.a();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ige b12 = igg.b(dxg.class, dxi.class, igf.AUTO_UI);
                ify a12 = igb.a();
                a12.a = new iiy[]{gwz.b};
                a12.b = R.string.f175160_resource_name_obfuscated_res_0x7f140c52;
                b12.g = a12;
                return b12.a();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ige b13 = igg.b(dyf.class, dyq.class, igf.AUTO_UI);
                ify a13 = igb.a();
                a13.a = new iiy[]{gwz.b};
                a13.c = context.getString(R.string.f161950_resource_name_obfuscated_res_0x7f1406e4);
                b13.g = a13;
                return b13.a();
            case 15:
                ige b14 = igg.b(IEmojiOrGifExtension.class, dyw.class, igf.ON_DEMAND);
                ify a14 = igb.a();
                a14.a = new iiy[]{gwz.b};
                a14.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
                b14.g = a14;
                return b14.a();
            case 16:
                ify a15 = igb.a();
                a15.a = new iiy[]{gwz.b, irz.a, hsd.a, irs.a};
                a15.g = ((Long) cvb.g.c()).longValue();
                a15.c(iho.a(context), false);
                a15.c = context.getString(R.string.f160760_resource_name_obfuscated_res_0x7f14066c);
                a15.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
                ige b15 = igg.b(ContentSuggestionExtension.class, dzm.class, igf.AUTO_ASYNC_BACKGROUND);
                b15.g = a15;
                igc i = hek.i();
                i.b(ibz.a(context.getString(R.string.f154930_resource_name_obfuscated_res_0x7f14039f)));
                b15.e = i;
                iao b16 = iap.b();
                b16.d(R.id.f54800_resource_name_obfuscated_res_0x7f0b01c8, jbt.n(context, R.string.f154930_resource_name_obfuscated_res_0x7f14039f));
                b15.f = b16;
                return b15.a();
            case 17:
                ify a16 = igb.a();
                a16.a = new iiy[]{gwz.b};
                a16.h = ((Long) cvb.g.c()).longValue();
                a16.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
                igc i2 = hek.i();
                i2.b(ibz.a(context.getString(R.string.f154940_resource_name_obfuscated_res_0x7f1403a1)));
                iao b17 = iap.b();
                b17.d(R.id.f54800_resource_name_obfuscated_res_0x7f0b01c8, jbt.n(context, R.string.f154940_resource_name_obfuscated_res_0x7f1403a1));
                ige b18 = igg.b(IEmojiSearchExtension.class, eao.class, igf.AUTO_ASYNC_BACKGROUND);
                b18.g = a16;
                b18.e = i2;
                b18.f = b17;
                return b18.a();
            case 18:
                ify a17 = igb.a();
                a17.a = new iiy[]{gwz.b};
                a17.g = ((Long) cvb.g.c()).longValue();
                a17.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
                igc i3 = hek.i();
                i3.b(ibz.a(context.getString(R.string.f154940_resource_name_obfuscated_res_0x7f1403a1)));
                i3.b(ibz.a(context.getString(R.string.f154950_resource_name_obfuscated_res_0x7f1403a2)));
                iao b19 = iap.b();
                b19.d(R.id.f54800_resource_name_obfuscated_res_0x7f0b01c8, jbt.n(context, R.string.f154940_resource_name_obfuscated_res_0x7f1403a1));
                ige b20 = igg.b(IEmojiSearchExtension.class, eaz.class, igf.AUTO_ASYNC);
                b20.g = a17;
                b20.e = i3;
                b20.f = b19;
                return b20.a();
            case 19:
                ige b21 = igg.b(IEmoticonExtension.class, ebe.class, igf.ON_DEMAND);
                b21.g = fgy.q();
                igc i4 = hek.i();
                i4.b(ibz.a(context.getString(R.string.f154970_resource_name_obfuscated_res_0x7f1403a4)));
                b21.e = i4;
                iao b22 = iap.b();
                b22.d(R.id.f54800_resource_name_obfuscated_res_0x7f0b01c8, jbt.n(context, R.string.f154970_resource_name_obfuscated_res_0x7f1403a4));
                b21.f = b22;
                return b21.a();
            default:
                ige b23 = igg.b(FastAccessBarExtension.class, ecp.class, igf.AUTO_ASYNC);
                ify a18 = igb.a();
                a18.a = new iiy[]{gwz.b, irz.a, hsd.a, irs.a};
                a18.g = ((Long) cvb.g.c()).longValue();
                a18.d(ecq.a);
                a18.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
                a18.b(new iga(null, null, "morse_2", true));
                b23.g = a18;
                return b23.a();
        }
    }
}
