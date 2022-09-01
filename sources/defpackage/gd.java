package defpackage;

import android.content.Context;
import android.view.MenuItem;

/* compiled from: PG */
/* renamed from: gd  reason: default package */
/* loaded from: classes.dex */
class gd {
    final Context a;
    public qv b;

    public gd(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem a(MenuItem menuItem) {
        if (menuItem instanceof wn) {
            wn wnVar = (wn) menuItem;
            if (this.b == null) {
                this.b = new qv();
            }
            MenuItem menuItem2 = (MenuItem) this.b.get(wnVar);
            if (menuItem2 != null) {
                return menuItem2;
            }
            gu guVar = new gu(this.a, wnVar);
            this.b.put(wnVar, guVar);
            return guVar;
        }
        return menuItem;
    }
}
