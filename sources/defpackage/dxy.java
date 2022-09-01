package defpackage;

import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.List;

/* compiled from: PG */
/* renamed from: dxy  reason: default package */
/* loaded from: classes.dex */
public final class dxy implements dfq {
    private final ibi a;
    private final long b;

    public dxy(ibi ibiVar, long j) {
        this.a = ibiVar;
        this.b = j;
    }

    @Override // defpackage.dfq
    public final void a(SoftKeyView softKeyView, dfr dfrVar, List list, List list2) {
        iay b = dzg.b(softKeyView, this.b, this.a);
        if (b == null || b.d != iax.DECODE) {
            return;
        }
        Object obj = b.e;
        if (!(obj instanceof String)) {
            return;
        }
        dfrVar.f = ((String) obj).codePointAt(0);
        list.add(dfrVar.a());
    }
}
