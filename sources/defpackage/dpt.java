package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.libraries.inputmethod.trainingcache.maintenance.maintainer.MaintenanceTaskRunner;
import j$.util.function.Supplier;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: dpt  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dpt implements Supplier {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dpt(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    public /* synthetic */ dpt(dpu dpuVar, int i) {
        this.b = i;
        this.a = dpuVar;
    }

    public /* synthetic */ dpt(dtl dtlVar, int i) {
        this.b = i;
        this.a = dtlVar;
    }

    public /* synthetic */ dpt(iut iutVar, int i) {
        this.b = i;
        this.a = iutVar;
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return Delight5Facilitator.h(((dpu) this.a).a);
                }
                if (i == 3) {
                    return ((dtl) this.a).k;
                }
                if (i == 4) {
                    return (jac) igr.d(((iut) this.a).a).b(jac.class);
                }
                Object obj = this.a;
                ltg ltgVar = MaintenanceTaskRunner.a;
                igr.d((Context) obj);
                return Boolean.valueOf(igr.k(iwl.class));
            }
            hrx.y((Context) this.a);
            HashSet hashSet = new HashSet();
            llp b = hqr.b();
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                hqt hqtVar = (hqt) b.get(i2);
                if (dhr.a(hqtVar)) {
                    hashSet.add(hqtVar.i());
                }
            }
            return hashSet;
        }
        return (jac) igr.d(((dpu) this.a).a).b(jac.class);
    }
}
