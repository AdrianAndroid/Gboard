package defpackage;

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ouu  reason: default package */
/* loaded from: classes2.dex */
public class ouu implements Serializable, Comparable {
    public static final ouu a = new ouu(new byte[0]);
    private static final long serialVersionUID = 1;
    public final byte[] b;
    public transient int c;
    public transient String d;

    public ouu(byte[] bArr) {
        oll.e(bArr, "data");
        this.b = bArr;
    }

    public static final ouu f(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i + i;
                bArr[i] = (byte) ((ovu.a(str.charAt(i2)) << 4) + ovu.a(str.charAt(i2 + 1)));
            }
            return new ouu(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
    }

    public static final ouu h(String str) {
        return oix.g(str);
    }

    public static final ouu i(byte... bArr) {
        oll.e(bArr, "data");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        oll.d(copyOf, "copyOf(this, size)");
        return new ouu(copyOf);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        oll.e(objectInputStream, "<this>");
        if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            int i = 0;
            while (i < readInt) {
                int read = objectInputStream.read(bArr, i, readInt - i);
                if (read == -1) {
                    throw new EOFException();
                }
                i += read;
            }
            ouu ouuVar = new ouu(bArr);
            Field declaredField = ouu.class.getDeclaredField("b");
            declaredField.setAccessible(true);
            declaredField.set(this, ouuVar.b);
            return;
        }
        throw new IllegalArgumentException("byteCount < 0: " + readInt);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.b.length);
        objectOutputStream.write(this.b);
    }

    public byte a(int i) {
        return this.b[i];
    }

    public int b() {
        return this.b.length;
    }

    public final String c() {
        byte[] bArr = this.b;
        byte[] bArr2 = ovs.a;
        oll.e(bArr, "<this>");
        oll.e(bArr2, "map");
        int length = bArr.length;
        byte[] bArr3 = new byte[((length + 2) / 3) * 4];
        int i = length - (length % 3);
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            int i5 = i4 + 1;
            byte b2 = bArr[i4];
            int i6 = i5 + 1;
            byte b3 = bArr[i5];
            int i7 = i3 + 1;
            bArr3[i3] = bArr2[(b & 255) >> 2];
            int i8 = i7 + 1;
            bArr3[i7] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i9 = i8 + 1;
            bArr3[i8] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i3 = i9 + 1;
            bArr3[i9] = bArr2[b3 & 63];
            i2 = i6;
        }
        int length2 = bArr.length - i;
        if (length2 == 1) {
            byte b4 = bArr[i2];
            int i10 = i3 + 1;
            bArr3[i3] = bArr2[(b4 & 255) >> 2];
            int i11 = i10 + 1;
            bArr3[i10] = bArr2[(b4 & 3) << 4];
            bArr3[i11] = 61;
            bArr3[i11 + 1] = 61;
        } else if (length2 == 2) {
            byte b5 = bArr[i2];
            byte b6 = bArr[i2 + 1];
            int i12 = i3 + 1;
            bArr3[i3] = bArr2[(b5 & 255) >> 2];
            int i13 = i12 + 1;
            bArr3[i12] = bArr2[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i13] = bArr2[(b6 & 15) << 2];
            bArr3[i13 + 1] = 61;
        }
        return oli.h(bArr3);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ouu ouuVar = (ouu) obj;
        oll.e(ouuVar, "other");
        int b = b();
        int b2 = ouuVar.b();
        int min = Math.min(b, b2);
        int i = 0;
        while (true) {
            if (i < min) {
                int a2 = a(i) & 255;
                int a3 = ouuVar.a(i) & 255;
                if (a2 == a3) {
                    i++;
                } else if (a2 < a3) {
                    return -1;
                }
            } else if (b == b2) {
                return 0;
            } else {
                if (b < b2) {
                    return -1;
                }
            }
        }
        return 1;
    }

    public String d() {
        byte[] bArr = this.b;
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr[i] = ovu.a[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = ovu.a[b & 15];
        }
        return ols.f(cArr);
    }

    public final String e() {
        String str = this.d;
        if (str == null) {
            String h = oli.h(m());
            this.d = h;
            return h;
        }
        return str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ouu) {
            ouu ouuVar = (ouu) obj;
            int b = ouuVar.b();
            byte[] bArr = this.b;
            int length = bArr.length;
            if (b == length && ouuVar.k(0, bArr, 0, length)) {
                return true;
            }
        }
        return false;
    }

    public final ouu g(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.b, 0, b());
        byte[] digest = messageDigest.digest();
        oll.d(digest, "digestBytes");
        return new ouu(digest);
    }

    public int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.b);
        this.c = hashCode;
        return hashCode;
    }

    public ouu j() {
        int i = 0;
        while (true) {
            byte[] bArr = this.b;
            int length = bArr.length;
            if (i < length) {
                byte b = bArr[i];
                if (b >= 65 && b <= 90) {
                    byte[] copyOf = Arrays.copyOf(bArr, length);
                    oll.d(copyOf, "copyOf(this, size)");
                    copyOf[i] = (byte) (b + 32);
                    for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                        byte b2 = copyOf[i2];
                        if (b2 >= 65 && b2 <= 90) {
                            copyOf[i2] = (byte) (b2 + 32);
                        }
                    }
                    return new ouu(copyOf);
                }
                i++;
            } else {
                return this;
            }
        }
    }

    public boolean k(int i, byte[] bArr, int i2, int i3) {
        oll.e(bArr, "other");
        if (i >= 0) {
            byte[] bArr2 = this.b;
            return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && oli.g(bArr2, i, bArr, i2, i3);
        }
        return false;
    }

    public final boolean l(ouu ouuVar) {
        oll.e(ouuVar, "prefix");
        return o(ouuVar, ouuVar.b());
    }

    public byte[] m() {
        return this.b;
    }

    public byte[] n() {
        byte[] bArr = this.b;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        oll.d(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public boolean o(ouu ouuVar, int i) {
        oll.e(ouuVar, "other");
        return ouuVar.k(0, this.b, 0, i);
    }

    public void p(our ourVar, int i) {
        char[] cArr = ovu.a;
        ourVar.L(this.b, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x00ba, code lost:
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00d8, code lost:
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00db, code lost:
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x009b, code lost:
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x011d, code lost:
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0123, code lost:
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0112, code lost:
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0131, code lost:
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0135, code lost:
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0139, code lost:
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x00e6, code lost:
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x013d, code lost:
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
        r6 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x004f, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0075, code lost:
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x008d, code lost:
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0063, code lost:
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00c4, code lost:
        if (r5 != 64) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouu.toString():java.lang.String");
    }
}
