package com.google.android.libraries.inputmethod.userfeaturecache;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Printer;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.nativelib.NativeLibHelper;
import com.google.android.libraries.inputmethod.userfeaturecache.metrics.InputActionsUserFeatureProcessor;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UserFeatureCache implements jac, hho, jaf {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache");
    public final AtomicLong b = new AtomicLong(0);
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public volatile boe d;
    private final Context e;
    private final ExecutorService f;

    public UserFeatureCache(Context context) {
        mks f = gxp.a().f("UFCache", 10);
        this.e = context;
        this.f = f;
    }

    public static void h(long j, long j2, byte[] bArr) {
        if (((Boolean) izv.d.c()).booleanValue()) {
            try {
                nativeUpdateCachedUserFeature(j, j2, bArr);
            } catch (UnsatisfiedLinkError e) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "maybeUpdateCachedUserFeature", 614, "UserFeatureCache.java")).w("shared library not loaded: %s", e.getMessage());
                ieh.j().e(izw.a, new Object[0]);
            }
        }
    }

    private static boolean n(int i) {
        if (i >= izq.values().length) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "checkFeatureOneofCase", 622, "UserFeatureCache.java")).u("Invalid feature id provided: %d", i);
            return false;
        }
        return true;
    }

    private static native void nativeCancelUpdate(long j, long j2);

    private native long nativeCreateUserFeatureCache(int[] iArr);

    private native long nativeCreateUserFeatureCacheV2(byte[] bArr);

    private static native void nativeDestroyUserFeatureCache(long j);

    private static native byte[] nativeUpdate(long j, byte[] bArr, long j2, boolean z);

    private static native void nativeUpdateCachedUserFeature(long j, long j2, byte[] bArr);

    public final izu c() {
        nfh t = izu.b.t();
        izu izuVar = (izu) izv.c.j();
        if (izuVar.a.size() != 0) {
            for (izs izsVar : izuVar.a) {
                nfh t2 = izs.d.t();
                t2.cG(izsVar);
                if (((izs) t2.b).c.size() == 0) {
                    ltd ltdVar = (ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "addRegisteredDataStores", 140, "UserFeatureCache.java");
                    izr izrVar = ((izs) t2.b).b;
                    if (izrVar == null) {
                        izrVar = izr.c;
                    }
                    ltdVar.u("Feature misses namespace: id = %d", izq.a(izrVar.a).m - 1);
                    t2.cX();
                }
                t.dL(t2);
            }
        } else {
            for (izr izrVar2 : ((izt) izv.b.j()).a) {
                nfh t3 = izs.d.t();
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                izs izsVar2 = (izs) t3.b;
                izrVar2.getClass();
                izsVar2.b = izrVar2;
                izsVar2.a |= 1;
                t3.cX();
                t.dL(t3);
            }
        }
        izu izuVar2 = (izu) t.cz();
        this.d = new boe(izuVar2);
        for (izs izsVar3 : Collections.unmodifiableList(((izu) t.b).a)) {
            for (String str : izsVar3.c) {
                izr izrVar3 = izsVar3.b;
                if (izrVar3 == null) {
                    izrVar3 = izr.c;
                }
                izq a2 = izq.a(izrVar3.a);
                switch (a2.ordinal()) {
                    case 0:
                        e(a2, str, izx.a);
                        break;
                    case 1:
                        e(a2, str, ize.b);
                        break;
                    case 2:
                        e(a2, str, izn.a);
                        break;
                    case 3:
                        e(a2, str, iyr.a);
                        break;
                    case 4:
                        e(a2, str, iyj.a);
                        break;
                    case 5:
                        e(a2, str, iyh.a);
                        break;
                    case 6:
                        e(a2, str, iyq.a);
                        break;
                    case 7:
                        e(a2, str, iyt.c);
                        break;
                    case 8:
                        e(a2, str, iys.a);
                        break;
                    case 9:
                        e(a2, str, mxi.a);
                        break;
                    case 10:
                        e(a2, str, izx.a);
                        break;
                    default:
                        ((ltd) ((ltd) jag.a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/register/UserFeatureCacheRegisterHelper", "registerFeatureOneofCase", 92, "UserFeatureCacheRegisterHelper.java")).u("Invalid feature: %d", a2.ordinal());
                        break;
                }
            }
        }
        return izuVar2;
    }

    @Override // defpackage.jac
    public final ngz d(izq izqVar, Class cls) {
        if (!jag.a(izqVar, cls)) {
            return null;
        }
        iyu m = m(izqVar, cls);
        if (m != null) {
            return m.b;
        }
        ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "getProto", 638, "UserFeatureCache.java")).u("Feature not enabled should not called: %d", boe.s(izqVar));
        return null;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        for (Long l : this.c.keySet()) {
            printer.println(l.toString());
        }
    }

    @Override // defpackage.jaf
    public final void e(izq izqVar, String str, ngz ngzVar) {
        boe boeVar = this.d;
        if (boeVar == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "addProtoDataStore", 188, "UserFeatureCache.java")).t("featureIdHelper is not initialized.");
            return;
        }
        long u = boeVar.u(izqVar, str);
        kqi a2 = ift.a();
        kqg a3 = kqh.a();
        kor a4 = kos.a(this.e);
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        iyi v = boeVar.v(u);
        objArr[0] = v.b.equals("") ? String.format(Locale.ENGLISH, "%d", Integer.valueOf(v.a)) : String.format(Locale.ENGLISH, "%s_%d", v.b, Integer.valueOf(v.a));
        a4.e(String.format(locale, "ufc_%s.pb", objArr));
        a3.f(a4.a());
        a3.e(ngzVar);
        this.c.put(Long.valueOf(u), new iyu(this.f, ngzVar, new opu(a2.a(a3.a())), null, null, null));
    }

    public final void f() {
        try {
            long nativeCreateUserFeatureCacheV2 = nativeCreateUserFeatureCacheV2(c().q());
            if (nativeCreateUserFeatureCacheV2 == 0) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "createUserFeatureCache", 270, "UserFeatureCache.java")).t("Create native user feature cache failed.");
                return;
            }
            if (!this.b.compareAndSet(0L, nativeCreateUserFeatureCacheV2)) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "createUserFeatureCache", 274, "UserFeatureCache.java")).t("nativePointer should be zero, this will cause memory leak.");
            }
            this.b.set(nativeCreateUserFeatureCacheV2);
            if (((Boolean) jad.d.c()).booleanValue()) {
                InputActionsUserFeatureProcessor.c(ieh.j(), (iym) jad.c.j(), this.d);
            } else {
                InputActionsUserFeatureProcessor.a(ieh.j(), ((njc) jad.a.j()).a, j());
            }
        } catch (UnsatisfiedLinkError e) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "createUserFeatureCache", 278, "UserFeatureCache.java")).w("user feature cache shared library not loaded: %s", e.getMessage());
            ieh.j().e(izw.a, new Object[0]);
        }
    }

    public final void g() {
        this.d = null;
        this.c.clear();
        long j = this.b.get();
        if (j != 0) {
            try {
                nativeDestroyUserFeatureCache(j);
            } catch (UnsatisfiedLinkError e) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "destroyUserFeatureCache", 305, "UserFeatureCache.java")).w("Shared library not loaded: %s", e.getMessage());
                ieh.j().e(izw.a, new Object[0]);
            }
            if (!this.b.compareAndSet(j, 0L)) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "destroyUserFeatureCache", 309, "UserFeatureCache.java")).t("nativePointer should not be null, leave it as it is.");
            }
        }
        InputActionsUserFeatureProcessor.b(ieh.j());
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        if (set.contains(izv.d) || set.contains(izv.b) || set.contains(izv.c)) {
            kcu.U(kcu.N(new ihi(this, 15), this.f), new ivq(14), mjl.a);
        }
        if (set.contains(jad.a) || set.contains(jad.b) || set.contains(jad.c) || set.contains(jad.d)) {
            kcu.U(kcu.N(new ihi(this, 16), this.f), new ivq(15), mjl.a);
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "UserFeatureCache";
    }

    public byte[] getSerializedData(long j) {
        iyu iyuVar = (iyu) this.c.get(Long.valueOf(j));
        if (iyuVar == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "getSerializedData", 359, "UserFeatureCache.java")).v("Feature not enabled should not called: %d", j);
            return null;
        }
        return iyuVar.b.q();
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "onCreate", 317, "UserFeatureCache.java")).t("onCreate()");
        NativeLibHelper.a("jni_delight5decoder", false);
        f();
        hhq.p(this, jad.a, jad.b, jad.c, jad.d, izv.b, izv.d, izv.c);
    }

    @Override // defpackage.ifw
    public final void gn() {
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "onDestroy", 336, "UserFeatureCache.java")).t("onDestroy()");
        g();
        hhq.q(this);
    }

    @Override // defpackage.jac
    public final void i(izq izqVar, ngz ngzVar) {
        Class<?> cls = ngzVar.getClass();
        iul iulVar = new iul(ngzVar, 11);
        boe boeVar = this.d;
        if (boeVar == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "updateProto", 661, "UserFeatureCache.java")).t("featureIdHelper not initialized.");
            return;
        }
        long u = boeVar.u(izqVar, "");
        if (!jag.a(izqVar, cls)) {
            return;
        }
        iyu m = m(izqVar, cls);
        if (m == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "updateProto", 672, "UserFeatureCache.java")).v("Feature not enabled should not called: %d", u);
        } else {
            m.a(iulVar, null);
        }
    }

    public final byte[] j() {
        TypedArray obtainTypedArray = this.e.getResources().obtainTypedArray(R.array.f1230_resource_name_obfuscated_res_0x7f030015);
        nfh t = iyl.f.t();
        t.cG((iyl) jad.b.j());
        hrx.y(this.e);
        hqt b = hqp.b();
        nfh t2 = iyp.d.t();
        for (int i = 0; i < obtainTypedArray.length(); i++) {
            int resourceId = obtainTypedArray.getResourceId(i, 0);
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            iyp iypVar = (iyp) t2.b;
            nfs nfsVar = iypVar.b;
            if (!nfsVar.c()) {
                iypVar.b = nfm.D(nfsVar);
            }
            iypVar.b.g(resourceId);
        }
        if (b != null) {
            String n = b.n(0);
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            iyp iypVar2 = (iyp) t2.b;
            n.getClass();
            iypVar2.a |= 8;
            iypVar2.c = n;
        }
        obtainTypedArray.recycle();
        iyp iypVar3 = ((iyl) t.b).c;
        if (iypVar3 == null) {
            iypVar3 = iyp.d;
        }
        t2.cG(iypVar3);
        iyp iypVar4 = (iyp) t2.cz();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        iyl iylVar = (iyl) t.b;
        iypVar4.getClass();
        iylVar.c = iypVar4;
        iylVar.a |= 2;
        return ((iyl) t.cz()).q();
    }

    @Override // defpackage.jac
    public final byte[] k(izq izqVar) {
        boe boeVar = this.d;
        if (boeVar == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "getSerializedData", 369, "UserFeatureCache.java")).t("featureIdHelper not initialized.");
            return null;
        }
        return getSerializedData(boeVar.u(izqVar, ""));
    }

    public final /* synthetic */ byte[] l(long j, byte[] bArr) {
        try {
            return nativeUpdate(this.b.get(), bArr, j, false);
        } catch (UnsatisfiedLinkError e) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "lambda$updateSerializedDataAsync$1", 493, "UserFeatureCache.java")).w("Shared library not loaded: %s", e.getMessage());
            ieh.j().e(izw.a, new Object[0]);
            return new byte[0];
        }
    }

    final iyu m(izq izqVar, Class cls) {
        boe boeVar = this.d;
        if (boeVar == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "getStore", 708, "UserFeatureCache.java")).t("featureIdHelper not initialized.");
            return null;
        }
        long u = boeVar.u(izqVar, "");
        iyu iyuVar = (iyu) this.c.get(Long.valueOf(u));
        if (iyuVar != null && cls.equals(iyuVar.b.getClass())) {
            return iyuVar;
        }
        ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "getStore", 714, "UserFeatureCache.java")).C("Wrong feature id provided %s for protobuf %s.", u, cls.getCanonicalName());
        return null;
    }

    public boolean putSerializedData(long j, byte[] bArr) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        iyu iyuVar = (iyu) this.c.get(Long.valueOf(j));
        if (iyuVar == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "putSerializedData", 395, "UserFeatureCache.java")).v("Feature not enabled should not called: %d", j);
            return false;
        }
        iyuVar.b(new iul(bArr, 12), new izp(this, j, atomicBoolean, atomicBoolean2));
        for (int i = 0; i < 3; i++) {
            if (!atomicBoolean2.get()) {
                try {
                    synchronized (atomicBoolean2) {
                        atomicBoolean2.wait(1000L);
                    }
                } catch (InterruptedException e) {
                    ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "putSerializedData", (char) 432, "UserFeatureCache.java")).t("Interrupted when calling updateSerializedProto.");
                    return false;
                }
            } else {
                ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "putSerializedData", 424, "UserFeatureCache.java")).w("completed with %s", Boolean.valueOf(atomicBoolean.get()));
                return atomicBoolean.get();
            }
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "putSerializedData", 436, "UserFeatureCache.java")).w("Return with %s", Boolean.valueOf(atomicBoolean.get()));
        return atomicBoolean.get();
    }

    public boolean putSerializedDataAsync(long j, byte[] bArr) {
        iyu iyuVar = (iyu) this.c.get(Long.valueOf(j));
        if (iyuVar == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "putSerializedDataAsync", 518, "UserFeatureCache.java")).v("Feature not enabled should not called: %d", j);
            return false;
        }
        boe boeVar = this.d;
        if (boeVar == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "putSerializedDataAsync", 524, "UserFeatureCache.java")).t("featureIdHelper not initialized.");
            return false;
        } else if (!n(boeVar.v(j).a)) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "putSerializedDataAsync", 529, "UserFeatureCache.java")).v("Invalid feature id: %s", j);
            return false;
        } else {
            iyuVar.b(new iul(bArr, 10), new evm(this, j, 4));
            return true;
        }
    }

    public void updateSerializedDataAsync(long j, long j2) {
        iyu iyuVar = (iyu) this.c.get(Long.valueOf(j));
        if (iyuVar == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "updateSerializedDataAsync", 462, "UserFeatureCache.java")).v("Feature not enabled should not called: %d", j);
            return;
        }
        boe boeVar = this.d;
        if (boeVar == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "updateSerializedDataAsync", 468, "UserFeatureCache.java")).t("featureIdHelper not initialized.");
        } else if (!n(boeVar.v(j).a)) {
            ltg ltgVar = a;
            ((ltd) ((ltd) ltgVar.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "updateSerializedDataAsync", 472, "UserFeatureCache.java")).v("Invalid feature id: %s", j);
            long j3 = this.b.get();
            if (j3 != 0) {
                try {
                    nativeCancelUpdate(j3, j2);
                    return;
                } catch (UnsatisfiedLinkError e) {
                    ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "updateSerializedDataAsync", 478, "UserFeatureCache.java")).w("Shared library not loaded: %s", e.getMessage());
                    ieh.j().e(izw.a, new Object[0]);
                    return;
                }
            }
            ((ltd) ((ltd) ltgVar.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache", "updateSerializedDataAsync", 483, "UserFeatureCache.java")).t("Should not call this method from non-native environment.");
        } else {
            iyuVar.b(new cxo(this, j2, 4), new evm(this, j, 3));
        }
    }
}
