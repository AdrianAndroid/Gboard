package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: drj  reason: default package */
/* loaded from: classes.dex */
public final class drj implements gyg {
    public static volatile drj a;
    private static final lug e = lug.i("MozcShortcutsData");
    public final ikj b;
    public final dsg c;
    public byte[] d;
    private final Executor f;
    private final List g = new ArrayList();

    public drj(Executor executor, ikj ikjVar, dsg dsgVar) {
        this.f = executor;
        this.b = ikjVar;
        this.c = dsgVar;
    }

    @Override // defpackage.gyg
    public final void b() {
        this.g.clear();
    }

    @Override // defpackage.gyg
    public final void c() {
        this.g.size();
        ArrayList arrayList = new ArrayList(this.g);
        this.g.clear();
        ((luc) ((luc) e.b()).k("com/google/android/apps/inputmethod/libs/mozc/ime/MozcShortcutsDataHandler", "endProcess", 119, "MozcShortcutsDataHandler.java")).t("Scheduling import task");
        this.f.execute(new dod(this, arrayList, 4));
    }

    @Override // defpackage.gyg
    public final void d(Object[] objArr) {
        String m = gyo.m(objArr);
        String i = gyo.i(objArr);
        String e2 = gyo.e(objArr);
        if (!drl.d(m) || !drl.c(i)) {
            return;
        }
        List list = this.g;
        if (TextUtils.isEmpty(e2)) {
            e2 = Locale.ROOT.toString();
        }
        list.add(new drk(i, m, e2));
    }

    @Override // defpackage.gyg
    public final void g() {
        this.g.clear();
    }
}
