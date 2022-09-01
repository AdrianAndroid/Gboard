package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: nvu  reason: default package */
/* loaded from: classes2.dex */
public final class nvu {
    public static final List a;
    public static final nvu b;
    public static final nvu c;
    public static final nvu d;
    public static final nvu e;
    public static final nvu f;
    public static final nvu g;
    public static final nvu h;
    public static final nvu i;
    public static final nvu j;
    public static final nvu k;
    public static final nvu l;
    static final nuj m;
    static final nuj n;
    private static final nul r;
    public final nvr o;
    public final String p;
    public final Throwable q;

    static {
        nvr[] values;
        nvu nvuVar;
        Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));
        TreeMap treeMap = new TreeMap();
        for (nvr nvrVar : nvr.values()) {
            if (((nvu) treeMap.put(Integer.valueOf(nvrVar.r), new nvu(nvrVar, null, null))) != null) {
                throw new IllegalStateException("Code value duplication between " + nvuVar.o.name() + " & " + nvrVar.name());
            }
        }
        a = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        b = nvr.OK.b();
        c = nvr.CANCELLED.b();
        d = nvr.UNKNOWN.b();
        nvr.INVALID_ARGUMENT.b();
        e = nvr.DEADLINE_EXCEEDED.b();
        f = nvr.NOT_FOUND.b();
        nvr.ALREADY_EXISTS.b();
        g = nvr.PERMISSION_DENIED.b();
        h = nvr.UNAUTHENTICATED.b();
        i = nvr.RESOURCE_EXHAUSTED.b();
        nvr.FAILED_PRECONDITION.b();
        nvr.ABORTED.b();
        nvr.OUT_OF_RANGE.b();
        j = nvr.UNIMPLEMENTED.b();
        k = nvr.INTERNAL.b();
        l = nvr.UNAVAILABLE.b();
        nvr.DATA_LOSS.b();
        m = nuj.d("grpc-status", false, new nvs());
        nvt nvtVar = new nvt();
        r = nvtVar;
        n = nuj.d("grpc-message", false, nvtVar);
    }

    private nvu(nvr nvrVar, String str, Throwable th) {
        jdg.Q(nvrVar, "code");
        this.o = nvrVar;
        this.p = str;
        this.q = th;
    }

    public static num a(Throwable th) {
        while (th != null) {
            if (!(th instanceof nvv)) {
                if (!(th instanceof nvw)) {
                    th = th.getCause();
                } else {
                    return ((nvw) th).b;
                }
            } else {
                nvv nvvVar = (nvv) th;
                return null;
            }
        }
        return null;
    }

    public static nvu c(int i2) {
        if (i2 >= 0) {
            List list = a;
            if (i2 <= list.size()) {
                return (nvu) list.get(i2);
            }
        }
        nvu nvuVar = d;
        return nvuVar.f("Unknown code " + i2);
    }

    public static nvu d(Throwable th) {
        jdg.Q(th, "t");
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (!(th2 instanceof nvv)) {
                if (th2 instanceof nvw) {
                    return ((nvw) th2).a;
                }
            } else {
                return ((nvv) th2).a;
            }
        }
        return d.e(th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String j(nvu nvuVar) {
        if (nvuVar.p == null) {
            return nvuVar.o.toString();
        }
        return nvuVar.o + ": " + nvuVar.p;
    }

    public final nvu b(String str) {
        if (this.p == null) {
            return new nvu(this.o, str, this.q);
        }
        nvr nvrVar = this.o;
        return new nvu(nvrVar, this.p + "\n" + str, this.q);
    }

    public final nvu e(Throwable th) {
        return jdg.W(this.q, th) ? this : new nvu(this.o, this.p, th);
    }

    public final nvu f(String str) {
        return jdg.W(this.p, str) ? this : new nvu(this.o, str, this.q);
    }

    public final nvv g() {
        return new nvv(this);
    }

    public final nvw h() {
        return new nvw(this, null);
    }

    public final nvw i(num numVar) {
        return new nvw(this, numVar);
    }

    public final boolean k() {
        return nvr.OK == this.o;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("code", this.o.name());
        S.b("description", this.p);
        Throwable th = this.q;
        String str = th;
        if (th != null) {
            str = lgf.a(th);
        }
        S.b("cause", str);
        return S.toString();
    }
}
