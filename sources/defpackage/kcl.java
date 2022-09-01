package defpackage;

import android.app.Application;
import android.content.Context;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;

/* compiled from: PG */
/* renamed from: kcl  reason: default package */
/* loaded from: classes.dex */
public final class kcl {
    public final Object a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    public kcl(Context context, kdg kdgVar, byte[] bArr) {
        this.a = kdgVar;
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(kdgVar.a);
        application.registerComponentCallbacks(kdgVar.a);
    }

    public final void a(kck kckVar) {
        Object obj = this.a;
        jdg.u(kckVar);
        Object obj2 = ((kdg) obj).a;
        int i = kcm.c;
        ((kcm) obj2).a.add(kckVar);
    }

    public final void b(kck kckVar) {
        Object obj = this.a;
        jdg.u(kckVar);
        Object obj2 = ((kdg) obj).a;
        int i = kcm.c;
        ((kcm) obj2).a.remove(kckVar);
    }

    public final int c() {
        return ((AtomicInteger) this.a).get();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    public final void f(lrh lrhVar) {
        jdg.A(!lrhVar.q(), "range must not be empty, but was %s", lrhVar);
        this.a.add(lrhVar);
    }

    public final void d(Object obj, int i) {
        try {
            ((Field) this.a).set(obj, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    public final void e(Object obj, Object obj2) {
        try {
            ((Field) this.a).set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    public kcl(byte[] bArr) {
        this.a = kjv.a();
    }

    public kcl() {
        this.a = new AtomicInteger();
    }

    public kcl(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = ndi.c();
    }

    public kcl(Matcher matcher) {
        jdg.u(matcher);
        this.a = matcher;
    }

    public kcl(char[] cArr) {
        this.a = lre.A();
    }

    public kcl(Field field) {
        this.a = field;
        field.setAccessible(true);
    }
}
