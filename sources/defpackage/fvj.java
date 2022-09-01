package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: fvj  reason: default package */
/* loaded from: classes.dex */
abstract class fvj extends fvi {
    public fvj(fod fodVar) {
        super(fodVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ foi a(Status status) {
        return status == null ? Status.c : status;
    }
}
