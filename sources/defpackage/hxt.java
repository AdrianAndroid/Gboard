package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodSubtype;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: hxt  reason: default package */
/* loaded from: classes.dex */
public final class hxt extends guh {
    public final /* synthetic */ hxv a;
    private hxu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxt(hxv hxvVar) {
        super("LanguagePicker");
        this.a = hxvVar;
    }

    @Override // defpackage.guh
    protected final void a(gub gubVar) {
        Context r = gubVar.r();
        gubVar.v();
        gubVar.n(true);
        gubVar.l();
        gubVar.h();
        gubVar.j();
        if (this.a.c) {
            gubVar.s(LayoutInflater.from(r).inflate(R.layout.f142730_resource_name_obfuscated_res_0x7f0e0418, (ViewGroup) null));
        } else {
            gubVar.w(r.getApplicationInfo().icon);
            gubVar.D(R.string.f176560_resource_name_obfuscated_res_0x7f140ce1);
        }
        hxv hxvVar = this.a;
        int i = true != hxvVar.c ? R.layout.f142710_resource_name_obfuscated_res_0x7f0e0416 : R.layout.f142720_resource_name_obfuscated_res_0x7f0e0417;
        jaq jaqVar = hxvVar.g;
        boolean booleanValue = ((Boolean) hxv.b.c()).booleanValue();
        jcf jcfVar = new jcf(li.e() ? jbt.J(InputMethodInfo.class, new Class[0]) : null, 1);
        jap japVar = new jap(booleanValue, 0);
        ArrayList arrayList = new ArrayList();
        String packageName = jaqVar.b.getPackageName();
        for (InputMethodInfo inputMethodInfo : jaqVar.d()) {
            String packageName2 = inputMethodInfo.getPackageName();
            if (packageName2 != null && !packageName2.equals(packageName) && jcfVar.a(inputMethodInfo)) {
                List<InputMethodSubtype> k = jaqVar.k(inputMethodInfo);
                if (k.isEmpty()) {
                    arrayList.add(jao.a(inputMethodInfo, null));
                } else {
                    for (InputMethodSubtype inputMethodSubtype : k) {
                        if (japVar.a(inputMethodSubtype)) {
                            arrayList.add(jao.a(inputMethodInfo, inputMethodSubtype));
                        }
                    }
                }
            }
        }
        hxu hxuVar = new hxu(r, i, arrayList);
        this.b = hxuVar;
        ijl.b().h(hxuVar.a, hqp.class, mjl.a);
        ijl.b().h(hxuVar.a, hqr.class, mjl.a);
        hxuVar.a();
        DialogInterface.OnClickListener cdlVar = new cdl(this, hxuVar, 6);
        gubVar.u(hxuVar, cdlVar);
        if (!jai.b.b() || !irs.d() || !irz.b.a()) {
            return;
        }
        gubVar.m(true != this.a.c ? -3 : -1, R.string.f165030_resource_name_obfuscated_res_0x7f14083e, cdlVar);
    }

    @Override // defpackage.guh
    protected final void d() {
        hxu hxuVar = this.b;
        if (hxuVar != null) {
            ijl.b().d(hxuVar.a, hqp.class);
            ijl.b().d(hxuVar.a, hqr.class);
        }
        this.a.h.f();
    }
}
