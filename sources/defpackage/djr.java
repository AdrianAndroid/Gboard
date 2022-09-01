package defpackage;

/* compiled from: PG */
/* renamed from: djr  reason: default package */
/* loaded from: classes.dex */
public final class djr {
    public static final iay[][] a = {new iay[]{new iay(29, iax.DECODE, "a"), new iay(30, iax.DECODE, "b"), new iay(31, iax.DECODE, "c")}, new iay[]{new iay(32, iax.DECODE, "d"), new iay(33, iax.DECODE, "e"), new iay(34, iax.DECODE, "f")}, new iay[]{new iay(35, iax.DECODE, "g"), new iay(36, iax.DECODE, "h"), new iay(37, iax.DECODE, "i")}, new iay[]{new iay(38, iax.DECODE, "j"), new iay(39, iax.DECODE, "k"), new iay(40, iax.DECODE, "l")}, new iay[]{new iay(41, iax.DECODE, "m"), new iay(42, iax.DECODE, "n"), new iay(43, iax.DECODE, "o")}, new iay[]{new iay(44, iax.DECODE, "p"), new iay(45, iax.DECODE, "q"), new iay(46, iax.DECODE, "r"), new iay(47, iax.DECODE, "s")}, new iay[]{new iay(48, iax.DECODE, "t"), new iay(49, iax.DECODE, "u"), new iay(50, iax.DECODE, "v")}, new iay[]{new iay(51, iax.DECODE, "w"), new iay(52, iax.DECODE, "x"), new iay(53, iax.DECODE, "y"), new iay(54, iax.DECODE, "z")}};
    public static final float[][] b;
    private static final float[] c;
    private static final float[] d;

    static {
        new iay(29, iax.DECODE, "A");
        new iay(30, iax.DECODE, "B");
        new iay(31, iax.DECODE, "C");
        new iay(32, iax.DECODE, "D");
        new iay(33, iax.DECODE, "E");
        new iay(34, iax.DECODE, "F");
        new iay(35, iax.DECODE, "G");
        new iay(36, iax.DECODE, "H");
        new iay(37, iax.DECODE, "I");
        new iay(38, iax.DECODE, "J");
        new iay(39, iax.DECODE, "K");
        new iay(40, iax.DECODE, "L");
        new iay(41, iax.DECODE, "M");
        new iay(42, iax.DECODE, "N");
        new iay(43, iax.DECODE, "O");
        new iay(44, iax.DECODE, "P");
        new iay(45, iax.DECODE, "Q");
        new iay(46, iax.DECODE, "R");
        new iay(47, iax.DECODE, "S");
        new iay(48, iax.DECODE, "T");
        new iay(49, iax.DECODE, "U");
        new iay(50, iax.DECODE, "V");
        new iay(51, iax.DECODE, "W");
        new iay(52, iax.DECODE, "X");
        new iay(53, iax.DECODE, "Y");
        new iay(54, iax.DECODE, "Z");
        float[] fArr = {0.0f, 0.0f, 0.0f};
        c = fArr;
        float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.0f};
        d = fArr2;
        b = new float[][]{fArr, fArr, fArr, fArr, fArr, fArr2, fArr, fArr2};
    }

    public static int a(iay iayVar) {
        Object obj = iayVar.e;
        if (!(obj instanceof String) || ((String) obj).length() <= 0) {
            return -1;
        }
        return ((String) iayVar.e).codePointAt(0) - 48;
    }
}
