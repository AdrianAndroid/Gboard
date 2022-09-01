package defpackage;

import android.content.res.Resources;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.stickers.megamode.MegamodeView;

/* compiled from: PG */
/* renamed from: kny  reason: default package */
/* loaded from: classes.dex */
final class kny extends mo {
    final /* synthetic */ knz s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kny(knz knzVar, MegamodeView megamodeView) {
        super(megamodeView);
        this.s = knzVar;
    }

    @Override // defpackage.mo
    public final void E(njs njsVar) {
        MegamodeView megamodeView = (MegamodeView) this.a;
        kod kodVar = this.s.f;
        megamodeView.k = kodVar;
        megamodeView.l.e = kodVar;
        String str = njsVar.c;
        megamodeView.e.setContentDescription(str);
        megamodeView.f.setText(str);
        megamodeView.g.setText(megamodeView.getContext().getString(R.string.f158050_resource_name_obfuscated_res_0x7f140501, njsVar.d));
        koc kocVar = megamodeView.l;
        kocVar.d = njsVar;
        kocVar.fc();
        megamodeView.d = ((knl) megamodeView.getContext().getApplicationContext()).b();
        megamodeView.m = megamodeView.d.a(kfl.k(njsVar.a));
        megamodeView.c(str);
        Resources resources = megamodeView.e.getContext().getResources();
        atw d = atb.d(megamodeView);
        njr njrVar = njsVar.e;
        if (njrVar == null) {
            njrVar = njr.d;
        }
        d.i(giu.b(njsVar, njrVar).a()).n(new beu().z(kfl.i(resources.getDrawable(R.drawable.f50790_resource_name_obfuscated_res_0x7f080382), megamodeView.e, resources.getInteger(R.integer.f132780_resource_name_obfuscated_res_0x7f0c0104), resources.getInteger(R.integer.f132770_resource_name_obfuscated_res_0x7f0c0103)))).m(atx.b()).r(megamodeView.e);
        megamodeView.e.setOnClickListener(new ikq(megamodeView, njsVar, 8));
        megamodeView.e.setOnLongClickListener(new koa(megamodeView, njsVar, 2));
        megamodeView.j.setContentDescription(megamodeView.getContext().getString(R.string.f148700_resource_name_obfuscated_res_0x7f1400c5, str));
        megamodeView.j.setOnClickListener(new ikq(megamodeView, njsVar, 6));
        megamodeView.i.setContentDescription(megamodeView.getContext().getString(R.string.f148690_resource_name_obfuscated_res_0x7f1400c4, str));
        megamodeView.i.setOnClickListener(new ikq(megamodeView, njsVar, 7));
        megamodeView.h.setOnClickListener(new buw(megamodeView, njsVar, str, 11));
    }
}
