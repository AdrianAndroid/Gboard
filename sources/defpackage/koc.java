package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: koc  reason: default package */
/* loaded from: classes.dex */
public final class koc extends ls {
    public njs d;
    public kod e;

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ mo d(ViewGroup viewGroup, int i) {
        return new kob(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f143420_resource_name_obfuscated_res_0x7f0e0462, viewGroup, false));
    }

    @Override // defpackage.ls
    public final int ha() {
        njs njsVar = this.d;
        if (njsVar == null) {
            return 0;
        }
        return njsVar.f.size();
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ void o(mo moVar, int i) {
        kob kobVar = (kob) moVar;
        njr njrVar = (njr) this.d.f.get(i);
        kobVar.s.setContentDescription(njrVar.b);
        Resources resources = kobVar.s.getContext().getResources();
        atb.d(kobVar.s).i(giu.b(kobVar.t.d, njrVar).a()).n(new beu().z(kfl.i(resources.getDrawable(R.drawable.f50790_resource_name_obfuscated_res_0x7f080382), kobVar.s, resources.getInteger(R.integer.f132780_resource_name_obfuscated_res_0x7f0c0104), resources.getInteger(R.integer.f132770_resource_name_obfuscated_res_0x7f0c0103)))).m(atx.b()).r(kobVar.s);
        kobVar.s.setOnClickListener(new ikq(kobVar, njrVar, 5));
        kobVar.s.setOnLongClickListener(new koa(kobVar, njrVar, 0));
    }
}
