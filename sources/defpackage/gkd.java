package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: gkd  reason: default package */
/* loaded from: classes.dex */
public final class gkd {
    public final gjd a;
    public final gjl b;

    protected gkd(Context context, gjl gjlVar) {
        Context context2;
        jdg.u(context);
        Context applicationContext = context.getApplicationContext();
        Throwable th = new Throwable();
        gjc gjcVar = new gjc(null);
        gjcVar.a();
        if (applicationContext != null) {
            gjcVar.a = applicationContext;
            gjcVar.c = lfb.g(th);
            gjcVar.a();
            if (gjcVar.e != 1 || (context2 = gjcVar.a) == null) {
                StringBuilder sb = new StringBuilder();
                if (gjcVar.a == null) {
                    sb.append(" context");
                }
                if (gjcVar.e == 0) {
                    sb.append(" googlerOverridesCheckbox");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            this.a = new gjd(context2, gjcVar.b, gjcVar.c, gjcVar.d);
            this.b = gjlVar;
            return;
        }
        throw new NullPointerException("Null context");
    }

    public static gkd a(Context context, gjb gjbVar) {
        return new gkd(context, new gjl(gjbVar));
    }

    public final String toString() {
        return "CollectionBasisLogVerifier{collectionBasisContext=" + this.a + ", basis=" + this.b + "}";
    }
}
