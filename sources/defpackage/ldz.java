package defpackage;

/* compiled from: PG */
/* renamed from: ldz  reason: default package */
/* loaded from: classes.dex */
public enum ldz {
    a { // from class: ldw
    },
    b { // from class: ldx
    },
    LOWER_CAMEL(lek.e('A', 'Z'), ""),
    UPPER_CAMEL(lek.e('A', 'Z'), ""),
    e { // from class: ldy
    };
    
    public final lek f;
    public final String g;

    ldz(lek lekVar, String str) {
        this.f = lekVar;
        this.g = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5 */
    private static String b(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        boolean aa = jdg.aa(charAt);
        char c = charAt;
        if (aa) {
            c = charAt ^ ' ';
        }
        sb.append(c);
        sb.append(jdg.X(str.substring(1)));
        return sb.toString();
    }

    public final String a(String str) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return jdg.X(str);
            }
            if (ordinal == 2) {
                return b(str);
            }
            if (ordinal == 3) {
                return b(str);
            }
            if (ordinal != 4) {
                throw null;
            }
            return jdg.Y(str);
        }
        return jdg.X(str);
    }
}
