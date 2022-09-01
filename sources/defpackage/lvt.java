package defpackage;

import dalvik.system.VMStack;

/* compiled from: PG */
/* renamed from: lvt  reason: default package */
/* loaded from: classes.dex */
class lvt extends lvk {
    @Override // defpackage.lvk
    public ltp a(Class cls, int i) {
        return ltp.a;
    }

    @Override // defpackage.lvk
    public String b(Class cls) {
        boolean z;
        boolean z2;
        StackTraceElement a;
        z = lvv.a;
        if (z) {
            try {
                if (cls.equals(lvv.p())) {
                    return VMStack.getStackClass2().getName();
                }
            } catch (Throwable unused) {
            }
        }
        z2 = lvv.b;
        if (!z2 || (a = lxf.a(cls, 1)) == null) {
            return null;
        }
        return a.getClassName();
    }
}
