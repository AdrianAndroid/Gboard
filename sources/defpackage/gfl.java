package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: gfl  reason: default package */
/* loaded from: classes.dex */
final class gfl extends gfi {
    @Override // defpackage.gfi
    public final void d(Status status) {
        if (!status.a()) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener: status=".concat(String.valueOf(String.valueOf(status))));
        }
    }
}
