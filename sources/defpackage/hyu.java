package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hyu  reason: default package */
/* loaded from: classes.dex */
public final class hyu implements lgb {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/mdd/CronetWithOkhttpFallbackFileDownloaderSupplier");
    private final lgb b;
    private final lgb c;

    public hyu(Context context, Executor executor, kcq kcqVar, jmz jmzVar, jhy jhyVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = new jjq(executor, iip.a, context, lfb.g(jmzVar), kcqVar, null, null, null);
        this.c = jjs.a(context, executor, kcqVar, lfb.g(jmzVar));
    }

    @Override // defpackage.lgb
    public final /* bridge */ /* synthetic */ Object a() {
        try {
            return ((jjq) this.b).a();
        } catch (RuntimeException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/inputmethod/mdd/CronetWithOkhttpFallbackFileDownloaderSupplier", "get", 'I', "CronetWithOkhttpFallbackFileDownloaderSupplier.java")).t("Failed to create GMS Cronet FileDownloader ");
            return ((jjr) this.c).a();
        }
    }
}
