package defpackage;

import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* renamed from: ye  reason: default package */
/* loaded from: classes2.dex */
public abstract class ye {
    public opu b;

    public abstract View a();

    public void b(SubMenu subMenu) {
        throw null;
    }

    public boolean c() {
        throw null;
    }

    public boolean d() {
        throw null;
    }

    public View e(MenuItem menuItem) {
        return a();
    }

    public boolean f() {
        return true;
    }

    public boolean g() {
        return false;
    }

    public void h(opu opuVar) {
        if (this.b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.b = opuVar;
    }
}
