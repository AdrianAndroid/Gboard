package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: avo  reason: default package */
/* loaded from: classes.dex */
public final class avo {
    private static final avk a = new avm();
    private final Map b = new HashMap();

    public final synchronized avl a(Object obj) {
        avk avkVar;
        ce.m(obj);
        avkVar = (avk) this.b.get(obj.getClass());
        if (avkVar == null) {
            Iterator it = this.b.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                avk avkVar2 = (avk) it.next();
                if (avkVar2.b().isAssignableFrom(obj.getClass())) {
                    avkVar = avkVar2;
                    break;
                }
            }
        }
        if (avkVar == null) {
            avkVar = a;
        }
        return avkVar.a(obj);
    }

    public final synchronized void b(avk avkVar) {
        this.b.put(avkVar.b(), avkVar);
    }
}
