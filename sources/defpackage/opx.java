package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: opx  reason: default package */
/* loaded from: classes2.dex */
public final class opx {
    private final String[] a;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    public opx(mlu mluVar, byte[] bArr, byte[] bArr2) {
        ?? r1 = mluVar.a;
        this.a = (String[]) r1.toArray(new String[r1.size()]);
    }

    public static void g(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= 31) {
                    if (charAt != '\t') {
                        throw new IllegalArgumentException(oqs.i("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                    }
                    charAt = '\t';
                }
                if (charAt >= 127) {
                    throw new IllegalArgumentException(oqs.i("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException("value for name " + str2 + " == null");
    }

    public final int a() {
        return this.a.length >> 1;
    }

    public final String b(String str) {
        String[] strArr = this.a;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    public final String c(int i) {
        return this.a[i + i];
    }

    public final String d(int i) {
        return this.a[i + i + 1];
    }

    public final List e(String str) {
        int a = a();
        ArrayList arrayList = null;
        for (int i = 0; i < a; i++) {
            if (str.equalsIgnoreCase(c(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(d(i));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof opx) && Arrays.equals(((opx) obj).a, this.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection, java.lang.Object] */
    public final mlu h() {
        mlu mluVar = new mlu((byte[]) null);
        Collections.addAll(mluVar.a, this.a);
        return mluVar;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int a = a();
        for (int i = 0; i < a; i++) {
            sb.append(c(i));
            sb.append(": ");
            sb.append(d(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void f(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= ' ' || charAt >= 127) {
                throw new IllegalArgumentException(oqs.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
            }
        }
    }
}
