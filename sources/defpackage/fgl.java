package defpackage;

/* compiled from: PG */
/* renamed from: fgl  reason: default package */
/* loaded from: classes.dex */
public final class fgl {
    private static final llw a;

    static {
        lls i = llw.i(42);
        b(i, 7, "ㄢ");
        b(i, 8, "ㄅ");
        b(i, 9, "ㄉ");
        b(i, 10, "ˇ");
        b(i, 11, "ˋ");
        b(i, 12, "ㄓ");
        b(i, 13, "ˊ");
        b(i, 14, "˙");
        b(i, 15, "ㄚ");
        b(i, 16, "ㄞ");
        c(i, 29, "ㄇ", "a");
        c(i, 30, "ㄖ", "b");
        c(i, 31, "ㄏ", "c");
        c(i, 32, "ㄎ", "d");
        c(i, 33, "ㄍ", "e");
        c(i, 34, "ㄑ", "f");
        c(i, 35, "ㄕ", "g");
        c(i, 36, "ㄘ", "h");
        c(i, 37, "ㄛ", "i");
        c(i, 38, "ㄨ", "j");
        c(i, 39, "ㄜ", "k");
        c(i, 40, "ㄠ", "l");
        c(i, 41, "ㄩ", "m");
        c(i, 42, "ㄙ", "n");
        c(i, 43, "ㄟ", "o");
        c(i, 44, "ㄣ", "p");
        c(i, 45, "ㄆ", "q");
        c(i, 46, "ㄐ", "r");
        c(i, 47, "ㄋ", "s");
        c(i, 48, "ㄔ", "t");
        c(i, 49, "ㄧ", "u");
        c(i, 50, "ㄒ", "v");
        c(i, 51, "ㄊ", "w");
        c(i, 52, "ㄌ", "x");
        c(i, 53, "ㄗ", "y");
        c(i, 54, "ㄈ", "z");
        b(i, 55, "ㄝ");
        b(i, 56, "ㄡ");
        b(i, 62, "ˉ");
        b(i, 69, "ㄦ");
        b(i, 74, "ㄤ");
        b(i, 76, "ㄥ");
        a = i.l();
    }

    public static iay[] a(int i) {
        return (iay[]) a.get(Integer.valueOf(i));
    }

    private static void b(lls llsVar, int i, String str) {
        llsVar.a(Integer.valueOf(i), new iay[]{new iay(i, iax.DECODE, str)});
    }

    private static void c(lls llsVar, int i, String str, String str2) {
        llsVar.a(Integer.valueOf(i), new iay[]{new iay(i, iax.DECODE, str), new iay(i, iax.DECODE, str2)});
    }
}
