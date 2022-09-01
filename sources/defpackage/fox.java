package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: fox  reason: default package */
/* loaded from: classes.dex */
public abstract class fox extends LifecycleCallback implements DialogInterface.OnCancelListener {
    protected volatile boolean a;
    protected final AtomicReference b = new AtomicReference(null);
    public final Handler c = new gco(Looper.getMainLooper());
    protected final fmx d;

    public fox(fpq fpqVar, fmx fmxVar) {
        super(fpqVar);
        this.d = fmxVar;
    }

    private static final int m(krm krmVar) {
        if (krmVar == null) {
            return -1;
        }
        return krmVar.a;
    }

    public final void a(fmt fmtVar, int i) {
        this.b.set(null);
        e(fmtVar, i);
    }

    public final void b() {
        this.b.set(null);
        f();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void c(int i, int i2, Intent intent) {
        krm krmVar = (krm) this.b.get();
        if (i != 1) {
            if (i == 2) {
                int e = this.d.e(k());
                if (e == 0) {
                    b();
                    return;
                } else if (krmVar == null) {
                    return;
                } else {
                    if (((fmt) krmVar.b).c == 18 && e == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            b();
            return;
        } else if (i2 == 0) {
            if (krmVar == null) {
                return;
            }
            int i3 = 13;
            if (intent != null) {
                i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
            }
            a(new fmt(i3, null, ((fmt) krmVar.b).toString()), m(krmVar));
            return;
        }
        if (krmVar != null) {
            a((fmt) krmVar.b, krmVar.a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void d(Bundle bundle) {
        if (bundle != null) {
            this.b.set(bundle.getBoolean("resolving_error", false) ? new krm(new fmt(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    protected abstract void e(fmt fmtVar, int i);

    protected abstract void f();

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void g(Bundle bundle) {
        krm krmVar = (krm) this.b.get();
        if (krmVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", krmVar.a);
        bundle.putInt("failed_status", ((fmt) krmVar.b).c);
        bundle.putParcelable("failed_resolution", ((fmt) krmVar.b).d);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a(new fmt(13, null), m((krm) this.b.get()));
    }
}
