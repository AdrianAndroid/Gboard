package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* renamed from: kpl  reason: default package */
/* loaded from: classes.dex */
public final class kpl implements koo {
    private final /* synthetic */ int a;

    public kpl(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kpt] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.koo
    public final /* synthetic */ Object a(kon konVar) {
        int i = this.a;
        kol kolVar = null;
        if (i != 0) {
            if (i == 1) {
                if (konVar.b()) {
                    throw new kpa("Transforms are not supported by this Opener: ".concat(String.valueOf(String.valueOf(konVar.d))));
                }
                return new kph((kcq) konVar.f, (Uri) konVar.d, null, null, null);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            kcq kcqVar = (kcq) konVar.f;
            lre.af(arrayDeque, kcqVar.p(((Uri) konVar.d).buildUpon().fragment(null).build()));
            long j = 0;
            while (!arrayDeque.isEmpty()) {
                Uri uri = (Uri) arrayDeque.remove();
                if (kcqVar.w(uri)) {
                    lre.af(arrayDeque, kcqVar.p(uri));
                } else if (!kcqVar.v(uri)) {
                    throw new FileNotFoundException(String.format("Child %s could not be opened", uri));
                } else {
                    j += kcqVar.o(uri);
                }
            }
            return Long.valueOf(j);
        }
        OutputStream q = konVar.a.q((Uri) konVar.e);
        ArrayList arrayList = new ArrayList();
        arrayList.add(q);
        if (!konVar.c.isEmpty()) {
            ?? r4 = konVar.c;
            Object obj = konVar.d;
            ArrayList arrayList2 = new ArrayList();
            for (kpx kpxVar : r4) {
                kpw a = kpxVar.a((Uri) obj);
                if (a != null) {
                    arrayList2.add(a);
                }
            }
            if (!arrayList2.isEmpty()) {
                kolVar = new kol(q, arrayList2);
            }
            if (kolVar != null) {
                arrayList.add(kolVar);
            }
        }
        for (kpy kpyVar : konVar.b) {
            arrayList.add(kpyVar.d((OutputStream) lre.ac(arrayList)));
        }
        Collections.reverse(arrayList);
        return (OutputStream) arrayList.get(0);
    }
}
