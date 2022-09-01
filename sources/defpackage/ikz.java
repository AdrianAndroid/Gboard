package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;

/* compiled from: PG */
/* renamed from: ikz  reason: default package */
/* loaded from: classes.dex */
public final class ikz extends aih implements ikl {
    @Override // defpackage.aih, defpackage.an
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View G = super.G(layoutInflater, viewGroup, bundle);
        RecyclerView recyclerView = this.b;
        recyclerView.aw();
        hqs.f(recyclerView, C());
        return G;
    }

    @Override // defpackage.an
    public final void U() {
        super.U();
        fL().ae();
        ikn.a(B(), this.m, this);
    }

    @Override // defpackage.ikl
    public final void a(String str, jav javVar) {
        Preference preference = new Preference(B());
        preference.Q(str);
        preference.K(false);
        preference.v = ilb.class.getName();
        preference.r().putParcelable("ARG_KEY_LANGUAGE_TAG", javVar);
        fL().ah(preference);
    }

    @Override // defpackage.aih
    public final void o(Bundle bundle, String str) {
        aw(this.a.e(B()));
    }
}
