package defpackage;

/* compiled from: PG */
/* renamed from: gsk  reason: default package */
/* loaded from: classes.dex */
public final class gsk {
    public final idk a;
    public long b;

    public gsk(idk idkVar) {
        this.a = idkVar;
    }

    private static boolean c() {
        hpy b = hqj.b();
        return b != null && !b.g();
    }

    public final void a(String str, boolean z, boolean z2) {
        Object obj;
        idk idkVar = this.a;
        gsl gslVar = gsl.ACCESS_POINT_FEATURE_CLICKED;
        Object[] objArr = new Object[1];
        jqi jqiVar = new jqi();
        if (str != null) {
            jqiVar.e = str;
            jqiVar.a = z;
            jqiVar.b = (byte) 1;
            jqiVar.f().c(z2);
            jqiVar.f().b(c());
            Object obj2 = jqiVar.c;
            if (obj2 != null) {
                jqiVar.d = ((gsn) obj2).a();
            } else if (jqiVar.d == null) {
                jqiVar.d = gso.a().a();
            }
            if (jqiVar.b == 1 && (obj = jqiVar.e) != null) {
                objArr[0] = new gsj((String) obj, jqiVar.a, (gso) jqiVar.d);
                idkVar.e(gslVar, objArr);
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (jqiVar.e == null) {
                sb.append(" featureId");
            }
            if (jqiVar.b == 0) {
                sb.append(" clickedInBar");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        throw new NullPointerException("Null featureId");
    }

    public final void b(boolean z) {
        idk idkVar = this.a;
        gsl gslVar = gsl.OPEN_ACCESS_POINTS;
        gsn a = gso.a();
        a.c(z);
        a.b(c());
        idkVar.e(gslVar, a.a());
    }
}
