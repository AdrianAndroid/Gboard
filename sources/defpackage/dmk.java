package defpackage;

import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.List;

/* compiled from: PG */
/* renamed from: dmk  reason: default package */
/* loaded from: classes.dex */
public final class dmk implements dfq {
    private static final iah[] a = {iah.PRESS, iah.DOUBLE_TAP, iah.LONG_PRESS};

    @Override // defpackage.dfq
    public final void a(SoftKeyView softKeyView, dfr dfrVar, List list, List list2) {
        iay[] iayVarArr;
        Object obj;
        ict ictVar = softKeyView.b;
        if (ictVar == null || ictVar.m == null) {
            return;
        }
        iah[] iahVarArr = a;
        int length = iahVarArr.length;
        for (int i = 0; i < 3; i++) {
            ial c = softKeyView.c(iahVarArr[i]);
            if (c != null) {
                for (iay iayVar : c.d) {
                    if (iayVar != null && (obj = iayVar.e) != null && (obj instanceof String)) {
                        String str = (String) obj;
                        if (dzg.j(str.charAt(0))) {
                            dfrVar.f = str.charAt(0);
                            dfrVar.h = c.c != a[0];
                            list.add(dfrVar.a());
                        }
                    }
                }
            }
        }
    }
}
