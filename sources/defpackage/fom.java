package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: fom  reason: default package */
/* loaded from: classes.dex */
public final class fom extends foq {
    protected final fou a;

    public fom(int i, fou fouVar) {
        super(i);
        this.a = fouVar;
    }

    @Override // defpackage.foq
    public final void d(Status status) {
        try {
            this.a.g(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.foq
    public final void e(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.a.g(new Status(10, simpleName + ": " + localizedMessage));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.foq
    public final void f(fpg fpgVar) {
        try {
            this.a.f(fpgVar.b);
        } catch (RuntimeException e) {
            e(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.foq
    public final void g(ijk ijkVar, boolean z) {
        fou fouVar = this.a;
        ijkVar.b.put(fouVar, Boolean.valueOf(z));
        fouVar.d(new frp(ijkVar, fouVar, 1, null, null, null));
    }
}
