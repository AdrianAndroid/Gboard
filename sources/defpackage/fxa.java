package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: fxa  reason: default package */
/* loaded from: classes.dex */
public final class fxa {
    public final Object a;

    public fxa() {
        this.a = new ger();
    }

    public fxa(Context context) {
        this.a = context;
    }

    public fxa(fpo fpoVar) {
        this.a = fpoVar;
    }

    public fxa(InputStream inputStream) {
        this.a = inputStream;
    }

    public fxa(mkr mkrVar) {
        this.a = mkrVar;
    }

    public fxa(byte[] bArr) {
        this.a = new ArrayList();
    }

    public static boolean a(File file) {
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            return true;
        }
        boolean z = true;
        for (File file2 : file.listFiles()) {
            z &= a(file2);
        }
        return file.delete() && z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fpo, java.lang.Object] */
    public final void b(Status status) {
        try {
            this.a.b(status);
        } catch (RemoteException unused) {
            Log.w("brella.ResultHdlingSvc", "An error occurred when trying to communicate with Brella.");
        }
    }

    public final void c(Exception exc) {
        ((ger) this.a).n(exc);
    }

    public final void d(Object obj) {
        ((ger) this.a).o(obj);
    }

    public final boolean e(Exception exc) {
        Object obj = this.a;
        fyb.aH(exc, "Exception must not be null");
        ger gerVar = (ger) obj;
        synchronized (gerVar.a) {
            if (((ger) obj).b) {
                return false;
            }
            ((ger) obj).b = true;
            ((ger) obj).e = exc;
            gerVar.f.f((gen) obj);
            return true;
        }
    }

    public final boolean f(Object obj) {
        Object obj2 = this.a;
        ger gerVar = (ger) obj2;
        synchronized (gerVar.a) {
            if (((ger) obj2).b) {
                return false;
            }
            ((ger) obj2).b = true;
            ((ger) obj2).d = obj;
            gerVar.f.f((gen) obj2);
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    public final synchronized List g() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (gil gilVar : this.a) {
            arrayList.add(gilVar.b());
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.lang.Object] */
    public final synchronized gil h(String str, ndy ndyVar) {
        gil gilVar;
        gilVar = new gil(str, ndyVar);
        this.a.add(gilVar);
        return gilVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    public final void j(Object obj) {
        this.a.add(obj);
    }

    public fxa(int i) {
        this.a = new lsm(lks.a(i));
    }

    public final gpc i(InputStream inputStream, int i) {
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0 || i2 == 3 || i2 == 9) {
                return new goy(inputStream, i, 1);
            }
            if (i2 == 10) {
                return new goy(inputStream, (Context) this.a, 0);
            }
            throw new RuntimeException("Unsupported encoding: ".concat(ndb.ac(i)));
        }
        throw null;
    }
}
