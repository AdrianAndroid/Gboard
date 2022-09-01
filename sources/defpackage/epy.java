package defpackage;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: epy  reason: default package */
/* loaded from: classes.dex */
public final class epy implements eri {
    private static final ltg c = ltg.j("com/google/android/apps/inputmethod/libs/theme/core/BuiltinThemePackage");
    public final eve a;
    public final String b;
    private final AssetManager d;

    private epy(AssetManager assetManager, eve eveVar, String str) {
        this.d = assetManager;
        this.a = eveVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.epy b(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.epy.b(android.content.Context, java.lang.String, java.lang.String):epy");
    }

    public static euw d(AssetManager assetManager, List list, euw euwVar) {
        nfh nfhVar = (nfh) euwVar.N(5);
        nfhVar.cG(euwVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            era.t(nfhVar, assetManager, (String) it.next());
        }
        return (euw) nfhVar.cz();
    }

    @Override // defpackage.eri
    public final /* synthetic */ Bitmap a(String str, int i, int i2) {
        return null;
    }

    @Override // defpackage.eri
    public final euw c(Set set, euw euwVar) {
        return d(this.d, eru.c(this.a, set), euwVar);
    }

    @Override // defpackage.eri
    public final eve e() {
        return this.a;
    }

    @Override // defpackage.eri
    public final String f() {
        return this.b;
    }
}
