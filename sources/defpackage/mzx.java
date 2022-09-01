package defpackage;

/* compiled from: PG */
/* renamed from: mzx  reason: default package */
/* loaded from: classes2.dex */
public final class mzx {
    public static final mzm a = mzw.e(mzw.j("(\\s+)", new omv[0]));
    public static final mzm b = mzw.e(mzw.j("(\\s*)", new omv[0]));

    public static final mzm a(String str) {
        oll.e(str, "token");
        return mzw.e(mzw.j("(" + str + ")(?![a-z0-9_])", omv.IGNORE_CASE));
    }

    public static final mzv b(mzv mzvVar) {
        mzm e = mzw.e(mzw.k("("));
        mzm mzmVar = b;
        return mzw.n(mzw.n(mzw.m(mzw.d(e, mzmVar), mzvVar), mzmVar), mzw.e(mzw.k(")")));
    }

    public static final mzv c(mzv mzvVar, String str, Integer num) {
        oll.e(mzvVar, "<this>");
        mzm mzmVar = b;
        return mzw.l(mzw.i(mzvVar, mzw.g(mzw.m(mzw.d(mzw.d(mzmVar, mzw.e(mzw.k(str))), mzmVar), mzvVar), num != null ? Integer.valueOf(num.intValue() - 1) : null)), kls.i);
    }

    public static final okq d(mzv mzvVar) {
        oll.e(mzvVar, "<this>");
        return new klr(mzvVar, 13);
    }
}
