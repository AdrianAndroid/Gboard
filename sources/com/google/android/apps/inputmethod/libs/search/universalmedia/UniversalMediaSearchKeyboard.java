package com.google.android.apps.inputmethod.libs.search.universalmedia;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UniversalMediaSearchKeyboard extends SearchKeyboard {
    public UniversalMediaSearchKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard
    protected final ido A() {
        return ctd.UNIVERSAL_MEDIA_CANDIDATE_QUERY_SEARCHED;
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard
    protected final String H() {
        return "universalmedia";
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard
    protected final ido L() {
        return ctd.UNIVERSAL_MEDIA_CANDIDATE_QUERY_SUGGESTED;
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard, com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
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
        mbcVar.b = 8;
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
        super.g(editorInfo, obj);
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard
    public final int l() {
        return 3;
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard
    protected final int m() {
        return R.layout.f134030_resource_name_obfuscated_res_0x7f0e0074;
    }
}
