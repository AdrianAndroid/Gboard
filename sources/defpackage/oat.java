package defpackage;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: PG */
/* renamed from: oat  reason: default package */
/* loaded from: classes2.dex */
public abstract class oat {
    public final Set a = Collections.newSetFromMap(new IdentityHashMap());

    protected abstract void a();

    protected abstract void b();

    public final void c(Object obj, boolean z) {
        int size = this.a.size();
        if (z) {
            this.a.add(obj);
            if (size != 0) {
                return;
            }
            a();
        } else if (!this.a.remove(obj) || size != 1) {
        } else {
            b();
        }
    }
}
