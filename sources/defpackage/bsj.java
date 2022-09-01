package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.expression.expressionmoment.IExpressionMomentExtension;
import com.google.android.inputmethod.latin.R;
import java.util.Random;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: bsj  reason: default package */
/* loaded from: classes.dex */
public final class bsj implements ifx {
    private final /* synthetic */ int a;

    public bsj(int i) {
        this.a = i;
    }

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        switch (this.a) {
            case 0:
                return new bsi(context);
            case 1:
                return new bpb();
            case 2:
                return new bsn(context);
            case 3:
                return new bsr(context);
            case 4:
                return new bsy(context);
            case 5:
                return new bst();
            case 6:
                return new bvt();
            case 7:
                return new bxe();
            case 8:
                return new ccp(context);
            case 9:
                return new ccq(context);
            case 10:
                return new cfp(context);
            case 11:
                return new chw(new chs(context, cqh.a(), gxo.a(9), null));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                nxp.V(context);
                nxp.U(context, Context.class);
                oiy c = npd.c(ciw.a);
                npe b = npf.b(context);
                oiy c2 = npd.c(new gne((oiy) b, (oiy) new cvy(b, 1), 1, (byte[]) null));
                oiy c3 = npd.c(ciy.a);
                cix cixVar = new cix(b, 1);
                csb csbVar = new csb(b);
                cix cixVar2 = new cix(csbVar, 0);
                csd b2 = csd.b(b);
                cix cixVar3 = new cix(csbVar, 2);
                civ civVar = new civ(b);
                hso hsoVar = (hso) c.a();
                idk i = ciz.i();
                hso hsoVar2 = (hso) c.a();
                cil cilVar = new cil(context, eju.o(), (cik) c2.a(), ciz.i(), (Random) c3.a(), cixVar);
                cke o = eju.o();
                czj czjVar = czj.b;
                nxp.X(czjVar);
                ciq ciqVar = new ciq(context, o, czjVar, (Random) c3.a(), cixVar2, ciz.i());
                cke o2 = eju.o();
                ckm k = ffb.k(context);
                idk i2 = ciz.i();
                Random random = (Random) c3.a();
                hfg a = cip.a();
                a.h(bou.l);
                a.a = 20;
                a.j(ckc.TENOR_QUERY);
                cio cioVar = new cio(context, o2, k, i2, random, a.g());
                cke o3 = eju.o();
                ckm k2 = ffb.k(context);
                idk i3 = ciz.i();
                Random random2 = (Random) c3.a();
                hfg a2 = cip.a();
                a2.h(bou.o);
                a2.a = 4;
                a2.i(mbr.EMOJI_KITCHEN_STICKER);
                a2.j(ckc.EMOJI);
                cio cioVar2 = new cio(context, o3, k2, i3, random2, a2.g());
                cke o4 = eju.o();
                ckm k3 = ffb.k(context);
                idk i4 = ciz.i();
                Random random3 = (Random) c3.a();
                hfg a3 = cip.a();
                a3.h(bou.p);
                a3.a = 27;
                a3.i(mbr.EMOJI_KITCHEN_STICKER);
                a3.j(ckc.EMOJI_KITCHEN);
                cio cioVar3 = new cio(context, o4, k3, i4, random3, a3.g());
                cke o5 = eju.o();
                ckm k4 = ffb.k(context);
                idk i5 = ciz.i();
                Random random4 = (Random) c3.a();
                hfg a4 = cip.a();
                a4.h(bou.n);
                a4.a = 29;
                a4.i(mbr.EMOJI_KITCHEN_MIX);
                a4.j(ckc.EMOJI_KITCHEN_MIX);
                cio cioVar4 = new cio(context, o5, k4, i5, random4, a4.g());
                cke o6 = eju.o();
                ckm k5 = ffb.k(context);
                idk i6 = ciz.i();
                Random random5 = (Random) c3.a();
                hfg a5 = cip.a();
                a5.h(bou.m);
                a5.a = 18;
                a5.i(mbr.EMOJI_KITCHEN_STICKER);
                a5.j(ckc.CONTEXTUAL_EMOJI_KITCHEN);
                return new cjj(context, hsoVar, i, new cjy(context, hsoVar2, cilVar, ciqVar, cioVar, cioVar2, cioVar3, cioVar4, new cio(context, o6, k5, i6, random5, a5.g()), b2, cixVar, cixVar3, eju.o()), new ckk(b2), (cik) c2.a(), civVar, cixVar, cixVar3);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                nxp.V(context);
                nxp.U(context, Context.class);
                oiy c4 = npd.c(ciw.a);
                npe b3 = npf.b(context);
                cql c5 = cql.c(b3);
                crm c6 = crm.c(b3);
                ciz cizVar = csc.a;
                return new cjn((hso) c4.a(), new cjt(context, (hso) c4.a(), crg.c(cizVar, c5, c6, cqr.c(cizVar)), fgy.s(context, R.string.f154910_resource_name_obfuscated_res_0x7f14039d), fgy.s(context, R.string.f155020_resource_name_obfuscated_res_0x7f1403a9), ciz.i(), new byi(context, 7)), ciz.i(), cqh.a().b, cqh.a().a);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new cmn(context);
            case 15:
                return new cnl(context);
            case 16:
                return new cqd();
            case 17:
                return new czx();
            case 18:
                return new dah();
            case 19:
                return new dft();
            default:
                return new dgu();
        }
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        switch (this.a) {
            case 0:
                ige b = igg.b(brz.class, bsi.class, igf.AUTO_ASYNC);
                ify a = igb.a();
                a.a = new iiy[]{gwz.b};
                b.g = a;
                return b.a();
            case 1:
                ige b2 = igg.b(bpc.class, bpb.class, igf.AUTO_UI);
                ify a2 = igb.a();
                a2.a = new iiy[]{gwu.a};
                a2.d(bpc.b);
                b2.g = a2;
                return b2.a();
            case 2:
                ify a3 = igb.a();
                a3.d(gqj.d);
                a3.a = new iiy[]{gwz.b};
                ige b3 = igg.b(bsn.class, bsn.class, igf.AUTO_UI);
                b3.g = a3;
                return b3.a();
            case 3:
                ify a4 = igb.a();
                a4.c(gqj.d, false);
                a4.a = new iiy[]{gwz.b};
                ige b4 = igg.b(bsr.class, bsr.class, igf.AUTO_UI);
                b4.g = a4;
                return b4.a();
            case 4:
                ige b5 = igg.b(bsy.class, bsy.class, igf.AUTO_ASYNC);
                ify a5 = igb.a();
                a5.a = new iiy[]{gwz.c};
                a5.d(bss.a);
                a5.b(new iga(null, null, "morse_2", true));
                a5.f = 31;
                b5.g = a5;
                return b5.a();
            case 5:
                ige b6 = igg.b(bst.class, bst.class, igf.ON_DEMAND);
                ify a6 = igb.a();
                a6.d(bss.a);
                a6.f = 31;
                a6.c = context.getString(R.string.f161080_resource_name_obfuscated_res_0x7f14068c);
                b6.g = a6;
                return b6.a();
            case 6:
                String string = context.getString(R.string.f154920_resource_name_obfuscated_res_0x7f14039e);
                gqe a7 = gqh.a();
                a7.i(context.getString(R.string.f153870_resource_name_obfuscated_res_0x7f140328));
                a7.f(R.drawable.f46960_resource_name_obfuscated_res_0x7f0801a6);
                a7.g(R.string.f155900_resource_name_obfuscated_res_0x7f140402);
                a7.d(R.string.f149010_resource_name_obfuscated_res_0x7f1400eb);
                a7.e(true);
                a7.k(-10123, string);
                gqh a8 = a7.a();
                ify a9 = igb.a();
                a9.a = new iiy[]{gwz.b, hsd.a, irs.a};
                a9.b = R.string.f175150_resource_name_obfuscated_res_0x7f140c51;
                igc i = hek.i();
                i.b(ibz.a(string));
                ige b7 = igg.b(bwj.class, bvt.class, igf.AUTO_UI);
                b7.d = a8;
                b7.g = a9;
                b7.e = i;
                return b7.a();
            case 7:
                ige b8 = igg.b(bxe.class, bxe.class, igf.AUTO_ASYNC_BACKGROUND);
                ify a10 = igb.a();
                a10.a = new iiy[]{gwz.c, irz.a};
                b8.g = a10;
                return b8.a();
            case 8:
                ige b9 = igg.b(ccp.class, ccp.class, igf.ON_DEMAND);
                ify a11 = igb.a();
                a11.d(cas.G);
                a11.a = new iiy[]{gwu.b};
                b9.g = a11;
                return b9.a();
            case 9:
                ige b10 = igg.b(ccq.class, ccq.class, igf.ON_DEMAND);
                ify a12 = igb.a();
                a12.d(cas.G);
                a12.a = new iiy[]{gwu.b};
                b10.g = a12;
                return b10.a();
            case 10:
                ige b11 = igg.b(cfp.class, cfp.class, igf.AUTO_ASYNC_BACKGROUND);
                ify a13 = igb.a();
                a13.a = new iiy[]{gwu.b};
                a13.d(cat.a);
                b11.g = a13;
                return b11.a();
            case 11:
                ige b12 = igg.b(chv.class, chw.class, igf.ON_DEMAND);
                ify a14 = igb.a();
                a14.a = new iiy[]{gwu.b};
                a14.d(cht.a);
                b12.g = a14;
                return b12.a();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ige b13 = igg.b(cjh.class, cjj.class, igf.AUTO_ASYNC_BACKGROUND);
                ify a15 = igb.a();
                a15.i = cjn.class;
                a15.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
                b13.g = a15;
                return b13.a();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ige b14 = igg.b(cjn.class, cjn.class, igf.AUTO_ASYNC);
                ify a16 = igb.a();
                a16.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
                a16.a = new iiy[]{gwz.b, irz.a, hsd.a};
                b14.g = a16;
                return b14.a();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ige b15 = igg.b(cmd.class, cmn.class, igf.AUTO_ASYNC);
                ify a17 = igb.a();
                a17.a = new iiy[]{gwz.b, irz.a, hsd.a, irs.a};
                a17.g = ((Long) cvb.g.c()).longValue();
                a17.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
                a17.b(new iga(null, null, "morse_2", true));
                b15.g = a17;
                return b15.a();
            case 15:
                ige b16 = igg.b(IExpressionMomentExtension.class, cnl.class, igf.AUTO_ASYNC);
                ify a18 = igb.a();
                a18.a = new iiy[]{gwz.b, irz.a, hsd.a, irs.a};
                a18.g = ((Long) cvb.g.c()).longValue();
                a18.d(cit.G);
                a18.b(new iga(null, null, null, false));
                b16.g = a18;
                return b16.a();
            case 16:
                ige b17 = igg.b(cqd.class, cqd.class, igf.AUTO_ASYNC_BACKGROUND);
                ify a19 = igb.a();
                a19.d(cqc.a);
                a19.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
                a19.a = new iiy[]{gwz.b, irz.a};
                b17.g = a19;
                return b17.a();
            case 17:
                ige b18 = igg.b(czy.class, czx.class, igf.ON_DEMAND);
                ify a20 = igb.a();
                a20.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
                a20.a = new iiy[]{gwu.b};
                b18.g = a20;
                return b18.a();
            case 18:
                ige b19 = igg.b(dai.class, dah.class, igf.ON_DEMAND);
                ify a21 = igb.a();
                a21.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
                a21.a = new iiy[]{gwu.b};
                b19.g = a21;
                return b19.a();
            case 19:
                ige b20 = igg.b(dfu.class, dft.class, igf.AUTO_ASYNC);
                ify a22 = igb.a();
                a22.a = new iiy[]{gwz.b};
                a22.k.add(new iga(null, null, "handwriting", false));
                b20.g = a22;
                return b20.a();
            default:
                ige b21 = igg.b(dgw.class, dgu.class, igf.ON_DEMAND);
                ify a23 = igb.a();
                a23.c = context.getString(R.string.f161080_resource_name_obfuscated_res_0x7f14068c);
                b21.g = a23;
                return b21.a();
        }
    }
}
