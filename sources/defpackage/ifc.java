package defpackage;

import android.os.Debug;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: ifc  reason: default package */
/* loaded from: classes.dex */
public final class ifc implements ife {
    private final Method a = Debug.class.getMethod("countInstancesOfClass", Class.class);

    @Override // defpackage.ife
    public final long a(Class cls) {
        Long l = (Long) this.a.invoke(null, cls);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }
}
