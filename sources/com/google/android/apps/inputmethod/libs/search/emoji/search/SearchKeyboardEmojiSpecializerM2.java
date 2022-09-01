package com.google.android.apps.inputmethod.libs.search.emoji.search;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Printer;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ImageView;
import com.google.android.apps.inputmethod.libs.expression.extension.IEmojiSearchExtension;
import com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.widget.PageableEmojiListHolderView;
import com.google.android.libraries.inputmethod.widgets.EditTextOnKeyboard;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SearchKeyboardEmojiSpecializerM2 extends EditableKeyboard implements gzv, ear, hep, heo {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/emoji/search/SearchKeyboardEmojiSpecializerM2");
    public String b;
    public mko c;
    private final cpu j;
    private final idk k;
    private List l;
    private PageableEmojiListHolderView m;
    private ImageView n;
    private hes o;
    private elj p;
    private hiz q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchKeyboardEmojiSpecializerM2(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        cpu cpuVar = cqh.a().b;
        this.j = cpuVar;
        this.k = hszVar.hO();
    }

    public static void P(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    private final void T() {
        hes hesVar = this.o;
        if (hesVar != null) {
            hesVar.close();
            this.o = null;
        }
    }

    @Override // defpackage.heo
    public final void A() {
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard
    protected final String H() {
        return "emoji";
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard
    public final void K(String str, mba mbaVar) {
        if (!str.trim().isEmpty()) {
            elj eljVar = this.p;
            if (eljVar != null) {
                eljVar.b(new eer(this, str, mbaVar, 1));
            }
            gmi gmiVar = this.i;
            if (gmiVar == null) {
                return;
            }
            gmiVar.k();
        }
    }

    public final void L(String... strArr) {
        this.v.z(hfd.d(new iay(-10073, null, llp.p(strArr))));
    }

    @Override // defpackage.ear
    public final void N(llp llpVar) {
        hes hesVar;
        PageableEmojiListHolderView pageableEmojiListHolderView;
        String[] strArr = (String[]) llpVar.toArray(new String[0]);
        int length = strArr.length;
        if (length == 0 && fx() != null) {
            fx().d(R.string.f149730_resource_name_obfuscated_res_0x7f14013d, new Object[0]);
        }
        if (length > 0 && (pageableEmojiListHolderView = this.m) != null && pageableEmojiListHolderView.getVisibility() != 0) {
            this.m.setVisibility(0);
            ImageView imageView = this.n;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            elj eljVar = this.p;
            if (eljVar != null) {
                eljVar.c(new ecr(this, 1));
            }
        }
        if (this.m == null || (hesVar = this.o) == null) {
            return;
        }
        hesVar.c(strArr);
    }

    @Override // defpackage.hep
    public final void O(int i) {
        PageableEmojiListHolderView pageableEmojiListHolderView = this.m;
        if (pageableEmojiListHolderView == null || pageableEmojiListHolderView.getVisibility() != 0 || fx() == null) {
            return;
        }
        if (i > 0) {
            fx().d(R.string.f149740_resource_name_obfuscated_res_0x7f14013f, Integer.valueOf(i));
        } else {
            fx().d(R.string.f149730_resource_name_obfuscated_res_0x7f14013d, new Object[0]);
        }
    }

    public final void Q() {
        if (!this.C) {
            return;
        }
        hiz b = this.j.b(100L);
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(new dys(this, 10));
        e2.h(new dys(this, 11));
        b.E(hjg.a(gyc.b, null, afpVar, z, e, e2, e3));
        this.q = b;
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard
    protected final void R(CharSequence charSequence) {
        P(this.f, true != TextUtils.isEmpty(S()) ? 0 : 8);
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.c != null) {
            return;
        }
        this.c = gyc.b.hP(new dvc(this, editable, 9));
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f == null) {
            return false;
        }
        int i = f.c;
        if (i == -10071) {
            Object obj = f.e;
            if (obj instanceof String) {
                if (((String) obj).isEmpty()) {
                    ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/search/emoji/search/SearchKeyboardEmojiSpecializerM2", "consumeEvent", 309, "SearchKeyboardEmojiSpecializerM2.java")).t("COMMIT_TEXT_TO_APP received with empty text; replaced with \"\"");
                }
                return true;
            }
            i = -10071;
        }
        if (i == -10072) {
            this.v.z(hfd.d(new iay(-10073, null, 40)));
            return true;
        } else if (i == -10074) {
            Object obj2 = f.e;
            if (!(obj2 instanceof List)) {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoji/search/SearchKeyboardEmojiSpecializerM2", "consumeEvent", 326, "SearchKeyboardEmojiSpecializerM2.java")).t("EMOJI_SEARCH_SUGGESTIONS received with bad key data.");
                return true;
            }
            List list = (List) obj2;
            this.l = list;
            r(list, null, false);
            return true;
        } else {
            return super.c(hfdVar);
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, java.lang.AutoCloseable
    public final void close() {
        h();
        super.close();
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        boolean z2 = this.C;
        printer.println("isActive = " + z2);
        printer.println("getQuery = ".concat(String.valueOf(z ? jbs.b(S()) : S())));
        List list = this.l;
        Integer valueOf = list != null ? Integer.valueOf(list.size()) : null;
        new StringBuilder("lastKnownEmojiSearchResultCandidates.size = ").append(valueOf);
        printer.println("lastKnownEmojiSearchResultCandidates.size = ".concat(String.valueOf(valueOf)));
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        super.fA(icfVar);
        if (icfVar.b == ice.HEADER) {
            this.p = null;
            T();
            this.m = null;
            this.n = null;
            gmi gmiVar = this.i;
            if (gmiVar != null) {
                gmiVar.j();
            }
            hji.h(this.q);
            this.q = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final String fs() {
        return this.u.getResources().getString(R.string.f153010_resource_name_obfuscated_res_0x7f1402b8);
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        gmi gmiVar;
        super.fz(softKeyboardView, icfVar);
        if (icfVar.b == ice.HEADER) {
            this.m = (PageableEmojiListHolderView) softKeyboardView.findViewById(R.id.f68020_resource_name_obfuscated_res_0x7f0b08b4);
            this.n = (ImageView) softKeyboardView.findViewById(R.id.f52770_resource_name_obfuscated_res_0x7f0b00ce);
            if (this.m != null) {
                this.m = (PageableEmojiListHolderView) softKeyboardView.findViewById(R.id.f68020_resource_name_obfuscated_res_0x7f0b08b4);
                this.p = new elj(this.m, this.u.getResources().getDimensionPixelSize(R.dimen.f33810_resource_name_obfuscated_res_0x7f070164));
            }
            SoftKeyboardView softKeyboardView2 = this.h;
            if (softKeyboardView2 != null && (gmiVar = this.i) != null) {
                gmiVar.i(this.d, softKeyboardView2, new dwx(this, 13));
            }
            EditTextOnKeyboard editTextOnKeyboard = this.e;
            if (editTextOnKeyboard == null) {
                return;
            }
            editTextOnKeyboard.e("disallowEmojiKeyboard");
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        String str = editorInfo.packageName;
        this.t.j("PREF_LAST_ACTIVE_TAB", IEmojiSearchExtension.class.getName());
        super.g(editorInfo, obj);
        PageableEmojiListHolderView pageableEmojiListHolderView = this.m;
        if (pageableEmojiListHolderView != null) {
            pageableEmojiListHolderView.setVisibility(8);
            PageableEmojiListHolderView pageableEmojiListHolderView2 = this.m;
            this.o = new hes(pageableEmojiListHolderView2, x(pageableEmojiListHolderView2), this, R.style.f192050_resource_name_obfuscated_res_0x7f150214, ((Boolean) cnd.a.c()).booleanValue(), ((Boolean) cnd.b.c()).booleanValue());
            ImageView imageView = this.n;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            this.o.f = this;
            this.o.d(this.u.getResources().getDimensionPixelSize(R.dimen.f33820_resource_name_obfuscated_res_0x7f070165), this.u.getResources().getDimensionPixelSize(R.dimen.f33800_resource_name_obfuscated_res_0x7f070163));
        }
        String S = S();
        if (TextUtils.isEmpty(S)) {
            Q();
        } else {
            SoftKeyboardView softKeyboardView = this.h;
            if (softKeyboardView != null) {
                softKeyboardView.post(new dvc(this, S, 10));
            }
        }
        if (this.C) {
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
            mbcVar.b = 1;
            mbcVar.a = 1 | mbcVar.a;
            mbc mbcVar2 = (mbc) t.b;
            mbcVar2.c = 3;
            mbcVar2.a |= 2;
            String S2 = S();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar3 = (mbc) t.b;
            S2.getClass();
            mbcVar3.a |= 1024;
            mbcVar3.j = S2;
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
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "SearchKeyboardEmojiSpecializerM2";
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        elj eljVar = this.p;
        if (eljVar != null) {
            eljVar.a();
        }
        T();
        hji.h(this.c);
        this.c = null;
        super.h();
    }

    @Override // defpackage.heo
    public final void l(hei heiVar) {
        this.v.z(hfd.d(new iay(-10071, iax.COMMIT, heiVar.b)));
        String str = heiVar.b;
        boolean z = heiVar.g;
        this.j.c(str);
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
        mbcVar2.c = 3;
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
        nfh t2 = mdl.h.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mdl mdlVar = (mdl) t2.b;
        mdlVar.b = 1;
        int i = mdlVar.a | 1;
        mdlVar.a = i;
        mdlVar.a = i | 4;
        mdlVar.d = z;
        mdl mdlVar2 = (mdl) t2.cz();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar4 = (mbc) t.b;
        mdlVar2.getClass();
        mbcVar4.k = mdlVar2;
        mbcVar4.a |= 2048;
        objArr[1] = t.cz();
        hO.e(ctdVar, objArr);
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard
    protected final int m() {
        return R.layout.f134020_resource_name_obfuscated_res_0x7f0e0073;
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void r(List list, hln hlnVar, boolean z) {
        String str;
        CharSequence charSequence;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                hln hlnVar2 = (hln) it.next();
                if (hlnVar2.g && (charSequence = hlnVar2.a) != null) {
                    str = charSequence.toString();
                    break;
                }
            }
            this.b = str;
        }
    }
}
