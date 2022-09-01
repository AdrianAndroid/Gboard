package defpackage;

import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.List;

/* compiled from: PG */
/* renamed from: dxr  reason: default package */
/* loaded from: classes.dex */
public final class dxr implements dfq {
    private static final int[][] a = {new int[]{97, 98, 99}, new int[]{100, 101, 102}, new int[]{103, 104, 105}, new int[]{106, 107, 108}, new int[]{109, 110, 111}, new int[]{112, 113, 114, 115}, new int[]{116, 117, 118}, new int[]{119, 120, 121, 122}};
    private final ibi b;
    private final long c;

    public dxr(ibi ibiVar, long j) {
        this.b = ibiVar;
        this.c = j;
    }

    @Override // defpackage.dfq
    public final void a(SoftKeyView softKeyView, dfr dfrVar, List list, List list2) {
        iay b = dzg.b(softKeyView, this.c, this.b);
        if (b == null || b.d != iax.DECODE) {
            return;
        }
        Object obj = b.e;
        if (!(obj instanceof String)) {
            return;
        }
        int i = b.c;
        if (i < 9 || i > 16) {
            if (i != 74) {
                return;
            }
            dfrVar.f = ((String) obj).codePointAt(0);
            list.add(dfrVar.a());
            return;
        }
        for (int i2 : a[i - 9]) {
            dfrVar.f = i2;
            list.add(dfrVar.a());
        }
    }
}
