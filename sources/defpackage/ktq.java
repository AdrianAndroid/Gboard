package defpackage;

import android.os.Build;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: ktq  reason: default package */
/* loaded from: classes.dex */
final class ktq implements ktr {
    private Long a;

    @Override // defpackage.ktr
    public final boolean a() {
        if (this.a == null) {
            try {
                Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                declaredMethod.setAccessible(true);
                this.a = Long.valueOf(((Long) declaredMethod.invoke(null, "ro.build.version.oneui")).longValue());
            } catch (Exception unused) {
                this.a = -1L;
            }
        }
        return this.a.longValue() >= 40100;
    }
}
