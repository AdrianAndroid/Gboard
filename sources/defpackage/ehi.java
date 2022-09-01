package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ViewSwitcher;
import com.google.android.apps.inputmethod.libs.expression.recyclerview.BindingRecyclerView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: ehi  reason: default package */
/* loaded from: classes.dex */
public final class ehi extends dz {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/sticker/HeaderController");
    public static final cpd b;
    public static final cpd c;
    public static final cpd d;
    public final cou e;
    public final BindingRecyclerView f;
    public final cuj g;
    public final View h;
    public Runnable i = eie.b;
    public Runnable j = eie.b;
    public int k = -1;
    public final List l = new ArrayList();
    public boe m;
    private final ViewSwitcher n;
    private final ehg o;
    private final boolean p;

    static {
        cpc a2 = cpd.a();
        a2.b = 5;
        b = a2.a();
        cpc a3 = cpd.a();
        a3.b = 4;
        c = a3.a();
        cpc a4 = cpd.a();
        a4.b = 2;
        d = a4.a();
    }

    public ehi(Context context, SoftKeyboardView softKeyboardView, cou couVar, ehg ehgVar) {
        this.e = couVar;
        BindingRecyclerView bindingRecyclerView = (BindingRecyclerView) aad.q(softKeyboardView, R.id.f66920_resource_name_obfuscated_res_0x7f0b0825);
        this.f = bindingRecyclerView;
        this.n = (ViewSwitcher) aad.q(softKeyboardView, R.id.f56150_resource_name_obfuscated_res_0x7f0b025b);
        this.o = ehgVar;
        boolean booleanValue = ((Boolean) iho.a(context).c()).booleanValue();
        this.p = booleanValue;
        if (booleanValue) {
            View q = aad.q(softKeyboardView, R.id.f63970_resource_name_obfuscated_res_0x7f0b06c8);
            if (q != null) {
                q.setVisibility(0);
                q.setOnClickListener(bwk.e);
            }
            View q2 = aad.q(softKeyboardView, R.id.f63990_resource_name_obfuscated_res_0x7f0b06ca);
            if (q2 != null) {
                q2.setVisibility(0);
                boe boeVar = new boe(context, 1, q2.findViewById(R.id.f63980_resource_name_obfuscated_res_0x7f0b06c9), q2, q2);
                this.m = boeVar;
                boeVar.k();
            }
            boe.i(softKeyboardView, R.string.f153170_resource_name_obfuscated_res_0x7f1402c8);
            this.h = aad.q(softKeyboardView, R.id.f53520_resource_name_obfuscated_res_0x7f0b0126);
        } else {
            this.h = null;
        }
        bindingRecyclerView.ab(new LinearLayoutManager(0));
        lls h = llw.h();
        Objects.requireNonNull(this);
        dzk dzkVar = new dzk(this, 14);
        cjq cjqVar = new cjq(context, dzkVar, 18);
        gmi i = cnx.i();
        i.c = ehk.m;
        i.n(R.layout.f134940_resource_name_obfuscated_res_0x7f0e00d4, cjqVar);
        i.n(R.layout.f134930_resource_name_obfuscated_res_0x7f0e00d3, cjqVar);
        i.n(R.layout.f134950_resource_name_obfuscated_res_0x7f0e00d5, new cus(dzkVar, 0));
        i.n(R.layout.f134920_resource_name_obfuscated_res_0x7f0e00d2, cjqVar);
        h.a(ehj.class, i.m());
        this.g = cnx.f(h, context, null, null);
    }

    public static int g(int i) {
        return i - 1;
    }

    public static int h(int i) {
        return i + 1;
    }

    private final int p() {
        return this.g.ha() - 1;
    }

    @Override // defpackage.dz
    public final void c(RecyclerView recyclerView, int i, int i2) {
        this.e.j(!cur.a(recyclerView.m));
    }

    public final int d() {
        return this.p ? R.string.f163280_resource_name_obfuscated_res_0x7f14077e : R.string.f167260_resource_name_obfuscated_res_0x7f140936;
    }

    public final int e() {
        return Math.max(0, this.g.ha() - 2);
    }

    public final int f() {
        int i;
        if (this.g.H() || (i = this.k) < 3 || i >= p()) {
            throw new IllegalStateException("current pack is not removable");
        }
        int i2 = this.k;
        l(-1);
        this.g.F(i2);
        if (i2 == p()) {
            i2--;
        }
        l(i2);
        return i2;
    }

    public final cov i() {
        cog.c();
        return cog.g(R.string.f153190_resource_name_obfuscated_res_0x7f1402ca, d()).h();
    }

    public final ehj j(int i) {
        return (ehj) this.g.z(ehj.class, i);
    }

    public final void k(ehj ehjVar, int i) {
        if (ehjVar.a() != 5) {
            l(i);
        }
        boe boeVar = this.m;
        if (boeVar != null) {
            boeVar.l(i);
        }
        for (his hisVar : this.l) {
            hisVar.a(ehjVar, Integer.valueOf(i));
        }
    }

    public final void l(int i) {
        int i2 = this.k;
        if (i2 == i) {
            return;
        }
        if (i2 != -1) {
            this.g.D(i2, false);
        }
        if (i != -1) {
            this.g.D(i, true);
            ehj j = j(i);
            if (j.a() == 7) {
                String str = j.b().b;
                if (!str.equals(this.o.e.Q("pref_key_last_seen_feature_pack_id_key"))) {
                    this.g.C(i, ejj.c);
                    this.o.e.j("pref_key_last_seen_feature_pack_id_key", str);
                }
            }
        }
        this.k = i;
    }

    public final void m(cxe cxeVar, int i) {
        l(-1);
        n(0);
        this.i = eie.b;
        this.j = eie.b;
        cpd cpdVar = this.e.b;
        cpd cpdVar2 = b;
        if (!cpdVar.equals(cpdVar2)) {
            this.e.g(cpdVar2);
            this.e.k(i());
        }
        llk llkVar = new llk();
        llkVar.h(efq.b(""));
        llkVar.h(efj.a);
        llkVar.h(efl.a);
        if (cxeVar.g.e()) {
            llkVar.h(efq.a((cxc) cxeVar.g.a()));
        }
        llkVar.j(lre.ab(cxeVar.e, ehk.b));
        llkVar.h(efn.a);
        this.g.L(llkVar.g());
        l(i);
    }

    public final void n(int i) {
        if (this.n.getDisplayedChild() != i) {
            this.n.setDisplayedChild(i);
        }
    }

    public final void o(int i) {
        this.f.ae(i);
    }
}
