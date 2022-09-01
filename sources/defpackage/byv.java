package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: byv  reason: default package */
/* loaded from: classes.dex */
public final class byv implements jty, jtb {
    public static final /* synthetic */ int a = 0;
    private final jws b;
    private final jxg c;
    private final jty e;
    private final Context f;

    public byv(Context context, jty jtyVar, mks mksVar, Executor executor) {
        jxd f = jxg.f();
        f.a = context.getApplicationContext();
        f.b = executor;
        f.d = false;
        jxg a2 = f.a();
        this.c = a2;
        lzh lzhVar = jws.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(a2);
        this.b = kcu.r(mksVar, arrayList);
        this.e = jtyVar;
        this.f = context;
    }

    @Override // defpackage.jty
    public final jtv a(juc jucVar) {
        if (TextUtils.equals(jucVar.j(), "manifests")) {
            return this.b.a(jucVar);
        }
        return null;
    }

    @Override // defpackage.jrs
    public final mko b(jsr jsrVar) {
        return mio.g(kcu.H(this.b.b(jsrVar), this.e.b(jsrVar)), bou.d, mjl.a);
    }

    @Override // defpackage.jty
    public final mko c(juc jucVar, jtw jtwVar, File file) {
        if (this.c.c()) {
            return this.e.c(jucVar, jtwVar, file);
        }
        return this.b.c(jucVar, jtwVar, file);
    }

    @Override // defpackage.jsj
    public final String d() {
        return "ManifestFetcher";
    }

    @Override // defpackage.jtb
    public final void e(PrintWriter printWriter, boolean z) {
        printWriter.println("ManifestFetcher");
        this.b.e(printWriter, z);
        boolean z2 = true;
        printWriter.printf("Waiting For network: %b\n", Boolean.valueOf(this.c.c()));
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(activeNetworkInfo.getType());
            objArr[1] = activeNetworkInfo.getTypeName();
            objArr[2] = Boolean.valueOf(activeNetworkInfo.isConnected());
            if (activeNetworkInfo.getType() != 0 && activeNetworkInfo.getType() != 4 && activeNetworkInfo.getType() != 6 && activeNetworkInfo.getType() != 7 && activeNetworkInfo.getType() != 1 && activeNetworkInfo.getType() != 9 && activeNetworkInfo.getType() != 17) {
                z2 = false;
            }
            objArr[3] = Boolean.valueOf(z2);
            printWriter.printf("network info type = %d(%s), connected = %b, isWifiOrCellular = %b\n", objArr);
            return;
        }
        printWriter.println("network info is null\n");
    }
}
