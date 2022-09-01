package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: grh  reason: default package */
/* loaded from: classes.dex */
public final class grh implements hhk, inm {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/accesspoint/impl/AccessPointOrderHelper");
    public static final llp b = llp.u("settings", "theme_setting", "floating_keyboard", "one_handed");
    public final ino c;
    public final lmz d;
    public final List e = new ArrayList();
    public int f;
    public ija g;
    private final Context h;

    public grh(Context context, ino inoVar) {
        this.c = inoVar;
        this.h = context;
        this.d = lmz.q(context.getResources().getStringArray(R.array.f2080_resource_name_obfuscated_res_0x7f030071));
        ija a2 = ijf.a(new fqa(this, 9), ino.a);
        this.g = a2;
        a2.e(mjl.a);
    }

    public static lmz d(String[] strArr, leq leqVar, lfe lfeVar) {
        lmx lmxVar = new lmx();
        for (String str : strArr) {
            Object obj = str;
            if (leqVar != null) {
                obj = leqVar.a(str);
            }
            if (obj != null && lfeVar.a(obj)) {
                lmxVar.d(obj);
            }
        }
        return lmxVar.g();
    }

    public static void i(ino inoVar, Collection collection) {
        inoVar.j("access_points_showing_order", TextUtils.join(";", collection));
    }

    private static lmz l(String[] strArr, lfe lfeVar) {
        return d(strArr, null, lfeVar);
    }

    public final llp c() {
        return llp.o(this.e);
    }

    public final lmz e() {
        j();
        lmz lmzVar = null;
        String d = this.c.d("access_points_showing_order", null);
        if (!TextUtils.isEmpty(d)) {
            String[] split = d.split(";");
            lmz lmzVar2 = this.d;
            Objects.requireNonNull(lmzVar2);
            lmz l = l(split, new ein(lmzVar2, 6));
            if (!l.isEmpty()) {
                lmzVar = l;
            }
        }
        if (lmzVar != null) {
            return lmzVar;
        }
        lmz h = h();
        if (h != null) {
            return h;
        }
        lmz f = f();
        if (f == null) {
            f = g();
        }
        gqj.a.e(this);
        gqj.b.e(this);
        return f;
    }

    public final lmz f() {
        String str;
        ino.L().af(this, "is_foldable_device");
        if (!gzq.c(this.h) && (!((Boolean) gzq.a.c()).booleanValue() || !gzq.d(this.h, true))) {
            ino.L().Y(this, "is_foldable_device");
            str = (String) gqj.a.c();
        } else {
            str = (String) gqj.b.c();
        }
        String[] split = str.split(";");
        lmz lmzVar = this.d;
        Objects.requireNonNull(lmzVar);
        lmz l = l(split, new ein(lmzVar, 6));
        if (l.isEmpty()) {
            return null;
        }
        return l;
    }

    public final lmz g() {
        String str;
        ino.L().af(this, "is_foldable_device");
        if (!gzq.c(this.h) && (!((Boolean) gzq.a.c()).booleanValue() || !gzq.d(this.h, true))) {
            ino.L().Y(this, "is_foldable_device");
            str = (String) gqj.a.a();
        } else {
            str = (String) gqj.b.a();
        }
        if (TextUtils.isEmpty(str)) {
            return lrr.a;
        }
        String[] split = str.split(";");
        lmz lmzVar = this.d;
        Objects.requireNonNull(lmzVar);
        return l(split, new ein(lmzVar, 6));
    }

    @Override // defpackage.inm
    public final void go(ino inoVar, String str) {
        if (str.equals("is_foldable_device")) {
            k(e());
        }
    }

    public final lmz h() {
        String x = jbt.x(this.h.getApplicationContext(), R.string.f175030_resource_name_obfuscated_res_0x7f140c45);
        if (TextUtils.isEmpty(x)) {
            return null;
        }
        String[] split = x.split(";");
        lmz lmzVar = this.d;
        Objects.requireNonNull(lmzVar);
        lmz l = l(split, new ein(lmzVar, 6));
        if (!l.isEmpty()) {
            return l;
        }
        return null;
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        if (!this.c.ai("access_points_showing_order")) {
            k(f());
        } else {
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/accesspoint/impl/AccessPointOrderHelper", "flagUpdated", 247, "AccessPointOrderHelper.java")).t("Ignoring the access points showing order pushed from server because the user has local customized order");
        }
    }

    public final void j() {
        gqj.a.g(this);
        gqj.b.g(this);
    }

    public final void k(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        this.f = collection.size();
        if (this.e.isEmpty()) {
            this.e.addAll(collection);
            return;
        }
        ArrayList arrayList = new ArrayList(this.e);
        this.e.clear();
        this.e.addAll(collection);
        arrayList.removeAll(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList);
        this.e.addAll(arrayList);
    }
}
