package com.google.android.apps.inputmethod.libs.search.emoji.search;

import android.content.Context;
import android.text.TextUtils;
import android.util.Printer;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.ContentSuggestionExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IEmojiSearchExtension;
import com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.widget.PageableEmojiListHolderView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EmojiSearchResultKeyboard extends AbstractSearchResultKeyboard implements dbo, gzv, ear, hep, heo, dzt {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/emoji/search/EmojiSearchResultKeyboard");
    private final cpu b;
    private final String c;
    private final idk d;
    private eky e;
    private PageableEmojiListHolderView f;
    private hes g;
    private ViewGroup h;
    private cou i;
    private final boolean j;
    private eac k;
    private final dxe l = new dxe();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiSearchResultKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        cpu cpuVar = cqh.a().b;
        this.b = cpuVar;
        this.c = context.getResources().getString(R.string.f153080_resource_name_obfuscated_res_0x7f1402bf);
        this.d = hszVar.hO();
        boolean booleanValue = ((Boolean) iho.a(context).c()).booleanValue();
        this.j = booleanValue;
        if (booleanValue) {
            this.k = new eac(context, hszVar);
        }
    }

    private final void P() {
        hes hesVar = this.g;
        if (hesVar != null) {
            hesVar.close();
            this.g = null;
        }
    }

    @Override // defpackage.heo
    public final void A() {
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard
    protected final dyz H() {
        return new dyx(this.u);
    }

    @Override // defpackage.dzt
    public final void K(dat datVar) {
        eac eacVar = this.k;
        if (eacVar != null) {
            eacVar.g(datVar);
        }
    }

    @Override // defpackage.dzt
    public final void L(eab eabVar) {
        eac eacVar = this.k;
        if (eacVar != null) {
            eacVar.j(eabVar);
        }
    }

    @Override // defpackage.ear
    public final void N(llp llpVar) {
        String[] strArr = (String[]) llpVar.toArray(new String[0]);
        if (strArr.length > 0) {
            ViewGroup viewGroup = this.h;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            PageableEmojiListHolderView pageableEmojiListHolderView = this.f;
            if (pageableEmojiListHolderView != null) {
                pageableEmojiListHolderView.setVisibility(0);
            }
            hes hesVar = this.g;
            if (hesVar == null) {
                return;
            }
            hesVar.c(strArr);
            return;
        }
        PageableEmojiListHolderView pageableEmojiListHolderView2 = this.f;
        if (pageableEmojiListHolderView2 != null) {
            pageableEmojiListHolderView2.setVisibility(8);
        }
        ViewGroup viewGroup2 = this.h;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        cnf a2 = cng.a();
        a2.e(1);
        a2.g(R.drawable.f49120_resource_name_obfuscated_res_0x7f080294);
        a2.f(R.string.f158990_resource_name_obfuscated_res_0x7f14058c);
        a2.a().b(this.u, this.h);
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/search/EmojiSearchResultKeyboard", "displayEmoji", 315, "EmojiSearchResultKeyboard.java")).t("No results found");
    }

    @Override // defpackage.hep
    public final void O(int i) {
        PageableEmojiListHolderView pageableEmojiListHolderView = this.f;
        if (pageableEmojiListHolderView == null || pageableEmojiListHolderView.getVisibility() != 0) {
            return;
        }
        if (i > 0) {
            fx().d(R.string.f149740_resource_name_obfuscated_res_0x7f14013f, Integer.valueOf(i));
        } else {
            fx().d(R.string.f149730_resource_name_obfuscated_res_0x7f14013d, new Object[0]);
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        hfd c;
        ltg ltgVar = a;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/search/EmojiSearchResultKeyboard", "consumeEvent", 369, "EmojiSearchResultKeyboard.java")).w("consumeEvent: %s", hfdVar);
        iay f = hfdVar.f();
        if (f == null) {
            return false;
        }
        int i = f.c;
        if (i == -10041) {
            if (f.e instanceof String) {
                idk idkVar = this.d;
                ctd ctdVar = ctd.CATEGORY_SWITCH;
                Object[] objArr = new Object[1];
                nfh t = mbc.p.t();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mbc mbcVar = (mbc) t.b;
                mbcVar.b = 1;
                mbcVar.a |= 1;
                mbc mbcVar2 = (mbc) t.b;
                mbcVar2.c = 2;
                mbcVar2.a |= 2;
                nfh t2 = mbb.g.t();
                int indexOf = iby.K.indexOf(Long.valueOf(iby.a((String) f.e)));
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mbb mbbVar = (mbb) t2.b;
                mbbVar.a |= 4;
                mbbVar.d = indexOf;
                mbb mbbVar2 = (mbb) t2.b;
                mbbVar2.c = 2;
                mbbVar2.a = 2 | mbbVar2.a;
                mbb mbbVar3 = (mbb) t2.cz();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mbc mbcVar3 = (mbc) t.b;
                mbbVar3.getClass();
                mbcVar3.e = mbbVar3;
                mbcVar3.a |= 8;
                objArr[0] = t.cz();
                idkVar.e(ctdVar, objArr);
                this.v.z(hfd.d(new iay(-10104, null, new icz(ibz.d.l, llw.m("subcategory", f.e, "activation_source", hfl.INTERNAL)))));
            } else {
                ((ltd) ltgVar.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoji/search/EmojiSearchResultKeyboard", "consumeEvent", 402, "EmojiSearchResultKeyboard.java")).w("SWITCH_SUB_CATEGORY received without valid subcategory. Actual data: %s", f.e);
            }
            return true;
        } else if (i != -10071 || !(f.e instanceof String)) {
            return super.c(hfdVar);
        } else {
            iay f2 = hfdVar.f();
            if (f2 == null) {
                c = hfd.c(hfdVar);
            } else {
                c = hfd.c(hfdVar);
                Object obj = f2.e;
                c.b = new iay[]{new iay(-10027, iax.COMMIT, (!(obj instanceof CharSequence) || TextUtils.isEmpty((CharSequence) obj)) ? "" : (CharSequence) f2.e)};
            }
            this.v.z(c);
            return true;
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, java.lang.AutoCloseable
    public final void close() {
        super.close();
        eac eacVar = this.k;
        if (eacVar != null) {
            eacVar.b();
        }
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        boolean z2 = this.C;
        printer.println("isActive = " + z2);
        printer.println("getQuery = ".concat(z ? jbs.b(U()) : U()));
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        super.fA(icfVar);
        if (icfVar.b == ice.HEADER) {
            this.i = null;
            this.e = null;
        } else if (icfVar.b == ice.BODY) {
            P();
            this.f = null;
            this.h = null;
        }
        eac eacVar = this.k;
        if (eacVar != null) {
            eacVar.f(icfVar);
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final String fr() {
        return TextUtils.isEmpty(U()) ? "" : this.u.getString(R.string.f152780_resource_name_obfuscated_res_0x7f1402a1, U());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final String fs() {
        return this.u.getString(R.string.f152760_resource_name_obfuscated_res_0x7f14029f);
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        super.fz(softKeyboardView, icfVar);
        if (icfVar.b == ice.HEADER) {
            int i = icfVar.d;
            if (i == R.layout.f135520_resource_name_obfuscated_res_0x7f0e0114 || i == R.layout.f135530_resource_name_obfuscated_res_0x7f0e0115) {
                this.i = new cou(softKeyboardView, new eaq(this.u, this.v, new drf(this, 8)));
                if (this.j) {
                    boe.i(softKeyboardView, R.string.f152760_resource_name_obfuscated_res_0x7f14029f);
                }
            } else {
                eky ekyVar = (eky) softKeyboardView.findViewById(R.id.f68160_resource_name_obfuscated_res_0x7f0b08c4);
                this.e = ekyVar;
                if (ekyVar != null) {
                    throw null;
                }
            }
        } else if (icfVar.b == ice.BODY) {
            this.f = (PageableEmojiListHolderView) softKeyboardView.findViewById(R.id.f59250_resource_name_obfuscated_res_0x7f0b04dc);
            this.h = (ViewGroup) softKeyboardView.findViewById(R.id.f68170_resource_name_obfuscated_res_0x7f0b08c5);
        }
        eac eacVar = this.k;
        if (eacVar != null) {
            eacVar.e(softKeyboardView, icfVar, null, new eav(this, 1));
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        String str = editorInfo.packageName;
        super.g(editorInfo, obj);
        ino.M(this.u).j("PREF_LAST_ACTIVE_TAB", IEmojiSearchExtension.class.getName());
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        PageableEmojiListHolderView pageableEmojiListHolderView = this.f;
        if (pageableEmojiListHolderView != null) {
            pageableEmojiListHolderView.setVisibility(8);
            PageableEmojiListHolderView pageableEmojiListHolderView2 = this.f;
            hes hesVar = new hes(pageableEmojiListHolderView2, x(pageableEmojiListHolderView2), this, R.style.f192080_resource_name_obfuscated_res_0x7f150217, ((Boolean) cnd.c.c()).booleanValue(), ((Boolean) cnd.d.c()).booleanValue());
            this.g = hesVar;
            hesVar.f = this;
            this.g.d(this.u.getResources().getDimensionPixelSize(R.dimen.f33820_resource_name_obfuscated_res_0x7f070165), this.u.getResources().getDimensionPixelSize(R.dimen.f33800_resource_name_obfuscated_res_0x7f070163));
        }
        String l = dip.l(obj);
        this.o = l;
        cou couVar = this.i;
        if (couVar != null) {
            cpc a2 = cpd.a();
            a2.b = 4;
            couVar.g(a2.a());
            cog.c();
            emv i = cog.i(U(), R.string.f152770_resource_name_obfuscated_res_0x7f1402a0);
            cou couVar2 = this.i;
            if (couVar2 != null) {
                couVar2.k(i.h());
            }
        } else if (this.e != null) {
            throw null;
        }
        llp r = llp.r(U());
        this.l.g(this.u);
        N(this.l.f(r));
        this.l.h();
        this.v.z(hfd.d(new iay(-10105, null, ContentSuggestionExtension.class)));
        hfl g = dip.g(obj, hfl.EXTERNAL);
        if (g != hfl.INTERNAL) {
            idk idkVar = this.d;
            ctd ctdVar = ctd.TAB_OPEN;
            Object[] objArr = new Object[1];
            nfh t = mbc.p.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar = (mbc) t.b;
            mbcVar.b = 1;
            mbcVar.a = 1 | mbcVar.a;
            mbc mbcVar2 = (mbc) t.b;
            mbcVar2.c = 2;
            int i2 = 2 | mbcVar2.a;
            mbcVar2.a = i2;
            l.getClass();
            mbcVar2.a = i2 | 1024;
            mbcVar2.j = l;
            int a3 = cte.a(g);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar3 = (mbc) t.b;
            mbcVar3.d = a3 - 1;
            mbcVar3.a |= 4;
            objArr[0] = t.cz();
            idkVar.e(ctdVar, objArr);
        }
        eac eacVar = this.k;
        if (eacVar != null) {
            eacVar.k(this, editorInfo, false);
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "EmojiSearchResultKeyboard";
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        cou couVar = this.i;
        if (couVar != null) {
            couVar.h();
        }
        P();
        this.v.z(hfd.d(new iay(-10060, null, ContentSuggestionExtension.class)));
        eac eacVar = this.k;
        if (eacVar != null) {
            eacVar.d();
        }
        super.h();
    }

    @Override // defpackage.heo
    public final void l(hei heiVar) {
        this.v.z(hfd.d(new iay(-10071, iax.COMMIT, heiVar.b)));
        String str = heiVar.b;
        boolean z = heiVar.g;
        this.b.c(str);
        idk hO = this.v.hO();
        ctd ctdVar = ctd.EMOJI_OR_TEXT_SHARE;
        Object[] objArr = new Object[2];
        objArr[0] = str;
        nfh t = mbc.p.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar = (mbc) t.b;
        mbcVar.b = 1;
        mbcVar.a |= 1;
        mbc mbcVar2 = (mbc) t.b;
        mbcVar2.c = 2;
        int i = 2 | mbcVar2.a;
        mbcVar2.a = i;
        String U = U();
        mbcVar2.a = i | 1024;
        mbcVar2.j = U;
        nfh t2 = mdl.h.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mdl mdlVar = (mdl) t2.b;
        mdlVar.b = 1;
        int i2 = mdlVar.a | 1;
        mdlVar.a = i2;
        mdlVar.a = i2 | 4;
        mdlVar.d = z;
        mdl mdlVar2 = (mdl) t2.cz();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar3 = (mbc) t.b;
        mdlVar2.getClass();
        mbcVar3.k = mdlVar2;
        mbcVar3.a |= 2048;
        objArr[1] = t.cz();
        hO.e(ctdVar, objArr);
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard
    protected final int m() {
        return R.id.key_pos_non_prime_category_1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final String q() {
        return TextUtils.isEmpty(U()) ? "" : String.format(this.c, U());
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void r(List list, hln hlnVar, boolean z) {
    }

    @Override // defpackage.dbo
    public final hpu t(EditorInfo editorInfo) {
        return null;
    }

    @Override // defpackage.dbo
    public final void u(CharSequence charSequence) {
    }

    @Override // defpackage.dbo
    public final /* synthetic */ void v(CharSequence charSequence) {
    }
}
