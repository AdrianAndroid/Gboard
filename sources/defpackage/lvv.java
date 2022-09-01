package defpackage;

import android.os.Build;
import dalvik.system.VMStack;

/* compiled from: PG */
/* renamed from: lvv  reason: default package */
/* loaded from: classes.dex */
public final class lvv extends lvl {
    private static final boolean a = lvu.a();
    private static final boolean b;
    private static final lvk c;

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        b = z;
        c = new lvt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class p() {
        return VMStack.getStackClass2();
    }

    static String q() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean t() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new Class[0]);
            return lvu.class.getName().equals(q());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // defpackage.lvl
    protected lun e(String str) {
        if (lvy.a.get() != null) {
            return ((lvr) lvy.a.get()).a(str);
        }
        lvy lvyVar = new lvy(str.replace('$', '.'));
        lvx.a.offer(lvyVar);
        if (lvy.a.get() == null) {
            return lvyVar;
        }
        lvy.a();
        return lvyVar;
    }

    @Override // defpackage.lvl
    protected lvk h() {
        return c;
    }

    @Override // defpackage.lvl
    protected lwm j() {
        return lvz.a;
    }

    @Override // defpackage.lvl
    protected String m() {
        return "platform: Android";
    }
}
