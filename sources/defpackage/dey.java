package defpackage;

import com.google.android.apps.inputmethod.libs.framework.keyboard.widget.PageableRecentSubCategorySoftKeyListHolderView;

/* compiled from: PG */
/* renamed from: dey  reason: default package */
/* loaded from: classes.dex */
public final class dey implements aky {
    final /* synthetic */ PageableRecentSubCategorySoftKeyListHolderView a;

    public dey(PageableRecentSubCategorySoftKeyListHolderView pageableRecentSubCategorySoftKeyListHolderView) {
        this.a = pageableRecentSubCategorySoftKeyListHolderView;
    }

    @Override // defpackage.aky
    public final void a(int i) {
        long longValue;
        PageableRecentSubCategorySoftKeyListHolderView pageableRecentSubCategorySoftKeyListHolderView = this.a;
        pageableRecentSubCategorySoftKeyListHolderView.u = i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < pageableRecentSubCategorySoftKeyListHolderView.l.size()) {
                int intValue = ((Integer) pageableRecentSubCategorySoftKeyListHolderView.l.get(i2)).intValue();
                if (i >= i3 && i < i3 + intValue) {
                    pageableRecentSubCategorySoftKeyListHolderView.p = i2;
                    longValue = ((Long) pageableRecentSubCategorySoftKeyListHolderView.j.get(i2)).longValue();
                    break;
                }
                i3 += intValue;
                i2++;
            } else {
                longValue = ((Long) pageableRecentSubCategorySoftKeyListHolderView.j.get(0)).longValue();
                break;
            }
        }
        PageableRecentSubCategorySoftKeyListHolderView pageableRecentSubCategorySoftKeyListHolderView2 = this.a;
        if (longValue != pageableRecentSubCategorySoftKeyListHolderView2.n) {
            pageableRecentSubCategorySoftKeyListHolderView2.z(longValue, true);
        }
        PageableRecentSubCategorySoftKeyListHolderView pageableRecentSubCategorySoftKeyListHolderView3 = this.a;
        dfa dfaVar = pageableRecentSubCategorySoftKeyListHolderView3.I;
        if (dfaVar != null) {
            dfaVar.gs(pageableRecentSubCategorySoftKeyListHolderView3, pageableRecentSubCategorySoftKeyListHolderView3.s(i));
        }
    }

    @Override // defpackage.aky
    public final void b(int i, float f) {
        PageableRecentSubCategorySoftKeyListHolderView pageableRecentSubCategorySoftKeyListHolderView = this.a;
        dfa dfaVar = pageableRecentSubCategorySoftKeyListHolderView.I;
        if (dfaVar != null) {
            dfaVar.u(pageableRecentSubCategorySoftKeyListHolderView.s(i), f);
        }
    }
}
