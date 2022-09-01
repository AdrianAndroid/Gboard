package j$.util;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* loaded from: classes3.dex */
abstract class H {
    static final boolean a = ((Boolean) AccessController.doPrivileged(new PrivilegedAction() { // from class: j$.util.G
        @Override // java.security.PrivilegedAction
        public final Object run() {
            return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
        }
    })).booleanValue();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Class cls, String str) {
        String valueOf = String.valueOf(cls);
        throw new UnsupportedOperationException(valueOf + " tripwire tripped but logging not supported: " + str);
    }
}
