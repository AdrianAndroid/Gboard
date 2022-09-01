package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: nsa  reason: default package */
/* loaded from: classes2.dex */
public final class nsa {
    public static final nsa a = new nsa();
    public nsv b;
    public Executor c;
    public List d;
    public Boolean e;
    public Integer f;
    public Integer g;
    private Object[][] h;

    private nsa() {
        this.d = Collections.emptyList();
        this.h = (Object[][]) Array.newInstance(Object.class, 0, 2);
    }

    public final nsa a(Executor executor) {
        nsa nsaVar = new nsa(this);
        nsaVar.c = executor;
        return nsaVar;
    }

    public final nsa b(int i) {
        jdg.y(i >= 0, "invalid maxsize %s", i);
        nsa nsaVar = new nsa(this);
        nsaVar.f = Integer.valueOf(i);
        return nsaVar;
    }

    public final nsa c(int i) {
        jdg.y(i >= 0, "invalid maxsize %s", i);
        nsa nsaVar = new nsa(this);
        nsaVar.g = Integer.valueOf(i);
        return nsaVar;
    }

    public final nsa d(nrz nrzVar, Object obj) {
        jdg.Q(nrzVar, "key");
        jdg.Q(obj, "value");
        nsa nsaVar = new nsa(this);
        int i = 0;
        while (true) {
            Object[][] objArr = this.h;
            if (i >= objArr.length) {
                i = -1;
                break;
            } else if (nrzVar.equals(objArr[i][0])) {
                break;
            } else {
                i++;
            }
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, this.h.length + (i == -1 ? 1 : 0), 2);
        nsaVar.h = objArr2;
        Object[][] objArr3 = this.h;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i == -1) {
            Object[][] objArr4 = nsaVar.h;
            int length = this.h.length;
            Object[] objArr5 = new Object[2];
            objArr5[0] = nrzVar;
            objArr5[1] = obj;
            objArr4[length] = objArr5;
        } else {
            Object[][] objArr6 = nsaVar.h;
            Object[] objArr7 = new Object[2];
            objArr7[0] = nrzVar;
            objArr7[1] = obj;
            objArr6[i] = objArr7;
        }
        return nsaVar;
    }

    public final Object e(nrz nrzVar) {
        jdg.Q(nrzVar, "key");
        int i = 0;
        while (true) {
            Object[][] objArr = this.h;
            if (i < objArr.length) {
                if (nrzVar.equals(objArr[i][0])) {
                    return this.h[i][1];
                }
                i++;
            } else {
                return nrzVar.a;
            }
        }
    }

    public final boolean f() {
        return Boolean.TRUE.equals(this.e);
    }

    public final nsa g(nxp nxpVar) {
        nsa nsaVar = new nsa(this);
        ArrayList arrayList = new ArrayList(this.d.size() + 1);
        arrayList.addAll(this.d);
        arrayList.add(nxpVar);
        nsaVar.d = Collections.unmodifiableList(arrayList);
        return nsaVar;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("deadline", this.b);
        S.b("authority", null);
        S.b("callCredentials", null);
        Executor executor = this.c;
        S.b("executor", executor != null ? executor.getClass() : null);
        S.b("compressorName", null);
        S.b("customOptions", Arrays.deepToString(this.h));
        S.h("waitForReady", f());
        S.b("maxInboundMessageSize", this.f);
        S.b("maxOutboundMessageSize", this.g);
        S.b("streamTracerFactories", this.d);
        return S.toString();
    }

    public nsa(nsa nsaVar) {
        this.d = Collections.emptyList();
        this.b = nsaVar.b;
        this.c = nsaVar.c;
        this.h = nsaVar.h;
        this.e = nsaVar.e;
        this.f = nsaVar.f;
        this.g = nsaVar.g;
        this.d = nsaVar.d;
    }
}
