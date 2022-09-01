package defpackage;

import android.view.inputmethod.InputMethodInfo;
import j$.util.Collection$EL;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;

/* compiled from: PG */
/* renamed from: jcf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jcf implements lfe {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jcf(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public /* synthetic */ jcf(Method method, int i) {
        this.b = i;
        this.a = method;
    }

    public /* synthetic */ jcf(Set set, int i) {
        this.b = i;
        this.a = set;
    }

    public /* synthetic */ jcf(jil jilVar, int i) {
        this.b = i;
        this.a = jilVar;
    }

    public /* synthetic */ jcf(jwr jwrVar, int i) {
        this.b = i;
        this.a = jwrVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.lfe
    public final boolean a(Object obj) {
        mld mldVar;
        int i = this.b;
        if (i == 0) {
            return !((String) this.a).equals(((Map.Entry) obj).getKey());
        } else if (i == 1) {
            Boolean bool = (Boolean) jbt.s((Method) this.a, (InputMethodInfo) obj, true, new Object[0]);
            return bool == null || bool.booleanValue();
        } else if (i != 2) {
            if (i == 3) {
                Object obj2 = this.a;
                Exception exc = (Exception) obj;
                synchronized (obj2) {
                    mldVar = ((jwr) obj2).g;
                }
                return mldVar == null;
            }
            return Collection$EL.stream(this.a).anyMatch(new cjx((ZipEntry) obj, 16));
        } else {
            Object obj3 = this.a;
            jil jilVar = (jil) obj;
            int i2 = jmn.d;
            jil jilVar2 = (jil) obj3;
            jiq jiqVar = jilVar2.b;
            if (jiqVar == null) {
                jiqVar = jiq.f;
            }
            jiq jiqVar2 = jilVar.b;
            if (jiqVar2 == null) {
                jiqVar2 = jiq.f;
            }
            return jiqVar.equals(jiqVar2) && jilVar2.e == jilVar.e && jilVar2.c == jilVar.c;
        }
    }
}
