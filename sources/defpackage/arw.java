package defpackage;

import java.io.Closeable;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: arw  reason: default package */
/* loaded from: classes.dex */
public abstract class arw implements Closeable {
    public static final String[] a = new String[128];
    int b;
    int[] c = new int[32];
    String[] d = new String[32];
    int[] e = new int[32];

    static {
        for (int i = 0; i <= 31; i++) {
            a[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static arw d(out outVar) {
        return new arx(outVar);
    }

    public abstract double a();

    public abstract int b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final arv c(String str) {
        String e = e();
        throw new arv(str + " at path " + e);
    }

    public final String e() {
        int i = this.b;
        int[] iArr = this.c;
        String[] strArr = this.d;
        int[] iArr2 = this.e;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract String f();

    public abstract String g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(int i) {
        int i2 = this.b;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i2 == length) {
            if (i2 == 256) {
                throw new aru("Nesting too deep at ".concat(e()));
            }
            this.c = Arrays.copyOf(iArr, length + length);
            String[] strArr = this.d;
            int length2 = strArr.length;
            this.d = (String[]) Arrays.copyOf(strArr, length2 + length2);
            int[] iArr2 = this.e;
            int length3 = iArr2.length;
            this.e = Arrays.copyOf(iArr2, length3 + length3);
        }
        int[] iArr3 = this.c;
        int i3 = this.b;
        this.b = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract void m();

    public abstract void n();

    public abstract boolean o();

    public abstract boolean p();

    public abstract int q();

    public abstract int r(azp azpVar);
}
