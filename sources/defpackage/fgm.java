package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.List;

/* compiled from: PG */
/* renamed from: fgm  reason: default package */
/* loaded from: classes.dex */
public final class fgm implements dfq {
    private final /* synthetic */ int a;

    public fgm(int i) {
        this.a = i;
    }

    @Override // defpackage.dfq
    public final void a(SoftKeyView softKeyView, dfr dfrVar, List list, List list2) {
        if (this.a == 0) {
            ial c = softKeyView.c(iah.PRESS);
            if (c == null) {
                return;
            }
            dfrVar.f = c.d().c;
            list.add(dfrVar.a());
            return;
        }
        ial c2 = softKeyView.c(iah.PRESS);
        if (c2 == null) {
            return;
        }
        String str = (String) c2.d().e;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        dfrVar.f = str.codePointAt(0);
        list.add(dfrVar.a());
    }
}
