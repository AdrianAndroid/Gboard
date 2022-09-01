package defpackage;

/* compiled from: PG */
/* renamed from: ipz  reason: default package */
/* loaded from: classes.dex */
public final class ipz {
    public static final lex a = lex.d(" AND ");
    public static final lex b = lex.d(" OR ");
    public static final ipz c = a().k();
    public final String d;
    public final String[] e;
    public final String f;
    public final String g;
    public final ipx h;

    public ipz(osr osrVar, byte[] bArr) {
        this.d = (String) osrVar.a;
        this.e = (String[]) osrVar.b;
        this.f = (String) osrVar.c;
        this.g = (String) osrVar.d;
        this.h = (ipx) osrVar.e;
    }

    public static osr a() {
        return new osr("", new String[0]);
    }

    public static osr b(String str, String[] strArr) {
        return new osr(str, strArr);
    }

    public static osr c(String str, ipy ipyVar, String... strArr) {
        osr a2 = a();
        a2.p(str, ipyVar, strArr);
        return a2;
    }
}
