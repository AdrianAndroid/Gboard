package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: PG */
/* renamed from: bmf  reason: default package */
/* loaded from: classes.dex */
public final class bmf {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public bmf() {
        this.a = new bek((byte[]) null);
        this.c = new bej();
        xx a = bgq.a(new xz(20), new ayj(2), new bgl());
        this.d = a;
        this.i = new azp(a);
        this.g = new aqr((byte[]) null, (byte[]) null);
        this.j = new bek();
        this.b = new boe((byte[]) null);
        this.h = new avo();
        this.f = new aqr((char[]) null);
        this.e = new aqr((byte[]) null);
        List<String> asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String str : asList) {
            arrayList.add(str);
        }
        arrayList.add("legacy_append");
        ((bek) this.j).d(arrayList);
    }

    public static long a(List list) {
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            bme bmeVar = (bme) it.next();
            j += bmeVar.a.length() + bmeVar.b.length() + 4;
        }
        return j;
    }

    public final avl b(Object obj) {
        return ((avo) this.h).a(obj);
    }

    public final List c() {
        List b = ((aqr) this.e).b();
        if (!b.isEmpty()) {
            return b;
        }
        throw new atm();
    }

    public final List d(Object obj) {
        List b = ((azp) this.i).b(obj.getClass());
        if (b.isEmpty()) {
            throw new atn(obj);
        }
        int size = b.size();
        List emptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            azn aznVar = (azn) b.get(i);
            if (aznVar.a(obj)) {
                if (z) {
                    emptyList = new ArrayList(size - i);
                }
                emptyList.add(aznVar);
                z = false;
            }
        }
        if (emptyList.isEmpty()) {
            throw new atn(obj, b);
        }
        return emptyList;
    }

    public final void e(Class cls, auo auoVar) {
        ((aqr) this.g).e(cls, auoVar);
    }

    public final void f(Class cls, avd avdVar) {
        ((boe) this.b).g(cls, avdVar);
    }

    public final void g(Class cls, Class cls2, avc avcVar) {
        i("legacy_append", cls, cls2, avcVar);
    }

    public final void h(Class cls, Class cls2, azo azoVar) {
        ((azp) this.i).c(cls, cls2, azoVar);
    }

    public final void i(String str, Class cls, Class cls2, avc avcVar) {
        ((bek) this.j).c(str, avcVar, cls, cls2);
    }

    public final void j(Class cls, Class cls2, azo azoVar) {
        ((azp) this.i).d(cls, cls2, azoVar);
    }

    public final void k(auq auqVar) {
        ((aqr) this.e).c(auqVar);
    }

    public final void l(avk avkVar) {
        ((avo) this.h).b(avkVar);
    }

    public final void m(Class cls, Class cls2, bcv bcvVar) {
        ((aqr) this.f).h(cls, cls2, bcvVar);
    }

    public final void n(Class cls, Class cls2, azo azoVar) {
        ((azp) this.i).e(cls, cls2, azoVar);
    }

    public bmf(gjz gjzVar, byte[] bArr) {
        this.b = new ConcurrentLinkedQueue();
        this.a = new Object();
        this.c = new SparseIntArray(32);
        this.d = new SparseArray();
        this.e = new SparseArray();
        this.f = new SparseArray();
        this.g = new SparseArray();
        this.h = new SparseArray();
        this.i = new SparseArray();
        this.j = gjzVar;
    }
}
