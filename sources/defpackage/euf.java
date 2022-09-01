package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: euf  reason: default package */
/* loaded from: classes.dex */
public final class euf extends ls {
    public static final ltg d = ltg.j("com/google/android/apps/inputmethod/libs/theme/listing/ThemeListingItemAdapter");
    public final int e;
    public final List f;
    public final List g;
    public final eua h;
    public int j;
    public int i = 10000;
    public int k = -1;

    public euf(int i, List list, eua euaVar) {
        this.e = i;
        ArrayList arrayList = new ArrayList(list);
        this.f = arrayList;
        this.g = new ArrayList(Collections.nCopies(list.size(), etz.NONE));
        this.h = euaVar;
        this.j = Math.min(arrayList.size(), this.i);
    }

    public static void G(View view, etz etzVar) {
        View findViewById = view.findViewById(R.id.f129900_resource_name_obfuscated_res_0x7f0b219d);
        if (findViewById != null) {
            findViewById.setVisibility(etzVar == etz.LOADING ? 0 : 8);
        }
    }

    public static void H(View view, etz etzVar) {
        etz etzVar2 = etz.SELECTED;
        int i = 0;
        boolean z = etzVar == etzVar2;
        View findViewById = view.findViewById(R.id.f129860_resource_name_obfuscated_res_0x7f0b2199);
        if (findViewById != null) {
            if (etzVar != etzVar2) {
                i = 8;
            }
            findViewById.setVisibility(i);
        }
        View findViewById2 = view.findViewById(R.id.f129850_resource_name_obfuscated_res_0x7f0b2198);
        if (findViewById2 != null) {
            findViewById2.setSelected(z);
        }
    }

    public static erd z(Context context, eqg eqgVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
        ess essVar = new ess(contextThemeWrapper, eqgVar, 1, false);
        erc ercVar = new erc(contextThemeWrapper, essVar);
        jco.d(essVar, ercVar);
        return (erd) LayoutInflater.from(ercVar);
    }

    public final ety A(int i) {
        return (ety) this.f.get(i);
    }

    public final etz B(int i) {
        return (etz) this.g.get(i);
    }

    public final void C() {
        for (int i = 0; i < this.g.size(); i++) {
            if (this.g.get(i) == etz.SELECTED) {
                D(i, etz.NONE);
            }
        }
    }

    public final void D(int i, etz etzVar) {
        if (this.g.get(i) != etzVar) {
            this.g.set(i, etzVar);
            if (i >= this.j) {
                return;
            }
            hg(i);
        }
    }

    public final void E(int i) {
        int i2 = this.j;
        int min = Math.min(this.f.size(), i);
        this.j = min;
        this.i = i;
        if (i2 < min) {
            hk(i2, min - i2);
        } else if (i2 <= min) {
        } else {
            hl(min, i2 - min);
        }
    }

    public final void F(Context context) {
        for (int i = 0; i < this.f.size(); i++) {
            etz etzVar = (etz) this.g.get(i);
            boolean e = ((ety) this.f.get(i)).e(context);
            if (etzVar == etz.NONE && e) {
                D(i, etz.DOWNLOADABLE);
            } else if (etzVar == etz.DOWNLOADABLE && !e) {
                D(i, etz.NONE);
            }
        }
    }

    @Override // defpackage.ls
    public final /* synthetic */ mo d(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        if (this.k != -1) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) inflate.getLayoutParams();
            int i2 = (this.k * marginLayoutParams.height) / marginLayoutParams.width;
            marginLayoutParams.width = this.k;
            marginLayoutParams.height = i2;
            marginLayoutParams.setMarginEnd(0);
            inflate.setLayoutParams(marginLayoutParams);
            if (i == R.layout.f146800_resource_name_obfuscated_res_0x7f0e05e9) {
                View findViewById = inflate.findViewById(R.id.f129890_resource_name_obfuscated_res_0x7f0b219c);
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.width = this.k;
                layoutParams.height = i2;
                findViewById.setLayoutParams(layoutParams);
            } else if (i == R.layout.f146810_resource_name_obfuscated_res_0x7f0e05ea) {
                View findViewById2 = inflate.findViewById(R.id.f129850_resource_name_obfuscated_res_0x7f0b2198);
                ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
                int i3 = this.k;
                layoutParams2.width = i3;
                layoutParams2.height = (layoutParams2.height * i3) / layoutParams2.width;
                findViewById2.setLayoutParams(layoutParams2);
            }
        }
        return new mo(inflate);
    }

    @Override // defpackage.ls
    public final int ha() {
        return this.j;
    }

    @Override // defpackage.ls
    public final int he(int i) {
        return ((ety) this.f.get(i)).a();
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ void o(mo moVar, int i) {
        ety etyVar = (ety) this.f.get(i);
        etyVar.d(moVar.a, (etz) this.g.get(i));
        moVar.a.setContentDescription(etyVar.b());
        moVar.a.setOnClickListener(new buw(this, etyVar, moVar, 8));
    }

    public final int x(eul eulVar) {
        for (int i = 0; i < this.f.size(); i++) {
            if (((ety) this.f.get(i)).f(eulVar)) {
                return i;
            }
        }
        return -1;
    }

    public final int y() {
        return this.f.size();
    }
}
