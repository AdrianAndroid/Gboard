package defpackage;

import android.content.Context;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* compiled from: PG */
/* renamed from: gi  reason: default package */
/* loaded from: classes.dex */
public final class gi implements AdapterView.OnItemClickListener, gz {
    Context a;
    public LayoutInflater b;
    gm c;
    public ExpandedMenuView d;
    public gy e;
    public gh f;

    public gi(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    public final ListAdapter a() {
        if (this.f == null) {
            this.f = new gh(this);
        }
        return this.f;
    }

    @Override // defpackage.gz
    public final void b(Context context, gm gmVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = gmVar;
        gh ghVar = this.f;
        if (ghVar != null) {
            ghVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.gz
    public final void c(gm gmVar, boolean z) {
        gy gyVar = this.e;
        if (gyVar != null) {
            gyVar.a(gmVar, z);
        }
    }

    @Override // defpackage.gz
    public final void d(gy gyVar) {
        throw null;
    }

    @Override // defpackage.gz
    public final boolean e() {
        return false;
    }

    @Override // defpackage.gz
    public final boolean f(hg hgVar) {
        if (!hgVar.hasVisibleItems()) {
            return false;
        }
        gn gnVar = new gn(hgVar);
        gm gmVar = gnVar.a;
        cu cuVar = new cu(gmVar.a);
        gnVar.c = new gi(cuVar.a());
        gi giVar = gnVar.c;
        giVar.e = gnVar;
        gnVar.a.g(giVar);
        cuVar.c(gnVar.c.a(), gnVar);
        View view = gmVar.g;
        if (view == null) {
            cuVar.e(gmVar.f);
            cuVar.k(gmVar.e);
        } else {
            cuVar.d(view);
        }
        cuVar.m(gnVar);
        gnVar.b = cuVar.b();
        gnVar.b.setOnDismissListener(gnVar);
        WindowManager.LayoutParams attributes = gnVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        gnVar.b.show();
        gy gyVar = this.e;
        if (gyVar == null) {
            return true;
        }
        gyVar.b(hgVar);
        return true;
    }

    @Override // defpackage.gz
    public final boolean g(go goVar) {
        return false;
    }

    @Override // defpackage.gz
    public final boolean h(go goVar) {
        return false;
    }

    @Override // defpackage.gz
    public final void i() {
        gh ghVar = this.f;
        if (ghVar != null) {
            ghVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.A(this.f.getItem(i), this, 0);
    }
}
