package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: luv  reason: default package */
/* loaded from: classes.dex */
public final class luv extends luy {
    private final Map a;
    private final Map b;
    private final luw c;

    public luv(luu luuVar) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        hashMap.putAll(luuVar.c);
        hashMap2.putAll(luuVar.d);
        this.c = luuVar.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.luy
    public final void a(lty ltyVar, Object obj, Object obj2) {
        lux luxVar = (lux) this.a.get(ltyVar);
        if (luxVar == null) {
            ltyVar.e(obj, obj2);
        } else {
            luxVar.a(ltyVar, obj, obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.luy
    public final void b(lty ltyVar, Iterator it, Object obj) {
        luw luwVar = (luw) this.b.get(ltyVar);
        if (luwVar != null) {
            luwVar.a(ltyVar, it, obj);
        } else if (this.c == null || this.a.containsKey(ltyVar)) {
            while (it.hasNext()) {
                a(ltyVar, it.next(), obj);
            }
        } else {
            ltyVar.f(it, obj);
        }
    }
}
