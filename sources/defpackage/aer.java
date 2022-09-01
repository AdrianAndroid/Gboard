package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* renamed from: aer  reason: default package */
/* loaded from: classes.dex */
public final class aer {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public aer(int i, int i2, long j, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public aer(int i, int i2, byte[] bArr) {
        this(i, i2, -1L, bArr);
    }

    public static aer b(String str) {
        byte[] bytes = (str + (char) 0).getBytes(aet.g);
        return new aer(2, bytes.length, bytes);
    }

    public static aer c(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[aet.e[4]]);
        wrap.order(byteOrder);
        for (int i = 0; i <= 0; i++) {
            wrap.putInt((int) jArr[i]);
        }
        return new aer(4, 1, wrap.array());
    }

    public static aer d(aes aesVar, ByteOrder byteOrder) {
        aes[] aesVarArr = {aesVar};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[aet.e[5]]);
        wrap.order(byteOrder);
        for (int i = 0; i <= 0; i++) {
            aes aesVar2 = aesVarArr[i];
            wrap.putInt((int) aesVar2.a);
            wrap.putInt((int) aesVar2.b);
        }
        return new aer(5, 1, wrap.array());
    }

    public static aer e(int i, ByteOrder byteOrder) {
        int[] iArr = {i};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[aet.e[3]]);
        wrap.order(byteOrder);
        for (int i2 = 0; i2 <= 0; i2++) {
            wrap.putShort((short) iArr[i2]);
        }
        return new aer(3, 1, wrap.array());
    }

    public final int a(ByteOrder byteOrder) {
        Object f = f(byteOrder);
        if (f == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (f instanceof String) {
            return Integer.parseInt((String) f);
        }
        if (f instanceof long[]) {
            long[] jArr = (long[]) f;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        } else if (f instanceof int[]) {
            int[] iArr = (int[]) f;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        } else {
            throw new NumberFormatException("Couldn't find a integer value");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0196: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:167:0x0196 */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0199 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.nio.ByteOrder r11) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aer.f(java.nio.ByteOrder):java.lang.Object");
    }

    public final String g(ByteOrder byteOrder) {
        Object f = f(byteOrder);
        if (f == null) {
            return null;
        }
        if (f instanceof String) {
            return (String) f;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (f instanceof long[]) {
            long[] jArr = (long[]) f;
            while (true) {
                int length = jArr.length;
                if (i >= length) {
                    return sb.toString();
                }
                sb.append(jArr[i]);
                i++;
                if (i != length) {
                    sb.append(",");
                }
            }
        } else if (f instanceof int[]) {
            int[] iArr = (int[]) f;
            while (true) {
                int length2 = iArr.length;
                if (i >= length2) {
                    return sb.toString();
                }
                sb.append(iArr[i]);
                i++;
                if (i != length2) {
                    sb.append(",");
                }
            }
        } else if (f instanceof double[]) {
            double[] dArr = (double[]) f;
            while (true) {
                int length3 = dArr.length;
                if (i >= length3) {
                    return sb.toString();
                }
                sb.append(dArr[i]);
                i++;
                if (i != length3) {
                    sb.append(",");
                }
            }
        } else if (!(f instanceof aes[])) {
            return null;
        } else {
            aes[] aesVarArr = (aes[]) f;
            while (true) {
                int length4 = aesVarArr.length;
                if (i >= length4) {
                    return sb.toString();
                }
                sb.append(aesVarArr[i].a);
                sb.append('/');
                sb.append(aesVarArr[i].b);
                i++;
                if (i != length4) {
                    sb.append(",");
                }
            }
        }
    }

    public final String toString() {
        return "(" + aet.d[this.a] + ", data length:" + this.d.length + ")";
    }
}
