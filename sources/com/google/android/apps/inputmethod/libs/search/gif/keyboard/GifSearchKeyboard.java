package com.google.android.apps.inputmethod.libs.search.gif.keyboard;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard;
import com.google.android.apps.inputmethod.libs.search.widget.SuggestionListRecyclerView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GifSearchKeyboard extends SearchKeyboard {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/gif/keyboard/GifSearchKeyboard");
    private final iqi j = iqi.m(cyj.s, 3);
    private final idk k;
    private mko l;
    private AppCompatTextView m;
    private SuggestionListRecyclerView n;
    private final dxs o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GifSearchKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        dxs u = dxs.u();
        ieh j = ieh.j();
        this.o = u;
        this.k = j;
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard
    protected final ido A() {
        return ctd.GIF_CANDIDATE_QUERY_SEARCHED;
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard
    protected final String H() {
        return "gif";
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard
    protected final ido L() {
        return ctd.GIF_CANDIDATE_QUERY_SUGGESTED;
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard
    public final void N(hln hlnVar) {
        super.N(hlnVar);
        if (hlnVar.e == hlm.CONTEXTUAL) {
            idk idkVar = this.k;
            ctd ctdVar = ctd.IMPRESSION;
            Object[] objArr = new Object[1];
            nfh t = mbc.p.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar = (mbc) t.b;
            mbcVar.b = 2;
            mbcVar.a = 1 | mbcVar.a;
            mbc mbcVar2 = (mbc) t.b;
            mbcVar2.c = 8;
            mbcVar2.a |= 2;
            mbc mbcVar3 = (mbc) t.b;
            mbcVar3.f = 11;
            mbcVar3.a |= 32;
            objArr[0] = t.cz();
            idkVar.e(ctdVar, objArr);
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard
    public final void O(hln hlnVar) {
        super.O(hlnVar);
        if (hlnVar.e == hlm.CONTEXTUAL) {
            idk idkVar = this.k;
            ctd ctdVar = ctd.IMPRESSION;
            Object[] objArr = new Object[1];
            nfh t = mbc.p.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar = (mbc) t.b;
            mbcVar.b = 2;
            mbcVar.a = 1 | mbcVar.a;
            mbc mbcVar2 = (mbc) t.b;
            mbcVar2.c = 8;
            mbcVar2.a |= 2;
            nfh t2 = mbt.e.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbt mbtVar = (mbt) t2.b;
            mbtVar.c = 11;
            mbtVar.a = 2 | mbtVar.a;
            t.dM(t2);
            objArr[0] = t.cz();
            idkVar.e(ctdVar, objArr);
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
            idk idkVar = this.k;
            ctd ctdVar = ctd.IMPRESSION;
            Object[] objArr = new Object[1];
            nfh t = mbc.p.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar = (mbc) t.b;
            mbcVar.b = 2;
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
            idkVar.e(ctdVar, objArr);
        }
    }

    public final void Q(List list) {
        if (this.m == null) {
            return;
        }
        boolean isEmpty = list.isEmpty();
        boolean z = !isEmpty;
        this.m.setVisibility(true != isEmpty ? 0 : 8);
        SuggestionListRecyclerView suggestionListRecyclerView = this.n;
        if (suggestionListRecyclerView == null) {
            return;
        }
        elk elkVar = suggestionListRecyclerView.T;
        if (elkVar != null) {
            elkVar.d = llp.o(list);
            elkVar.fc();
        }
        suggestionListRecyclerView.Y(0);
        if (!list.isEmpty()) {
            suggestionListRecyclerView.setVisibility(0);
        } else {
            suggestionListRecyclerView.setVisibility(8);
        }
        if (!z) {
            return;
        }
        gyc.b.execute(new eas(this, 19));
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, java.lang.AutoCloseable
    public final void close() {
        this.j.close();
        super.close();
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard, com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        super.fA(icfVar);
        if (icfVar.b == ice.HEADER) {
            this.m = null;
            this.n = null;
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard, com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        super.fz(softKeyboardView, icfVar);
        if (icfVar.b == ice.HEADER) {
            this.m = (AppCompatTextView) softKeyboardView.findViewById(R.id.f129470_resource_name_obfuscated_res_0x7f0b2164);
            SuggestionListRecyclerView suggestionListRecyclerView = (SuggestionListRecyclerView) softKeyboardView.findViewById(R.id.f129460_resource_name_obfuscated_res_0x7f0b2163);
            this.n = suggestionListRecyclerView;
            if (suggestionListRecyclerView == null) {
                return;
            }
            opu opuVar = new opu(this);
            elk elkVar = suggestionListRecyclerView.T;
            if (elkVar == null) {
                return;
            }
            elkVar.e = opuVar;
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard, com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        String str;
        int i;
        hfl g = dip.g(obj, hfl.INTERNAL);
        idk idkVar = this.k;
        ctd ctdVar = ctd.EXTENSION_OPEN;
        Object[] objArr = new Object[1];
        nfh t = mbc.p.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar = (mbc) t.b;
        mbcVar.b = 2;
        mbcVar.a |= 1;
        mbc mbcVar2 = (mbc) t.b;
        mbcVar2.c = 8;
        mbcVar2.a = 2 | mbcVar2.a;
        String S = S();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar3 = (mbc) t.b;
        S.getClass();
        mbcVar3.a |= 1024;
        mbcVar3.j = S;
        int a2 = cte.a(g);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar4 = (mbc) t.b;
        mbcVar4.d = a2 - 1;
        mbcVar4.a |= 4;
        objArr[0] = t.cz();
        idkVar.e(ctdVar, objArr);
        super.g(editorInfo, obj);
        hji.h(this.l);
        this.l = null;
        if (!this.C || jam.r(this.u) || !this.j.l() || this.t.aj(R.string.f160920_resource_name_obfuscated_res_0x7f14067c)) {
            return;
        }
        dxs dxsVar = this.o;
        czh f = czi.f();
        if (f.d != 1 || (str = f.a) == null || (i = f.e) == 0) {
            StringBuilder sb = new StringBuilder();
            if (f.a == null) {
                sb.append(" baseUrl");
            }
            if (f.d == 0) {
                sb.append(" cacheExpirationTimeInSeconds");
            }
            if (f.e == 0) {
                sb.append(" priority");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        hiz k = hiz.k(dxsVar.j(new czi(str, f.b, f.c, i)));
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(new dys(this, 18));
        e2.h(new dys(this, 19));
        k.E(hjg.a(gyc.b, this, afpVar, z, e, e2, e3));
        this.l = k;
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard, com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        hji.h(this.l);
        this.l = null;
        Q(llp.q());
        super.h();
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard
    public final int l() {
        return 2;
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard
    protected final int m() {
        return R.layout.f134030_resource_name_obfuscated_res_0x7f0e0074;
    }
}
