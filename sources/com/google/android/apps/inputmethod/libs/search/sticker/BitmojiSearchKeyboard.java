package com.google.android.apps.inputmethod.libs.search.sticker;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard;
import com.google.android.inputmethod.latin.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BitmojiSearchKeyboard extends SearchKeyboard {
    public BitmojiSearchKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard
    protected final ido A() {
        return ctd.BITMOJI_CANDIDATE_QUERY_SEARCHED;
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard
    protected final String H() {
        return "bitmoji";
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard
    protected final ido L() {
        return ctd.BITMOJI_CANDIDATE_QUERY_SUGGESTED;
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard
    public final void N(hln hlnVar) {
        super.N(hlnVar);
        if (hlnVar.e == hlm.CONTEXTUAL) {
            idk hO = this.v.hO();
            ctd ctdVar = ctd.CLICK;
            Object[] objArr = new Object[1];
            nfh t = mbc.p.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar = (mbc) t.b;
            mbcVar.b = 4;
            mbcVar.a = 1 | mbcVar.a;
            mbc mbcVar2 = (mbc) t.b;
            mbcVar2.c = 8;
            mbcVar2.a |= 2;
            mbc mbcVar3 = (mbc) t.b;
            mbcVar3.f = 12;
            mbcVar3.a |= 32;
            objArr[0] = t.cz();
            hO.e(ctdVar, objArr);
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard
    protected final void P(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((hln) it.next()).e == hlm.CONTEXTUAL) {
                    i++;
                }
            }
            if (i <= 0) {
                return;
            }
            idk hO = this.v.hO();
            ctd ctdVar = ctd.IMPRESSION;
            Object[] objArr = new Object[1];
            nfh t = mbc.p.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar = (mbc) t.b;
            mbcVar.b = 4;
            mbcVar.a |= 1;
            mbc mbcVar2 = (mbc) t.b;
            mbcVar2.c = 8;
            mbcVar2.a |= 2;
            nfh t2 = mbt.e.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbt mbtVar = (mbt) t2.b;
            mbtVar.a = 1 | mbtVar.a;
            mbtVar.b = i;
            mbt mbtVar2 = (mbt) t2.b;
            mbtVar2.c = 13;
            mbtVar2.a |= 2;
            t.dM(t2);
            objArr[0] = t.cz();
            hO.e(ctdVar, objArr);
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard, com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        super.g(editorInfo, obj);
        hfl g = dip.g(obj, hfl.INTERNAL);
        idk hO = this.v.hO();
        ctd ctdVar = ctd.EXTENSION_OPEN;
        Object[] objArr = new Object[1];
        nfh t = mbc.p.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar = (mbc) t.b;
        mbcVar.b = 4;
        mbcVar.a = 1 | mbcVar.a;
        mbc mbcVar2 = (mbc) t.b;
        mbcVar2.c = 8;
        mbcVar2.a |= 2;
        String S = S();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar3 = (mbc) t.b;
        S.getClass();
        mbcVar3.a |= 1024;
        mbcVar3.j = S;
        int a = cte.a(g);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar4 = (mbc) t.b;
        mbcVar4.d = a - 1;
        mbcVar4.a |= 4;
        objArr[0] = t.cz();
        hO.e(ctdVar, objArr);
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard
    public final int l() {
        return 6;
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard
    protected final int m() {
        return R.layout.f134030_resource_name_obfuscated_res_0x7f0e0074;
    }
}
