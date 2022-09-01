package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: azr  reason: default package */
/* loaded from: classes.dex */
final class azr implements azn {
    private final List a;
    private final xx b;

    public azr(List list, xx xxVar) {
        this.a = list;
        this.b = xxVar;
    }

    @Override // defpackage.azn
    public final boolean a(Object obj) {
        for (azn aznVar : this.a) {
            if (aznVar.a(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [auw] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // defpackage.azn
    public final fws b(Object obj, int i, int i2, ava avaVar) {
        fws b;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        int i3 = 0;
        ?? r4 = 0;
        while (i3 < size) {
            azn aznVar = (azn) this.a.get(i3);
            if (aznVar.a(obj) && (b = aznVar.b(obj, i, i2, avaVar)) != null) {
                r4 = b.c;
                arrayList.add(b.a);
            }
            i3++;
            r4 = r4;
        }
        if (arrayList.isEmpty() || r4 == 0) {
            return null;
        }
        return new fws((auw) r4, new azq(arrayList, this.b));
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a.toArray());
        return "MultiModelLoader{modelLoaders=" + arrays + "}";
    }
}
