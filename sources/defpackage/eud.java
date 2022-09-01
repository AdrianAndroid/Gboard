package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: eud  reason: default package */
/* loaded from: classes.dex */
public final class eud implements ety {
    public final String a;
    public final String b;
    public final String c;
    private final String d;

    public eud(String str, String str2, String str3, String str4) {
        this.a = str;
        this.d = str2;
        this.b = str3;
        this.c = str4;
    }

    @Override // defpackage.ety
    public final int a() {
        return R.layout.f146800_resource_name_obfuscated_res_0x7f0e05e9;
    }

    @Override // defpackage.ety
    public final String b() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ety
    public final void c(eua euaVar, euf eufVar, int i) {
        etw etwVar = (etw) euaVar;
        etwVar.k();
        etwVar.k = etwVar.h.z().indexOf(eufVar);
        File b = etwVar.c.b(this.b);
        if (b == null || !erv.g(b)) {
            if (etwVar.j.add(this.b)) {
                etwVar.c.a(this.b, b, false, euaVar, this.c);
            }
            eufVar.D(i, etz.LOADING);
            return;
        }
        if (eufVar.B(i) == etz.DOWNLOADABLE) {
            eufVar.D(i, etz.NONE);
        }
        etwVar.h(this.a, eufVar.e, eul.f(etwVar.b, b.getName()), eufVar, i);
    }

    @Override // defpackage.ety
    public final void d(View view, etz etzVar) {
        Context context = view.getContext();
        View findViewById = view.findViewById(R.id.f129880_resource_name_obfuscated_res_0x7f0b219b);
        if (findViewById != null) {
            findViewById.setVisibility(etzVar == etz.DOWNLOADABLE ? 0 : 8);
        }
        euf.G(view, etzVar);
        euf.H(view, etzVar);
        hjq.a(context).j(this.d).r((ImageView) view.findViewById(R.id.f129890_resource_name_obfuscated_res_0x7f0b219c));
    }

    @Override // defpackage.ety
    public final boolean e(Context context) {
        File d = erj.d(context.getFilesDir(), "downloaded_theme_".concat(String.valueOf(jbs.a(this.b))));
        return !d.exists() || !erv.g(d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eud)) {
            return false;
        }
        eud eudVar = (eud) obj;
        return this.a.equals(eudVar.a) && this.d.equals(eudVar.d) && this.b.equals(eudVar.b) && this.c.equals(eudVar.c);
    }

    @Override // defpackage.ety
    public final boolean f(eul eulVar) {
        String f = erj.f(this.b);
        String k = eulVar.k();
        if (!erj.g(f).equals(k)) {
            return k != null && k.contains(jbs.a(this.b));
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.d, this.b, this.c});
    }
}
