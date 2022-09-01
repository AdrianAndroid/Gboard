package defpackage;

import android.view.View;
import com.google.android.apps.inputmethod.libs.search.emoticon.EmoticonKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.emoticon.EmoticonRecyclerView;
import com.google.android.apps.inputmethod.libs.search.universalmedia.UniversalMediaKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.universalmedia.UniversalMediaKeyboardTablet;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dzw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dzw implements hiu {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ dzw(cmn cmnVar, String str, cnc cncVar, int i) {
        this.d = i;
        this.c = cmnVar;
        this.b = str;
        this.a = cncVar;
    }

    public /* synthetic */ dzw(EmoticonKeyboardM2 emoticonKeyboardM2, EmoticonRecyclerView emoticonRecyclerView, String str, int i) {
        this.d = i;
        this.c = emoticonKeyboardM2;
        this.a = emoticonRecyclerView;
        this.b = str;
    }

    public /* synthetic */ dzw(UniversalMediaKeyboardM2 universalMediaKeyboardM2, cqp cqpVar, String str, int i) {
        this.d = i;
        this.a = universalMediaKeyboardM2;
        this.c = cqpVar;
        this.b = str;
    }

    public /* synthetic */ dzw(UniversalMediaKeyboardTablet universalMediaKeyboardTablet, cqp cqpVar, String str, int i) {
        this.d = i;
        this.a = universalMediaKeyboardTablet;
        this.c = cqpVar;
        this.b = str;
    }

    public /* synthetic */ dzw(dzx dzxVar, hsy hsyVar, dat datVar, int i) {
        this.d = i;
        this.a = dzxVar;
        this.b = hsyVar;
        this.c = datVar;
    }

    public /* synthetic */ dzw(ibz ibzVar, ice iceVar, View view, int i) {
        this.d = i;
        this.a = ibzVar;
        this.b = iceVar;
        this.c = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, hsy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [cnc, java.lang.Object] */
    @Override // defpackage.hiu
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            Object obj2 = this.a;
            ?? r1 = this.b;
            Object obj3 = this.c;
            llp llpVar = (llp) obj;
            if (r1.fq()) {
                if (llpVar.isEmpty()) {
                    dzu.g();
                    return;
                }
                eab a = eab.a((dat) obj3, llpVar, lfb.f(((dzx) obj2).h));
                if (!(r1 instanceof dzt)) {
                    return;
                }
                dzt dztVar = (dzt) r1;
                dztVar.K(a.a);
                dztVar.L(a);
                return;
            }
            ((ltd) ((ltd) dzx.a.b()).k("com/google/android/apps/inputmethod/libs/search/contentsuggestion/ContentSuggestionProvider", "lambda$tryFetchContentAndShowSuggestions$3", 205, "ContentSuggestionProvider.java")).t("Content fetch succeeded but no further process is done because the currentKeyboard is not active anymore");
        } else if (i == 1) {
            Object obj4 = this.c;
            Object obj5 = this.b;
            ?? r4 = this.a;
            llp llpVar2 = (llp) obj;
            cmn cmnVar = (cmn) obj4;
            cmnVar.k++;
            nfh t = maz.k.t();
            long size = llpVar2.size();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            maz mazVar = (maz) t.b;
            int i2 = mazVar.a | 1;
            mazVar.a = i2;
            mazVar.b = size;
            int i3 = cmnVar.k;
            mazVar.a = i2 | 16;
            mazVar.f = i3;
            if (!llpVar2.isEmpty()) {
                String str = ((cmg) llpVar2.get(0)).d;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                maz mazVar2 = (maz) t.b;
                str.getClass();
                mazVar2.a |= 128;
                mazVar2.i = str;
            }
            cmnVar.b.e(cta.EMOJIFY_RESULTS_GENERATED, t.cz());
            cmnVar.i = llpVar2;
            if (cmnVar.i.isEmpty()) {
                cmnVar.j = 0;
                cmnVar.k = 0;
                cmnVar.m.g(R.string.f150950_resource_name_obfuscated_res_0x7f1401d5, new Object[0]);
                return;
            }
            cmnVar.j = llpVar2.size() + 1;
            if (cmnVar.h >= cmnVar.i.size()) {
                ((ltd) ((ltd) cmn.a.d()).k("com/google/android/apps/inputmethod/libs/expression/emojify/impl/EmojifyExtensionImpl", "lambda$emojifyInputText$2", 873, "EmojifyExtensionImpl.java")).u("Wrong nextEmojifiedIndex: %d", cmnVar.h);
                cmnVar.t(true, false, true, true, null);
                return;
            }
            cmnVar.f = (String) obj5;
            cmnVar.d(cmnVar.i, r4);
        } else if (i == 2) {
            ((EmoticonKeyboardM2) this.c).A((EmoticonRecyclerView) this.a, (llp) obj, (String) this.b);
        } else if (i == 3) {
            Object obj6 = this.a;
            Object obj7 = this.c;
            Object obj8 = this.b;
            crc crcVar = (crc) obj;
            UniversalMediaKeyboardM2 universalMediaKeyboardM2 = (UniversalMediaKeyboardM2) obj6;
            universalMediaKeyboardM2.n.o((cqp) obj7);
            idk idkVar = universalMediaKeyboardM2.e;
            ctd ctdVar = ctd.IMAGE_SHARE;
            Object[] objArr = new Object[2];
            nfh t2 = mbc.p.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbc mbcVar = (mbc) t2.b;
            mbcVar.b = 8;
            mbcVar.a |= 1;
            String str2 = (String) obj8;
            int V = UniversalMediaKeyboardM2.V(str2);
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbc mbcVar2 = (mbc) t2.b;
            mbcVar2.c = V - 1;
            mbcVar2.a = 2 | mbcVar2.a;
            mbs b = crcVar.b();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbc mbcVar3 = (mbc) t2.b;
            b.getClass();
            mbcVar3.h = b;
            mbcVar3.a |= 128;
            String d = lfd.d(str2);
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbc mbcVar4 = (mbc) t2.b;
            mbcVar4.a |= 1024;
            mbcVar4.j = d;
            int a2 = cte.a(universalMediaKeyboardM2.h);
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbc mbcVar5 = (mbc) t2.b;
            mbcVar5.d = a2 - 1;
            mbcVar5.a |= 4;
            objArr[0] = t2.cz();
            objArr[1] = crcVar;
            idkVar.e(ctdVar, objArr);
        } else if (i == 4) {
            Object obj9 = this.a;
            Object obj10 = this.c;
            Object obj11 = this.b;
            crc crcVar2 = (crc) obj;
            UniversalMediaKeyboardTablet universalMediaKeyboardTablet = (UniversalMediaKeyboardTablet) obj9;
            universalMediaKeyboardTablet.r.o((cqp) obj10);
            idk idkVar2 = universalMediaKeyboardTablet.e;
            ctd ctdVar2 = ctd.IMAGE_SHARE;
            Object[] objArr2 = new Object[2];
            nfh t3 = mbc.p.t();
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mbc mbcVar6 = (mbc) t3.b;
            mbcVar6.b = 8;
            mbcVar6.a |= 1;
            String str3 = (String) obj11;
            int W = UniversalMediaKeyboardTablet.W(str3);
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mbc mbcVar7 = (mbc) t3.b;
            mbcVar7.c = W - 1;
            mbcVar7.a = 2 | mbcVar7.a;
            mbs b2 = crcVar2.b();
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mbc mbcVar8 = (mbc) t3.b;
            b2.getClass();
            mbcVar8.h = b2;
            mbcVar8.a |= 128;
            String d2 = lfd.d(str3);
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mbc mbcVar9 = (mbc) t3.b;
            mbcVar9.a |= 1024;
            mbcVar9.j = d2;
            int a3 = cte.a(universalMediaKeyboardTablet.h);
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mbc mbcVar10 = (mbc) t3.b;
            mbcVar10.d = a3 - 1;
            mbcVar10.a |= 4;
            objArr2[0] = t3.cz();
            objArr2[1] = crcVar2;
            idkVar2.e(ctdVar2, objArr2);
        } else {
            ((hwu) obj).a((ibz) this.a, (ice) this.b, (View) this.c);
        }
    }
}
