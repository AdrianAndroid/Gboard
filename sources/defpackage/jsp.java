package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: jsp  reason: default package */
/* loaded from: classes.dex */
public abstract class jsp {
    public static jsp e(long j, long j2) {
        return new jrg(j, j2);
    }

    public static String f(int i) {
        char[] cArr = new char[i];
        Arrays.fill(cArr, '-');
        cArr[i - 1] = 'o';
        return new String(cArr);
    }

    public abstract long a();

    public abstract long b();

    public float c() {
        throw null;
    }

    public abstract void d();
}
