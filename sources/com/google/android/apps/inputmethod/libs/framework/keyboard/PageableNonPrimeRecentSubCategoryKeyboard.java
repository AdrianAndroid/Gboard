package com.google.android.apps.inputmethod.libs.framework.keyboard;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.framework.keyboard.widget.PageableRecentSubCategorySoftKeyListHolderView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PageableNonPrimeRecentSubCategoryKeyboard extends PageableNonPrimeSubCategoryKeyboard implements huj {
    private static final lug c = hin.a;
    private volatile boolean d = false;

    public PageableNonPrimeRecentSubCategoryKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
    }

    private static boolean H(ial ialVar) {
        iay[] iayVarArr;
        for (iay iayVar : ialVar.d) {
            if (iayVar != null) {
                Object obj = iayVar.e;
                if ((obj instanceof CharSequence) && jbs.n(obj.toString())) {
                    return true;
                }
            }
        }
        return false;
    }

    final void A(hui[] huiVarArr) {
        ial[] ialVarArr;
        PageableRecentSubCategorySoftKeyListHolderView pageableRecentSubCategorySoftKeyListHolderView = this.a;
        if (pageableRecentSubCategorySoftKeyListHolderView == null) {
            ((luc) c.a(hip.a).k("com/google/android/apps/inputmethod/libs/framework/keyboard/PageableNonPrimeRecentSubCategoryKeyboard", "updateKeyHistory", 73, "PageableNonPrimeRecentSubCategoryKeyboard.java")).t("Pageable holder should NOT be null.");
            return;
        }
        if (!ham.X(this.D)) {
            int i = 0;
            for (hui huiVar : huiVarArr) {
                for (ial ialVar : huiVar.b) {
                    if (H(ialVar)) {
                        i++;
                    }
                }
            }
            if (i != 0) {
                hui[] huiVarArr2 = new hui[huiVarArr.length - i];
                int i2 = 0;
                for (hui huiVar2 : huiVarArr) {
                    ial[] ialVarArr2 = huiVar2.b;
                    int length = ialVarArr2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            if (H(ialVarArr2[i3])) {
                                break;
                            }
                            i3++;
                        } else {
                            huiVarArr2[i2] = huiVar2;
                            i2++;
                            break;
                        }
                    }
                }
                huiVarArr = huiVarArr2;
            }
        }
        int a = pageableRecentSubCategorySoftKeyListHolderView.a();
        int length2 = huiVarArr.length;
        if (length2 <= a) {
            a = length2;
        }
        ArrayList arrayList = new ArrayList(a);
        ico icoVar = new ico();
        iaj iajVar = new iaj();
        for (int i4 = 0; i4 < a; i4++) {
            hui huiVar3 = huiVarArr[i4];
            ibm ibmVar = this.w;
            int i5 = ibmVar.m;
            int i6 = ibmVar.n;
            icoVar.v();
            icoVar.n = i5;
            for (ial ialVar2 : huiVar3.b) {
                if (ialVar2.c != null) {
                    ialVar2.g(iajVar);
                    iah iahVar = iah.PRESS;
                    ibl iblVar = ibl.NONE;
                    int ordinal = ialVar2.c.ordinal();
                    if (ordinal == 0) {
                        icoVar.t((CharSequence) ialVar2.d().e);
                    } else if (ordinal == 1) {
                        iajVar.h = i6;
                    }
                    ial b = iajVar.b();
                    if (b != null) {
                        icoVar.u(b);
                    }
                }
            }
            arrayList.add(icoVar.c());
        }
        ict[] ictVarArr = (ict[]) arrayList.toArray(new ict[arrayList.size()]);
        if (pageableRecentSubCategorySoftKeyListHolderView.q != ictVarArr) {
            pageableRecentSubCategorySoftKeyListHolderView.q = ictVarArr;
        }
        pageableRecentSubCategorySoftKeyListHolderView.B();
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.keyboard.PageableNonPrimeSubCategoryKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        ibm ibmVar;
        super.fz(softKeyboardView, icfVar);
        if (icfVar.b != ice.BODY || !this.C || (ibmVar = this.w) == null || ibmVar.k == ibl.NONE || this.E == null) {
            return;
        }
        this.d = false;
        A(this.E.i());
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.keyboard.PageableNonPrimeSubCategoryKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        huk hukVar;
        super.g(editorInfo, obj);
        if (this.w == null || (hukVar = this.E) == null) {
            return;
        }
        hukVar.g(this);
        if (this.b == iby.p) {
            A(this.E.i());
        } else {
            this.d = true;
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        super.h();
        huk hukVar = this.E;
        if (hukVar != null) {
            hukVar.h(this);
        }
    }

    @Override // defpackage.huj
    public final void w() {
        this.d = true;
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.keyboard.PageableNonPrimeSubCategoryKeyboard, defpackage.dez
    public final void x(long j, boolean z) {
        if (this.d && j == iby.p && this.E != null) {
            this.d = false;
            A(this.E.i());
        }
        super.x(j, z);
    }
}
