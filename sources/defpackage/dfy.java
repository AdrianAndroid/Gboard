package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dfy  reason: default package */
/* loaded from: classes.dex */
public final class dfy extends gxu {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/handwriting/ime/HandwritingModelLoader");
    public final idk b;
    public final boolean c;
    public final Context d;
    public final dgb e;
    public final dhp f;
    public final jav g;
    public final dhd h;
    private final Executor j;

    public dfy(Context context, jav javVar, dhp dhpVar, dgb dgbVar, dhd dhdVar, idk idkVar, boolean z, Executor executor) {
        super("LoadHandwritingModel");
        this.d = context;
        this.f = dhpVar;
        this.h = dhdVar;
        this.g = javVar;
        this.e = dgbVar;
        this.b = idkVar;
        this.c = z;
        this.j = executor;
    }

    public static File a(byz byzVar) {
        File file;
        if (!byzVar.b().isDirectory()) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/handwriting/ime/HandwritingModelLoader", "extractFileForDirPack", 249, "HandwritingModelLoader.java")).w("extractFileForDirPack(): %s should be directory.", byzVar);
            return null;
        }
        File[] listFiles = byzVar.b().listFiles();
        if (listFiles != null && listFiles.length == 1 && (file = listFiles[0]) != null) {
            return file;
        }
        ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/handwriting/ime/HandwritingModelLoader", "extractFileForDirPack", 254, "HandwritingModelLoader.java")).w("extractFileForDirPack(): %s missing files.", byzVar);
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mko j;
        mko K;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        dhp dhpVar = this.f;
        mko[] mkoVarArr = new mko[2];
        dhj dhjVar = dhpVar.c;
        if (dhjVar.k()) {
            j = kcu.K(true);
        } else {
            j = dhjVar.j();
        }
        mkoVarArr[0] = j;
        dhe dheVar = dhpVar.d;
        if (dheVar != null) {
            K = dheVar.h();
        } else {
            K = kcu.K(false);
        }
        mkoVarArr[1] = K;
        kcu.U(kcu.H(mkoVarArr), new dfw(this, elapsedRealtime), this.j);
    }
}
