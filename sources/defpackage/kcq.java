package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.inputmethod.latin.R;
import com.google.android.keyboard.client.delight5.ConceptPredictionApi;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: kcq  reason: default package */
/* loaded from: classes.dex */
public final class kcq {
    public final Object a;
    public final Object b;
    public final Object c;

    public kcq() {
        this.c = new AtomicInteger();
        this.a = new AtomicBoolean();
        this.b = new HashSet();
    }

    public kcq(Class cls, Class cls2, bcv bcvVar) {
        this.a = cls;
        this.c = cls2;
        this.b = bcvVar;
    }

    public kcq(Object obj, Object obj2, Object obj3) {
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public kcq(Object obj, Field field, Class cls) {
        this.b = obj;
        this.c = field;
        this.a = cls;
    }

    public kcq(String str, jma jmaVar, oiy oiyVar, byte[] bArr) {
        this.b = str;
        this.a = jmaVar;
        this.c = oiyVar;
    }

    private static final Uri H(Uri uri) {
        return uri.buildUpon().fragment(null).build();
    }

    private final kon I(Uri uri) {
        llp K = K(uri);
        kom komVar = new kom();
        komVar.a = this;
        komVar.b = J(uri.getScheme());
        komVar.d = this.a;
        komVar.c = K;
        komVar.e = uri;
        if (!K.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = K.listIterator(K.size());
                while (listIterator.hasPrevious()) {
                    ((kpy) listIterator.previous()).f();
                }
                arrayList.set(arrayList.size() - 1, str);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        komVar.f = uri;
        return new kon(komVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    private final kpt J(String str) {
        kpt kptVar = (kpt) this.b.get(str);
        if (kptVar != null) {
            return kptVar;
        }
        throw new kpa(String.format("Cannot open, unregistered backend: %s", str));
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map, java.lang.Object] */
    private final llp K(Uri uri) {
        llk e = llp.e();
        llp a = kpg.a(uri);
        int i = ((lrl) a).c;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) a.get(i2);
            kpy kpyVar = (kpy) this.c.get(str);
            if (kpyVar != null) {
                e.h(kpyVar);
            } else {
                String valueOf = String.valueOf(uri);
                throw new kpa("No such transform: " + str + ": " + valueOf);
            }
        }
        return e.g().a();
    }

    private static Set L(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptySet();
        }
        return new HashSet(lfy.c('.').b().k(str));
    }

    public static kcq g(mkr mkrVar) {
        return new kcq(mkrVar, (String) null);
    }

    public static kcq h(mkr mkrVar, String str) {
        return new kcq(mkrVar, str);
    }

    public static String z(View view) {
        Object tag = view.getTag();
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public final void B(View view, String str) {
        if (view == null || view.getTag(R.id.f129410_resource_name_obfuscated_res_0x7f0b215c) != null) {
            return;
        }
        view.setTag(R.id.f129410_resource_name_obfuscated_res_0x7f0b215c, Boolean.TRUE);
        String z = z(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                B(viewGroup.getChildAt(i), z);
            }
        } else if (view instanceof ViewStub) {
            ((ViewStub) view).setLayoutInflater(LayoutInflater.from(view.getContext()));
        }
        if (z == null) {
            return;
        }
        for (eqr eqrVar : A(z, str)) {
            eqrVar.d(view);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, cne] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ejo] */
    public final void C(String str) {
        ?? r0 = this.a;
        hrx.y((Context) this.b);
        r0.a((Context) this.b, cuz.m());
        mwu c = r0.c(llp.r(str));
        r0.b();
        this.c.a((String[]) llp.o(lre.H(c.a, ehk.t)).toArray(new String[0]));
    }

    public final llp D(String str, int i) {
        return E(str, i, false);
    }

    public final llp E(String str, int i, boolean z) {
        if (!F()) {
            return llp.q();
        }
        llk e = llp.e();
        String[] conceptPredictionPredictEmojis = ((ConceptPredictionApi) this.b).conceptPredictionPredictEmojis(str, i, z);
        for (String str2 : conceptPredictionPredictEmojis) {
            String c = ((hbd) this.c).c(str2);
            if (c != null) {
                str2 = c;
            }
            e.h(str2);
        }
        return e.g();
    }

    public final boolean F() {
        return ((ConceptPredictionApi) this.b).conceptPredictionIsReady();
    }

    public final boolean G(Class cls, Class cls2) {
        return ((Class) this.a).isAssignableFrom(cls) && cls2.isAssignableFrom((Class) this.c);
    }

    public final List a() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(((knr) this.b).a());
        }
        return arrayList;
    }

    public final void b(String str, boolean z) {
        c(str, z, false);
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Set, java.lang.Object] */
    public final void c(String str, boolean z, boolean z2) {
        synchronized (this.b) {
            if (z) {
                if (!((knr) this.b).a().contains(str)) {
                    if (z2) {
                        ((knr) this.b).a().add(0, str);
                    } else {
                        ((knr) this.b).a().add(str);
                    }
                    ((knr) this.b).b();
                }
            } else {
                ((knr) this.b).a().remove(str);
                ((knr) this.b).b();
            }
            ((knr) this.b).c(false);
        }
        for (knq knqVar : this.c) {
            ((Handler) this.a).post(new joq(knqVar, 17));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final mko d(Object obj) {
        mld mldVar;
        lug lugVar = jsh.a;
        f(obj);
        synchronized (this.b) {
            jto jtoVar = (jto) this.b.get(obj);
            if (jtoVar == null) {
                return kcu.K(null);
            }
            synchronized (jtoVar) {
                mldVar = jtoVar.b;
                if (mldVar == null) {
                    jtoVar.c.b();
                    jtoVar.b = mld.e();
                    mldVar = jtoVar.b;
                }
            }
            return mldVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [mkr, java.lang.Object] */
    public final mko e(Object obj, jtn jtnVar) {
        jto jtoVar;
        lug lugVar = jsh.a;
        f(obj);
        synchronized (this.b) {
            jtoVar = (jto) this.b.get(obj);
            if (jtoVar == null) {
                jtoVar = new jto();
                this.b.put(obj, jtoVar);
                mko hQ = this.c.hQ(new eid(this, jtnVar, jtoVar, obj, 6, (byte[]) null));
                jtoVar.a = kcu.X(hQ).b(new iiq(this, obj, jtoVar, hQ, 4, null), this.c);
            }
        }
        return kcu.L(jtoVar.a);
    }

    public final void f(Object obj) {
        obj.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    public final boolean i() {
        return this.b.isEmpty();
    }

    public final IllegalArgumentException j() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.c + "=" + this.a + " and " + this.c + "=" + this.b);
    }

    public final Object k() {
        try {
            return ((Class) this.a).cast(((Field) this.c).get(this.b));
        } catch (Exception e) {
            throw new lak(String.format("Failed to get value of field %s of type %s on object of type %s", ((Field) this.c).getName(), this.b.getClass().getName(), ((Class) this.a).getName()), e);
        }
    }

    public final Class m() {
        return ((Field) this.c).getType().getComponentType();
    }

    public final void n(Collection collection) {
        Object[] objArr = (Object[]) k();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(m(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        for (Object obj : collection) {
            objArr2[length] = obj;
            length++;
        }
        l(objArr2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kpt] */
    public final long o(Uri uri) {
        kon I = I(uri);
        return I.a.p((Uri) I.e);
    }

    public final Iterable p(Uri uri) {
        kpt J = J(uri.getScheme());
        llp<kpy> K = K(uri);
        ArrayList arrayList = new ArrayList();
        String encodedFragment = uri.getEncodedFragment();
        for (Uri uri2 : J.s(H(uri))) {
            Uri build = uri2.buildUpon().encodedFragment(encodedFragment).build();
            if (!K.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(build.getPathSegments());
                if (!arrayList2.isEmpty() && !build.getPath().endsWith("/")) {
                    String str = (String) lre.ac(arrayList2);
                    for (kpy kpyVar : K) {
                        kpyVar.e();
                    }
                    arrayList2.set(arrayList2.size() - 1, str);
                    build = build.buildUpon().path(TextUtils.join("/", arrayList2)).build();
                }
            }
            arrayList.add(build);
        }
        return arrayList;
    }

    public final Object q(Uri uri, koo kooVar) {
        return kooVar.a(I(uri));
    }

    public final void r(Uri uri) {
        J(uri.getScheme()).i(H(uri));
    }

    public final void s(Uri uri) {
        J(uri.getScheme()).j(H(uri));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kpt] */
    public final void t(Uri uri) {
        kon I = I(uri);
        I.a.k((Uri) I.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kpt] */
    public final void u(Uri uri, Uri uri2) {
        kon I = I(uri);
        kon I2 = I(uri2);
        ?? r0 = I.a;
        if (r0 == I2.a) {
            r0.l((Uri) I.e, (Uri) I2.e);
            return;
        }
        throw new kpa("Cannot rename file across backends");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kpt] */
    public final boolean v(Uri uri) {
        kon I = I(uri);
        return I.a.g((Uri) I.e);
    }

    public final boolean w(Uri uri) {
        return J(uri.getScheme()).m(H(uri));
    }

    @Deprecated
    public final void x(Uri uri) {
        if (!v(uri)) {
            return;
        }
        if (!w(uri)) {
            t(uri);
            return;
        }
        for (Uri uri2 : p(uri)) {
            x(uri2);
        }
        s(uri);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, fjr] */
    public final void y(Throwable th) {
        Bundle bundle = new Bundle(fkd.class.getClassLoader());
        fgy.c(bundle, th);
        try {
            new fkg(this.b).makeBundleCall(bundle);
        } catch (fka unused) {
            Log.e("FutureResult", "Connection was dropped before response");
        }
    }

    public final void l(Object obj) {
        try {
            ((Field) this.c).set(this.b, obj);
        } catch (Exception e) {
            throw new lak(String.format("Failed to set value of field %s of type %s on object of type %s", ((Field) this.c).getName(), this.b.getClass().getName(), ((Class) this.a).getName()), e);
        }
    }

    public kcq(Context context, byte[] bArr, byte[] bArr2) {
        this.b = new ConceptPredictionApi(context);
        this.a = new iov();
        this.c = hbd.h(context);
    }

    public kcq(gpq gpqVar) {
        this.b = gpqVar;
        this.c = new AtomicBoolean(false);
        this.a = new AtomicBoolean(false);
    }

    public kcq(Context context, cne cneVar, ejo ejoVar) {
        this.b = context.getApplicationContext();
        this.a = cneVar;
        this.c = ejoVar;
    }

    public kcq(eqw eqwVar, List list) {
        this.c = new HashMap();
        this.b = eqwVar;
        this.a = list;
    }

    public kcq(Context context, byte[] bArr) {
        this.c = new Object();
        this.b = ino.M(context);
        this.a = new HashMap();
    }

    public kcq(fjr fjrVar, fkd fkdVar, fke fkeVar) {
        if (fjrVar == null || fkdVar == null) {
            throw null;
        }
        this.b = fjrVar;
        this.c = fkdVar;
        this.a = fkeVar;
    }

    private kcq(mkr mkrVar, String str) {
        this.b = new HashMap();
        this.c = mkrVar;
        this.a = str;
    }

    public kcq(Context context) {
        this.c = new HashSet();
        this.a = new Handler(Looper.getMainLooper());
        this.b = new knr(context);
    }

    public kcq(List list) {
        this(list, Collections.emptyList(), Collections.emptyList());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List, java.lang.Object] */
    public kcq(List list, List list2, List list3) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.a = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kpt kptVar = (kpt) it.next();
            if (TextUtils.isEmpty(kptVar.f())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                kpt kptVar2 = (kpt) this.b.put(kptVar.f(), kptVar);
                if (kptVar2 != null) {
                    String canonicalName = kptVar2.getClass().getCanonicalName();
                    String canonicalName2 = kptVar.getClass().getCanonicalName();
                    throw new IllegalArgumentException("Cannot override Backend " + canonicalName + " with " + canonicalName2);
                }
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            kpy kpyVar = (kpy) it2.next();
            if (TextUtils.isEmpty(kpyVar.a())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                kpy kpyVar2 = (kpy) this.c.put(kpyVar.a(), kpyVar);
                if (kpyVar2 != null) {
                    String canonicalName3 = kpyVar2.getClass().getCanonicalName();
                    String canonicalName4 = kpyVar.getClass().getCanonicalName();
                    throw new IllegalArgumentException("Cannot to override Transform " + canonicalName3 + " with " + canonicalName4);
                }
            }
        }
        this.a.addAll(list3);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    public final List A(String str, String str2) {
        Object obj;
        String str3 = str2 == null ? str : str2 + ">" + str;
        List list = (List) this.c.get(str3);
        if (list == null) {
            Set L = L(str);
            Set L2 = L(str2);
            SparseArray sparseArray = new SparseArray();
            llp llpVar = ((eqw) this.b).c;
            int i = ((lrl) llpVar).c;
            for (int i2 = 0; i2 < i; i2++) {
                euu euuVar = (euu) llpVar.get(i2);
                Object obj2 = this.b;
                ArrayList arrayList = new ArrayList();
                for (eqv eqvVar : (List) ((eqw) obj2).b.get(euuVar.ae, llp.q())) {
                    if (((eqp) eqvVar.a).b(L) && ((obj = eqvVar.b) == null || ((eqp) obj).b(L2))) {
                        int[] iArr = ((eqp) eqvVar.a).a;
                        arrayList.add(ewj.e(eqvVar.d, iArr));
                        if (iArr.length == 0) {
                            break;
                        }
                    }
                }
                eqq eqqVar = arrayList.isEmpty() ? null : new eqq(arrayList);
                if (eqqVar != null) {
                    sparseArray.put(euuVar.ae, eqqVar);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (eqs eqsVar : this.a) {
                eqr a = eqsVar.a(sparseArray);
                if (a != null) {
                    arrayList2.add(a);
                }
            }
            this.c.put(str3, arrayList2);
            return arrayList2;
        }
        return list;
    }

    public kcq(mmr mmrVar) {
        this.a = new HashSet();
        this.b = new HashSet();
        this.c = mmrVar;
    }
}
