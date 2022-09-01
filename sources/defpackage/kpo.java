package defpackage;

import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* renamed from: kpo  reason: default package */
/* loaded from: classes.dex */
public final class kpo implements koo {
    public boolean a = false;

    private kpo() {
    }

    public static kpo b() {
        return new kpo();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kpt] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.koo
    /* renamed from: c */
    public final InputStream a(kon konVar) {
        InputStream e = konVar.a.e((Uri) konVar.e);
        if (this.a) {
            e = new BufferedInputStream(e);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(e);
        if (!konVar.c.isEmpty()) {
            ?? r2 = konVar.c;
            ArrayList arrayList2 = new ArrayList();
            for (kpx kpxVar : r2) {
                kpxVar.f();
            }
            kok kokVar = !arrayList2.isEmpty() ? new kok(e, arrayList2) : null;
            if (kokVar != null) {
                arrayList.add(kokVar);
            }
        }
        for (kpy kpyVar : konVar.b) {
            arrayList.add(kpyVar.b((InputStream) lre.ac(arrayList)));
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }
}
