package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: lfa  reason: default package */
/* loaded from: classes.dex */
public final class lfa {
    private final String a;
    private final lez b;
    private lez c;
    private boolean d = false;

    public lfa(String str) {
        lez lezVar = new lez();
        this.b = lezVar;
        this.c = lezVar;
        jdg.u(str);
        this.a = str;
    }

    private final lez i() {
        lez lezVar = new lez();
        this.c.c = lezVar;
        this.c = lezVar;
        return lezVar;
    }

    public final void a(Object obj) {
        i().b = obj;
    }

    public final void b(String str, Object obj) {
        lez i = i();
        i.b = obj;
        jdg.u(str);
        i.a = str;
    }

    public final void c(String str, Object obj) {
        ley leyVar = new ley();
        this.c.c = leyVar;
        this.c = leyVar;
        leyVar.b = obj;
        leyVar.a = str;
    }

    public final void d() {
        this.d = true;
    }

    public final void e(String str, float f) {
        c(str, String.valueOf(f));
    }

    public final void f(String str, int i) {
        c(str, String.valueOf(i));
    }

    public final void g(String str, long j) {
        c(str, String.valueOf(j));
    }

    public final void h(String str, boolean z) {
        c(str, String.valueOf(z));
    }

    public final String toString() {
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        String str = "";
        for (lez lezVar = this.b.c; lezVar != null; lezVar = lezVar.c) {
            Object obj = lezVar.b;
            if ((lezVar instanceof ley) || obj != null || !z) {
                sb.append(str);
                String str2 = lezVar.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
