package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: ijk  reason: default package */
/* loaded from: classes.dex */
public final class ijk {
    public final Object a;
    public final Object b;

    public ijk(Activity activity) {
        this.b = activity;
        this.a = new etm(activity, 5);
    }

    public ijk(Context context, fjd fjdVar) {
        context.getClass();
        this.a = context;
        this.b = fjdVar;
    }

    public ijk(SharedPreferences.Editor editor, hie hieVar) {
        this.a = editor;
        this.b = hieVar;
    }

    public ijk(jav javVar, String str) {
        this.a = str;
        this.b = javVar;
    }

    public ijk(Class cls, Object obj) {
        this.b = cls;
        this.a = obj;
    }

    public ijk(String str, fgy fgyVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = str;
        this.b = fgyVar;
    }

    public ijk(String str, iiy iiyVar) {
        this.a = str;
        this.b = iiyVar;
    }

    public ijk(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public ijk(nem nemVar, byte[] bArr) {
        this.b = nemVar;
        this.a = bArr;
    }

    public ijk(nnx nnxVar, File file) {
        this.a = nnxVar;
        this.b = file;
    }

    public ijk(byte[] bArr, ngz ngzVar) {
        this.a = bArr;
        this.b = ngzVar;
    }

    public ijk(int[] iArr, CharSequence[] charSequenceArr) {
        this.b = iArr;
        this.a = charSequenceArr;
    }

    public static boolean c(hie hieVar) {
        hie hieVar2 = hie.DEFAULT;
        int ordinal = hieVar.ordinal();
        return ordinal == 1 || ordinal == 4;
    }

    public static void d(nfh nfhVar, hhl hhlVar, hie hieVar) {
        nfh t;
        hif hifVar = (hif) Collections.unmodifiableMap(Collections.unmodifiableMap(((hij) nfhVar.b).a)).get(hhlVar.d());
        if (hifVar != null) {
            t = (nfh) hifVar.N(5);
            t.cG(hifVar);
        } else {
            t = hif.e.t();
            String d = hhlVar.d();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            hif hifVar2 = (hif) t.b;
            d.getClass();
            hifVar2.a |= 1;
            hifVar2.b = d;
        }
        if (c(hieVar)) {
            int i = hik.a;
            hih a = hik.a(hhlVar.b(hieVar));
            if (a == null) {
                t.cT(hieVar.g);
            } else {
                t.cS(hieVar.g, a);
            }
            nfhVar.cU(hhlVar.d(), (hif) t.cz());
        }
    }

    public static char f(iay iayVar) {
        Object obj = iayVar.e;
        if (obj == null) {
            return (char) 0;
        }
        String obj2 = obj.toString();
        if (!obj2.isEmpty()) {
            return obj2.charAt(0);
        }
        return (char) 0;
    }

    public final int a(hqt hqtVar) {
        int length = ((int[]) this.a).length;
        for (int i = 0; i < length; i++) {
            if (hqtVar.equals(((llp) this.b).get(((int[]) this.a)[i]))) {
                return i;
            }
        }
        return -1;
    }

    public final hqt b(hqt hqtVar, boolean z) {
        int a = a(hqtVar);
        if (a < 0) {
            return null;
        }
        int i = a + 1;
        int[] iArr = (int[]) this.a;
        if (i == iArr.length) {
            if (!z) {
                return null;
            }
            i = 0;
        }
        return (hqt) ((llp) this.b).get(iArr[i]);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    public final void e(lmz lmzVar) {
        lsz it = lmzVar.iterator();
        while (it.hasNext()) {
            hhr hhrVar = (hhr) ((hhl) it.next());
            String str = hhrVar.a;
            Class cls = hhrVar.b;
            if (cls == byte[].class) {
                str = "__bytes__".concat(String.valueOf(str));
            }
            Object b = hhrVar.b((hie) this.b);
            if (b == null) {
                this.a.remove(str);
            } else if (cls == byte[].class) {
                this.a.putString(str, lyk.d.i((byte[]) b));
            } else if (cls == Boolean.class) {
                this.a.putBoolean(str, ((Boolean) b).booleanValue());
            } else if (cls == Long.class) {
                this.a.putLong(str, ((Long) b).longValue());
            } else if (cls == Float.class) {
                this.a.putFloat(str, ((Float) b).floatValue());
            } else if (cls == Double.class) {
                this.a.putFloat(str, ((Double) b).floatValue());
            } else {
                this.a.putString(str, (String) b);
            }
        }
        this.a.apply();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder();
        Iterator it = ((ArrayDeque) this.b).iterator();
        while (it.hasNext()) {
            sb.append(((Character) it.next()).charValue());
        }
        return sb.toString();
    }

    public final boolean h() {
        return !((ArrayDeque) this.b).isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, gvz] */
    public final Object i(Object obj) {
        Object obj2;
        synchronized (this.b) {
            obj2 = ((WeakHashMap) this.b).get(obj);
            if (obj2 == null) {
                obj2 = this.a.a(obj);
                ((WeakHashMap) this.b).put(obj, obj2);
            }
        }
        return obj2;
    }

    public final void j(CharSequence charSequence, Runnable runnable) {
        ((ArrayList) this.b).add(charSequence);
        ((ArrayList) this.a).add(runnable);
    }

    public final CharSequence[] k() {
        return (CharSequence[]) ((ArrayList) this.b).toArray(new CharSequence[0]);
    }

    public final Runnable[] l() {
        return (Runnable[]) ((ArrayList) this.a).toArray(new Runnable[0]);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, ghn] */
    public final ghn m() {
        llw b;
        llp g = ((llk) this.a).g();
        jdg.w(!g.isEmpty(), "at least one range has to be specified");
        lmu lmuVar = lmu.a;
        ArrayList A = lre.A();
        int i = ((lrl) g).c;
        for (int i2 = 0; i2 < i; i2++) {
            gmi gmiVar = (gmi) g.get(i2);
            jez.F((lrh) gmiVar.a, gmiVar.d(), A);
        }
        lmu E = jez.E(A);
        lsz it = E.b().entrySet().iterator();
        Map.Entry entry = null;
        Map.Entry entry2 = null;
        lrh lrhVar = null;
        int i3 = 0;
        while (it.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it.next();
            if (i3 == 0) {
                entry = entry3;
            }
            if (i3 == b.size() - 1) {
                entry2 = entry3;
            }
            if (lrhVar != null) {
                jdg.D(lrhVar.p((lrh) entry3.getKey()), "ranges have to be connected. Range %s and %s were not", lrhVar, entry3.getKey());
            }
            lrhVar = (lrh) entry3.getKey();
            i3++;
        }
        jdg.Q(entry, "first range can not be null");
        jdg.Q(entry2, "last range can not be null");
        if (((lrh) entry.getKey()).n() || (entry.getValue() instanceof ghw)) {
            if (((lrh) entry2.getKey()).o() || (entry2.getValue() instanceof ghw)) {
                return new ghz(E, entry, entry2, this.b);
            }
            throw new IllegalArgumentException(String.format("Evaluator has to be constant for range without upper bound. Range: %s", entry2.getKey()));
        }
        throw new IllegalArgumentException(String.format("Evaluator has to be constant for range without lower bound. Range: %s", entry.getKey()));
    }

    public final void n(gmi gmiVar) {
        ((llk) this.a).h(gmiVar);
    }

    protected final String o(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return ((String) this.b).concat(str);
    }

    public final void p(String str, Throwable th, Object... objArr) {
        Log.e((String) this.a, o(str, objArr), th);
    }

    public final void q(String str, Object... objArr) {
        Log.w((String) this.a, o(str, objArr));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map, java.lang.Object] */
    public final void r(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.b) {
            hashMap = new HashMap((Map) this.b);
        }
        synchronized (this.a) {
            hashMap2 = new HashMap((Map) this.a);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).i(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((fxa) entry2.getKey()).e(new fnx(status));
            }
        }
    }

    public final boolean s() {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        return ((fjd) this.b).a((Context) this.a);
    }

    public ijk(byte[] bArr) {
        this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
    }

    public ijk(String str) {
        this.b = str;
        this.a = "Auth";
        for (int i = 2; i <= 7 && !Log.isLoggable((String) this.a, i); i++) {
        }
    }

    public ijk(Context context, byte[] bArr) {
        this.a = fsu.c(context);
        this.b = new gco(context.getMainLooper());
    }

    public ijk(File file, String str) {
        this.a = file;
        this.b = new File(file, str);
    }

    public ijk(ghn ghnVar) {
        this.a = new llk();
        this.b = ghnVar;
    }

    public ijk() {
        this.b = new ArrayList();
        this.a = new ArrayList();
    }

    public ijk(gvz gvzVar) {
        this.b = new WeakHashMap();
        this.a = gvzVar;
    }

    public ijk(doi doiVar, byte[] bArr) {
        this.b = lre.a();
        this.a = doiVar;
    }

    public ijk(Context context) {
        kqi a = ift.a();
        kor a2 = kos.a(context);
        a2.d("flags_module");
        a2.e("flags.pb");
        Uri a3 = a2.a();
        kqg a4 = kqh.a();
        a4.f(a3);
        a4.e(hij.b);
        this.a = a.a(a4.a());
        this.b = mjl.a;
    }

    public ijk(ijk ijkVar, llp llpVar, byte[] bArr) {
        this.b = llpVar;
        int i = 0;
        if (ijkVar != null) {
            Object obj = ijkVar.b;
            int size = llpVar.size();
            llp llpVar2 = (llp) obj;
            if (size == llpVar2.size()) {
                int i2 = 0;
                while (i2 < size) {
                    hqt hqtVar = (hqt) llpVar.get(i2);
                    hqt hqtVar2 = (hqt) llpVar2.get(i2);
                    i2 = (Objects.equals(hqtVar.i(), hqtVar2.i()) && Objects.equals(hqtVar.p(), hqtVar2.p())) ? i2 + 1 : i2;
                }
                int[] iArr = (int[]) ijkVar.a;
                this.a = Arrays.copyOf(iArr, iArr.length);
                return;
            }
        }
        this.a = new int[llpVar.size()];
        while (true) {
            int[] iArr2 = (int[]) this.a;
            if (i < iArr2.length) {
                iArr2[i] = i;
                i++;
            } else {
                return;
            }
        }
    }

    public ijk(iiy[] iiyVarArr) {
        this.a = iiyVarArr;
        this.b = lmz.g();
    }
}
