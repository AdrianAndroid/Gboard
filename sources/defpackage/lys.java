package defpackage;

import java.io.Closeable;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: lys  reason: default package */
/* loaded from: classes.dex */
final class lys implements lyt {
    private final Method a;

    public lys(Method method) {
        this.a = method;
    }

    @Override // defpackage.lyt
    public final void a(Closeable closeable, Throwable th, Throwable th2) {
        if (th == th2) {
            return;
        }
        try {
            this.a.invoke(th, th2);
        } catch (Throwable unused) {
            lyr.a.a(closeable, th, th2);
        }
    }
}
