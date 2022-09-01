package defpackage;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: bfi  reason: default package */
/* loaded from: classes.dex */
final class bfi implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference a;
    private final /* synthetic */ int b;

    public bfi(jwy jwyVar, int i, byte[] bArr, byte[] bArr2) {
        this.b = i;
        this.a = new WeakReference(jwyVar);
    }

    public bfi(gkn gknVar, int i, byte[] bArr) {
        this.b = i;
        this.a = new WeakReference(gknVar);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Collection, java.lang.Object] */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = 0;
        if (this.b == 0) {
            gkn gknVar = (gkn) this.a.get();
            if (gknVar != null && !gknVar.a.isEmpty()) {
                int c = gknVar.c();
                int b = gknVar.b();
                if (gkn.e(c, b)) {
                    ArrayList arrayList = new ArrayList((Collection) gknVar.a);
                    int size = arrayList.size();
                    while (i < size) {
                        ((bfg) arrayList.get(i)).g(c, b);
                        i++;
                    }
                    gknVar.d();
                }
            }
            return true;
        }
        jwy jwyVar = (jwy) this.a.get();
        if (jwyVar != null && !jwyVar.c.isEmpty()) {
            int b2 = jwyVar.b();
            int a = jwyVar.a();
            if (jwy.d(b2, a)) {
                ArrayList arrayList2 = new ArrayList((Collection) jwyVar.c);
                int size2 = arrayList2.size();
                while (i < size2) {
                    ((bfg) arrayList2.get(i)).g(b2, a);
                    i++;
                }
                jwyVar.c();
            }
        }
        return true;
    }
}
