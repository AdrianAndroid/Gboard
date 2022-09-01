package defpackage;

import android.util.Printer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: gzt  reason: default package */
/* loaded from: classes.dex */
public final class gzt implements gzv {
    public static final gzt a = new gzt();
    private final Set b = Collections.newSetFromMap(new WeakHashMap());

    private gzt() {
    }

    public final void a(gzv gzvVar) {
        synchronized (this.b) {
            this.b.add(gzvVar);
        }
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        ArrayList arrayList;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.b) {
            arrayList = new ArrayList(this.b);
        }
        Collections.sort(arrayList, xr.r);
        gzw gzwVar = new gzw(printer);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (gzu.b(printer, gzwVar, (gzv) arrayList.get(i3), z)) {
                i++;
            } else {
                i2++;
            }
        }
        gzu.a(printer, "Dumped objects: %d, failures: %d, duration: %dms\n", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }
}
