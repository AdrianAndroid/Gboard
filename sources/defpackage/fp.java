package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: fp  reason: default package */
/* loaded from: classes.dex */
public final class fp implements fl {
    public final ActionMode.Callback a;
    public final Context b;
    final ArrayList c = new ArrayList();
    final qv d = new qv();

    public fp(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    @Override // defpackage.fl
    public final void a(fm fmVar) {
        throw null;
    }

    @Override // defpackage.fl
    public final boolean b(fm fmVar, MenuItem menuItem) {
        throw null;
    }

    @Override // defpackage.fl
    public final boolean c(fm fmVar, Menu menu) {
        throw null;
    }

    @Override // defpackage.fl
    public final void d(fm fmVar, Menu menu) {
        throw null;
    }

    public final ActionMode e(fm fmVar) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            fq fqVar = (fq) this.c.get(i);
            if (fqVar != null && fqVar.b == fmVar) {
                return fqVar;
            }
        }
        fq fqVar2 = new fq(this.b, fmVar);
        this.c.add(fqVar2);
        return fqVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Menu f(Menu menu) {
        Menu menu2 = (Menu) this.d.get(menu);
        if (menu2 == null) {
            hc hcVar = new hc(this.b, menu);
            this.d.put(menu, hcVar);
            return hcVar;
        }
        return menu2;
    }
}
