package defpackage;

/* compiled from: PG */
/* renamed from: dmj  reason: default package */
/* loaded from: classes.dex */
public final class dmj {
    private static final llw a;
    private static final llw b;

    static {
        lls i = llw.i(26);
        b(i, 29, "ㅁ");
        b(i, 30, "ㅠ");
        b(i, 31, "ㅊ");
        b(i, 32, "ㅇ");
        b(i, 33, "ㄷ");
        b(i, 34, "ㄹ");
        b(i, 35, "ㅎ");
        b(i, 36, "ㅗ");
        b(i, 37, "ㅑ");
        b(i, 38, "ㅓ");
        b(i, 39, "ㅏ");
        b(i, 40, "ㅣ");
        b(i, 41, "ㅡ");
        b(i, 42, "ㅜ");
        b(i, 43, "ㅐ");
        b(i, 44, "ㅔ");
        b(i, 45, "ㅂ");
        b(i, 46, "ㄱ");
        b(i, 47, "ㄴ");
        b(i, 48, "ㅅ");
        b(i, 49, "ㅕ");
        b(i, 50, "ㅍ");
        b(i, 51, "ㅈ");
        b(i, 52, "ㅌ");
        b(i, 53, "ㅛ");
        b(i, 54, "ㅋ");
        a = i.l();
        lls i2 = llw.i(7);
        b(i2, 45, "ㅃ");
        b(i2, 51, "ㅉ");
        b(i2, 33, "ㄸ");
        b(i2, 46, "ㄲ");
        b(i2, 48, "ㅆ");
        b(i2, 43, "ㅒ");
        b(i2, 44, "ㅖ");
        b = i2.l();
    }

    public static iay a(int i, int i2) {
        iay iayVar = iaz.j(i2) ? (iay) b.get(Integer.valueOf(i)) : null;
        return iayVar == null ? (iay) a.get(Integer.valueOf(i)) : iayVar;
    }

    private static void b(lls llsVar, int i, String str) {
        llsVar.a(Integer.valueOf(i), new iay(i, iax.DECODE, str));
    }
}
