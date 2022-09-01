package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* renamed from: nto  reason: default package */
/* loaded from: classes2.dex */
public final class nto {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final lyk b = num.c;

    public static int a(num numVar) {
        return numVar.e;
    }

    public static nuj b(String str, ntn ntnVar) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return nuj.d(str, z, ntnVar);
    }

    public static num c(byte[]... bArr) {
        return new num(bArr.length >> 1, bArr);
    }

    public static num d(int i, Object[] objArr) {
        return new num(i, objArr);
    }

    public static Object[] e(num numVar) {
        Object[] objArr = new Object[numVar.a()];
        for (int i = 0; i < numVar.e; i++) {
            int i2 = i + i;
            objArr[i2] = numVar.g(i);
            int i3 = i2 + 1;
            Object c = numVar.c(i);
            if (c instanceof byte[]) {
                objArr[i3] = c;
            } else {
                nxo nxoVar = (nxo) c;
                throw null;
            }
        }
        return objArr;
    }

    public static byte[][] f(num numVar) {
        byte[][] bArr = new byte[numVar.a()];
        Object[] objArr = numVar.d;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, numVar.a());
        } else {
            for (int i = 0; i < numVar.e; i++) {
                int i2 = i + i;
                bArr[i2] = numVar.g(i);
                bArr[i2 + 1] = numVar.h(i);
            }
        }
        return bArr;
    }
}
