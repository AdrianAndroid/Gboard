package j$.util;

import j$.util.stream.Stream;

/* loaded from: classes3.dex */
public final /* synthetic */ class DesugarArrays {
    public static <T> Stream<T> stream(T[] tArr) {
        return j$.util.stream.E.J(F.m(tArr, 0, tArr.length), false);
    }
}
