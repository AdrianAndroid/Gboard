package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: eue  reason: default package */
/* loaded from: classes.dex */
public final class eue implements ety {
    public final String a;
    public final eul b;
    private final String c;

    public eue(String str, eul eulVar, String str2) {
        this.a = str;
        this.b = eulVar;
        this.c = str2;
    }

    @Override // defpackage.ety
    public final int a() {
        return R.layout.f146810_resource_name_obfuscated_res_0x7f0e05ea;
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
        Context context = viewGroup.getContext();
        erd z = euf.z(context, this.b.b());
        erd z2 = this.b.p() ? euf.z(context, this.b.a()) : z;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.f129800_resource_name_obfuscated_res_0x7f0b2193);
        viewGroup2.removeAllViews();
        z.inflate(R.layout.f146720_resource_name_obfuscated_res_0x7f0e05e1, viewGroup2, true);
        z2.inflate(R.layout.f146730_resource_name_obfuscated_res_0x7f0e05e2, viewGroup2, true);
        ((AppCompatTextView) viewGroup.findViewById(R.id.f129790_resource_name_obfuscated_res_0x7f0b2192)).setText(this.c);
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
        if (!(obj instanceof eue)) {
            return false;
        }
        eue eueVar = (eue) obj;
        return this.a.equals(eueVar.a) && this.b.equals(eueVar.b) && this.c.equals(eueVar.c);
    }

    @Override // defpackage.ety
    public final boolean f(eul eulVar) {
        return this.b.equals(eulVar);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }
}
