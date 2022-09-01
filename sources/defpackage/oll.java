package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: oll  reason: default package */
/* loaded from: classes2.dex */
public final class oll {
    public static String a(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(obj);
        return str.concat(String.valueOf(obj));
    }

    public static void b(Object obj) {
        if (obj == null) {
            f();
        }
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        i(nullPointerException);
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        i(nullPointerException);
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            s(str);
        }
    }

    public static void f() {
        NullPointerException nullPointerException = new NullPointerException();
        i(nullPointerException);
        throw nullPointerException;
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void h(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (true == str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static void i(Throwable th) {
        h(th, oll.class.getName());
    }

    public static final String j(olj oljVar) {
        String obj = oljVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public static final boolean k(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final void l() {
        olw olwVar = new olw(2, 36);
        if (olwVar.a > 16 || olwVar.b < 16) {
            StringBuilder sb = new StringBuilder("radix 16 was not in valid range ");
            olw olwVar2 = new olw(2, 36);
            sb.append(olwVar2);
            throw new IllegalArgumentException("radix 16 was not in valid range ".concat(olwVar2.toString()));
        }
    }

    public static boolean m(char c, char c2) {
        return c == c2;
    }

    public static final omi n(oku okuVar) {
        return new oml(okuVar, 0);
    }

    public static List o(omi omiVar) {
        ArrayList arrayList = new ArrayList();
        Iterator a = omiVar.a();
        while (a.hasNext()) {
            arrayList.add(a.next());
        }
        return nxp.q(arrayList);
    }

    public static omi p(omi omiVar, okq okqVar) {
        return new omh(omiVar, okqVar, 2);
    }

    public static boolean q(String str, byte[] bArr, int i, int i2) {
        try {
            byte[] bytes = str.getBytes("US-ASCII");
            int length = bytes.length;
            int i3 = length < i2 ? length : i2;
            for (int i4 = 0; i4 < i3; i4++) {
                if (bytes[i4] != bArr[i + i4]) {
                    return false;
                }
            }
            return length == i2;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static oll r(byte[] bArr, int i) {
        long b = ovy.b(bArr, i, 12);
        if (ovy.b(bArr, i + 12, 12) > 0 || b > 0) {
            return new oll();
        }
        return null;
    }

    private static void s(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str);
        i(nullPointerException);
        throw nullPointerException;
    }
}
