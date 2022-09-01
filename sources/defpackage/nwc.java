package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.net.SocketAddress;

/* compiled from: PG */
/* renamed from: nwc  reason: default package */
/* loaded from: classes2.dex */
public final class nwc extends SocketAddress {
    private static final long serialVersionUID = 0;
    public final Intent a;

    protected nwc(Intent intent) {
        jdg.w(intent.getComponent() != null, "Missing required component");
        this.a = intent;
    }

    public static nwc b(ComponentName componentName) {
        return new nwc(new Intent("grpc.io.action.BIND").setComponent(componentName));
    }

    public static nwc c(Context context) {
        return b(new ComponentName(context, context.getClass()));
    }

    public final ComponentName a() {
        return this.a.getComponent();
    }

    public final String d() {
        return a().getPackageName();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nwc) {
            return this.a.filterEquals(((nwc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.a;
        if (intent.getPackage() != null) {
            intent = intent.cloneFilter().setPackage(null);
        }
        return intent.filterHashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return "AndroidComponentAddress[" + valueOf + "]";
    }
}
