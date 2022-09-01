package defpackage;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* renamed from: nuq  reason: default package */
/* loaded from: classes2.dex */
public final class nuq {
    public final nup a;
    public final String b;
    public final String c;
    public final nuo d;
    public final nuo e;
    public final boolean f;

    public nuq(nup nupVar, String str, nuo nuoVar, nuo nuoVar2, boolean z) {
        new AtomicReferenceArray(2);
        jdg.Q(nupVar, "type");
        this.a = nupVar;
        jdg.Q(str, "fullMethodName");
        this.b = str;
        jdg.Q(str, "fullMethodName");
        int lastIndexOf = str.lastIndexOf(47);
        this.c = lastIndexOf == -1 ? null : str.substring(0, lastIndexOf);
        jdg.Q(nuoVar, "requestMarshaller");
        this.d = nuoVar;
        jdg.Q(nuoVar2, "responseMarshaller");
        this.e = nuoVar2;
        this.f = z;
    }

    public static nun a() {
        nun nunVar = new nun();
        nunVar.a = null;
        nunVar.b = null;
        return nunVar;
    }

    public static String c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        jdg.Q(str, "fullServiceName");
        sb.append(str);
        sb.append("/");
        jdg.Q(str2, "methodName");
        sb.append(str2);
        return sb.toString();
    }

    public final InputStream b(Object obj) {
        return this.d.a(obj);
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("fullMethodName", this.b);
        S.b("type", this.a);
        S.h("idempotent", false);
        S.h("safe", false);
        S.h("sampledToLocalTracing", this.f);
        S.b("requestMarshaller", this.d);
        S.b("responseMarshaller", this.e);
        S.b("schemaDescriptor", null);
        S.d();
        return S.toString();
    }
}
