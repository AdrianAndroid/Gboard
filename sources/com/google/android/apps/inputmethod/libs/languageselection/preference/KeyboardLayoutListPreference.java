package com.google.android.apps.inputmethod.libs.languageselection.preference;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class KeyboardLayoutListPreference extends Preference implements dmx {
    public RecyclerView a;
    public Parcelable c;
    private dmz d;
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    public int b = 0;
    private final View.OnAttachStateChangeListener g = new ge(this, 3);

    public KeyboardLayoutListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = R.layout.f145000_resource_name_obfuscated_res_0x7f0e051e;
        this.G = R.layout.f144970_resource_name_obfuscated_res_0x7f0e051b;
    }

    @Override // androidx.preference.Preference
    public final void a(ais aisVar) {
        super.a(aisVar);
        RecyclerView recyclerView = (RecyclerView) aisVar.F(R.id.keyboard_layout_container);
        if (recyclerView != this.a) {
            if (recyclerView.p) {
                l(recyclerView);
            } else {
                recyclerView.addOnAttachStateChangeListener(this.g);
            }
        }
    }

    @Override // defpackage.dmx
    public final boolean b(hqt hqtVar) {
        boolean U = U(hqtVar);
        if (U) {
            if (this.f.contains(hqtVar)) {
                this.f.remove(hqtVar);
            } else {
                this.f.add(hqtVar);
            }
        }
        return U;
    }

    @Override // androidx.preference.Preference
    public final Parcelable e() {
        Parcelable parcelable;
        Parcelable e = super.e();
        RecyclerView recyclerView = this.a;
        if (recyclerView != null) {
            parcelable = recyclerView.m.R();
        } else {
            parcelable = this.c;
        }
        return new dnh(e, parcelable);
    }

    @Override // androidx.preference.Preference
    public final void g(Parcelable parcelable) {
        if (!(parcelable instanceof dnh)) {
            super.g(parcelable);
            return;
        }
        dnh dnhVar = (dnh) parcelable;
        super.g(dnhVar.getSuperState());
        this.c = dnhVar.a;
    }

    public final void k(Collection collection, Collection collection2) {
        this.e.clear();
        this.e.addAll(collection);
        this.f.clear();
        this.f.addAll(collection2);
        dmz dmzVar = this.d;
        if (dmzVar != null) {
            dmzVar.x(this.e, this.f);
        }
    }

    public final void l(RecyclerView recyclerView) {
        Parcelable parcelable;
        int i;
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        this.a = recyclerView;
        if (this.d == null) {
            this.d = new dmz(this.j);
        }
        dmz dmzVar = this.d;
        dmzVar.d = this;
        dmzVar.x(this.e, this.f);
        recyclerView.aa(this.d);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        if (recyclerView2 != null) {
            parcelable = recyclerView2.m.R();
        } else {
            parcelable = this.c;
        }
        if (parcelable != null) {
            linearLayoutManager.Z(parcelable);
            this.c = null;
        }
        recyclerView.ab(linearLayoutManager);
        if (parcelable != null || (i = this.b) < 0) {
            return;
        }
        recyclerView.Y(i);
    }
}
