package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ajk  reason: default package */
/* loaded from: classes.dex */
public final class ajk {
    public final qo a;
    public final ArrayList b = new ArrayList();

    public ajk(Map map) {
        qo qoVar = new qo();
        this.a = qoVar;
        qoVar.g(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (((Float) entry.getValue()).floatValue() > 0.0f) {
                this.a.put((String) entry.getKey(), Float.valueOf(Math.min(1.0f, ((Float) entry.getValue()).floatValue())));
            }
        }
        this.b.clear();
        this.b.ensureCapacity(this.a.d);
        this.b.addAll(this.a.keySet());
        Collections.sort(this.b, new ezy(this, 1));
    }

    public final String toString() {
        return this.a.toString();
    }
}
