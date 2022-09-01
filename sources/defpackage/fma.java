package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* renamed from: fma  reason: default package */
/* loaded from: classes.dex */
public final class fma {
    public final int f;
    public final ReentrantReadWriteLock g;
    public boolean h;
    public volatile int i;
    public long j;
    public Map k;
    public flv l;
    public TreeMap m;
    public Integer n;
    private final String p;
    private final flo q;
    private volatile flx r;
    private final fsf s;
    public static final flt o = new flt(1);
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b = new byte[0];
    public static final flv c = new flv();
    public static final flv d = new flv();
    public static final Comparator e = xr.p;

    public fma(flo floVar, String str, int i) {
        this(floVar, str, i, fsf.a);
    }

    public static long a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(a));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public final fly b(String str) {
        return f(str, o);
    }

    public final Integer c(flv flvVar) {
        Integer num = (Integer) this.m.get(flvVar);
        if (num == null) {
            Integer valueOf = Integer.valueOf(this.m.size());
            this.m.put(flvVar, valueOf);
            return valueOf;
        }
        return num;
    }

    public final void d() {
        fyb.ax(this.q);
        this.g.writeLock().lock();
        try {
            this.h = true;
        } finally {
            this.g.writeLock().unlock();
        }
    }

    public final void e(flv flvVar) {
        if (flvVar == null) {
            flvVar = c;
        }
        this.g.writeLock().lock();
        try {
            this.l = flvVar;
            this.n = null;
        } finally {
            this.g.writeLock().unlock();
        }
    }

    public final fly f(String str, flt fltVar) {
        this.g.writeLock().lock();
        try {
            flq flqVar = (flq) this.k.get(str);
            if (flqVar == null) {
                this.g.writeLock().lock();
                fly flyVar = new fly(this, str, fltVar);
                this.k.put(str, flyVar);
                this.g.writeLock().unlock();
                return flyVar;
            }
            try {
                fly flyVar2 = (fly) flqVar;
                if (fltVar.equals(flyVar2.d)) {
                    return flyVar2;
                }
                throw new IllegalArgumentException("alias mismatch: " + str);
            } catch (ClassCastException e2) {
                throw new IllegalArgumentException("another type of counter exists with name: " + str, e2);
            }
        } finally {
            this.g.writeLock().unlock();
        }
    }

    public final void g() {
        this.g.writeLock().lock();
        try {
            fma fmaVar = new fma(this);
            this.g.writeLock().unlock();
            int size = fmaVar.m.size();
            flm[] flmVarArr = new flm[size];
            Iterator it = fmaVar.m.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                flo floVar = fmaVar.q;
                byte[] bArr = ((flv) entry.getKey()).a;
                int intValue = ((Integer) entry.getValue()).intValue();
                if (bArr == null) {
                    bArr = c.a;
                }
                Integer valueOf = Integer.valueOf(intValue);
                ArrayList arrayList = new ArrayList(fmaVar.k.size());
                for (flq flqVar : fmaVar.k.values()) {
                    qw qwVar = flqVar.b;
                    int intValue2 = valueOf.intValue();
                    if (qwVar.b) {
                        qwVar.g();
                    }
                    if (qx.a(qwVar.c, qwVar.e, intValue2) >= 0) {
                        arrayList.add(flqVar);
                    }
                }
                nfh t = noo.e.t();
                long j = fmaVar.j;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                noo nooVar = (noo) t.b;
                int i = 1;
                nooVar.a |= 1;
                nooVar.b = j;
                if (bArr.length != 0) {
                    nem u = nem.u(bArr);
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    noo nooVar2 = (noo) t.b;
                    nooVar2.a |= 4;
                    nooVar2.d = u;
                }
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    flq flqVar2 = (flq) arrayList.get(i2);
                    qs qsVar = (qs) flqVar2.b.d(valueOf.intValue());
                    fyb.ax(qsVar);
                    nfh t2 = non.d.t();
                    long a2 = a(flqVar2.a);
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    non nonVar = (non) t2.b;
                    nonVar.a = i;
                    nonVar.b = Long.valueOf(a2);
                    ArrayList arrayList2 = new ArrayList(qsVar.a());
                    Iterator it2 = it;
                    int i3 = 0;
                    while (i3 < qsVar.a()) {
                        nfh t3 = nom.d.t();
                        int i4 = size2;
                        Integer num = valueOf;
                        long b2 = qsVar.b(i3);
                        ArrayList arrayList3 = arrayList;
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        nom nomVar = (nom) t3.b;
                        nomVar.a |= 1;
                        nomVar.b = b2;
                        long j2 = ((long[]) qsVar.f(i3))[0];
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        nom nomVar2 = (nom) t3.b;
                        nomVar2.a |= 2;
                        nomVar2.c = j2;
                        arrayList2.add((nom) t3.cz());
                        i3++;
                        valueOf = num;
                        size2 = i4;
                        arrayList = arrayList3;
                    }
                    int i5 = size2;
                    Integer num2 = valueOf;
                    ArrayList arrayList4 = arrayList;
                    Collections.sort(arrayList2, xr.q);
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    non nonVar2 = (non) t2.b;
                    nga ngaVar = nonVar2.c;
                    if (!ngaVar.c()) {
                        nonVar2.c = nfm.H(ngaVar);
                    }
                    ndt.cs(arrayList2, nonVar2.c);
                    non nonVar3 = (non) t2.cz();
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    noo nooVar3 = (noo) t.b;
                    nonVar3.getClass();
                    nga ngaVar2 = nooVar3.c;
                    if (!ngaVar2.c()) {
                        nooVar3.c = nfm.H(ngaVar2);
                    }
                    nooVar3.c.add(nonVar3);
                    i2++;
                    it = it2;
                    valueOf = num2;
                    size2 = i5;
                    arrayList = arrayList4;
                    i = 1;
                }
                flmVarArr[((Integer) entry.getValue()).intValue()] = floVar.c((noo) t.cz());
                it = it;
            }
            fof fofVar = null;
            for (int i6 = 0; i6 < size; i6++) {
                flm flmVar = flmVarArr[i6];
                flmVar.g = fmaVar.p;
                fofVar = flmVar.a();
            }
            if (fofVar != null) {
                return;
            }
            new fqc(Looper.getMainLooper()).k(Status.a);
        } catch (Throwable th) {
            this.g.writeLock().unlock();
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        this.g.readLock().lock();
        try {
            sb.append("{");
            boolean z = true;
            for (Map.Entry entry : this.m.entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append("(");
                sb.append(entry.getKey());
                sb.append(") => ");
                sb.append(entry.getValue());
                z = false;
            }
            sb.append("}\n");
            for (flq flqVar : this.k.values()) {
                sb.append(flqVar.toString());
                sb.append("\n");
            }
            this.g.readLock().unlock();
            return sb.toString();
        } catch (Throwable th) {
            this.g.readLock().unlock();
            throw th;
        }
    }

    public fma(flo floVar, String str, int i, fsf fsfVar) {
        this.g = new ReentrantReadWriteLock();
        this.k = new TreeMap();
        this.l = c;
        this.m = new TreeMap();
        this.n = null;
        this.r = null;
        fyb.ay(i > 0);
        this.q = floVar;
        this.p = str;
        this.f = i;
        this.s = fsfVar;
        this.j = SystemClock.elapsedRealtime();
    }

    private fma(fma fmaVar) {
        this(fmaVar.q, fmaVar.p, fmaVar.f, fmaVar.s);
        flq flsVar;
        ReentrantReadWriteLock.WriteLock writeLock = fmaVar.g.writeLock();
        writeLock.lock();
        try {
            this.l = fmaVar.l;
            this.n = fmaVar.n;
            this.j = fmaVar.j;
            this.k = new TreeMap();
            for (Map.Entry entry : fmaVar.k.entrySet()) {
                Map map = this.k;
                String str = (String) entry.getKey();
                flq flqVar = (flq) entry.getValue();
                if (flqVar instanceof flu) {
                    flsVar = new flu(this, (flu) flqVar);
                } else if (flqVar instanceof flz) {
                    flsVar = new flz(this, (flz) flqVar);
                } else if (flqVar instanceof flw) {
                    flsVar = new flw(this, (flw) flqVar);
                } else if (flqVar instanceof fly) {
                    flsVar = new fly(this, (fly) flqVar);
                } else if (flqVar instanceof fls) {
                    flsVar = new fls(this, (fls) flqVar);
                } else {
                    throw new IllegalArgumentException("Unknown counter type: ".concat(String.valueOf(String.valueOf(flqVar))));
                }
                map.put(str, flsVar);
            }
            TreeMap treeMap = this.m;
            this.m = fmaVar.m;
            fmaVar.m = treeMap;
            fmaVar.n = null;
            fmaVar.j = SystemClock.elapsedRealtime();
        } finally {
            writeLock.unlock();
        }
    }
}
