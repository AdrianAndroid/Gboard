package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ajd  reason: default package */
/* loaded from: classes.dex */
public final class ajd {
    public static volatile ajd a;
    public static final Object b = new Object();
    final Context e;
    final Set d = new HashSet();
    final Map c = new HashMap();

    public ajd(Context context) {
        this.e = context.getApplicationContext();
    }

    public final void a(Class cls, Set set) {
        if (aju.a()) {
            cls.getSimpleName();
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (!this.c.containsKey(cls)) {
            set.add(cls);
            ajf ajfVar = (ajf) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            List<Class> a2 = ajfVar.a();
            if (!a2.isEmpty()) {
                for (Class cls2 : a2) {
                    if (!this.c.containsKey(cls2)) {
                        a(cls2, set);
                    }
                }
            }
            Object b2 = ajfVar.b();
            set.remove(cls);
            this.c.put(cls, b2);
            return;
        }
        this.c.get(cls);
    }
}
