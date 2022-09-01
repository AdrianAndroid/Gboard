package defpackage;

import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: gj  reason: default package */
/* loaded from: classes.dex */
public final class gj extends BaseAdapter {
    public final gm a;
    public boolean b;
    private int c = -1;
    private final boolean d;
    private final LayoutInflater e;
    private final int f;

    public gj(gm gmVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = gmVar;
        this.f = i;
        b();
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public final go getItem(int i) {
        ArrayList e = this.d ? this.a.e() : this.a.f();
        int i2 = this.c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (go) e.get(i);
    }

    final void b() {
        gm gmVar = this.a;
        go goVar = gmVar.h;
        if (goVar != null) {
            ArrayList e = gmVar.e();
            int size = e.size();
            for (int i = 0; i < size; i++) {
                if (((go) e.get(i)) == goVar) {
                    this.c = i;
                    return;
                }
            }
        }
        this.c = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList e = this.d ? this.a.e() : this.a.f();
        if (this.c < 0) {
            return e.size();
        }
        return e.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = 0;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i3 = getItem(i).b;
        int i4 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        boolean z = this.a.w() && i3 != (i4 >= 0 ? getItem(i4).b : i3);
        ImageView imageView = listMenuItemView.b;
        if (imageView != null) {
            if (listMenuItemView.d || !z) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
        ha haVar = (ha) view;
        if (this.b) {
            listMenuItemView.e = true;
            listMenuItemView.c = true;
        }
        haVar.f(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
