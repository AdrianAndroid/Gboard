package defpackage;

/* compiled from: PG */
/* renamed from: ovt  reason: default package */
/* loaded from: classes2.dex */
public final class ovt {
    public static final byte[] a = oli.i("0123456789abcdef");

    public static final String a(our ourVar, long j) {
        if (j > 0) {
            long j2 = (-1) + j;
            if (ourVar.c(j2) == 13) {
                String o = ourVar.o(j2);
                ourVar.B(2L);
                return o;
            }
        }
        String o2 = ourVar.o(j);
        ourVar.B(1L);
        return o2;
    }

    public static final boolean b(ovk ovkVar, int i, byte[] bArr, int i2) {
        oll.e(ovkVar, "segment");
        oll.e(bArr, "bytes");
        int i3 = ovkVar.c;
        byte[] bArr2 = ovkVar.a;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                ovkVar = ovkVar.f;
                oll.b(ovkVar);
                byte[] bArr3 = ovkVar.a;
                bArr2 = bArr3;
                i = ovkVar.b;
                i3 = ovkVar.c;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c(defpackage.our r17, defpackage.ovc r18) {
        /*
            Method dump skipped, instructions count: 172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ovt.c(our, ovc):int");
    }
}
