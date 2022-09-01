package defpackage;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* renamed from: aqq  reason: default package */
/* loaded from: classes.dex */
public final class aqq {
    public final Object a;

    public aqq(aca acaVar) {
        this.a = acaVar;
    }

    public aqq(DisplayMetrics displayMetrics) {
        this.a = displayMetrics;
    }

    public aqq(PointerIcon pointerIcon) {
        this.a = pointerIcon;
    }

    public aqq(au auVar) {
        this.a = auVar;
    }

    public aqq(hy hyVar) {
        this.a = hyVar;
    }

    public aqq(Object obj) {
        this.a = obj;
    }

    public aqq(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public aqq(Object obj, byte[] bArr, byte[] bArr2) {
        this.a = obj;
    }

    public aqq(Object obj, char[] cArr) {
        this.a = obj;
    }

    public aqq(String str) {
        Bundle bundle = new Bundle();
        this.a = bundle;
        bundle.putBoolean(str, true);
    }

    public aqq(List list) {
        this.a = list;
    }

    public aqq(opu opuVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = opuVar;
    }

    public aqq(vj vjVar) {
        this.a = vjVar;
    }

    public aqq(File[] fileArr) {
        this.a = fileArr;
    }

    public static aqq D(int i, int i2, int i3, int i4, boolean z) {
        return new aqq(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z), (byte[]) null, (byte[]) null);
    }

    public static aqq E(int i, int i2, int i3) {
        return new aqq(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3), (byte[]) null, (byte[]) null);
    }

    public static String c(String str, aqp aqpVar, boolean z) {
        String replaceAll = str.replaceAll("\\W+", "");
        String concat = z ? ".temp".concat(String.valueOf(aqpVar.c)) : aqpVar.c;
        return "lottie_cache_" + replaceAll + concat;
    }

    public final bi A() {
        return ((au) this.a).e;
    }

    public final void B() {
        ((au) this.a).e.noteStateNotSaved();
    }

    public final void C() {
        ((au) this.a).e.aa(true);
    }

    public final void F(opu opuVar) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            aal.a(view.animate(), opuVar != null ? new op(opuVar, 2, null, null, null, null, null) : null);
        }
    }

    public final File a() {
        File file = new File(((Context) ((opu) this.a).a).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File b(String str, InputStream inputStream, aqp aqpVar) {
        File file = new File(a(), c(str, aqpVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final void d() {
        this.a.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, aca] */
    public final ClipDescription e() {
        return this.a.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, aca] */
    public final Uri f() {
        return this.a.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, aca] */
    public final Uri g() {
        return this.a.c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, aca] */
    public final Object h() {
        return this.a.d();
    }

    public final void i() {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void j(float f) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void k(long j) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void l(aam aamVar) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            if (aamVar != null) {
                view.animate().setListener(new aak(aamVar));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void m(float f) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public final boolean n() {
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            if (((yt) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final void o(MotionEvent motionEvent) {
        ((GestureDetector) ((aqq) this.a).a).onTouchEvent(motionEvent);
    }

    public final Object p(Object obj, Object obj2) {
        oll.e(obj2, "value");
        return ((LinkedHashMap) this.a).put(obj, obj2);
    }

    public final boolean q() {
        return ((LinkedHashMap) this.a).isEmpty();
    }

    public final qb r() {
        return new qb((Bundle) this.a);
    }

    public final void s(ColorStateList colorStateList) {
        nq.h(colorStateList, "imageTintList should not be null");
        ((Bundle) this.a).putParcelable("image_tint_list", colorStateList);
    }

    public final qc t() {
        return new qc((Bundle) this.a);
    }

    public final void u(int i) {
        ((Bundle) this.a).putInt("text_color", i);
    }

    public final void v(float f) {
        ((Bundle) this.a).putInt("text_size_unit", 1);
        ((Bundle) this.a).putFloat("text_size", f);
    }

    public final void w() {
        ((Bundle) this.a).putString("text_font_family", "google-sans-text-medium-compat");
        ((Bundle) this.a).putInt("text_font_style", 0);
    }

    public final qd x() {
        return new qd((Bundle) this.a);
    }

    public final void y(int i, int i2) {
        ((Bundle) this.a).putIntArray("layout_margin", new int[]{i, 0, i2, 0});
    }

    public final void z(int i) {
        ((Bundle) this.a).putIntArray("padding", new int[]{i, 0, 0, 0});
    }

    public aqq(byte[] bArr, char[] cArr, byte[] bArr2) {
        this("image_view_style", (byte[]) null);
    }

    public aqq(char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this("text_view_style", (byte[]) null);
    }

    public aqq(String str, byte[] bArr) {
        this(str);
    }

    public aqq(short[] sArr) {
        this("view_style", (byte[]) null);
    }

    public aqq(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new LinkedHashMap(0, 0.75f, true);
    }

    public aqq(Context context, GestureDetector.OnGestureListener onGestureListener, byte[] bArr) {
        this.a = new GestureDetector(context, onGestureListener, null);
    }

    public aqq(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = new aqq(context, onGestureListener, (byte[]) null);
    }

    public aqq(byte[] bArr, char[] cArr) {
        this.a = new CopyOnWriteArrayList();
        new HashMap();
    }

    public aqq(View view) {
        this.a = new WeakReference(view);
    }

    public aqq(Window window) {
        this.a = Build.VERSION.SDK_INT >= 30 ? new abf(window) : Build.VERSION.SDK_INT >= 26 ? new abe(window) : new abe(window);
    }

    public aqq(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = Build.VERSION.SDK_INT >= 25 ? new aby(uri, clipDescription, uri2) : new abz(uri, clipDescription, uri2);
    }

    public aqq() {
        this.a = new HashMap();
    }

    public aqq(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new azl();
    }

    public aqq(byte[] bArr) {
        this.a = new HashMap();
    }
}
