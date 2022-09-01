package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: etw  reason: default package */
/* loaded from: classes.dex */
public final class etw implements etc, ete, eua, eum, etk {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/listing/ThemeListingFragmentPeer");
    public final Context b;
    public final etf c;
    public final etd d;
    public final idk e;
    public final boolean f;
    public RecyclerView g;
    public final eun h;
    public int k;
    public boolean l;
    public boolean m;
    public File n;
    public mko o;
    public String p;
    public final ewj q;
    public int i = -1;
    private final Set r = new HashSet();
    public final Set j = new HashSet();

    public etw(Context context, etf etfVar, etd etdVar, ewj ewjVar, idk idkVar, Bundle bundle, Bundle bundle2, byte[] bArr) {
        this.k = -1;
        this.b = context;
        this.c = etfVar;
        this.d = etdVar;
        this.q = ewjVar;
        this.e = idkVar;
        this.f = bundle.getBoolean("ARGUMENT_EXIT_ON_APPLY", false);
        this.h = new etb(context);
        if (bundle2 != null) {
            this.k = bundle2.getInt("SAVED_LAST_CLICKED_SECTION_POSITION", -1);
        }
    }

    public static String f(Intent intent) {
        return intent.getStringExtra("intent_extra_key_new_theme_file_name");
    }

    public static List g(File[] fileArr, Comparator comparator) {
        ArrayList arrayList = new ArrayList(Arrays.asList(fileArr));
        Collections.sort(arrayList, comparator);
        return arrayList;
    }

    public static void i(Context context) {
        if (!erj.l(context, eqg.a(context).a)) {
            ino.M(context).v(R.string.f161570_resource_name_obfuscated_res_0x7f1406be);
        }
    }

    private final String r(String str, int i) {
        return this.b.getString(R.string.f176350_resource_name_obfuscated_res_0x7f140ccc, str, Integer.valueOf(i + 1));
    }

    @Override // defpackage.etc
    public final void a(eva evaVar) {
        for (euy euyVar : evaVar.a) {
            if (this.r.add(euyVar.a)) {
                ArrayList arrayList = new ArrayList(euyVar.c.size());
                for (euz euzVar : euyVar.c) {
                    arrayList.add(new eud(r(euyVar.b, arrayList.size()), euzVar.b, euzVar.c, euzVar.a));
                }
                euf eufVar = new euf(5, arrayList, this);
                eufVar.F(this.b);
                this.h.A(euyVar.b, eufVar, this);
            }
        }
    }

    @Override // defpackage.ete
    public final void b(String str, File file) {
        if (this.l) {
            return;
        }
        this.j.remove(str);
        eul f = eul.f(this.b, file.getName());
        String str2 = null;
        euf eufVar = null;
        int i = -1;
        for (euf eufVar2 : this.h.z()) {
            for (int i2 = 0; i2 < eufVar2.y(); i2++) {
                if (eufVar2.A(i2).f(f)) {
                    str2 = eufVar2.A(i2).b();
                    eufVar2.D(i2, etz.NONE);
                    eufVar = eufVar2;
                    i = i2;
                }
            }
        }
        if (str2 == null || eufVar == null) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/theme/listing/ThemeListingFragmentPeer", "onThemePackageDownloaded", 359, "ThemeListingFragmentPeer.java")).t("Title or target adapter is null.");
        } else {
            h(str2, 5, f, eufVar, i);
        }
    }

    @Override // defpackage.etk
    public final void c(String str) {
        File file = this.n;
        if (file == null || !jdg.W(file.getName(), str)) {
            return;
        }
        this.n = null;
    }

    @Override // defpackage.etk
    public final void d(eul eulVar) {
        o();
        String k = eulVar.k();
        if (!jez.g(this.b) || k == null || !erj.j(k)) {
            return;
        }
        l(erj.h(this.b, k));
    }

    public final euf e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new euc(this.b.getString(R.string.f176520_resource_name_obfuscated_res_0x7f140cdd)));
        qo qoVar = new qo();
        for (eul eulVar : eti.a(this.b)) {
            String r = r(this.b.getString(R.string.f176380_resource_name_obfuscated_res_0x7f140ccf), arrayList.size() - 1);
            qoVar.put(eulVar, Integer.valueOf(arrayList.size()));
            arrayList.add(new eub(r, eulVar));
        }
        ArrayList<eub> arrayList2 = new ArrayList();
        for (File file : g(evf.a(this.b), Collections.reverseOrder())) {
            File file2 = this.n;
            if (file2 == null || !jdg.W(file2.getName(), file.getName())) {
                erv b = erv.b(this.b, file);
                if (b == null) {
                    ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/theme/listing/ThemeListingFragmentPeer", "getUserThemeItems", 763, "ThemeListingFragmentPeer.java")).w("Failed to load zip theme package: %s", file.getName());
                } else {
                    arrayList2.add(new eub(eru.b(this.b, b.a), eul.f(this.b, file.getName())));
                }
            }
        }
        for (eub eubVar : arrayList2) {
            Integer num = (Integer) qoVar.get(eubVar.b);
            if (num != null) {
                arrayList.set(num.intValue(), eubVar);
            } else {
                arrayList.add(eubVar);
            }
        }
        return new euf(6, arrayList, this);
    }

    public final void h(final String str, final int i, final eul eulVar, final euf eufVar, final int i2) {
        etz etzVar;
        if (eufVar.B(i2) != etz.LOADING) {
            etzVar = eufVar.B(i2);
            eufVar.D(i2, etz.LOADING);
        } else {
            etzVar = etz.NONE;
        }
        final etz etzVar2 = etzVar;
        etq.e(this.b, eulVar.b(), eulVar.m(this.b), new dlm() { // from class: etu
            @Override // defpackage.dlm
            public final void b(String str2, Drawable drawable) {
                etw etwVar = etw.this;
                euf eufVar2 = eufVar;
                int i3 = i2;
                etz etzVar3 = etzVar2;
                String str3 = str;
                int i4 = i;
                eul eulVar2 = eulVar;
                if (!etwVar.l) {
                    eufVar2.D(i3, etzVar3);
                    etwVar.n(str3, i4, eulVar2, drawable);
                }
            }
        }, etq.a(eulVar.p()));
    }

    public final void j(Intent intent) {
        this.e.e(erh.CREATED, new Object[0]);
        String f = f(intent);
        if (TextUtils.isEmpty(f)) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/theme/listing/ThemeListingFragmentPeer", "handleThemeBuilderResult", 222, "ThemeListingFragmentPeer.java")).w("ThemeBuilderActivity should set result data for key: %s", "intent_extra_key_new_theme_file_name");
            return;
        }
        File file = new File(this.b.getFilesDir(), f);
        erv b = erv.b(this.b, file);
        if (b == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/theme/listing/ThemeListingFragmentPeer", "handleThemeBuilderResult", 230, "ThemeListingFragmentPeer.java")).w("Failed to load newly created zip theme package: %s", f);
            return;
        }
        final String b2 = eru.b(this.b, b.a);
        final eul f2 = eul.f(this.b, f);
        this.n = file;
        etq.e(this.b, f2.b(), f2.m(this.b), new dlm() { // from class: etv
            @Override // defpackage.dlm
            public final void b(String str, Drawable drawable) {
                etw etwVar = etw.this;
                String str2 = b2;
                eul eulVar = f2;
                if (!etwVar.l) {
                    etwVar.n(str2, 6, eulVar, drawable);
                }
            }
        }, etq.a(f2.p()));
    }

    public final void k() {
        String str;
        if (!jez.g(this.b)) {
            return;
        }
        mko mkoVar = this.o;
        if (mkoVar != null) {
            if (mkoVar.cancel(true) && (str = this.p) != null) {
                jez.c(this.b, str);
            }
            this.p = null;
            this.o = null;
        }
        p(false);
    }

    public final void l(String str) {
        if (!jez.g(this.b) || str == null) {
            return;
        }
        jez.c(this.b, str);
    }

    public final void m(int i, eul eulVar) {
        int i2 = 0;
        while (i2 < this.h.ha()) {
            euf eufVar = (euf) this.h.z().get(i2);
            int x = i2 == i ? eufVar.x(eulVar) : -1;
            if (x != -1) {
                if (eufVar.g.get(x) != etz.SELECTED) {
                    eufVar.C();
                    eufVar.D(x, etz.SELECTED);
                }
            } else {
                eufVar.C();
            }
            i2++;
        }
    }

    public final void n(String str, int i, eul eulVar, Drawable drawable) {
        if (this.m) {
            return;
        }
        this.m = true;
        euo euoVar = new euo();
        euoVar.ad = this;
        etl etlVar = euoVar.ac;
        if (etlVar != null) {
            etlVar.j = this;
        }
        euoVar.ae = drawable;
        Bundle bundle = new Bundle();
        bundle.putString("arg_title", str);
        bundle.putInt("arg_category_type", i);
        eulVar.b.d(bundle);
        ewj ewjVar = this.q;
        euoVar.Z(bundle);
        euoVar.ae((an) ewjVar.a, 0);
        bq i2 = ((ap) ewjVar.b).hB().i();
        i2.o(euoVar, "PreferencePageNavigator_Dialog");
        i2.k();
    }

    public final void o() {
        i(this.b);
        int i = -1;
        if (this.i == -1) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/theme/listing/ThemeListingFragmentPeer", "updateAdapters", 633, "ThemeListingFragmentPeer.java")).t("No position.");
        }
        eun eunVar = this.h;
        int i2 = this.i;
        eunVar.f.set(i2, e());
        eunVar.hg(i2);
        int i3 = 0;
        p(this.o != null);
        eul e = eul.e(this.b);
        while (true) {
            if (i3 >= this.h.ha()) {
                break;
            } else if (((euf) this.h.z().get(i3)).x(e) != -1) {
                i = i3;
                break;
            } else {
                i3++;
            }
        }
        m(i, e);
        for (euf eufVar : this.h.z()) {
            eufVar.F(this.b);
        }
    }

    public final void p(boolean z) {
        if (this.l || !jez.g(this.b)) {
            return;
        }
        this.h.x(this.i).D(0, z ? etz.LOADING : etz.NONE);
    }

    @Override // defpackage.eum
    public final void q(euf eufVar) {
        this.e.e(erh.CATEGORY_SHOW_MORE, Integer.valueOf(eufVar.e));
    }

    @Override // defpackage.ete
    public final void s(String str) {
        if (this.l) {
            return;
        }
        this.j.remove(str);
        this.c.b(str);
        eul f = eul.f(this.b, etg.e(str));
        Iterator it = this.h.z().iterator();
        while (true) {
            if (it.hasNext()) {
                euf eufVar = (euf) it.next();
                for (int i = 0; i < eufVar.y(); i++) {
                    if (eufVar.A(i).f(f)) {
                        eufVar.D(i, etz.DOWNLOADABLE);
                    }
                }
            } else {
                ewj ewjVar = this.q;
                Toast.makeText((Context) ewjVar.b, this.b.getString(R.string.f175920_resource_name_obfuscated_res_0x7f140c9e), 0).show();
                return;
            }
        }
    }
}
