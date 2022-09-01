package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ErrorReport;

/* compiled from: PG */
/* renamed from: fud  reason: default package */
/* loaded from: classes.dex */
public final class fud extends fuh {
    final /* synthetic */ ful a;
    final /* synthetic */ Context e;
    final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fud(fod fodVar, ful fulVar, Context context, long j) {
        super(fodVar);
        this.a = fulVar;
        this.e = context;
        this.f = j;
    }

    @Override // defpackage.fou
    protected final /* bridge */ /* synthetic */ void c(fnr fnrVar) {
        fur furVar = (fur) fnrVar;
        ful fulVar = this.a;
        fyb fybVar = fulVar.r;
        if (fybVar == null) {
            giw.i(fulVar);
            furVar.H(fulVar);
            fut futVar = (fut) furVar.w();
            ErrorReport errorReport = new ErrorReport(fulVar, furVar.s.getCacheDir());
            Parcel a = futVar.a();
            bkh.d(a, errorReport);
            Parcel hG = futVar.hG(1, a);
            bkh.g(hG);
            hG.recycle();
            k(Status.a);
            return;
        }
        Context context = this.e;
        long j = this.f;
        giw.j(new fus(context, fybVar, j, 1, null));
        giw.j(new fus(context, fybVar, j, 0, null));
        ful fulVar2 = this.a;
        long j2 = this.f;
        giw.i(fulVar2);
        furVar.H(fulVar2);
        fut futVar2 = (fut) furVar.w();
        ErrorReport errorReport2 = new ErrorReport(fulVar2, furVar.s.getCacheDir());
        Parcel a2 = futVar2.a();
        bkh.d(a2, errorReport2);
        a2.writeLong(j2);
        futVar2.hJ(6, a2);
        k(Status.a);
    }
}
