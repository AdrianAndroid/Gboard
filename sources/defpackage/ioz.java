package defpackage;

/* compiled from: PG */
/* renamed from: ioz  reason: default package */
/* loaded from: classes.dex */
final class ioz {
    public static final lle a;

    static {
        ioy ioyVar = ioy.INTEGER;
        ioy ioyVar2 = ioy.REAL;
        ioy ioyVar3 = ioy.TEXT;
        ioy ioyVar4 = ioy.BLOB;
        ioy ioyVar5 = ioy.NULL;
        jez.U(ioyVar, "INTEGER");
        jez.U(ioyVar2, "REAL");
        jez.U(ioyVar3, "TEXT");
        jez.U(ioyVar4, "BLOB");
        jez.U(ioyVar5, "NULL");
        a = new lrk(new Object[]{ioyVar, "INTEGER", ioyVar2, "REAL", ioyVar3, "TEXT", ioyVar4, "BLOB", ioyVar5, "NULL"}, 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ioy a(ngf ngfVar) {
        ngf ngfVar2 = ngf.VOID;
        switch (ngfVar.ordinal()) {
            case 1:
            case 2:
            case 5:
            case 8:
                return ioy.INTEGER;
            case 3:
            case 4:
                return ioy.REAL;
            case 6:
                return ioy.TEXT;
            case 7:
                return ioy.BLOB;
            default:
                throw new IllegalArgumentException("Unsupported java type: ".concat(String.valueOf(String.valueOf(ngfVar))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(ioy ioyVar) {
        String str = (String) a.get(ioyVar);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("No matching name for give type: ".concat(ioyVar.toString()));
    }
}
