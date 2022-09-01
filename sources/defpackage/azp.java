package defpackage;

import android.animation.Animator;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* renamed from: azp  reason: default package */
/* loaded from: classes.dex */
public final class azp {
    public final Object a;
    public final Object b;

    public azp(int i, int i2) {
        this.b = new int[]{i, i2};
        this.a = new float[]{0.0f, 1.0f};
    }

    public azp(int i, int i2, int i3) {
        this.b = new int[]{i, i2, i3};
        this.a = new float[]{0.0f, 0.5f, 1.0f};
    }

    public azp(Animator animator) {
        this.a = null;
        this.b = animator;
    }

    public azp(ComponentName componentName, IBinder iBinder) {
        this.b = componentName;
        this.a = iBinder;
    }

    public azp(Intent intent, ArrayList arrayList) {
        this.b = intent;
        this.a = arrayList;
    }

    public azp(Animation animation) {
        this.a = animation;
        this.b = null;
    }

    public azp(aqq aqqVar, Handler handler, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = aqqVar;
        this.a = handler;
    }

    public azp(bi biVar) {
        this.a = new CopyOnWriteArrayList();
        this.b = biVar;
    }

    public azp(og ogVar) {
        this.a = ogVar;
        this.b = new of();
    }

    public azp(float[] fArr, int[] iArr) {
        this.b = fArr;
        this.a = iArr;
    }

    private azp(String[] strArr, ovc ovcVar) {
        this.a = strArr;
        this.b = ovcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ac, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[Catch: IOException -> 0x01f2, TryCatch #0 {IOException -> 0x01f2, blocks: (B:3:0x0002, B:4:0x000c, B:6:0x000f, B:8:0x0020, B:10:0x0028, B:14:0x0044, B:16:0x003c, B:17:0x003f, B:28:0x0049, B:30:0x004c, B:33:0x005b, B:35:0x0076, B:36:0x0079, B:39:0x0082, B:41:0x008e, B:43:0x00a8, B:50:0x00c2, B:54:0x00dc, B:58:0x00e2, B:61:0x00e8, B:66:0x00d6, B:68:0x00e5, B:71:0x00f5, B:72:0x0116, B:75:0x0117, B:76:0x0138, B:78:0x0139, B:81:0x0146, B:83:0x014c, B:84:0x0155, B:86:0x015b, B:88:0x0167, B:90:0x0171, B:97:0x0187, B:93:0x018e, B:100:0x0191, B:101:0x01ab, B:106:0x01ae, B:107:0x01c6, B:109:0x01cc, B:111:0x01d6, B:113:0x01ea, B:114:0x01f1), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.azp k(java.lang.String... r17) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azp.k(java.lang.String[]):azp");
    }

    public static final boolean p(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public static final KeyListener q(KeyListener keyListener) {
        if (!p(keyListener) || (keyListener instanceof ael)) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return !(keyListener instanceof NumberKeyListener) ? new ael(keyListener) : keyListener;
    }

    public final void A(an anVar, boolean z) {
        an anVar2 = ((bi) this.b).k;
        if (anVar2 != null) {
            anVar2.E().v.A(anVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            nsx nsxVar = (nsx) it.next();
            if (!z) {
                ((cd) nsxVar.b).w(anVar);
            } else {
                boolean z2 = nsxVar.a;
            }
        }
    }

    public final void B(an anVar, Bundle bundle, boolean z) {
        an anVar2 = ((bi) this.b).k;
        if (anVar2 != null) {
            anVar2.E().v.B(anVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            nsx nsxVar = (nsx) it.next();
            if (!z) {
                Object obj = nsxVar.b;
            } else {
                boolean z2 = nsxVar.a;
            }
        }
    }

    public final void C(an anVar, boolean z) {
        an anVar2 = ((bi) this.b).k;
        if (anVar2 != null) {
            anVar2.E().v.C(anVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            nsx nsxVar = (nsx) it.next();
            if (!z) {
                Object obj = nsxVar.b;
            } else {
                boolean z2 = nsxVar.a;
            }
        }
    }

    public final void D(an anVar, boolean z) {
        an anVar2 = ((bi) this.b).k;
        if (anVar2 != null) {
            anVar2.E().v.D(anVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            nsx nsxVar = (nsx) it.next();
            if (!z) {
                ((cd) nsxVar.b).x(anVar);
            } else {
                boolean z2 = nsxVar.a;
            }
        }
    }

    public final void E(an anVar, View view, Bundle bundle, boolean z) {
        an anVar2 = ((bi) this.b).k;
        if (anVar2 != null) {
            anVar2.E().v.E(anVar, view, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            nsx nsxVar = (nsx) it.next();
            if (!z) {
                Object obj = nsxVar.b;
            } else {
                boolean z2 = nsxVar.a;
            }
        }
    }

    public final void F(an anVar, boolean z) {
        an anVar2 = ((bi) this.b).k;
        if (anVar2 != null) {
            anVar2.E().v.F(anVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            nsx nsxVar = (nsx) it.next();
            if (!z) {
                Object obj = nsxVar.b;
            } else {
                boolean z2 = nsxVar.a;
            }
        }
    }

    public final synchronized List a(Class cls) {
        return ((azt) this.a).c(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map, java.lang.Object] */
    public final synchronized List b(Class cls) {
        aqq aqqVar = (aqq) ((aqq) this.b).a.get(cls);
        ?? r0 = aqqVar == null ? 0 : aqqVar.a;
        if (r0 == 0) {
            List unmodifiableList = Collections.unmodifiableList(((azt) this.a).b(cls));
            if (((aqq) ((aqq) this.b).a.put(cls, new aqq(unmodifiableList))) == null) {
                return unmodifiableList;
            }
            throw new IllegalStateException("Already cached loaders for model: ".concat(String.valueOf(String.valueOf(cls))));
        }
        return r0;
    }

    public final synchronized void c(Class cls, Class cls2, azo azoVar) {
        ((azt) this.a).f(cls, cls2, azoVar);
        ((aqq) this.b).d();
    }

    public final synchronized void d(Class cls, Class cls2, azo azoVar) {
        ((azt) this.a).g(cls, cls2, azoVar);
        ((aqq) this.b).d();
    }

    public final synchronized void e(Class cls, Class cls2, azo azoVar) {
        for (azo azoVar2 : ((azt) this.a).e(cls, cls2, azoVar)) {
            azoVar2.c();
        }
        ((aqq) this.b).d();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [xx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [xx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [xx, java.lang.Object] */
    public final String f(auw auwVar) {
        String str;
        synchronized (this.a) {
            str = (String) ((bgf) this.a).f(auwVar);
        }
        if (str == null) {
            ayk aykVar = (ayk) this.b.a();
            ce.m(aykVar);
            try {
                auwVar.a(aykVar.a);
                byte[] digest = aykVar.a.digest();
                synchronized (bgj.b) {
                    char[] cArr = bgj.b;
                    for (int i = 0; i < digest.length; i++) {
                        int i2 = digest[i] & 255;
                        int i3 = i + i;
                        char[] cArr2 = bgj.a;
                        cArr[i3] = cArr2[i2 >>> 4];
                        cArr[i3 + 1] = cArr2[i2 & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                this.b.b(aykVar);
            }
        }
        synchronized (this.a) {
            ((bgf) this.a).g(auwVar, str);
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.concurrent.locks.Lock, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.Queue] */
    public final void g(String str) {
        otj otjVar;
        synchronized (this) {
            otjVar = (otj) this.a.get(str);
            ce.m(otjVar);
            int i = otjVar.a;
            if (i > 0) {
                int i2 = i - 1;
                otjVar.a = i2;
                if (i2 == 0) {
                    otj otjVar2 = (otj) this.a.remove(str);
                    if (otjVar2.equals(otjVar)) {
                        Object obj = this.b;
                        synchronized (((aqr) obj).a) {
                            if (((aqr) obj).a.size() < 10) {
                                ((aqr) obj).a.offer(otjVar2);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + otjVar.toString() + ", but actually removed: " + String.valueOf(otjVar2) + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + i);
            }
        }
        otjVar.b.unlock();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map, java.lang.Object] */
    public final Map h(boolean z) {
        return z ? this.a : this.b;
    }

    public final void i(auw auwVar, awz awzVar) {
        Map h = h(awzVar.d);
        if (awzVar.equals(h.get(auwVar))) {
            h.remove(auwVar);
        }
    }

    public final int j() {
        return ((int[]) this.a).length;
    }

    public final File l(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) ((HashMap) this.a).get(decode);
        if (file == null) {
            new StringBuilder("Unable to find configured root for ").append(uri);
            throw new IllegalArgumentException("Unable to find configured root for ".concat(String.valueOf(uri)));
        }
        File file2 = new File(file, decode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (!canonicalFile.getPath().startsWith(file.getPath())) {
                throw new SecurityException("Resolved path jumped beyond configured root");
            }
            return canonicalFile;
        } catch (IOException unused) {
            new StringBuilder("Failed to resolve canonical path for ").append(file2);
            throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(file2.toString()));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [og, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [og, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [og, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [og, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [og, java.lang.Object] */
    public final View m(int i, int i2, int i3, int i4) {
        int d = this.a.d();
        int c = this.a.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View e = this.a.e(i);
            ((of) this.b).c(d, c, this.a.b(e), this.a.a(e));
            ((of) this.b).b();
            ((of) this.b).a(i3);
            of ofVar = (of) this.b;
            if (ofVar.d()) {
                return e;
            }
            if (i4 != 0) {
                ofVar.b();
                ((of) this.b).a(i4);
                if (((of) this.b).d()) {
                    view = e;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [og, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [og, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [og, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [og, java.lang.Object] */
    public final boolean n(View view) {
        ((of) this.b).c(this.a.d(), this.a.c(), this.a.b(view), this.a.a(view));
        ((of) this.b).b();
        ((of) this.b).a(24579);
        return ((of) this.b).d();
    }

    public final void o(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, ei.i, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            aeo aeoVar = (aeo) ((bek) ((aqr) this.a).a).a;
            if (aeoVar.a == z) {
                return;
            }
            aeoVar.a = z;
            if (!z) {
                return;
            }
            aef.a();
            throw null;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection r(InputConnection inputConnection) {
        Object obj = this.a;
        if (inputConnection == null) {
            return null;
        }
        return inputConnection instanceof aek ? inputConnection : new aek((TextView) ((bek) ((aqr) obj).a).b, inputConnection);
    }

    public final void s(an anVar, Bundle bundle, boolean z) {
        an anVar2 = ((bi) this.b).k;
        if (anVar2 != null) {
            anVar2.E().v.s(anVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            nsx nsxVar = (nsx) it.next();
            if (!z) {
                Object obj = nsxVar.b;
            } else {
                boolean z2 = nsxVar.a;
            }
        }
    }

    public final void t(an anVar, boolean z) {
        bi biVar = (bi) this.b;
        Context context = biVar.i.c;
        an anVar2 = biVar.k;
        if (anVar2 != null) {
            anVar2.E().v.t(anVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            nsx nsxVar = (nsx) it.next();
            if (!z) {
                Object obj = nsxVar.b;
            } else {
                boolean z2 = nsxVar.a;
            }
        }
    }

    public final void u(an anVar, Bundle bundle, boolean z) {
        an anVar2 = ((bi) this.b).k;
        if (anVar2 != null) {
            anVar2.E().v.u(anVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            nsx nsxVar = (nsx) it.next();
            if (!z) {
                Object obj = nsxVar.b;
            } else {
                boolean z2 = nsxVar.a;
            }
        }
    }

    public final void v(an anVar, boolean z) {
        an anVar2 = ((bi) this.b).k;
        if (anVar2 != null) {
            anVar2.E().v.v(anVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            nsx nsxVar = (nsx) it.next();
            if (!z) {
                Object obj = nsxVar.b;
            } else {
                boolean z2 = nsxVar.a;
            }
        }
    }

    public final void w(an anVar, boolean z) {
        an anVar2 = ((bi) this.b).k;
        if (anVar2 != null) {
            anVar2.E().v.w(anVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            nsx nsxVar = (nsx) it.next();
            if (!z) {
                Object obj = nsxVar.b;
            } else {
                boolean z2 = nsxVar.a;
            }
        }
    }

    public final void x(an anVar, boolean z) {
        an anVar2 = ((bi) this.b).k;
        if (anVar2 != null) {
            anVar2.E().v.x(anVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            nsx nsxVar = (nsx) it.next();
            if (!z) {
                ((cd) nsxVar.b).v(anVar);
            } else {
                boolean z2 = nsxVar.a;
            }
        }
    }

    public final void y(an anVar, boolean z) {
        bi biVar = (bi) this.b;
        Context context = biVar.i.c;
        an anVar2 = biVar.k;
        if (anVar2 != null) {
            anVar2.E().v.y(anVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            nsx nsxVar = (nsx) it.next();
            if (!z) {
                Object obj = nsxVar.b;
            } else {
                boolean z2 = nsxVar.a;
            }
        }
    }

    public final void z(an anVar, Bundle bundle, boolean z) {
        an anVar2 = ((bi) this.b).k;
        if (anVar2 != null) {
            anVar2.E().v.z(anVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            nsx nsxVar = (nsx) it.next();
            if (!z) {
                Object obj = nsxVar.b;
            } else {
                boolean z2 = nsxVar.a;
            }
        }
    }

    public azp(EditText editText) {
        this.b = editText;
        this.a = new aqr(editText);
    }

    public final void G(krm krmVar) {
        if (krmVar.a != 0) {
            Object obj = this.b;
            ((Handler) this.a).post(new od((aqq) obj, 7, null, null, null));
            return;
        }
        Object obj2 = krmVar.b;
        Object obj3 = this.b;
        ((Handler) this.a).post(new bw((aqq) obj3, (Typeface) obj2, 12, null, null, null));
    }

    public azp(String str) {
        this.a = new HashMap();
        this.b = str;
    }

    public azp(List list, List list2) {
        int size = list.size();
        this.b = new int[size];
        this.a = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) list.get(i)).intValue();
            ((float[]) this.a)[i] = ((Float) list2.get(i)).floatValue();
        }
    }

    public azp(aob aobVar) {
        this.a = new ArrayList();
        this.b = aobVar;
    }

    public azp(byte[] bArr, byte[] bArr2) {
        this.b = new HashMap();
        this.a = new HashMap();
    }

    public azp(byte[] bArr) {
        this.a = new HashMap();
        this.b = new aqr();
    }

    public azp() {
        this.a = new bgf(1000L);
        this.b = bgq.b(10, new ayj(0));
    }

    public azp(xx xxVar) {
        azt aztVar = new azt(xxVar);
        this.b = new aqq((byte[]) null);
        this.a = aztVar;
    }
}
