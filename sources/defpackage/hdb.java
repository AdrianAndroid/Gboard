package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: hdb  reason: default package */
/* loaded from: classes.dex */
public final class hdb extends AbstractList {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList");
    public final List b;
    public final int c;
    public final int d;
    public final boolean e;
    public int f;
    private final int g;
    private final int[] h;
    private final int[] i;
    private final int j;

    public hdb(llp llpVar, int i, int i2, boolean z, int i3) {
        ArrayList arrayList = new ArrayList(llpVar);
        this.b = arrayList;
        this.j = i;
        this.c = i2;
        this.d = i3;
        if (i3 >= 0) {
            arrayList.add(i3, llp.q());
        }
        int size = arrayList.size();
        this.g = size;
        this.h = new int[size];
        this.i = new int[size];
        this.e = z;
        f();
        if (llpVar.isEmpty()) {
            ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList", "<init>", 59, "ItemViewDataFlatList.java")).t("Initialized with empty categorized sources");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= this.g || i < this.i[i3]) {
                break;
            }
            i2 = i3;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int i) {
        if (i >= this.g) {
            ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList", "getCategorySize", 214, "ItemViewDataFlatList.java")).y("Too large categoryIndex (%s vs %s)", i, this.g);
            return 0;
        }
        return this.h[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(int i) {
        if (i >= this.g) {
            ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList", "getCategoryStartPosition", 232, "ItemViewDataFlatList.java")).y("Too large categoryIndex (%s vs %s)", i, this.g);
            return 0;
        }
        return this.i[i];
    }

    public final int d() {
        if (!this.e) {
            return -1;
        }
        return this.b.size() - 1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public final hda get(int i) {
        int a2 = a(i);
        int i2 = i - this.i[a2];
        if (i2 < 0) {
            ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList", "get", 174, "ItemViewDataFlatList.java")).y("position (%d) for category (%d) is invalid", i, a2);
            return hbn.b;
        } else if (i2 == 0) {
            return new hbl(a2, 0);
        } else {
            if (i2 < ((llp) this.b.get(a2)).size() + 1) {
                return (hda) ((llp) this.b.get(a2)).get(i2 - 1);
            }
            if (i2 != 1 || !((llp) this.b.get(a2)).isEmpty()) {
                return hbn.b;
            }
            return hcs.b;
        }
    }

    public final void f() {
        int i;
        int i2 = 0;
        for (int i3 = 0; i3 < this.g; i3++) {
            llp llpVar = (llp) this.b.get(i3);
            int size = llpVar.size();
            this.i[i3] = i2;
            int i4 = this.d;
            if (i3 == i4 && size > 0) {
                int[] iArr = this.h;
                int i5 = this.c + 1;
                iArr[i4] = i5;
                i2 += i5;
            } else if (i3 != i4) {
                double d = size;
                double d2 = this.c;
                Double.isNaN(d);
                Double.isNaN(d2);
                int max = Math.max((int) Math.ceil(d / d2), this.j);
                if (size <= 0 || (size == 1 && (llpVar.get(0) instanceof hcs))) {
                    i = (max > 0 ? (max - 1) * this.c : 0) + 2;
                } else {
                    i = (max * this.c) + 1;
                }
                this.h[i3] = i;
                i2 += i;
            }
        }
        this.f = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(llp llpVar) {
        if (this.g == 0) {
            ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList", "updateRecent", 65, "ItemViewDataFlatList.java")).t("Couldn't update recents due to empty categorizes sources");
            return;
        }
        this.b.set(0, llpVar);
        f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }
}
