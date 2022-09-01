package com.google.android.apps.inputmethod.libs.framework.keyboard;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.framework.keyboard.widget.PageableRecentSubCategorySoftKeyListHolderView;
import com.google.android.apps.inputmethod.libs.framework.keyboard.widget.SliderPagingIndicatorView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PageableNonPrimeSubCategoryKeyboard extends PageableKeyboard implements dfa, dez {
    private static final lug c = hin.a;
    public PageableRecentSubCategorySoftKeyListHolderView a;
    public long b;
    private final hxk d;
    private final Set e = new HashSet();
    private SliderPagingIndicatorView f;
    private String g;

    public PageableNonPrimeSubCategoryKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        this.d = hxk.a(context);
    }

    private final String A() {
        String str;
        PageableRecentSubCategorySoftKeyListHolderView pageableRecentSubCategorySoftKeyListHolderView = this.a;
        String str2 = "";
        if (pageableRecentSubCategorySoftKeyListHolderView != null) {
            long j = this.B & iby.o;
            try {
                str = pageableRecentSubCategorySoftKeyListHolderView.y.getString(R.string.f176950_resource_name_obfuscated_res_0x7f140d10, Integer.toString((j == pageableRecentSubCategorySoftKeyListHolderView.n ? pageableRecentSubCategorySoftKeyListHolderView.s(pageableRecentSubCategorySoftKeyListHolderView.u) : 0) + 1));
            } catch (RuntimeException unused) {
                str = str2;
            }
            Object[] objArr = new Object[2];
            int indexOf = pageableRecentSubCategorySoftKeyListHolderView.j.indexOf(Long.valueOf(j));
            if (indexOf >= 0 && indexOf < pageableRecentSubCategorySoftKeyListHolderView.k.size()) {
                str2 = (String) pageableRecentSubCategorySoftKeyListHolderView.k.get(indexOf);
            }
            objArr[0] = str2;
            objArr[1] = str;
            return String.format("%s. %s", objArr);
        }
        return str2;
    }

    private final void H() {
        PageableRecentSubCategorySoftKeyListHolderView pageableRecentSubCategorySoftKeyListHolderView = this.a;
        if (pageableRecentSubCategorySoftKeyListHolderView != null) {
            pageableRecentSubCategorySoftKeyListHolderView.C(this.B & iby.o, 0);
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.keyboard.PageableKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        if (hfdVar.a == iah.UP) {
            return super.c(hfdVar);
        }
        iay f = hfdVar.f();
        if (f == null) {
            return false;
        }
        if (f.c != -10041 || this.a == null) {
            return super.c(hfdVar);
        }
        this.a.C(iby.a((String) hfdVar.b[0].e), -1);
        return true;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        if (icfVar.b == ice.BODY) {
            this.a = null;
            this.f = null;
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final boolean ft(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f != null) {
            return !htg.b(this) || f.c == 66;
        }
        return false;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        if (icfVar.b == ice.BODY) {
            PageableRecentSubCategorySoftKeyListHolderView pageableRecentSubCategorySoftKeyListHolderView = (PageableRecentSubCategorySoftKeyListHolderView) softKeyboardView.findViewById(R.id.f67030_resource_name_obfuscated_res_0x7f0b0830);
            this.a = pageableRecentSubCategorySoftKeyListHolderView;
            if (this.C) {
                H();
            }
            pageableRecentSubCategorySoftKeyListHolderView.o = this;
            dez dezVar = pageableRecentSubCategorySoftKeyListHolderView.o;
            if (dezVar != null) {
                dezVar.x(pageableRecentSubCategorySoftKeyListHolderView.n, false);
            }
            this.f = (SliderPagingIndicatorView) softKeyboardView.findViewById(R.id.f67000_resource_name_obfuscated_res_0x7f0b082d);
            pageableRecentSubCategorySoftKeyListHolderView.b(this);
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public void g(EditorInfo editorInfo, Object obj) {
        super.g(editorInfo, obj);
        H();
        this.e.clear();
        PageableRecentSubCategorySoftKeyListHolderView pageableRecentSubCategorySoftKeyListHolderView = this.a;
        if (pageableRecentSubCategorySoftKeyListHolderView != null) {
            for (int i = 0; i < pageableRecentSubCategorySoftKeyListHolderView.i.size(); i++) {
                if (!pageableRecentSubCategorySoftKeyListHolderView.D(i)) {
                    this.e.add(Long.valueOf(((Long) pageableRecentSubCategorySoftKeyListHolderView.j.get(i)).longValue()));
                }
            }
        } else {
            ((luc) c.a(hip.a).k("com/google/android/apps/inputmethod/libs/framework/keyboard/PageableNonPrimeSubCategoryKeyboard", "onActivate", 78, "PageableNonPrimeSubCategoryKeyboard.java")).t("mPageableView should NOT be null.");
        }
        for (ice iceVar : ice.values()) {
            htu ah = ah(iceVar, true);
            Set set = this.e;
            if (ah != null) {
                ibi ibiVar = ah.a.h;
                ibd a = ibi.a();
                for (int i2 = 0; i2 < ibiVar.b.size(); i2++) {
                    if (set.contains(Long.valueOf(((icy) ibiVar.b.valueAt(i2)).c))) {
                        a.e(ibiVar.b.keyAt(i2), ict.b, 0);
                    }
                }
                ah.h(a.a());
            }
        }
    }

    @Override // defpackage.det
    public final void gs(deu deuVar, int i) {
        SliderPagingIndicatorView sliderPagingIndicatorView = this.f;
        if (sliderPagingIndicatorView != null) {
            sliderPagingIndicatorView.c(i, 0.0f);
        }
        if (this.C && fx().m()) {
            String A = A();
            if (!A.equals(this.g)) {
                this.g = A;
                fx().c(A());
            }
        }
        l(deuVar);
    }

    @Override // defpackage.dfa
    public final void gt(int i) {
        SliderPagingIndicatorView sliderPagingIndicatorView = this.f;
        if (sliderPagingIndicatorView != null) {
            sliderPagingIndicatorView.b(i);
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.keyboard.PageableKeyboard
    protected final boolean m() {
        PageableRecentSubCategorySoftKeyListHolderView pageableRecentSubCategorySoftKeyListHolderView = this.a;
        if (pageableRecentSubCategorySoftKeyListHolderView != null) {
            pageableRecentSubCategorySoftKeyListHolderView.J();
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.keyboard.PageableKeyboard
    protected final boolean o() {
        PageableRecentSubCategorySoftKeyListHolderView pageableRecentSubCategorySoftKeyListHolderView = this.a;
        if (pageableRecentSubCategorySoftKeyListHolderView != null) {
            pageableRecentSubCategorySoftKeyListHolderView.K();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final String q() {
        this.g = A();
        return String.format("%s. %s", super.q(), this.g);
    }

    @Override // defpackage.dfa
    public final void u(int i, float f) {
        SliderPagingIndicatorView sliderPagingIndicatorView = this.f;
        if (sliderPagingIndicatorView != null) {
            sliderPagingIndicatorView.c(i, f);
        }
    }

    public void x(long j, boolean z) {
        if (!this.C || this.b == j) {
            return;
        }
        if (z) {
            this.d.c(this.a, null);
        }
        this.b = j;
        fp(iby.o, false);
        fp(j, true);
    }
}
