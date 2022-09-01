package defpackage;

/* compiled from: PG */
/* renamed from: lui  reason: default package */
/* loaded from: classes.dex */
public enum lui {
    STRING('s', luk.GENERAL, "-#", true),
    BOOLEAN('b', luk.BOOLEAN, "-", true),
    CHAR('c', luk.CHARACTER, "-", true),
    DECIMAL('d', luk.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', luk.INTEGRAL, "-#0(", false),
    HEX('x', luk.INTEGRAL, "-#0(", true),
    FLOAT('f', luk.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', luk.FLOAT, "-#0+ (", true),
    GENERAL('g', luk.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', luk.FLOAT, "-#0+ ", true);
    
    public static final lui[] k = new lui[26];
    public final char l;
    public final luk m;
    public final int n;
    public final String o;

    static {
        lui[] values;
        for (lui luiVar : values()) {
            k[a(luiVar.l)] = luiVar;
        }
    }

    lui(char c, luk lukVar, String str, boolean z) {
        this.l = c;
        this.m = lukVar;
        this.n = luj.a(str, z);
        this.o = "%" + c;
    }

    public static int a(char c) {
        return (c | ' ') - 97;
    }
}
