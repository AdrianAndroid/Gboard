package defpackage;

import android.content.Context;
import com.google.android.libraries.inputmethod.trainingcache.maintenance.maintainer.MaintenanceTaskRunner;
import com.google.android.libraries.inputmethod.userfeaturecache.UserFeatureCache;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: cxo  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cxo implements leq {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ cxo(Context context, long j, int i) {
        this.c = i;
        this.b = context;
        this.a = j;
    }

    public /* synthetic */ cxo(UserFeatureCache userFeatureCache, long j, int i) {
        this.c = i;
        this.b = userFeatureCache;
        this.a = j;
    }

    public /* synthetic */ cxo(cpu cpuVar, long j, int i) {
        this.c = i;
        this.b = cpuVar;
        this.a = j;
    }

    public /* synthetic */ cxo(String str, long j, int i) {
        this.c = i;
        this.b = str;
        this.a = j;
    }

    public /* synthetic */ cxo(dan[] danVarArr, long j, int i) {
        this.c = i;
        this.b = danVarArr;
        this.a = j;
    }

    @Override // defpackage.leq
    public final Object a(Object obj) {
        int i = this.c;
        int i2 = 5;
        if (i == 0) {
            Object obj2 = this.b;
            long j = this.a;
            cxl cxlVar = (cxl) obj;
            int i3 = cxp.d;
            ArrayList B = lre.B(cxlVar.b);
            cxp.a(B, (String) obj2, j);
            nfh nfhVar = (nfh) cxlVar.N(5);
            nfhVar.cG(cxlVar);
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            ((cxl) nfhVar.b).b = cxl.G();
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            cxl cxlVar2 = (cxl) nfhVar.b;
            nga ngaVar = cxlVar2.b;
            if (!ngaVar.c()) {
                cxlVar2.b = nfm.H(ngaVar);
            }
            ndt.cs(B, cxlVar2.b);
            return (cxl) nfhVar.cz();
        } else if (i == 1) {
            Object obj3 = this.b;
            long j2 = this.a;
            llp llpVar = (llp) obj;
            cpp cppVar = ((cpu) obj3).d;
            synchronized (cppVar.b) {
                if (llpVar.size() >= cppVar.b.size()) {
                    cppVar.b.evictAll();
                    cppVar.c = Math.min(j2, 100L);
                    lta listIterator = llpVar.subList(0, Math.min(llpVar.size(), 100)).a().listIterator();
                    while (listIterator.hasNext()) {
                        cppVar.b.put((String) listIterator.next(), cpp.a);
                        cppVar.b.size();
                    }
                    cppVar.b.size();
                }
            }
            return llpVar;
        } else if (i != 2) {
            if (i == 3) {
                Object obj4 = this.b;
                long j3 = this.a;
                Void r2 = (Void) obj;
                ltg ltgVar = MaintenanceTaskRunner.a;
                ino K = ino.K((Context) obj4, null);
                long c = K.c("pref_training_cache_maintenance_task_last_run", 0L);
                long currentTimeMillis = System.currentTimeMillis();
                if (c == 0) {
                    ieh.j().e(iwc.MAINTENANCE_TASK_INTERVAL_HOURS, -1L);
                } else {
                    ieh.j().e(iwc.MAINTENANCE_TASK_INTERVAL_HOURS, Long.valueOf(TimeUnit.MILLISECONDS.toHours(currentTimeMillis - c)));
                }
                K.i("pref_training_cache_maintenance_task_last_run", currentTimeMillis);
                ieh.j().e(iwc.MAINTENANCE_TASK_RESULT, 0);
                ieh.j().g(iwe.MAINTENANCE_CLEANUP_DURATION, System.currentTimeMillis() - j3);
                return null;
            }
            return ((UserFeatureCache) this.b).l(this.a, (byte[]) obj);
        } else {
            Object obj5 = this.b;
            long j4 = this.a;
            dao daoVar = (dao) obj;
            hhl hhlVar = das.a;
            ArrayList B2 = lre.B(daoVar.a);
            dan[] danVarArr = (dan[]) obj5;
            int length = danVarArr.length;
            int i4 = 0;
            while (i4 < length) {
                dan danVar = danVarArr[i4];
                int X = lre.X(B2, new cjm(danVar, 13));
                if (X >= 0) {
                    dal dalVar = (dal) B2.get(X);
                    nfh nfhVar2 = (nfh) dalVar.N(i2);
                    nfhVar2.cG(dalVar);
                    int i5 = dalVar.c + 1;
                    if (nfhVar2.c) {
                        nfhVar2.cD();
                        nfhVar2.c = false;
                    }
                    dal dalVar2 = (dal) nfhVar2.b;
                    int i6 = dalVar2.a | 2;
                    dalVar2.a = i6;
                    dalVar2.c = i5;
                    dalVar2.a = i6 | 4;
                    dalVar2.d = j4;
                    B2.set(X, (dal) nfhVar2.cz());
                } else {
                    nfh t = dal.e.t();
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    dal dalVar3 = (dal) t.b;
                    danVar.getClass();
                    dalVar3.b = danVar;
                    int i7 = dalVar3.a | 1;
                    dalVar3.a = i7;
                    int i8 = i7 | 2;
                    dalVar3.a = i8;
                    dalVar3.c = 1;
                    dalVar3.a = i8 | 4;
                    dalVar3.d = j4;
                    B2.add((dal) t.cz());
                }
                i4++;
                i2 = 5;
            }
            Collections.sort(B2, xr.h);
            nfh nfhVar3 = (nfh) daoVar.N(5);
            nfhVar3.cG(daoVar);
            if (nfhVar3.c) {
                nfhVar3.cD();
                nfhVar3.c = false;
            }
            ((dao) nfhVar3.b).a = dao.G();
            if (nfhVar3.c) {
                nfhVar3.cD();
                nfhVar3.c = false;
            }
            dao daoVar2 = (dao) nfhVar3.b;
            nga ngaVar2 = daoVar2.a;
            if (!ngaVar2.c()) {
                daoVar2.a = nfm.H(ngaVar2);
            }
            ndt.cs(B2, daoVar2.a);
            return (dao) nfhVar3.cz();
        }
    }
}
