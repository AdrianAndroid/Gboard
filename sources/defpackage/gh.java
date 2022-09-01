package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: gh  reason: default package */
/* loaded from: classes.dex */
public final class gh extends BaseAdapter {
    final /* synthetic */ gi a;
    private int b = -1;

    public gh(gi giVar) {
        this.a = giVar;
        b();
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public final go getItem(int i) {
        ArrayList e = this.a.c.e();
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (go) e.get(i);
    }

    final void b() {
        gm gmVar = this.a.c;
        go goVar = gmVar.h;
        if (goVar != null) {
            ArrayList e = gmVar.e();
            int size = e.size();
            for (int i = 0; i < size; i++) {
                if (((go) e.get(i)) == goVar) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int size = this.a.c.e().size();
        return this.b < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.a.b.inflate(R.layout.f133320_resource_name_obfuscated_res_0x7f0e0010, viewGroup, false);
        }
        ((ha) view).f(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
