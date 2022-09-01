package defpackage;

import android.util.LruCache;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: PG */
/* renamed from: end  reason: default package */
/* loaded from: classes.dex */
public final class end {
    public static final String[] a = new String[0];
    public mhn c;
    public mhn d;
    public String f;
    private mhn i;
    private boolean h = true;
    public final BlockingQueue e = new LinkedBlockingDeque();
    private final LruCache g = new LruCache(1000);
    public final LruCache b = new LruCache(50);

    public final synchronized enf a(String str) {
        if (this.b.get(str) != null) {
            return enf.a;
        }
        return (enf) this.g.get(str);
    }

    public final synchronized mhn b() {
        mhn mhnVar;
        if (this.h && (mhnVar = this.i) != null) {
            mhn mhnVar2 = new mhn(mhnVar.g);
            int[] iArr = mhnVar.b;
            mhnVar2.b = Arrays.copyOf(iArr, iArr.length);
            int[] iArr2 = mhnVar.c;
            mhnVar2.c = Arrays.copyOf(iArr2, iArr2.length);
            int[] iArr3 = mhnVar.d;
            mhnVar2.d = Arrays.copyOf(iArr3, iArr3.length);
            int[] iArr4 = mhnVar.f;
            mhnVar2.f = Arrays.copyOf(iArr4, iArr4.length);
            String[][] strArr = mhnVar.e;
            mhnVar2.e = (String[][]) Arrays.copyOf(strArr, strArr.length);
            mhnVar2.j = mhnVar.j;
            if (true == mhnVar2.d((String[]) this.b.snapshot().keySet().toArray(new String[0]))) {
                mhnVar = mhnVar2;
            }
            this.i = mhnVar;
            this.h = false;
        }
        return this.i;
    }

    public final synchronized void c() {
        this.b.evictAll();
    }

    public final synchronized void d(String str) {
        this.g.put(str, enf.a);
    }

    public final synchronized void e(String str, String[] strArr) {
        this.g.put(str, enf.b(strArr));
    }

    public final synchronized void f(String str) {
        this.h = true;
        this.b.put(str, str);
    }

    public final synchronized void g(String str, enf enfVar) {
        this.g.put(str, enfVar);
    }

    public final synchronized void h(mhn mhnVar) {
        this.i = mhnVar;
        this.h = false;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder("SpellCheckerCache");
        for (Map.Entry entry : this.g.snapshot().entrySet()) {
            sb.append("\n[");
            sb.append((String) entry.getKey());
            sb.append("] =");
            sb.append(entry.getValue());
        }
        for (String str : this.b.snapshot().keySet()) {
            sb.append("\n[");
            sb.append(str);
            sb.append("] = IV");
        }
        return sb.toString();
    }
}
