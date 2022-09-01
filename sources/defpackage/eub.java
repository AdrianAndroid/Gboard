package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: eub  reason: default package */
/* loaded from: classes.dex */
public final class eub implements ety {
    public final String a;
    public final eul b;

    public eub(String str, eul eulVar) {
        this.a = str;
        this.b = eulVar;
    }

    @Override // defpackage.ety
    public final int a() {
        return R.layout.f146780_resource_name_obfuscated_res_0x7f0e05e7;
    }

    @Override // defpackage.ety
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ety
    public final void c(eua euaVar, euf eufVar, int i) {
        etw etwVar = (etw) euaVar;
        etwVar.k();
        etwVar.k = etwVar.h.z().indexOf(eufVar);
        etwVar.h(this.a, eufVar.e, this.b, eufVar, i);
    }

    @Override // defpackage.ety
    public final void d(View view, etz etzVar) {
        ViewGroup viewGroup = (ViewGroup) view;
        viewGroup.removeAllViews();
        euf.z(viewGroup.getContext(), this.b.b()).inflate(R.layout.f146710_resource_name_obfuscated_res_0x7f0e05e0, viewGroup, true);
        euf.G(viewGroup, etzVar);
        euf.H(viewGroup, etzVar);
    }

    @Override // defpackage.ety
    public final boolean e(Context context) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eub)) {
            return false;
        }
        eub eubVar = (eub) obj;
        return this.a.equals(eubVar.a) && this.b.equals(eubVar.b);
    }

    @Override // defpackage.ety
    public final boolean f(eul eulVar) {
        return this.b.equals(eulVar);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
