package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: aqr  reason: default package */
/* loaded from: classes.dex */
public final class aqr {
    public final Object a;

    public aqr(alt altVar) {
        this.a = altVar;
    }

    public aqr(Context context) {
        this.a = new doi(context);
    }

    @Deprecated
    public aqr(Context context, byte[] bArr) {
        this.a = new EdgeEffect(context);
    }

    public aqr(TextView textView) {
        this.a = new aen(textView);
    }

    public aqr(aqq aqqVar) {
        this.a = aqqVar;
    }

    public static float o(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return ach.a(edgeEffect);
        }
        return 0.0f;
    }

    public static EdgeEffect q(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? ach.c(context, attributeSet) : new EdgeEffect(context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final boolean a(Class cls) {
        return this.a.containsKey(cls);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    public final synchronized List b() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final synchronized void c(auq auqVar) {
        this.a.add(auqVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, auo] */
    public final synchronized auo d(Class cls) {
        for (bek bekVar : this.a) {
            if (((Class) bekVar.a).isAssignableFrom(cls)) {
                return bekVar.b;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final synchronized void e(Class cls, auo auoVar) {
        this.a.add(new bek(cls, auoVar));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [bcv, java.lang.Object] */
    public final synchronized bcv f(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return bcw.a;
        }
        for (kcq kcqVar : this.a) {
            if (kcqVar.G(cls, cls2)) {
                return kcqVar.b;
            }
        }
        String valueOf = String.valueOf(cls);
        String valueOf2 = String.valueOf(cls2);
        throw new IllegalArgumentException("No transcoder registered to transcode from " + valueOf + " to " + valueOf2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    public final synchronized List g(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (kcq kcqVar : this.a) {
            if (kcqVar.G(cls, cls2) && !arrayList.contains(kcqVar.c)) {
                arrayList.add(kcqVar.c);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final synchronized void h(Class cls, Class cls2, bcv bcvVar) {
        this.a.add(new kcq(cls, cls2, bcvVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    public final synchronized auj i(ByteBuffer byteBuffer) {
        auj aujVar;
        aujVar = (auj) this.a.poll();
        if (aujVar == null) {
            aujVar = new auj();
        }
        aujVar.b = null;
        Arrays.fill(aujVar.a, (byte) 0);
        aujVar.c = new aui();
        aujVar.d = 0;
        aujVar.b = byteBuffer.asReadOnlyBuffer();
        aujVar.b.position(0);
        aujVar.b.order(ByteOrder.LITTLE_ENDIAN);
        return aujVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final synchronized void j(auj aujVar) {
        aujVar.b = null;
        aujVar.c = null;
        this.a.offer(aujVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final void k(aob aobVar) {
        this.a.add(aobVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    public final void l(Path path) {
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                ash.g(path, (aob) this.a.get(size));
            } else {
                return;
            }
        }
    }

    public final void m() {
        for (agm agmVar : ((HashMap) this.a).values()) {
            agmVar.j = true;
            synchronized (agmVar.h) {
                for (Object obj : agmVar.h.values()) {
                    agm.f(obj);
                }
            }
            synchronized (agmVar.i) {
                for (Closeable closeable : agmVar.i) {
                    agm.f(closeable);
                }
            }
            agmVar.c();
        }
        ((HashMap) this.a).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final void n() {
        for (int o = nxp.o(this.a); o >= 0; o--) {
            ((acw) ((ArrayList) this.a).get(o)).a();
        }
    }

    @Deprecated
    public final void r() {
        ((EdgeEffect) this.a).finish();
    }

    @Deprecated
    public final void s(int i, int i2) {
        ((EdgeEffect) this.a).setSize(i, i2);
    }

    @Deprecated
    public final boolean t(Canvas canvas) {
        return ((EdgeEffect) this.a).draw(canvas);
    }

    @Deprecated
    public final boolean u() {
        return ((EdgeEffect) this.a).isFinished();
    }

    @Deprecated
    public final boolean v() {
        ((EdgeEffect) this.a).onRelease();
        return ((EdgeEffect) this.a).isFinished();
    }

    @Deprecated
    public final void w(float f) {
        ((EdgeEffect) this.a).onPull(f);
    }

    public aqr(char[] cArr, byte[] bArr) {
        this.a = new ArrayList();
    }

    public static float p(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return ach.b(edgeEffect, f, f2);
        }
        acg.a(edgeEffect, f, f2);
        return f;
    }

    public aqr(EditText editText, byte[] bArr) {
        this.a = new bek(editText, (byte[]) null);
    }

    public aqr(EditText editText) {
        this.a = new bek(editText);
    }

    public aqr(byte[] bArr, char[] cArr) {
        this.a = new HashMap();
    }

    public aqr(short[] sArr) {
        this.a = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    public aqr(aqq aqqVar, byte[] bArr) {
        this.a = Collections.unmodifiableMap(new HashMap((Map) aqqVar.a));
    }

    public aqr() {
        this.a = new ArrayDeque();
    }

    public aqr(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = bgj.i(0);
    }

    public aqr(char[] cArr) {
        this.a = new ArrayList();
    }

    public aqr(byte[] bArr, byte[] bArr2) {
        this.a = new ArrayList();
    }

    public aqr(byte[] bArr) {
        this.a = new ArrayList();
    }
}
