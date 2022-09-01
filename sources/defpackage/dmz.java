package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: dmz  reason: default package */
/* loaded from: classes.dex */
public final class dmz extends ls implements dlm {
    private static final lug g = hin.a;
    public dmx d;
    public List e;
    public final gqa f;
    private final Context h;
    private List i;
    private final SparseArray j = new SparseArray();
    private final Map k = new qo();

    public dmz(Context context) {
        this.h = context;
        this.f = gqa.a(context);
    }

    private static String y(hqt hqtVar) {
        iav g2 = hqtVar.g();
        return g2 == null ? "" : g2.f.c;
    }

    private static String z(hqt hqtVar) {
        return hqtVar.o(2);
    }

    @Override // defpackage.dlm
    public final void b(String str, Drawable drawable) {
        dln dlnVar = (dln) this.k.remove(str);
        if (dlnVar != null) {
            dlnVar.a();
        }
        for (hqt hqtVar : this.i) {
            if (y(hqtVar).equals(str)) {
                dmy dmyVar = (dmy) this.j.get(this.i.indexOf(hqtVar));
                if (dmyVar == null) {
                    return;
                }
                dmyVar.s.setImageDrawable(drawable);
                dmyVar.u.setText(z(hqtVar));
                dmyVar.a.setContentDescription(z(hqtVar));
                dmyVar.t.setVisibility(8);
                return;
            }
        }
        throw new IllegalArgumentException("Unknown variant: ".concat(str));
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ mo d(ViewGroup viewGroup, int i) {
        return new dmy(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f144960_resource_name_obfuscated_res_0x7f0e051a, viewGroup, false));
    }

    @Override // defpackage.ls
    public final int ha() {
        List list = this.i;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ void o(mo moVar, int i) {
        dln e;
        dmy dmyVar = (dmy) moVar;
        this.j.put(i, dmyVar);
        hqt hqtVar = (hqt) this.i.get(i);
        if (hqtVar == null) {
            return;
        }
        buw buwVar = new buw(this, dmyVar, hqtVar, 5);
        dmyVar.s.setOnClickListener(buwVar);
        dmyVar.v.setOnClickListener(buwVar);
        dmyVar.F(this.e.contains(hqtVar));
        iav g2 = hqtVar.g();
        if (g2 == null) {
            ((luc) ((luc) g.d()).k("com/google/android/apps/inputmethod/libs/languageselection/LanguageLayoutPreviewAdapter", "onBindViewHolder", 117, "LanguageLayoutPreviewAdapter.java")).G("The ImeDef of entry(languageTag=%s, variant=%s) is null", hqtVar.i(), hqtVar.p());
            return;
        }
        ibw ibwVar = g2.f;
        int e2 = hyq.e(ibwVar.i, ibwVar.h);
        eqg a = eqg.a(this.h);
        Context context = this.h;
        dlq dlqVar = new dlq(context, new ess(context, a, e2), dds.a, 0.5f);
        dmyVar.s.setImageDrawable(dlqVar.b());
        dmyVar.u.setText(z(hqtVar));
        dmyVar.a.setAccessibilityDelegate(new dmw());
        dmyVar.a.setContentDescription(z(hqtVar));
        dmyVar.t.setVisibility(0);
        if (this.k.get(y(hqtVar)) != null || (e = dlqVar.e(g2, g2.b, hqtVar, ibz.a, hqtVar.c(e2), this)) == null) {
            return;
        }
        this.k.put(y(hqtVar), e);
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ void t(mo moVar) {
        this.j.remove(((dmy) moVar).b());
    }

    public final void x(List list, List list2) {
        this.i = new ArrayList(list);
        this.e = new ArrayList(list2);
        fc();
    }
}
