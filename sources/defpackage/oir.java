package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* renamed from: oir  reason: default package */
/* loaded from: classes2.dex */
public final class oir {
    public Object a;

    public oir() {
    }

    public oir(SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.d = SwipeDismissBehavior.u(0.1f);
        swipeDismissBehavior.e = SwipeDismissBehavior.u(0.6f);
        swipeDismissBehavior.b = 0;
    }

    public oir(foi foiVar) {
        this.a = foiVar;
    }

    public oir(Object obj) {
        this.a = obj;
    }

    public oir(byte[] bArr, byte[] bArr2) {
    }

    public oir(char[] cArr) {
        this.a = gvw.b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, android.os.IBinder] */
    public final synchronized IBinder a() {
        return this.a;
    }

    public final synchronized void b(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void c() {
        Object obj = this.a;
        if (obj != null) {
            ((gsh) obj).b();
        }
    }

    public final boolean d() {
        return this.a != null;
    }

    public final int e(Context context) {
        if (this.a == null) {
            try {
                this.a = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                this.a = -1;
            }
        }
        return ((Integer) this.a).intValue();
    }
}
