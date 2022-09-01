package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* renamed from: fws  reason: default package */
/* loaded from: classes.dex */
public final class fws {
    public static fws d;
    public final Object a;
    public final Object b;
    public final Object c;

    public fws(Context context, LocationManager locationManager) {
        this.b = new ed();
        this.a = context;
        this.c = locationManager;
    }

    public fws(Context context, fwo fwoVar, boe boeVar, byte[] bArr) {
        this.a = context;
        this.b = fwoVar;
        this.c = boeVar;
    }

    public fws(PointF pointF, PointF pointF2, PointF pointF3) {
        this.a = pointF;
        this.c = pointF2;
        this.b = pointF3;
    }

    public fws(auo auoVar, Object obj, ava avaVar) {
        this.a = auoVar;
        this.b = obj;
        this.c = avaVar;
    }

    public fws(fpx fpxVar, opu opuVar, Runnable runnable, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = fpxVar;
        this.a = opuVar;
        this.c = runnable;
    }

    public fws(ijk ijkVar, File file, File file2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = ijkVar;
        this.a = file;
        this.c = file2;
    }

    public fws(ilz ilzVar, imi imiVar, ils ilsVar) {
        this.c = ilzVar;
        this.b = imiVar;
        this.a = ilsVar;
    }

    public fws(Class cls, Class cls2, azo azoVar) {
        this.b = cls;
        this.a = cls2;
        this.c = azoVar;
    }

    public fws(String str, String str2, String str3) {
        this.a = str;
        this.c = str2;
        this.b = str3;
    }

    public fws(sa saVar) {
        this.b = new ArrayList();
        this.c = new sh();
        this.a = saVar;
    }

    public final ConnectivityManager a() {
        return (ConnectivityManager) ((View) this.c).getContext().getSystemService("connectivity");
    }

    public final File b() {
        return (File) ((ijk) this.b).b;
    }

    public final File c() {
        return (File) ((ijk) this.b).a;
    }

    public final boolean d() {
        return b().isFile() && ((File) this.a).isDirectory();
    }

    public final boolean e(ial ialVar, int i) {
        return (((ilz) this.c).b == 0 || ialVar.b(i) == 0) ? false : true;
    }

    public final boolean f(ial ialVar, int i) {
        return (((ilz) this.c).a == 0 || ialVar.e(i) == null) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [idk, java.lang.Object] */
    public final hiz g(iih iihVar, iif iifVar, Executor executor) {
        if (iifVar.a == null || !hjg.r()) {
            return hiz.j(new jjn(this, iifVar, jpv.b(this.b, iihVar), iihVar, executor, 1, null, null, null));
        }
        return hiz.q(new iiq(this, iihVar, iifVar, executor, 0, null, null), executor);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, icx] */
    public final icy h() {
        long[] f = mhq.f(this.c);
        ?? r0 = this.b;
        return new icy(f, r0.toArray(this.a.a(r0.size())), iby.b(f), Integer.MAX_VALUE);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    public final void i(long j, Object obj) {
        ?? r0 = this.c;
        Long valueOf = Long.valueOf(j);
        int indexOf = r0.indexOf(valueOf);
        if (indexOf >= 0) {
            this.b.set(indexOf, obj);
            return;
        }
        this.c.add(valueOf);
        this.b.add(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List, java.lang.Object] */
    public final void j(long j, Object obj) {
        if (j != 0) {
            while (true) {
                int size = this.c.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        i = -1;
                        break;
                    } else if ((((Long) this.c.get(i)).longValue() & j) == j) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i == -1) {
                    break;
                }
                this.c.remove(i);
                this.b.remove(i);
            }
        } else {
            this.c.clear();
            this.b.clear();
            j = 0;
        }
        this.c.add(Long.valueOf(j));
        this.b.add(obj);
    }

    public final boolean k(Class cls) {
        return ((Class) this.b).isAssignableFrom(cls);
    }

    public final boolean l(Class cls, Class cls2) {
        return k(cls) && ((Class) this.a).isAssignableFrom(cls2);
    }

    public final void m(sa saVar) {
        ((ArrayList) this.b).clear();
        int size = saVar.aI.size();
        for (int i = 0; i < size; i++) {
            rz rzVar = (rz) saVar.aI.get(i);
            if (rzVar.M() == 3 || rzVar.N() == 3) {
                ((ArrayList) this.b).add(rzVar);
            }
        }
        saVar.c();
    }

    public final void n(sa saVar, int i, int i2, int i3) {
        int i4 = saVar.ac;
        int i5 = saVar.ad;
        saVar.B(0);
        saVar.A(0);
        saVar.C(i2);
        saVar.x(i3);
        saVar.B(i4);
        saVar.A(i5);
        Object obj = this.a;
        ((sa) obj).b = i;
        ((sg) obj).T();
    }

    public final boolean o(sz szVar, rz rzVar, int i) {
        ((sh) this.c).i = rzVar.M();
        ((sh) this.c).j = rzVar.N();
        ((sh) this.c).a = rzVar.j();
        ((sh) this.c).b = rzVar.h();
        sh shVar = (sh) this.c;
        shVar.g = false;
        shVar.h = i;
        int i2 = shVar.i;
        int i3 = shVar.j;
        boolean z = i2 == 3 && rzVar.X > 0.0f;
        boolean z2 = i3 == 3 && rzVar.X > 0.0f;
        if (z && rzVar.u[0] == 4) {
            shVar.i = 1;
        }
        if (z2 && rzVar.u[1] == 4) {
            shVar.j = 1;
        }
        szVar.a(rzVar, shVar);
        rzVar.C(((sh) this.c).c);
        rzVar.x(((sh) this.c).d);
        sh shVar2 = (sh) this.c;
        rzVar.F = shVar2.f;
        rzVar.u(shVar2.e);
        sh shVar3 = (sh) this.c;
        shVar3.h = 0;
        return shVar3.g;
    }

    public final Location p(String str) {
        try {
            if (!((LocationManager) this.c).isProviderEnabled(str)) {
                return null;
            }
            return ((LocationManager) this.c).getLastKnownLocation(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List, java.lang.Object] */
    public fws(List list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(((apk) ((lfy) list.get(i)).d).a());
            this.b.add(((apg) ((lfy) list.get(i)).c).a());
        }
    }

    public fws() {
        this.a = new PointF();
        this.c = new PointF();
        this.b = new PointF();
    }

    public fws(auw auwVar, avj avjVar) {
        List emptyList = Collections.emptyList();
        ce.m(auwVar);
        this.c = auwVar;
        ce.m(emptyList);
        this.b = emptyList;
        ce.m(avjVar);
        this.a = avjVar;
    }

    public fws(View view) {
        this.c = view;
        this.b = kyg.l(view);
        this.a = new gio(this, null);
    }

    public fws(icx icxVar) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        this.a = icxVar;
        arrayList.add(0L);
        arrayList2.add(null);
    }

    public fws(CronetEngine cronetEngine) {
        gjz gjzVar = gvs.a;
        ieh j = ieh.j();
        this.c = cronetEngine;
        this.a = gjzVar;
        this.b = j;
    }

    public fws(boe boeVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = boeVar;
        this.c = new iqz(boeVar, null, null, null);
        this.b = npd.c(krc.a);
    }
}
