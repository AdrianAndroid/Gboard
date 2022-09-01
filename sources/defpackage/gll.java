package defpackage;

import android.content.Context;
import android.net.http.HttpResponseCache;
import java.io.File;
import java.io.IOException;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: PG */
/* renamed from: gll  reason: default package */
/* loaded from: classes.dex */
public final class gll implements gle {
    public static final ltg b = ltg.j("com/google/android/libraries/gsa/io/impl/CronetEngineProviderImpl");
    public final gnn c;
    public final boolean d = !bky.g.a;
    public volatile boolean e;
    private final Context f;
    private final lgb g;
    private boolean h;

    public gll(Context context, gnn gnnVar, gnn gnnVar2, bvq bvqVar, boolean z, lfb lfbVar, lfb lfbVar2, glq glqVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f = context;
        this.c = gnnVar2;
        this.g = jdg.n(new lgb(gnnVar, context, bvqVar, z, lfbVar, lfbVar2, glqVar, null, null, null) { // from class: glf
            public final /* synthetic */ gnn b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ boolean d;
            public final /* synthetic */ lfb e;
            public final /* synthetic */ lfb f;
            public final /* synthetic */ glq g;
            public final /* synthetic */ bvq h;

            @Override // defpackage.lgb
            public final Object a() {
                final gll gllVar = gll.this;
                final gnn gnnVar3 = this.b;
                final Context context2 = this.c;
                final boolean z2 = this.d;
                final lfb lfbVar3 = this.e;
                final lfb lfbVar4 = this.f;
                return gnnVar3.b(new gnk() { // from class: glg
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:10:0x01c0  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0203  */
                    /* JADX WARN: Removed duplicated region for block: B:39:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:5:0x00dd  */
                    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.CharSequence, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.CharSequence, java.lang.Object] */
                    @Override // defpackage.gnk
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object a() {
                        /*
                            Method dump skipped, instructions count: 620
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.glg.a():java.lang.Object");
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File f(Context context, String str) {
        File file = new File(context.getCacheDir(), str);
        if (!file.isDirectory()) {
            if (file.exists()) {
                file.delete();
            }
            file.mkdirs();
        }
        return file;
    }

    public static void g(Context context, String str, CronetEngine.Builder builder, lfb lfbVar) {
        File f = f(context, str);
        if (!f.isDirectory()) {
            if (!lfbVar.e()) {
                ((ltd) ((ltd) b.d().h(luh.a, "CronetEngineProvidrImpl")).k("com/google/android/libraries/gsa/io/impl/CronetEngineProviderImpl", "setupCache", 558, "CronetEngineProviderImpl.java")).t("Disk cache directory creation failed. Falling back to in-memory cache.");
                builder.mo78enableHttpCache(1, 1048576L);
                return;
            }
            bvq bvqVar = (bvq) ((nox) lfbVar.a()).a();
            new blb(6563403);
            throw null;
        }
        builder.mo83setStoragePath(f.getAbsolutePath());
        builder.mo78enableHttpCache(3, bky.a.a);
    }

    @Override // defpackage.gle
    public final mko a() {
        return kcu.L((mko) this.g.a());
    }

    @Override // defpackage.gle
    public final void b() {
        a();
    }

    @Override // defpackage.gle
    public final synchronized void c() {
        if (!this.h) {
            if (HttpResponseCache.getInstalled() == null) {
                try {
                    HttpResponseCache.install(new File(this.f.getCacheDir(), "platform-http"), bky.a.a);
                    ((ltd) ((ltd) b.b().h(luh.a, "CronetEngineProvidrImpl")).k("com/google/android/libraries/gsa/io/impl/CronetEngineProviderImpl", "maybeInitializeCacheJavaOnlyMode", 577, "CronetEngineProviderImpl.java")).t("Installed HTTP response cache.");
                } catch (IOException e) {
                    ((ltd) ((ltd) ((ltd) b.d().h(luh.a, "CronetEngineProvidrImpl")).i(e)).k("com/google/android/libraries/gsa/io/impl/CronetEngineProviderImpl", "maybeInitializeCacheJavaOnlyMode", (char) 579, "CronetEngineProviderImpl.java")).t("HTTP response cache installation failed.");
                    bnh.b(e);
                }
            }
            this.h = true;
        }
    }

    @Override // defpackage.gle
    public final boolean d() {
        return this.e;
    }

    public final long e(leq leqVar) {
        ExperimentalCronetEngine experimentalCronetEngine;
        int intValue;
        if (!this.d || (experimentalCronetEngine = (ExperimentalCronetEngine) bvq.h(a())) == null || (intValue = ((Integer) leqVar.a(experimentalCronetEngine)).intValue()) == -1) {
            return -1L;
        }
        return intValue;
    }
}
