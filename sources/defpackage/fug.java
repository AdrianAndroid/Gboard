package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: fug  reason: default package */
/* loaded from: classes.dex */
public final class fug extends fuh {
    final /* synthetic */ ful a;
    final /* synthetic */ Bundle e;
    final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fug(fod fodVar, ful fulVar, Bundle bundle, long j) {
        super(fodVar);
        this.a = fulVar;
        this.e = bundle;
        this.f = j;
    }

    @Override // defpackage.fou
    protected final /* bridge */ /* synthetic */ void c(fnr fnrVar) {
        fur furVar = (fur) fnrVar;
        try {
            ful fulVar = this.a;
            Bundle bundle = this.e;
            long j = this.f;
            giw.h(bundle);
            giw.i(fulVar);
            fut futVar = (fut) furVar.w();
            Parcel a = futVar.a();
            bkh.d(a, fulVar);
            bkh.d(a, bundle);
            a.writeLong(j);
            futVar.hI(5, a);
            k(Status.a);
        } catch (Exception e) {
            Log.e("gF_Feedback", "Requesting to save the async feedback psbd failed!", e);
            i(fui.a);
        }
    }
}
