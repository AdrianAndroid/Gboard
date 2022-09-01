package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: axs  reason: default package */
/* loaded from: classes.dex */
final class axs {
    private final axr a = new axr(null);
    private final Map b = new HashMap();

    private static void d(axr axrVar) {
        axr axrVar2 = axrVar.d;
        axrVar2.c = axrVar.c;
        axrVar.c.d = axrVar2;
    }

    private static void e(axr axrVar) {
        axrVar.c.d = axrVar;
        axrVar.d.c = axrVar;
    }

    public final Object a(axz axzVar) {
        axr axrVar = (axr) this.b.get(axzVar);
        if (axrVar == null) {
            axrVar = new axr(axzVar);
            this.b.put(axzVar, axrVar);
        } else {
            axzVar.a();
        }
        d(axrVar);
        axr axrVar2 = this.a;
        axrVar.d = axrVar2;
        axrVar.c = axrVar2.c;
        e(axrVar);
        return axrVar.b();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [axz, java.lang.Object] */
    public final Object b() {
        for (axr axrVar = this.a.d; !axrVar.equals(this.a); axrVar = axrVar.d) {
            Object b = axrVar.b();
            if (b != null) {
                return b;
            }
            d(axrVar);
            this.b.remove(axrVar.a);
            axrVar.a.a();
        }
        return null;
    }

    public final void c(axz axzVar, Object obj) {
        axr axrVar = (axr) this.b.get(axzVar);
        if (axrVar == null) {
            axrVar = new axr(axzVar);
            d(axrVar);
            axr axrVar2 = this.a;
            axrVar.d = axrVar2.d;
            axrVar.c = axrVar2;
            e(axrVar);
            this.b.put(axzVar, axrVar);
        } else {
            axzVar.a();
        }
        if (axrVar.b == null) {
            axrVar.b = new ArrayList();
        }
        axrVar.b.add(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        axr axrVar = this.a.c;
        boolean z = false;
        while (!axrVar.equals(this.a)) {
            sb.append('{');
            sb.append(axrVar.a);
            sb.append(':');
            sb.append(axrVar.a());
            sb.append("}, ");
            axrVar = axrVar.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
