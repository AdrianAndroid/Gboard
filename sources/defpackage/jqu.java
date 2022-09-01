package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* renamed from: jqu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jqu implements mix {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jqu(jqx jqxVar, String str, mko mkoVar, int i) {
        this.d = i;
        this.a = jqxVar;
        this.c = str;
        this.b = mkoVar;
    }

    public /* synthetic */ jqu(jqx jqxVar, mko mkoVar, String str, int i) {
        this.d = i;
        this.a = jqxVar;
        this.b = mkoVar;
        this.c = str;
    }

    public /* synthetic */ jqu(jwz jwzVar, jsr jsrVar, mko mkoVar, int i) {
        this.d = i;
        this.b = jwzVar;
        this.a = jsrVar;
        this.c = mkoVar;
    }

    public /* synthetic */ jqu(jxn jxnVar, String str, Set set, int i) {
        this.d = i;
        this.a = jxnVar;
        this.b = str;
        this.c = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [mko, java.util.concurrent.Future, java.lang.Object] */
    @Override // defpackage.mix
    public final mko a() {
        long currentTimeMillis;
        long currentTimeMillis2;
        long currentTimeMillis3;
        int i = this.d;
        boolean z = false;
        if (i == 0) {
            Object obj = this.a;
            ?? r6 = this.b;
            Object obj2 = this.c;
            try {
                if (((jre) kcu.S(r6)).e()) {
                    ((jqx) obj).m.a(new jqp(1));
                }
            } catch (Throwable th) {
                Throwable w = lwm.w(th);
                if (!(w instanceof CancellationException)) {
                    ((jqx) obj).m.a(new jqp(0));
                    String message = w.getMessage();
                    jrz a = jsf.a((String) obj2);
                    a.f(2);
                    Object[] objArr = new Object[1];
                    if (message == null) {
                        message = "";
                    }
                    objArr[0] = message;
                    a.c("api", "sync_failed", objArr);
                }
            }
            return r6;
        } else if (i != 1) {
            if (i == 2) {
                Object obj3 = this.b;
                Object obj4 = this.a;
                ?? r3 = this.c;
                ((jwz) obj3).a.remove(obj4);
                return r3;
            }
            Object obj5 = this.a;
            Object obj6 = this.b;
            ?? r32 = this.c;
            jxn jxnVar = (jxn) obj5;
            jxr jxrVar = (jxr) jxnVar.h.remove(obj6);
            if (jxrVar != null) {
                jxrVar.a();
                lug lugVar = jsh.a;
            }
            return jxnVar.b((String) obj6, Collections.emptySet(), r32);
        } else {
            Object obj7 = this.a;
            Object obj8 = this.c;
            ?? r5 = this.b;
            try {
                jvr jvrVar = ((jqx) obj7).f;
                jxz jxzVar = jxz.POST_SYNC_GC;
                jtf jtfVar = jvrVar.f;
                long currentTimeMillis4 = System.currentTimeMillis();
                synchronized (jvrVar.b) {
                    jtf jtfVar2 = jvrVar.f;
                    currentTimeMillis = System.currentTimeMillis();
                    if (jxzVar == jxz.POST_SYNC_GC) {
                        z = true;
                    }
                    List l = jvrVar.l((String) obj8, 0L, z);
                    jtf jtfVar3 = jvrVar.f;
                    currentTimeMillis2 = System.currentTimeMillis();
                    jvrVar.t(l, jxzVar);
                    jtf jtfVar4 = jvrVar.f;
                    currentTimeMillis3 = System.currentTimeMillis();
                }
                lwm.r((String) obj8, 0L, jxzVar, currentTimeMillis3 - currentTimeMillis4, currentTimeMillis - currentTimeMillis4, currentTimeMillis2 - currentTimeMillis, currentTimeMillis3 - currentTimeMillis2);
            } catch (IOException e) {
                ((luc) ((luc) ((luc) jsh.a.d()).i(e)).k("com/google/android/libraries/micore/superpacks/Superpacks", "applyPostSyncGcBehavior", 1612, "Superpacks.java")).w("Error occurred during post-sync garbage collection on superpack: %s", obj8);
            }
            return r5;
        }
    }
}
