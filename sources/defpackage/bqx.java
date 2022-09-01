package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.search.contentsuggestion.ContentSuggestionKeyboard;
import com.google.android.apps.inputmethod.libs.search.emoticon.EmoticonKeyboardTablet;
import com.google.android.apps.inputmethod.libs.search.emoticon.EmoticonRecyclerView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.keyboard.impl.Keyboard;
import j$.util.Collection$EL;
import java.util.Collection;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: bqx  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bqx implements hiu {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bqx(bqy bqyVar, List list, int i) {
        this.c = i;
        this.a = bqyVar;
        this.b = list;
    }

    public /* synthetic */ bqx(cjt cjtVar, cjo cjoVar, int i) {
        this.c = i;
        this.b = cjtVar;
        this.a = cjoVar;
    }

    public /* synthetic */ bqx(cly clyVar, String str, int i) {
        this.c = i;
        this.a = clyVar;
        this.b = str;
    }

    public /* synthetic */ bqx(cny cnyVar, cjo cjoVar, int i) {
        this.c = i;
        this.b = cnyVar;
        this.a = cjoVar;
    }

    public /* synthetic */ bqx(ContentSuggestionKeyboard contentSuggestionKeyboard, dzp dzpVar, int i) {
        this.c = i;
        this.b = contentSuggestionKeyboard;
        this.a = dzpVar;
    }

    public /* synthetic */ bqx(EmoticonKeyboardTablet emoticonKeyboardTablet, EmoticonRecyclerView emoticonRecyclerView, int i) {
        this.c = i;
        this.a = emoticonKeyboardTablet;
        this.b = emoticonRecyclerView;
    }

    public /* synthetic */ bqx(dzl dzlVar, dzp dzpVar, int i) {
        this.c = i;
        this.a = dzlVar;
        this.b = dzpVar;
    }

    public /* synthetic */ bqx(dzl dzlVar, leq leqVar, int i) {
        this.c = i;
        this.a = dzlVar;
        this.b = leqVar;
    }

    public /* synthetic */ bqx(dzm dzmVar, dat datVar, int i) {
        this.c = i;
        this.b = dzmVar;
        this.a = datVar;
    }

    public /* synthetic */ bqx(dzx dzxVar, dat datVar, int i) {
        this.c = i;
        this.b = dzxVar;
        this.a = datVar;
    }

    public /* synthetic */ bqx(ede edeVar, List list, int i) {
        this.c = i;
        this.a = edeVar;
        this.b = list;
    }

    public /* synthetic */ bqx(egf egfVar, String str, int i) {
        this.c = i;
        this.a = egfVar;
        this.b = str;
    }

    public /* synthetic */ bqx(egj egjVar, String str, int i) {
        this.c = i;
        this.a = egjVar;
        this.b = str;
    }

    public /* synthetic */ bqx(eie eieVar, hja hjaVar, int i) {
        this.c = i;
        this.a = eieVar;
        this.b = hjaVar;
    }

    public /* synthetic */ bqx(eie eieVar, String str, int i) {
        this.c = i;
        this.a = eieVar;
        this.b = str;
    }

    public /* synthetic */ bqx(eij eijVar, String str, int i) {
        this.c = i;
        this.a = eijVar;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v111, types: [java.lang.Object, hja] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26, types: [leq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.hiu
    public final void a(Object obj) {
        hsk b;
        mbr mbrVar;
        mbr mbrVar2;
        cng b2;
        cng b3;
        cng a;
        int i;
        bue bueVar = null;
        switch (this.c) {
            case 0:
                Object obj2 = this.a;
                ?? r9 = this.b;
                ((ltd) ((ltd) ((ltd) bqy.a.d()).i((Throwable) obj)).k("com/google/android/apps/inputmethod/latin/metrics/LatinMetricsProcessor", "lambda$processPeriodicTaskServiceRun$1", (char) 443, "LatinMetricsProcessor.java")).t("Failed to fetch recent emojis");
                ((bqy) obj2).d(0, r9);
                return;
            case 1:
                ((bqy) this.a).d(((Integer) obj).intValue(), this.b);
                return;
            case 2:
                crc crcVar = (crc) obj;
                cjt cjtVar = (cjt) this.b;
                cjo cjoVar = (cjo) this.a;
                cjtVar.g.e(ciu.SHARE, Integer.valueOf(eju.m(cjoVar.b())));
                idk idkVar = cjtVar.g;
                ctd ctdVar = ctd.IMAGE_SHARE;
                Object[] objArr = new Object[2];
                nfh t = mbc.p.t();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mbc mbcVar = (mbc) t.b;
                mbcVar.b = 7;
                mbcVar.a |= 1;
                mbc mbcVar2 = (mbc) t.b;
                mbcVar2.c = 9;
                mbcVar2.a |= 2;
                int c = cte.c(cjoVar.b());
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mbc mbcVar3 = (mbc) t.b;
                mbcVar3.l = c - 1;
                mbcVar3.a |= 4096;
                mbs b4 = crcVar.b();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mbc mbcVar4 = (mbc) t.b;
                b4.getClass();
                mbcVar4.h = b4;
                mbcVar4.a |= 128;
                objArr[0] = t.cz();
                objArr[1] = crcVar;
                idkVar.e(ctdVar, objArr);
                return;
            case 3:
                Object obj3 = this.a;
                Object obj4 = this.b;
                ((ltd) ((ltd) ((ltd) cly.a.d()).i((Throwable) obj)).k("com/google/android/apps/inputmethod/libs/expression/data/emoji/search/EmojiSuperpacksManager", "lambda$triggerSync$3", (char) 402, "EmojiSuperpacksManager.java")).t("triggerSync() : Failed to obtain model.");
                ((cly) obj3).k.remove(obj4);
                return;
            case 4:
                crc crcVar2 = (crc) obj;
                cny cnyVar = (cny) this.b;
                cjo cjoVar2 = (cjo) this.a;
                cnyVar.r.o(cjoVar2.d());
                if (crcVar2.c() && !cnyVar.i.j(crcVar2.c.packageName)) {
                    mbs b5 = crcVar2.b();
                    List k = lfy.e(",").k((CharSequence) cit.N.c());
                    mbr b6 = mbr.b(b5.f);
                    if (b6 == null) {
                        b6 = mbr.UNKNOWN_CONTENT_TYPE;
                    }
                    if (k.contains(b6.name()) && (b = hsx.b()) != null) {
                        ((dcu) b).bJ();
                        hpy b7 = hqj.b();
                        if (b7 != null) {
                            kfp a2 = icn.a();
                            a2.e(b7.d);
                            a2.d(b7.c.length() - b7.e);
                            a2.h("");
                            a2.f();
                            b.at(hfd.d(new iay(-10141, null, a2.c())));
                        }
                    }
                }
                idk idkVar2 = cnyVar.b;
                ctd ctdVar2 = ctd.IMAGE_SHARE;
                Object[] objArr2 = new Object[2];
                nfh t2 = mbc.p.t();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mbc mbcVar5 = (mbc) t2.b;
                mbcVar5.b = 7;
                mbcVar5.a |= 1;
                mbc mbcVar6 = (mbc) t2.b;
                mbcVar6.c = 15;
                mbcVar6.a |= 2;
                int c2 = cte.c(cjoVar2.b());
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mbc mbcVar7 = (mbc) t2.b;
                mbcVar7.l = c2 - 1;
                mbcVar7.a |= 4096;
                mbs b8 = crcVar2.b();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mbc mbcVar8 = (mbc) t2.b;
                b8.getClass();
                mbcVar8.h = b8;
                mbcVar8.a |= 128;
                objArr2[0] = t2.cz();
                objArr2[1] = crcVar2;
                idkVar2.e(ctdVar2, objArr2);
                return;
            case 5:
                Object obj5 = this.a;
                ?? r2 = this.b;
                eak eakVar = (eak) obj;
                if (!eakVar.a()) {
                    boolean booleanValue = ((Boolean) dzn.k.c()).booleanValue();
                    llp llpVar = eakVar.a.isEmpty() ? eakVar.c : eakVar.a;
                    llp llpVar2 = booleanValue ? llpVar : eakVar.b;
                    if (booleanValue) {
                        llpVar = eakVar.b;
                    }
                    if (!llpVar2.isEmpty()) {
                        dzl dzlVar = (dzl) obj5;
                        dzlVar.h.J((Collection) Collection$EL.stream(llpVar2).map(dwn.e).collect(ljr.a));
                        if (!llpVar.isEmpty()) {
                            dzlVar.h.A(dzc.a);
                        }
                    }
                    dzl dzlVar2 = (dzl) obj5;
                    dzlVar2.h.J((Collection) Collection$EL.stream(llpVar).map(dwn.e).collect(ljr.a));
                    dzlVar2.h.A(dzd.a);
                    return;
                }
                r2.a(null);
                return;
            case 6:
                Object obj6 = this.a;
                crc crcVar3 = (crc) obj;
                dzo dzoVar = ((dzp) this.b).b;
                dzl dzlVar3 = (dzl) obj6;
                dzlVar3.p.o(crcVar3.a);
                if (dzoVar == dzo.MIX_QUERY) {
                    mbrVar = mbr.EMOJI_KITCHEN_MIX;
                } else {
                    mbrVar = mbr.EMOJI_KITCHEN_STICKER;
                }
                nfh t3 = mbc.p.t();
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                mbc mbcVar9 = (mbc) t3.b;
                mbcVar9.b = 1;
                mbcVar9.a |= 1;
                mbc mbcVar10 = (mbc) t3.b;
                mbcVar10.c = 10;
                mbcVar10.a |= 2;
                mbs b9 = crcVar3.b();
                nfh nfhVar = (nfh) b9.N(5);
                nfhVar.cG(b9);
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                mbs mbsVar = (mbs) nfhVar.b;
                mbs mbsVar2 = mbs.h;
                mbsVar.f = mbrVar.l;
                mbsVar.a |= 16;
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                mbc mbcVar11 = (mbc) t3.b;
                mbs mbsVar3 = (mbs) nfhVar.cz();
                mbsVar3.getClass();
                mbcVar11.h = mbsVar3;
                mbcVar11.a |= 128;
                String str = dzlVar3.l.b;
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                mbc mbcVar12 = (mbc) t3.b;
                mbcVar12.a |= 1024;
                mbcVar12.j = str;
                mba mbaVar = (mba) dzl.b.get(dzoVar);
                if (mbaVar != null) {
                    nfh t4 = mbb.g.t();
                    if (t4.c) {
                        t4.cD();
                        t4.c = false;
                    }
                    mbb mbbVar = (mbb) t4.b;
                    mbbVar.e = mbaVar.e;
                    mbbVar.a |= 8;
                    mbb mbbVar2 = (mbb) t4.cz();
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    mbc mbcVar13 = (mbc) t3.b;
                    mbbVar2.getClass();
                    mbcVar13.e = mbbVar2;
                    mbcVar13.a |= 8;
                }
                dzlVar3.d.e(ctd.IMAGE_SHARE, t3.cz(), crcVar3);
                if (!dzlVar3.m.C || !crcVar3.c()) {
                    return;
                }
                dzlVar3.f.a(dzlVar3.n, dzlVar3.l, dzoVar);
                return;
            case 7:
                Object obj7 = this.b;
                Object obj8 = this.a;
                llp llpVar3 = (llp) obj;
                dzm dzmVar = (dzm) obj7;
                hsy hsyVar = dzmVar.e;
                if (hsyVar == null || hsyVar.fq()) {
                    if (llpVar3.isEmpty()) {
                        dzu.g();
                        return;
                    }
                    eab a3 = eab.a((dat) obj8, llpVar3, lfb.f(dzmVar.l));
                    hsy hsyVar2 = dzmVar.e;
                    if (!(hsyVar2 instanceof dzt)) {
                        return;
                    }
                    dzt dztVar = (dzt) hsyVar2;
                    dztVar.K(a3.a);
                    dztVar.L(a3);
                    return;
                }
                ((ltd) ((ltd) dzm.a.b()).k("com/google/android/apps/inputmethod/libs/search/contentsuggestion/ContentSuggestionExtensionImpl", "lambda$tryFetchContentAndShowSuggestions$3", 241, "ContentSuggestionExtensionImpl.java")).t("Content fetch succeeded but no further process is done because the currentKeyboard is not active anymore");
                return;
            case 8:
                Object obj9 = this.b;
                Object obj10 = this.a;
                ((ltd) ((ltd) ((ltd) dzm.a.c()).i((Throwable) obj)).k("com/google/android/apps/inputmethod/libs/search/contentsuggestion/ContentSuggestionExtensionImpl", "lambda$tryFetchContentAndShowSuggestions$4", (char) 260, "ContentSuggestionExtensionImpl.java")).t("Fail to fetch content for content suggestion with Throwable");
                ((dzm) obj9).m = dat.a;
                dzu.e((dat) obj10);
                return;
            case 9:
                Object obj11 = this.b;
                crc crcVar4 = (crc) obj;
                dzo dzoVar2 = ((dzp) this.a).b;
                ContentSuggestionKeyboard contentSuggestionKeyboard = (ContentSuggestionKeyboard) obj11;
                contentSuggestionKeyboard.k.o(crcVar4.a);
                if (dzoVar2 == dzo.MIX_QUERY) {
                    mbrVar2 = mbr.EMOJI_KITCHEN_MIX;
                } else {
                    mbrVar2 = mbr.EMOJI_KITCHEN_STICKER;
                }
                nfh t5 = mbc.p.t();
                if (t5.c) {
                    t5.cD();
                    t5.c = false;
                }
                mbc mbcVar14 = (mbc) t5.b;
                mbcVar14.b = 1;
                mbcVar14.a |= 1;
                mbc mbcVar15 = (mbc) t5.b;
                mbcVar15.c = 10;
                mbcVar15.a |= 2;
                mbs b10 = crcVar4.b();
                nfh nfhVar2 = (nfh) b10.N(5);
                nfhVar2.cG(b10);
                if (nfhVar2.c) {
                    nfhVar2.cD();
                    nfhVar2.c = false;
                }
                mbs mbsVar4 = (mbs) nfhVar2.b;
                mbs mbsVar5 = mbs.h;
                mbsVar4.f = mbrVar2.l;
                mbsVar4.a |= 16;
                if (t5.c) {
                    t5.cD();
                    t5.c = false;
                }
                mbc mbcVar16 = (mbc) t5.b;
                mbs mbsVar6 = (mbs) nfhVar2.cz();
                mbsVar6.getClass();
                mbcVar16.h = mbsVar6;
                mbcVar16.a |= 128;
                String str2 = contentSuggestionKeyboard.h.b;
                if (t5.c) {
                    t5.cD();
                    t5.c = false;
                }
                mbc mbcVar17 = (mbc) t5.b;
                mbcVar17.a |= 1024;
                mbcVar17.j = str2;
                mba mbaVar2 = (mba) ContentSuggestionKeyboard.b.get(dzoVar2);
                if (mbaVar2 != null) {
                    nfh t6 = mbb.g.t();
                    if (t6.c) {
                        t6.cD();
                        t6.c = false;
                    }
                    mbb mbbVar3 = (mbb) t6.b;
                    mbbVar3.e = mbaVar2.e;
                    mbbVar3.a |= 8;
                    mbb mbbVar4 = (mbb) t6.cz();
                    if (t5.c) {
                        t5.cD();
                        t5.c = false;
                    }
                    mbc mbcVar18 = (mbc) t5.b;
                    mbbVar4.getClass();
                    mbcVar18.e = mbbVar4;
                    mbcVar18.a |= 8;
                }
                contentSuggestionKeyboard.c.e(ctd.IMAGE_SHARE, t5.cz(), crcVar4);
                if (!((Keyboard) obj11).C || !crcVar4.c()) {
                    return;
                }
                contentSuggestionKeyboard.d.a(contentSuggestionKeyboard.D, contentSuggestionKeyboard.h, dzoVar2);
                return;
            case 10:
                Object obj12 = this.b;
                Object obj13 = this.a;
                ((ltd) ((ltd) ((ltd) dzx.a.c()).i((Throwable) obj)).k("com/google/android/apps/inputmethod/libs/search/contentsuggestion/ContentSuggestionProvider", "lambda$tryFetchContentAndShowSuggestions$4", (char) 225, "ContentSuggestionProvider.java")).t("Fail to fetch content for content suggestion with Throwable");
                ((dzx) obj12).i = dat.a;
                dzu.e((dat) obj13);
                return;
            case 11:
                ((EmoticonKeyboardTablet) this.a).w((EmoticonRecyclerView) this.b, (llp) obj);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj14 = this.a;
                ?? r92 = this.b;
                ((ltd) ((ltd) ((ltd) ede.a.d()).i((Throwable) obj)).k("com/google/android/apps/inputmethod/libs/search/fastaccessbar/FastAccessKeyboardPeer", "lambda$showMergedDefaultAndFrequentEmojis$3", (char) 387, "FastAccessKeyboardPeer.java")).t("Failed to fetch frequent emojis");
                ((ede) obj14).m(r92);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj15 = this.a;
                ?? r93 = this.b;
                ((ltd) ((ltd) ((ltd) ede.a.d()).i((Throwable) obj)).k("com/google/android/apps/inputmethod/libs/search/fastaccessbar/FastAccessKeyboardPeer", "lambda$showMergedDefaultAndFrequentEmojis$4", (char) 393, "FastAccessKeyboardPeer.java")).t("Fetching frequent emojis is cancelled");
                ((ede) obj15).m(r93);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj16 = this.a;
                Object obj17 = this.b;
                egd egdVar = (egd) obj;
                cvv cvvVar = egdVar.a;
                if (cvvVar == cvv.READY) {
                    egm egmVar = ((egf) obj16).f;
                    llp llpVar4 = egdVar.b;
                    egmVar.k = 4;
                    egmVar.f = llp.q();
                    egmVar.g = llp.o(llpVar4);
                    egmVar.h = cni.a;
                    egmVar.c.d();
                    return;
                } else if (cvvVar == cvv.UNKNOWN) {
                    egf egfVar = (egf) obj16;
                    egfVar.f.j(egf.b(new dvc(egfVar, (String) obj17, 12)));
                    return;
                } else {
                    egf egfVar2 = (egf) obj16;
                    egfVar2.e.h();
                    cou couVar = egfVar2.e;
                    cpc a4 = cpd.a();
                    a4.b = 2;
                    couVar.g(a4.a());
                    egfVar2.f.j(egfVar2.a(egfVar2.c, egdVar.a));
                    return;
                }
            case 15:
                Object obj18 = this.a;
                Object obj19 = this.b;
                egf egfVar3 = (egf) obj18;
                egm egmVar2 = egfVar3.f;
                if (((Throwable) obj) instanceof IllegalStateException) {
                    Context context = egfVar3.c;
                    hsz hszVar = egfVar3.d;
                    cnf a5 = cng.a();
                    a5.c(false);
                    a5.e(1);
                    a5.h(R.layout.f134250_resource_name_obfuscated_res_0x7f0e008a);
                    a5.g(R.drawable.f49160_resource_name_obfuscated_res_0x7f08029c);
                    a5.d(R.string.f167220_resource_name_obfuscated_res_0x7f140932);
                    a5.f(R.string.f167210_resource_name_obfuscated_res_0x7f140931);
                    if (cuz.a.k(context) && !hszVar.X()) {
                        bueVar = new bue(context, hszVar, (String) obj19, 17);
                    }
                    a5.a = bueVar;
                    b2 = a5.a();
                } else {
                    b2 = egf.b(new dvc(egfVar3, (String) obj19, 13));
                }
                egmVar2.j(b2);
                return;
            case 16:
                Object obj20 = this.a;
                Object obj21 = this.b;
                egh eghVar = (egh) obj;
                cvv cvvVar2 = eghVar.a;
                if (cvvVar2 != cvv.READY) {
                    if (cvvVar2 == cvv.UNKNOWN) {
                        egj egjVar = (egj) obj20;
                        egjVar.c.j(egj.b(new dvc(egjVar, (String) obj21, 15)));
                        return;
                    }
                    egj egjVar2 = (egj) obj20;
                    egjVar2.c.j(egjVar2.a(egjVar2.a, cvvVar2));
                    return;
                }
                egp egpVar = ((egj) obj20).c;
                llp llpVar5 = eghVar.b;
                egpVar.p = 4;
                egpVar.g = llp.q();
                egpVar.n.B();
                egpVar.h = llp.o(llpVar5);
                egpVar.i = cni.a;
                egpVar.c.d();
                return;
            case 17:
                Object obj22 = this.a;
                Object obj23 = this.b;
                egj egjVar3 = (egj) obj22;
                egp egpVar2 = egjVar3.c;
                if (((Throwable) obj) instanceof IllegalStateException) {
                    Context context2 = egjVar3.a;
                    hsz hszVar2 = egjVar3.b;
                    cnf a6 = cng.a();
                    a6.c(false);
                    a6.e(1);
                    a6.h(R.layout.f134250_resource_name_obfuscated_res_0x7f0e008a);
                    a6.g(R.drawable.f49160_resource_name_obfuscated_res_0x7f08029c);
                    a6.d(R.string.f167220_resource_name_obfuscated_res_0x7f140932);
                    a6.f(R.string.f167210_resource_name_obfuscated_res_0x7f140931);
                    if (cuz.a.k(context2) && !hszVar2.X()) {
                        bueVar = new bue(context2, hszVar2, (String) obj23, 18);
                    }
                    a6.a = bueVar;
                    b3 = a6.a();
                } else {
                    b3 = egj.b(new dvc(egjVar3, (String) obj23, 14));
                }
                egpVar2.j(b3);
                return;
            case 18:
                Object obj24 = this.a;
                ?? r22 = this.b;
                ehp ehpVar = ((eie) obj24).g;
                ehpVar.i.a = r22;
                ehpVar.n = cni.a;
                ehpVar.o = cxe.a;
                ehpVar.p = (llp) obj;
                ehpVar.j(eho.SEARCH);
                return;
            case 19:
                Object obj25 = this.a;
                Object obj26 = this.b;
                eie eieVar = (eie) obj25;
                ehp ehpVar2 = eieVar.g;
                if (((Throwable) obj) instanceof IllegalStateException) {
                    Context context3 = eieVar.c;
                    hsz hszVar3 = eieVar.d;
                    cnf a7 = cng.a();
                    a7.c(false);
                    a7.e(1);
                    a7.h(R.layout.f134250_resource_name_obfuscated_res_0x7f0e008a);
                    a7.g(R.drawable.f49160_resource_name_obfuscated_res_0x7f08029c);
                    a7.d(R.string.f167220_resource_name_obfuscated_res_0x7f140932);
                    a7.f(R.string.f167210_resource_name_obfuscated_res_0x7f140931);
                    if (cuz.a.k(context3) && !hszVar3.X()) {
                        bueVar = new bue(context3, hszVar3, (String) obj26, 19);
                    }
                    a7.a = bueVar;
                    a = a7.a();
                } else {
                    a = eie.a(new dvc(eieVar, (String) obj26, 17));
                }
                ehpVar2.k(a);
                return;
            default:
                Object obj27 = this.a;
                Object obj28 = this.b;
                cxe cxeVar = (cxe) obj;
                if (obj28 != null) {
                    eis eisVar = ((eij) obj27).f;
                    llk llkVar = new llk();
                    llkVar.h(efq.b(lfd.d((String) obj28)));
                    llkVar.h(efj.a);
                    llkVar.h(efl.a);
                    if (cxeVar.g.e()) {
                        llkVar.h(efq.a((cxc) cxeVar.g.a()));
                    }
                    llkVar.j(lre.ab(cxeVar.e, ehk.j));
                    llkVar.h(efn.a);
                    cuj a8 = eisVar.v.a();
                    if (a8 != null) {
                        a8.L(llkVar.g());
                        a8.fc();
                    }
                    eisVar.n = cxeVar;
                    eisVar.t.set(true);
                } else {
                    eij eijVar = (eij) obj27;
                    dba dbaVar = eijVar.h;
                    if (dbaVar != null) {
                        int X = lre.X(cxeVar.e, new ein(dbaVar, 1));
                        if (X == -1) {
                            ((ltd) ((ltd) eij.a.d()).k("com/google/android/apps/inputmethod/libs/search/sticker/StickerTabletKeyboardPeer", "lambda$fetchPacksData$3", 250, "StickerTabletKeyboardPeer.java")).w("Can't open to opened sticker pack id %s.", dbaVar.b);
                        } else {
                            i = X + 3;
                            eijVar.f.q(cxeVar, i);
                        }
                    }
                    i = -1;
                    eijVar.f.q(cxeVar, i);
                }
                if (!cxeVar.g.e()) {
                    return;
                }
                eij eijVar2 = (eij) obj27;
                if (!eijVar2.g.e((cxc) cxeVar.g.a())) {
                    return;
                }
                eijVar2.e.b(((cxc) cxeVar.g.a()).b).v(new dvb(eijVar2, cxeVar, 3), mjl.a);
                return;
        }
    }
}
