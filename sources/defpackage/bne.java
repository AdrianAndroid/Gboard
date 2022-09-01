package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: bne  reason: default package */
/* loaded from: classes.dex */
final class bne implements lgb {
    private final Class a;
    private final Method b;

    public bne(Class cls, Method method) {
        this.a = cls;
        this.b = method;
    }

    @Override // defpackage.lgb
    /* renamed from: b */
    public final String a() {
        StringBuilder sb = new StringBuilder("ThreadChanger: ");
        sb.append(this.a.getSimpleName());
        sb.append(".");
        sb.append(this.b.getName());
        sb.append("(");
        Class<?>[] parameterTypes = this.b.getParameterTypes();
        int length = parameterTypes.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            Class<?> cls = parameterTypes[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls.getSimpleName());
            i++;
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }
}
