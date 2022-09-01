package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
@Deprecated
/* renamed from: afk  reason: default package */
/* loaded from: classes.dex */
public final class afk {
    public final int a;
    public final Method b;

    public afk(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afk)) {
            return false;
        }
        afk afkVar = (afk) obj;
        return this.a == afkVar.a && this.b.getName().equals(afkVar.b.getName());
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.getName().hashCode();
    }
}
