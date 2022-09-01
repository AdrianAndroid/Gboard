package defpackage;

import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cek  reason: default package */
/* loaded from: classes.dex */
public final class cek extends byr {
    private static final lug a = lug.i("SuperDelight");
    private final Delight5Facilitator b;
    private final cfd c;
    private final idk d;
    private final boolean e;
    private final int f;
    private final long g = System.currentTimeMillis();

    public cek(Delight5Facilitator delight5Facilitator, cfd cfdVar, idk idkVar, boolean z, int i) {
        super("delight");
        this.b = delight5Facilitator;
        this.c = cfdVar;
        this.d = idkVar;
        this.e = z;
        this.f = i;
    }

    @Override // defpackage.byr
    protected final void c(boolean z, Throwable th) {
        ((luc) ((luc) ((luc) a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/DelightSyncResultCallback", "onSyncFailure", 'x', "DelightSyncResultCallback.java")).t("DelightSyncResultCallback#onSyncFailure()");
        this.d.e(cap.SUPER_DELIGHT_SYNC, false, Boolean.valueOf(this.e));
        if (z) {
            this.c.k(true);
        }
    }

    @Override // defpackage.byr
    protected final void d(jre jreVar) {
        cdx cdxVar;
        if (!jreVar.f()) {
            ((luc) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/DelightSyncResultCallback", "onSyncSuccess", 69, "DelightSyncResultCallback.java")).w("DelightSyncResultCallback#onSuccess(): [download] unfinished syncResult %s", jreVar);
        }
        this.d.e(cap.SUPER_DELIGHT_SYNC, true, Boolean.valueOf(this.e));
        if (!((Boolean) cas.d.c()).booleanValue() && jreVar.e()) {
            llp a2 = jreVar.a();
            ArrayList arrayList = new ArrayList();
            lta listIterator = a2.listIterator();
            while (listIterator.hasNext()) {
                Locale g = cei.g((juc) listIterator.next());
                if (g != null && !arrayList.contains(g)) {
                    arrayList.add(g);
                }
            }
            this.b.y(arrayList);
        }
        if (jreVar.e() || this.f != 1 || (cdxVar = cdx.a) == null || cdxVar.f >= this.g) {
            return;
        }
        List n = this.b.n();
        List list = cdxVar.e;
        list.retainAll(n);
        if (list.isEmpty()) {
            return;
        }
        this.b.y(list);
        if (cdxVar.f >= this.g) {
            return;
        }
        cdxVar.f = Long.MAX_VALUE;
    }
}
