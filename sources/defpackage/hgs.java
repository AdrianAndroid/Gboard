package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: hgs  reason: default package */
/* loaded from: classes.dex */
public final class hgs implements idm {
    public static final Map a = nxp.l(oix.b("tenoranimation_feature_split", "TenorAnimation"), oix.b("brella_feature_split", "Brella"));
    public final idi b;
    private final idb c = new hgt(this);

    public hgs(idi idiVar) {
        oll.e(idiVar, "clearcutAdapter");
        this.b = idiVar;
    }

    public final void a(Collection collection) {
        int i;
        oll.e(collection, "newPendingModules");
        ido idoVar = this.c.b;
        if (idoVar == hgu.ALREADY_INSTALLED) {
            i = 2;
        } else {
            i = idoVar == hgu.DEFERRED_INSTALL_REQUESTED ? 3 : idoVar == hgu.NEWLY_INSTALLED ? 4 : 1;
        }
        int i2 = i - 1;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            idi idiVar = this.b;
            Object orDefault = Map.EL.getOrDefault(a, (String) it.next(), "Invalid");
            new StringBuilder("FeatureSplit.").append(orDefault);
            idiVar.d("FeatureSplit.".concat(String.valueOf(orDefault)), i2);
        }
    }

    public final void b() {
        int i;
        ido idoVar = this.c.b;
        if (idoVar == hgu.BRELLA_JNI_LOADED_FROM_FEATURE_SPLIT) {
            i = 2;
        } else {
            i = idoVar == hgu.BRELLA_JNI_LOADED_FROM_EMBEDDED_SHARED_OBJECT ? 3 : idoVar == hgu.BRELLA_JNI_LOADED_FROM_EMBEDDED_SHARED_OBJECT_WITH_STUB ? 5 : idoVar == hgu.BRELLA_JNI_FAILED_IN_LOADING ? 4 : 1;
        }
        this.b.d("FeatureSplit.Brella.LoadStatus", i - 1);
    }

    @Override // defpackage.idj
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.idj
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        oll.e(iduVar, "sessionInfo");
        this.c.b(idoVar, iduVar, j, j2, objArr);
    }

    @Override // defpackage.idm
    public final /* synthetic */ void r(idl idlVar) {
    }

    @Override // defpackage.idj
    public final /* synthetic */ boolean s() {
        return true;
    }

    @Override // defpackage.idm
    public final ido[] t() {
        return hgt.a;
    }
}
