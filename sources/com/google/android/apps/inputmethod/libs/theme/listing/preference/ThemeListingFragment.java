package com.google.android.apps.inputmethod.libs.theme.listing.preference;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ThemeListingFragment extends an {
    public etw a;
    private gqa b;

    private final String a() {
        return K(R.string.f156420_resource_name_obfuscated_res_0x7f140436);
    }

    @Override // defpackage.an
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        as();
        etw etwVar = this.a;
        if (etwVar != null) {
            View inflate = layoutInflater.cloneInContext(etwVar.b).inflate(R.layout.f146750_resource_name_obfuscated_res_0x7f0e05e4, viewGroup, false);
            etwVar.g = (RecyclerView) inflate.findViewById(R.id.f129810_resource_name_obfuscated_res_0x7f0b2194);
            etwVar.g.ab(new GridLayoutManager(1, 1));
            etwVar.g.aa(etwVar.h);
            hqs.f(etwVar.g, (Activity) gwc.b(etwVar.b, Activity.class));
            return inflate;
        }
        return null;
    }

    @Override // defpackage.an
    public final void P(int i, int i2, Intent intent) {
        etw etwVar = this.a;
        if (etwVar == null || intent == null || i2 != -1) {
            return;
        }
        if (i == 101) {
            etwVar.j(intent);
        } else if (i != 102 || !jez.g(etwVar.b)) {
        } else {
            String f = etw.f(intent);
            if (TextUtils.isEmpty(f)) {
                return;
            }
            etwVar.p(true);
            mko b = jez.b(etwVar.b, f, true);
            etwVar.o = b;
            etwVar.p = f;
            kcu.U(b, new cvt(etwVar, b, intent, 7), gyc.b);
        }
    }

    @Override // defpackage.an
    public final void Q(Menu menu, MenuInflater menuInflater) {
        menu.clear();
    }

    @Override // defpackage.an
    public final void R() {
        etw etwVar = this.a;
        if (etwVar != null) {
            etwVar.d.b(etwVar);
            etwVar.l = true;
        }
        this.a = null;
        super.R();
    }

    @Override // defpackage.an
    public final void T() {
        super.T();
        this.b.f(L(R.string.f149450_resource_name_obfuscated_res_0x7f140117, a()));
    }

    @Override // defpackage.an
    public final void U() {
        super.U();
        etw etwVar = this.a;
        if (etwVar != null) {
            etwVar.o();
        }
        this.b.f(L(R.string.f157230_resource_name_obfuscated_res_0x7f14048b, a()));
    }

    @Override // defpackage.an
    public final void e(Bundle bundle) {
        File[] fileArr;
        super.e(bundle);
        ap B = B();
        etg c = etg.c(B());
        ett c2 = ett.c(B());
        ewj ewjVar = new ewj((inx) B(), this);
        ieh j = ieh.j();
        Bundle bundle2 = this.m;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        etw etwVar = new etw(B, c, c2, ewjVar, j, bundle2, bundle, null);
        this.a = etwVar;
        etwVar.e.e(erh.SELECTOR_ACTIVITY_CREATED, new Object[0]);
        itb.f();
        etw.i(etwVar.b);
        etwVar.i = etwVar.h.ha();
        etwVar.h.A(etwVar.b.getString(R.string.f176380_resource_name_obfuscated_res_0x7f140ccf), etwVar.e(), etwVar);
        if (erg.a()) {
            eun eunVar = etwVar.h;
            String string = etwVar.b.getString(R.string.f176370_resource_name_obfuscated_res_0x7f140cce);
            ArrayList arrayList = new ArrayList();
            Context context = etwVar.b;
            if (itb.j()) {
                arrayList.add(new eue(context.getString(R.string.f176330_resource_name_obfuscated_res_0x7f140cca), eul.d(context), context.getString(R.string.f176340_resource_name_obfuscated_res_0x7f140ccb)));
            }
            if (eul.j(etwVar.b).p()) {
                arrayList.add(new eue(etwVar.b.getString(R.string.f176460_resource_name_obfuscated_res_0x7f140cd7), eul.j(etwVar.b), etwVar.b.getString(R.string.f176470_resource_name_obfuscated_res_0x7f140cd8)));
                arrayList.add(new eue(etwVar.b.getString(R.string.f176440_resource_name_obfuscated_res_0x7f140cd5), eul.i(etwVar.b), etwVar.b.getString(R.string.f176450_resource_name_obfuscated_res_0x7f140cd6)));
                arrayList.add(new eue(etwVar.b.getString(R.string.f176420_resource_name_obfuscated_res_0x7f140cd3), eul.h(etwVar.b), etwVar.b.getString(R.string.f176430_resource_name_obfuscated_res_0x7f140cd4)));
            } else {
                arrayList.add(new eue(etwVar.b.getString(R.string.f176440_resource_name_obfuscated_res_0x7f140cd5), eul.j(etwVar.b), etwVar.b.getString(R.string.f176450_resource_name_obfuscated_res_0x7f140cd6)));
            }
            eunVar.A(string, new euf(7, arrayList, etwVar), etwVar);
        }
        ArrayList arrayList2 = new ArrayList();
        File b = isw.b(etwVar.b);
        if (b == null) {
            fileArr = isw.b;
        } else {
            b.getAbsolutePath();
            File[] listFiles = b.listFiles();
            if (listFiles == null) {
                ((ltd) ((ltd) isw.a.c()).k("com/google/android/libraries/inputmethod/theme/SystemThemeFileUtils", "getThemeFiles", 35, "SystemThemeFileUtils.java")).w("Cannot read a directory: %s", b.getAbsolutePath());
                fileArr = isw.b;
            } else {
                fileArr = listFiles;
            }
        }
        for (File file : etw.g(fileArr, null)) {
            erv b2 = erv.b(etwVar.b, file);
            if (b2 == null) {
                ((ltd) ((ltd) etw.a.d()).k("com/google/android/apps/inputmethod/libs/theme/listing/ThemeListingFragmentPeer", "getSystemThemeItemAdapter", 779, "ThemeListingFragmentPeer.java")).w("Failed to load system zip theme package: %s", file.getName());
            } else {
                arrayList2.add(new eub(eru.b(etwVar.b, b2.a), eul.g(etwVar.b, erj.a(file.getName()))));
            }
        }
        euf eufVar = new euf(4, arrayList2, etwVar);
        if (eufVar.y() > 0) {
            etwVar.h.A(etwVar.b.getString(R.string.f176390_resource_name_obfuscated_res_0x7f140cd0), eufVar, etwVar);
        }
        eun eunVar2 = etwVar.h;
        String string2 = etwVar.b.getString(R.string.f176360_resource_name_obfuscated_res_0x7f140ccd);
        ArrayList arrayList3 = new ArrayList();
        for (String str : etwVar.b.getResources().getStringArray(R.array.f1320_resource_name_obfuscated_res_0x7f03001f)) {
            eqg eqgVar = new eqg(str);
            eri b3 = erj.b(etwVar.b, eqgVar);
            if (b3 != null) {
                arrayList3.add(new eub(eru.b(etwVar.b, b3.e()), eul.g(etwVar.b, eqgVar)));
            }
        }
        eunVar2.A(string2, new euf(2, arrayList3, etwVar), etwVar);
        etwVar.d.a(etwVar);
        this.b = gqa.a(fT());
    }

    @Override // defpackage.an
    public final void f() {
        RecyclerView recyclerView;
        etw etwVar = this.a;
        if (etwVar != null && (recyclerView = etwVar.g) != null) {
            recyclerView.aa(null);
            etwVar.g = null;
        }
        super.f();
    }

    @Override // defpackage.an
    public final void h(Bundle bundle) {
        etw etwVar = this.a;
        if (etwVar != null) {
            bundle.putInt("SAVED_LAST_CLICKED_SECTION_POSITION", etwVar.k);
        }
    }
}
