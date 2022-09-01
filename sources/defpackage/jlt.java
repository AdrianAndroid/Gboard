package defpackage;

import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IllegalFormatException;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jlt  reason: default package */
/* loaded from: classes.dex */
public final class jlt {
    public final Object a;

    public jlt(Executor executor) {
        this.a = executor;
    }

    public jlt(nsx nsxVar, byte[] bArr) {
        this.a = nsxVar;
    }

    public jlt(oiy oiyVar) {
        oiyVar.getClass();
        this.a = oiyVar;
    }

    public jlt(qv qvVar) {
        this.a = qvVar;
    }

    private static String m(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    public final mko a(Callable callable, Executor executor) {
        return ((nsx) this.a).a(ldd.g(callable), executor);
    }

    public final mko b(mix mixVar, Executor executor) {
        return ((nsx) this.a).b(ldd.b(mixVar), executor);
    }

    public final String c(Uri uri, String str, String str2) {
        if (uri != null) {
            qv qvVar = (qv) ((qv) this.a).get(uri.toString());
            if (qvVar == null) {
                return null;
            }
            if (str != null) {
                str2 = str.concat(String.valueOf(str2));
            }
            return (String) qvVar.get(str2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, oiy] */
    public final khn d(float f) {
        Random random = (Random) this.a.a();
        random.getClass();
        return new khn(random, f);
    }

    public final void e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m((String) this.a, str, objArr));
        }
    }

    public final void f(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m((String) this.a, str, objArr), th);
        }
    }

    public final void g(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", m((String) this.a, str, objArr));
        }
    }

    public final void h(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", m((String) this.a, str, objArr));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    public final synchronized void i(kzf kzfVar) {
        this.a.add(kzfVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    public final synchronized void j(kzf kzfVar) {
        this.a.remove(kzfVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    public final synchronized void k(Object obj) {
        for (kzf kzfVar : this.a) {
            kzfVar.a(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final void l(int i) {
        this.a.add(new kzc(i, System.currentTimeMillis()));
    }

    public jlt(byte[] bArr, byte[] bArr2) {
        this.a = new ArrayList();
    }

    public jlt(byte[] bArr) {
        this.a = new HashSet();
    }

    public jlt(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        this.a = ("UID: [" + myUid + "]  PID: [" + myPid + "] ").concat(String.valueOf(str));
    }

    public jlt() {
        this.a = new HashMap();
    }
}
