package defpackage;

/* compiled from: PG */
/* renamed from: lxt  reason: default package */
/* loaded from: classes.dex */
public abstract class lxt {
    private static final char[] a = "0123456789abcdef".toCharArray();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static lxt g(byte[] bArr) {
        return new lxr(bArr);
    }

    public static lxt h(int i) {
        return new lxs(i);
    }

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract boolean d(lxt lxtVar);

    public abstract byte[] e();

    public final boolean equals(Object obj) {
        if (obj instanceof lxt) {
            lxt lxtVar = (lxt) obj;
            if (b() == lxtVar.b() && d(lxtVar)) {
                return true;
            }
        }
        return false;
    }

    public byte[] f() {
        return e();
    }

    public final int hashCode() {
        if (b() >= 32) {
            return a();
        }
        byte[] f = f();
        int i = f[0] & 255;
        for (int i2 = 1; i2 < f.length; i2++) {
            i |= (f[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] f = f();
        int length = f.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : f) {
            char[] cArr = a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
