package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: lvb  reason: default package */
/* loaded from: classes.dex */
public final class lvb {
    private static final lux a = new luz();
    private static final luw b = new lva();

    public static luy a(Set set) {
        luu luuVar = new luu(a);
        luuVar.f = b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            lty ltyVar = (lty) it.next();
            lxj.b(ltyVar, "key");
            if (ltyVar.b) {
                luw luwVar = luu.b;
                lxj.b(ltyVar, "key");
                lxj.c(ltyVar.b, "key must be repeating");
                luuVar.c.remove(ltyVar);
                luuVar.d.put(ltyVar, luwVar);
            } else {
                lux luxVar = luu.a;
                lxj.b(ltyVar, "key");
                luuVar.d.remove(ltyVar);
                luuVar.c.put(ltyVar, luxVar);
            }
        }
        return new luv(luuVar);
    }
}
