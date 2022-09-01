package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: fsc  reason: default package */
/* loaded from: classes.dex */
public final class fsc extends fra {
    public fsc(Context context, Looper looper, fqs fqsVar, fpb fpbVar, fpw fpwVar) {
        super(context, looper, 270, fqsVar, fpbVar, fpwVar);
    }

    @Override // defpackage.fra, defpackage.fqq, defpackage.fnw
    public final int a() {
        return 203400000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqq
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof frz ? (frz) queryLocalInterface : new frz(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqq
    public final String c() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.fqq
    protected final String d() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.fqq
    protected final boolean g() {
        return true;
    }

    @Override // defpackage.fqq
    public final fmv[] h() {
        return fmr.b;
    }

    @Override // defpackage.fqq
    protected final Bundle v() {
        return new Bundle();
    }
}
