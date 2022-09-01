package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* renamed from: ajb  reason: default package */
/* loaded from: classes.dex */
public final class ajb {
    public boolean b;
    public Bundle c;
    public boolean d;
    public final py a = new py();
    public boolean e = true;

    public final Bundle a(String str) {
        if (this.d) {
            Bundle bundle = this.c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = this.c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.c;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public final void b(String str, aja ajaVar) {
        oll.e(ajaVar, "provider");
        if (((aja) this.a.f(str, ajaVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }
}
