package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* renamed from: pal  reason: default package */
/* loaded from: classes2.dex */
public final class pal extends RuntimeException {
    private static final long serialVersionUID = -569558213262703934L;

    public static void a(Throwable th, Object obj) {
        int i = 0;
        int i2 = 0;
        Throwable th2 = th;
        while (true) {
            if (th2.getCause() == null) {
                break;
            }
            int i3 = i2 + 1;
            if (i2 < 25) {
                th2 = th2.getCause();
                i2 = i3;
            } else {
                th2 = new RuntimeException("Stack too deep to get final cause");
                break;
            }
        }
        if (!(th2 instanceof pak) || ((pak) th2).a != obj) {
            pak pakVar = new pak(obj);
            HashSet hashSet = new HashSet();
            while (th.getCause() != null) {
                int i4 = i + 1;
                if (i >= 25) {
                    return;
                }
                th = th.getCause();
                if (!hashSet.contains(th.getCause())) {
                    hashSet.add(th.getCause());
                    i = i4;
                }
            }
            try {
                th.initCause(pakVar);
            } catch (Throwable unused) {
            }
        }
    }
}
