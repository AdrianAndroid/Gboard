package defpackage;

import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.apps.inputmethod.libs.framework.keyboard.widget.PageableRecentSubCategorySoftKeyListHolderView;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: dfe  reason: default package */
/* loaded from: classes.dex */
public final class dfe implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ dfe(InputConnection inputConnection, int i, CharSequence charSequence, int i2, int i3) {
        this.e = i3;
        this.c = inputConnection;
        this.b = i;
        this.d = charSequence;
        this.a = i2;
    }

    public dfe(PageableRecentSubCategorySoftKeyListHolderView pageableRecentSubCategorySoftKeyListHolderView, int i, der derVar, int i2, int i3) {
        this.e = i3;
        this.d = pageableRecentSubCategorySoftKeyListHolderView;
        this.b = i;
        this.c = derVar;
        this.a = i2;
    }

    public dfe(dfh dfhVar, der derVar, int i, int i2, int i3) {
        this.e = i3;
        this.d = dfhVar;
        this.c = derVar;
        this.a = i;
        this.b = i2;
    }

    public /* synthetic */ dfe(dij dijVar, String str, int i, int i2, int i3) {
        this.e = i3;
        this.c = dijVar;
        this.d = str;
        this.b = i;
        this.a = i2;
    }

    public /* synthetic */ dfe(hmd hmdVar, int i, int i2, CharSequence charSequence, int i3) {
        this.e = i3;
        this.c = hmdVar;
        this.b = i;
        this.a = i2;
        this.d = charSequence;
    }

    public dfe(lax laxVar, lbh lbhVar, int i, int i2, int i3) {
        this.e = i3;
        this.c = laxVar;
        this.d = lbhVar;
        this.a = i;
        this.b = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [der, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [der, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [der, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [der, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        int i = this.e;
        int i2 = 0;
        if (i == 0) {
            ict[] E = ((dfh) this.d).E();
            int d = this.c.d(E, this.a);
            int length = E.length;
            int i3 = this.a + d;
            if (length > i3) {
                ((dfh) this.d).J.append(this.b + 1, i3);
            }
            while (i2 < ((dfh) this.d).x.size()) {
                this.c.i(((dfh) this.d).x.keyAt(i2), (ict) ((dfh) this.d).x.valueAt(i2));
                i2++;
            }
            ((dfh) this.d).w();
        } else if (i == 1) {
            Object obj = this.d;
            int i4 = this.b;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                PageableRecentSubCategorySoftKeyListHolderView pageableRecentSubCategorySoftKeyListHolderView = (PageableRecentSubCategorySoftKeyListHolderView) obj;
                if (i5 < pageableRecentSubCategorySoftKeyListHolderView.l.size()) {
                    int intValue = ((Integer) pageableRecentSubCategorySoftKeyListHolderView.l.get(i5)).intValue();
                    if (i4 >= i6 && i4 < i6 + intValue) {
                        arrayList = (ArrayList) pageableRecentSubCategorySoftKeyListHolderView.i.get(i5);
                        break;
                    } else {
                        i6 += intValue;
                        i5++;
                    }
                } else {
                    arrayList = (ArrayList) pageableRecentSubCategorySoftKeyListHolderView.i.get(0);
                    break;
                }
            }
            this.c.d((ict[]) arrayList.toArray(new ict[arrayList.size()]), this.a);
            while (i2 < ((PageableRecentSubCategorySoftKeyListHolderView) this.d).x.size()) {
                this.c.i(((PageableRecentSubCategorySoftKeyListHolderView) this.d).x.keyAt(i2), (ict) ((PageableRecentSubCategorySoftKeyListHolderView) this.d).x.valueAt(i2));
                i2++;
            }
        } else if (i == 2) {
            Object obj2 = this.c;
            dij dijVar = (dij) obj2;
            dijVar.u((String) this.d, this.b, dijVar.G(this.a));
            dijVar.y();
        } else if (i == 3) {
            Object obj3 = this.c;
            ((hmd) obj3).a.f(this.b, this.a, this.d);
        } else if (i != 4) {
            Object obj4 = this.c;
            Object obj5 = this.d;
            lbh lbhVar = (lbh) obj5;
            lax laxVar = (lax) obj4;
            laxVar.g(new lbh(lbhVar.a, this.a, this.b, lbhVar.c, lbhVar.d, lbhVar.e, lbhVar.f, lbhVar.g, lbhVar.h));
        } else {
            ?? r0 = this.c;
            int i7 = this.b;
            ?? r2 = this.d;
            int i8 = this.a;
            ltg ltgVar = hpr.a;
            hpw.h(r0, new CorrectionInfo(i7, "", r2));
            hpw.i(r0, r2, i8);
        }
    }
}
