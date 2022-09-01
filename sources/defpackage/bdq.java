package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: bdq  reason: default package */
/* loaded from: classes.dex */
public final class bdq {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public final Set b = new HashSet();
    public boolean c;

    public final boolean a(bep bepVar) {
        boolean z = true;
        if (bepVar == null) {
            return true;
        }
        boolean remove = this.a.remove(bepVar);
        if (!this.b.remove(bepVar) && !remove) {
            z = false;
        }
        if (z) {
            bepVar.c();
        }
        return z;
    }

    public final String toString() {
        String obj = super.toString();
        int size = this.a.size();
        boolean z = this.c;
        return obj + "{numRequests=" + size + ", isPaused=" + z + "}";
    }
}
