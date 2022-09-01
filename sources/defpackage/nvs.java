package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: nvs  reason: default package */
/* loaded from: classes2.dex */
final class nvs implements nul {
    @Override // defpackage.nul
    public final /* synthetic */ Object a(byte[] bArr) {
        int i;
        int i2;
        byte b;
        List list = nvu.a;
        int length = bArr.length;
        char c = 0;
        if (length == 1) {
            if (bArr[0] == 48) {
                return nvu.b;
            }
            length = 1;
        }
        if (length != 1) {
            if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                i = (b - 48) * 10;
                c = 1;
            }
            return nvu.d.f("Unknown code ".concat(new String(bArr, lel.a)));
        }
        i = 0;
        byte b2 = bArr[c];
        if (b2 >= 48 && b2 <= 57 && (i2 = i + (b2 - 48)) < nvu.a.size()) {
            return (nvu) nvu.a.get(i2);
        }
        return nvu.d.f("Unknown code ".concat(new String(bArr, lel.a)));
    }

    @Override // defpackage.nul
    public final /* bridge */ /* synthetic */ byte[] b(Object obj) {
        return ((nvu) obj).o.s;
    }
}
