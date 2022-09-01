package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import java.util.Set;

/* compiled from: PG */
/* renamed from: esa  reason: default package */
/* loaded from: classes.dex */
public final class esa implements eqy {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public esa(Context context, String str, int i) {
        this.a = i;
        this.b = context.getAssets();
        this.c = str;
    }

    public esa(evc evcVar, eqy eqyVar, int i) {
        this.a = i;
        this.c = evcVar;
        this.b = eqyVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, eqy] */
    @Override // defpackage.eqy
    public final euw a(euw euwVar, Set set) {
        if (this.a != 0) {
            return !set.contains(this.c) ? euwVar : this.b.a(euwVar, set);
        }
        nfh nfhVar = (nfh) euwVar.N(5);
        nfhVar.cG(euwVar);
        era.t(nfhVar, (AssetManager) this.b, (String) this.c);
        return (euw) nfhVar.cz();
    }
}
